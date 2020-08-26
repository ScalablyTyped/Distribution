package typings.extjs.Ext

import typings.extjs.Ext.data.IAbstractStore
import typings.extjs.Ext.data.IStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ @js.native
trait IPagingToolbar
  extends typings.extjs.Ext.toolbar.IToolbar {
  /** [Config Option] (String) */
  var afterPageText: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var beforePageText: js.UndefOr[java.lang.String] = js.native
  /** [Method] Binds the paging toolbar to the specified Ext data Store deprecated
    * @param store Ext.data.Store The data store to bind
    */
  var bind: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.native
  /** [Method] Binds a store to this instance
    * @param store Ext.data.AbstractStore/String The store to bind or ID of the store. When no store given (or when null or undefined passed), unbinds the existing store.
    */
  var bindStore: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Binds listeners for this component to the store
    * @param store Ext.data.AbstractStore The store to bind to
    */
  var bindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var displayInfo: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var displayMsg: js.UndefOr[java.lang.String] = js.native
  /** [Method] Refresh the current page has the same effect as clicking the refresh button  */
  var doRefresh: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var emptyMsg: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var firstText: js.UndefOr[java.lang.String] = js.native
  /** [Method] Gets the current store instance
    * @returns Ext.data.AbstractStore The store, null if one does not exist.
    */
  var getStore: js.UndefOr[js.Function0[IAbstractStore]] = js.native
  /** [Method] Gets the listeners to bind to a new store
    * @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
    */
  var getStoreListeners: js.UndefOr[js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])] = js.native
  /** [Config Option] (Number) */
  var inputItemWidth: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var lastText: js.UndefOr[java.lang.String] = js.native
  /** [Method] Move to the first page has the same effect as clicking the first button  */
  var moveFirst: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Move to the last page has the same effect as clicking the last button  */
  var moveLast: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Move to the next page has the same effect as clicking the next button  */
  var moveNext: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Move to the previous page has the same effect as clicking the previous button  */
  var movePrevious: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var nextText: js.UndefOr[java.lang.String] = js.native
  /** [Method] Template method it is called when a new store is bound to the current instance
    * @param store Ext.data.AbstractStore The store being bound
    * @param initial Boolean True if this store is being bound as initialization of the instance.
    */
  var onBindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Template method it is called when an existing store is unbound from the current instance
    * @param store Ext.data.AbstractStore The store being unbound
    * @param initial Boolean True if this store is being bound as initialization of the instance.
    */
  var onUnbindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var prependButtons: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var prevText: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var refreshText: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.native
  /** [Method] Unbinds the paging toolbar from the specified Ext data Store deprecated
    * @param store Ext.data.Store The data store to unbind
    */
  var unbind: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.native
  /** [Method] Unbinds listeners from this component to the store
    * @param store Ext.data.AbstractStore The store to unbind from
    */
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.native
}

