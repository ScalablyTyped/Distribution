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
trait ILoadMask extends IComponent {
  /** [Method] Invoked after the Component is shown after onShow is called */
  @JSName("afterShow")
  var afterShow_ILoadMask: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Changes the data store bound to this LoadMask
    * @param store Ext.data.Store The store to bind to this LoadMask
    */
  var bindStore: js.UndefOr[js.Function1[js.UndefOr[js.Any | IStore], Unit]] = js.native
  /** [Method] Binds listeners for this component to the store
    * @param store Ext.data.AbstractStore The store to bind to
    */
  var bindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.native
  /** [Method] Center this Component in its container
    * @returns Ext.Component this
    */
  @JSName("center")
  var center_ILoadMask: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Moves this floating Component into a constrain region
    * @param constrainTo String/HTMLElement/Ext.Element/Ext.util.Region The Element or Region into which this Component is to be constrained. Defaults to the element into which this floating Component was rendered.
    */
  @JSName("doConstrain")
  var doConstrain_ILoadMask: js.UndefOr[js.Function1[/* constrainTo */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Gets the current store instance
    * @returns Ext.data.AbstractStore The store, null if one does not exist.
    */
  var getStore: js.UndefOr[js.Function0[IAbstractStore]] = js.native
  /** [Method] Gets the listeners to bind to a new store
    * @param store Object
    * @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
    */
  var getStoreListeners: js.UndefOr[js.Function1[js.UndefOr[js.Any | IStore], _]] = js.native
  /** [Method] Hides this Component setting it to invisible using the configured hideMode
    * @returns Ext.Component this
    */
  @JSName("hide")
  var hide_ILoadMask: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Config Option] (String) */
  var maskCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var msg: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var msgCls: js.UndefOr[java.lang.String] = js.native
  /** [Method] Template method it is called when a new store is bound to the current instance
    * @param store Ext.data.AbstractStore The store being bound
    * @param initial Boolean True if this store is being bound as initialization of the instance.
    */
  var onBindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Possibly animates down to a target element  */
  @JSName("onHide")
  var onHide_ILoadMask: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Allows addition of behavior to the show operation  */
  @JSName("onShow")
  var onShow_ILoadMask: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Template method it is called when an existing store is unbound from the current instance
    * @param store Ext.data.AbstractStore The store being unbound
    * @param initial Boolean True if this store is being bound as initialization of the instance.
    */
  var onUnbindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] This method is called internally by Ext ZIndexManager to signal that a floating Component has either been moved to th
    * @param active Boolean True to activate the Component, false to deactivate it.
    * @param newActive Ext.Component The newly active Component which is taking over topmost zIndex position.
    */
  @JSName("setActive")
  var setActive_ILoadMask: js.UndefOr[
    js.Function2[/* active */ js.UndefOr[Boolean], /* newActive */ js.UndefOr[IComponent], Unit]
  ] = js.native
  /** [Method] Shows this Component rendering it first if autoRender or floating are true
    * @returns Ext.Component this
    */
  @JSName("show")
  var show_ILoadMask: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.native
  /** [Config Option] (Ext.Component) */
  var target: js.UndefOr[IComponent] = js.native
  /** [Method] Sends this Component to the back of lower z index than any other visible windows
    * @returns Ext.Component this
    */
  @JSName("toBack")
  var toBack_ILoadMask: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Brings this floating Component to the front of any other visible floating Components managed by the same ZIndexManag
    * @param preventFocus Boolean Specify true to prevent the Component from being focused.
    * @returns Ext.Component this
    */
  @JSName("toFront")
  var toFront_ILoadMask: js.UndefOr[js.Function1[/* preventFocus */ js.UndefOr[Boolean], IComponent]] = js.native
  /** [Method] Unbinds listeners from this component to the store
    * @param store Ext.data.AbstractStore The store to unbind from
    */
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var useMsg: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var useTargetEl: js.UndefOr[Boolean] = js.native
}

object ILoadMask {
  @scala.inline
  def apply(): ILoadMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILoadMask]
  }
  @scala.inline
  implicit class ILoadMaskOps[Self <: ILoadMask] (val x: Self) extends AnyVal {
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
    def setAfterShow(value: () => Unit): Self = this.set("afterShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterShow: Self = this.set("afterShow", js.undefined)
    @scala.inline
    def setBindStore(value: js.UndefOr[js.Any | IStore] => Unit): Self = this.set("bindStore", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBindStore: Self = this.set("bindStore", js.undefined)
    @scala.inline
    def setBindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = this.set("bindStoreListeners", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBindStoreListeners: Self = this.set("bindStoreListeners", js.undefined)
    @scala.inline
    def setCenter(value: () => IComponent): Self = this.set("center", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setDoConstrain(value: /* constrainTo */ js.UndefOr[js.Any] => Unit): Self = this.set("doConstrain", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDoConstrain: Self = this.set("doConstrain", js.undefined)
    @scala.inline
    def setGetStore(value: () => IAbstractStore): Self = this.set("getStore", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStore: Self = this.set("getStore", js.undefined)
    @scala.inline
    def setGetStoreListeners(value: js.UndefOr[js.Any | IStore] => _): Self = this.set("getStoreListeners", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetStoreListeners: Self = this.set("getStoreListeners", js.undefined)
    @scala.inline
    def setHide(value: () => IComponent): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setMaskCls(value: java.lang.String): Self = this.set("maskCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskCls: Self = this.set("maskCls", js.undefined)
    @scala.inline
    def setMsg(value: java.lang.String): Self = this.set("msg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsg: Self = this.set("msg", js.undefined)
    @scala.inline
    def setMsgCls(value: java.lang.String): Self = this.set("msgCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsgCls: Self = this.set("msgCls", js.undefined)
    @scala.inline
    def setOnBindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit): Self = this.set("onBindStore", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnBindStore: Self = this.set("onBindStore", js.undefined)
    @scala.inline
    def setOnHide(value: () => Unit): Self = this.set("onHide", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setOnUnbindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit): Self = this.set("onUnbindStore", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnUnbindStore: Self = this.set("onUnbindStore", js.undefined)
    @scala.inline
    def setSetActive(value: (/* active */ js.UndefOr[Boolean], /* newActive */ js.UndefOr[IComponent]) => Unit): Self = this.set("setActive", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetActive: Self = this.set("setActive", js.undefined)
    @scala.inline
    def setShow(value: () => IComponent): Self = this.set("show", js.Any.fromFunction0(value))
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setStore(value: IStore): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    @scala.inline
    def setTarget(value: IComponent): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setToBack(value: () => IComponent): Self = this.set("toBack", js.Any.fromFunction0(value))
    @scala.inline
    def deleteToBack: Self = this.set("toBack", js.undefined)
    @scala.inline
    def setToFront(value: /* preventFocus */ js.UndefOr[Boolean] => IComponent): Self = this.set("toFront", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToFront: Self = this.set("toFront", js.undefined)
    @scala.inline
    def setUnbindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = this.set("unbindStoreListeners", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnbindStoreListeners: Self = this.set("unbindStoreListeners", js.undefined)
    @scala.inline
    def setUseMsg(value: Boolean): Self = this.set("useMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMsg: Self = this.set("useMsg", js.undefined)
    @scala.inline
    def setUseTargetEl(value: Boolean): Self = this.set("useTargetEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseTargetEl: Self = this.set("useTargetEl", js.undefined)
  }
  
}

