package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import typings.extjs.Ext.data.IAbstractStore
import typings.extjs.Ext.data.IStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBindable extends IBase {
  /** [Method] Binds a store to this instance
    * @param store Ext.data.AbstractStore/String The store to bind or ID of the store. When no store given (or when null or undefined passed), unbinds the existing store.
    */
  var bindStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Binds listeners for this component to the store
    * @param store Ext.data.AbstractStore The store to bind to
    */
  var bindStoreListeners: js.UndefOr[js.Function1[/* store */ js.UndefOr[IAbstractStore], Unit]] = js.native
  /** [Method] Gets the current store instance
    * @returns Ext.data.AbstractStore The store, null if one does not exist.
    */
  var getStore: js.UndefOr[js.Function0[IAbstractStore]] = js.native
  /** [Method] Gets the listeners to bind to a new store
    * @param store Ext.data.Store The Store which is being bound to for which a listeners object should be returned.
    * @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
    */
  var getStoreListeners: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], _]] = js.native
  /** [Method] Template method it is called when a new store is bound to the current instance
    * @param store Ext.data.AbstractStore The store being bound
    * @param initial Boolean True if this store is being bound as initialization of the instance.
    */
  var onBindStore: js.UndefOr[
    js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Template method it is called when an existing store is unbound from the current instance
    * @param store Ext.data.AbstractStore The store being unbound
    * @param initial Boolean True if this store is being bound as initialization of the instance.
    */
  var onUnbindStore: js.UndefOr[
    js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Unbinds listeners from this component to the store
    * @param store Ext.data.AbstractStore The store to unbind from
    */
  var unbindStoreListeners: js.UndefOr[js.Function1[/* store */ js.UndefOr[IAbstractStore], Unit]] = js.native
}

object IBindable {
  @scala.inline
  def apply(): IBindable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBindable]
  }
  @scala.inline
  implicit class IBindableOps[Self <: IBindable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBindStore(value: /* store */ js.UndefOr[js.Any] => Unit): Self = this.set("bindStore", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBindStore: Self = this.set("bindStore", js.undefined)
    @scala.inline
    def setBindStoreListeners(value: /* store */ js.UndefOr[IAbstractStore] => Unit): Self = this.set("bindStoreListeners", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBindStoreListeners: Self = this.set("bindStoreListeners", js.undefined)
    @scala.inline
    def setGetStore(value: () => IAbstractStore): Self = this.set("getStore", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStore: Self = this.set("getStore", js.undefined)
    @scala.inline
    def setGetStoreListeners(value: /* store */ js.UndefOr[IStore] => _): Self = this.set("getStoreListeners", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetStoreListeners: Self = this.set("getStoreListeners", js.undefined)
    @scala.inline
    def setOnBindStore(value: (/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean]) => Unit): Self = this.set("onBindStore", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnBindStore: Self = this.set("onBindStore", js.undefined)
    @scala.inline
    def setOnUnbindStore(value: (/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean]) => Unit): Self = this.set("onUnbindStore", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnUnbindStore: Self = this.set("onUnbindStore", js.undefined)
    @scala.inline
    def setUnbindStoreListeners(value: /* store */ js.UndefOr[IAbstractStore] => Unit): Self = this.set("unbindStoreListeners", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnbindStoreListeners: Self = this.set("unbindStoreListeners", js.undefined)
  }
  
}