object IPagingToolbar {
  @scala.inline
  def apply(): IPagingToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPagingToolbar]
  }
  @scala.inline
  implicit class IPagingToolbarOps[Self <: IPagingToolbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterPageText(value: java.lang.String): Self = this.set("afterPageText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterPageText: Self = this.set("afterPageText", js.undefined)
    @scala.inline
    def setBeforePageText(value: java.lang.String): Self = this.set("beforePageText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforePageText: Self = this.set("beforePageText", js.undefined)
    @scala.inline
    def setBind(value: /* store */ js.UndefOr[IStore] => Unit): Self = this.set("bind", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBind: Self = this.set("bind", js.undefined)
    @scala.inline
    def setBindStore(value: js.UndefOr[js.Any] => Unit): Self = this.set("bindStore", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBindStore: Self = this.set("bindStore", js.undefined)
    @scala.inline
    def setBindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = this.set("bindStoreListeners", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBindStoreListeners: Self = this.set("bindStoreListeners", js.undefined)
    @scala.inline
    def setDisplayInfo(value: Boolean): Self = this.set("displayInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayInfo: Self = this.set("displayInfo", js.undefined)
    @scala.inline
    def setDisplayMsg(value: java.lang.String): Self = this.set("displayMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayMsg: Self = this.set("displayMsg", js.undefined)
    @scala.inline
    def setDoRefresh(value: () => Unit): Self = this.set("doRefresh", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDoRefresh: Self = this.set("doRefresh", js.undefined)
    @scala.inline
    def setEmptyMsg(value: java.lang.String): Self = this.set("emptyMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyMsg: Self = this.set("emptyMsg", js.undefined)
    @scala.inline
    def setFirstText(value: java.lang.String): Self = this.set("firstText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstText: Self = this.set("firstText", js.undefined)
    @scala.inline
    def setGetStore(value: () => IAbstractStore): Self = this.set("getStore", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStore: Self = this.set("getStore", js.undefined)
    @scala.inline
    def setGetStoreListenersFunction1(value: /* store */ js.UndefOr[IStore] => _): Self = this.set("getStoreListeners", js.Any.fromFunction1(value))
    @scala.inline
    def setGetStoreListenersFunction0(value: () => _): Self = this.set("getStoreListeners", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStoreListeners(value: js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])): Self = this.set("getStoreListeners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetStoreListeners: Self = this.set("getStoreListeners", js.undefined)
    @scala.inline
    def setInputItemWidth(value: Double): Self = this.set("inputItemWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputItemWidth: Self = this.set("inputItemWidth", js.undefined)
    @scala.inline
    def setLastText(value: java.lang.String): Self = this.set("lastText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastText: Self = this.set("lastText", js.undefined)
    @scala.inline
    def setMoveFirst(value: () => Unit): Self = this.set("moveFirst", js.Any.fromFunction0(value))
    @scala.inline
    def deleteMoveFirst: Self = this.set("moveFirst", js.undefined)
    @scala.inline
    def setMoveLast(value: () => Unit): Self = this.set("moveLast", js.Any.fromFunction0(value))
    @scala.inline
    def deleteMoveLast: Self = this.set("moveLast", js.undefined)
    @scala.inline
    def setMoveNext(value: () => Unit): Self = this.set("moveNext", js.Any.fromFunction0(value))
    @scala.inline
    def deleteMoveNext: Self = this.set("moveNext", js.undefined)
    @scala.inline
    def setMovePrevious(value: () => Unit): Self = this.set("movePrevious", js.Any.fromFunction0(value))
    @scala.inline
    def deleteMovePrevious: Self = this.set("movePrevious", js.undefined)
    @scala.inline
    def setNextText(value: java.lang.String): Self = this.set("nextText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextText: Self = this.set("nextText", js.undefined)
    @scala.inline
    def setOnBindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit): Self = this.set("onBindStore", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnBindStore: Self = this.set("onBindStore", js.undefined)
    @scala.inline
    def setOnUnbindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit): Self = this.set("onUnbindStore", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnUnbindStore: Self = this.set("onUnbindStore", js.undefined)
    @scala.inline
    def setPrependButtons(value: Boolean): Self = this.set("prependButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrependButtons: Self = this.set("prependButtons", js.undefined)
    @scala.inline
    def setPrevText(value: java.lang.String): Self = this.set("prevText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevText: Self = this.set("prevText", js.undefined)
    @scala.inline
    def setRefreshText(value: java.lang.String): Self = this.set("refreshText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshText: Self = this.set("refreshText", js.undefined)
    @scala.inline
    def setStore(value: IStore): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    @scala.inline
    def setUnbind(value: /* store */ js.UndefOr[IStore] => Unit): Self = this.set("unbind", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnbind: Self = this.set("unbind", js.undefined)
    @scala.inline
    def setUnbindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = this.set("unbindStoreListeners", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnbindStoreListeners: Self = this.set("unbindStoreListeners", js.undefined)
  }
  
}

