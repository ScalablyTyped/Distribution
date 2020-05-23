package typings.extjs.Ext

import typings.extjs.Ext.data.IAbstractStore
import typings.extjs.Ext.data.IStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ trait ILoadMask extends IComponent {
  /** [Method] Invoked after the Component is shown after onShow is called */
  @JSName("afterShow")
  var afterShow_ILoadMask: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Changes the data store bound to this LoadMask
    * @param store Ext.data.Store The store to bind to this LoadMask
    */
  var bindStore: js.UndefOr[js.Function1[js.UndefOr[js.Any | IStore], Unit]] = js.undefined
  /** [Method] Binds listeners for this component to the store
    * @param store Ext.data.AbstractStore The store to bind to
    */
  var bindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.undefined
  /** [Method] Center this Component in its container
    * @returns Ext.Component this
    */
  @JSName("center")
  var center_ILoadMask: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Gets the current store instance
    * @returns Ext.data.AbstractStore The store, null if one does not exist.
    */
  var getStore: js.UndefOr[js.Function0[IAbstractStore]] = js.undefined
  /** [Method] Gets the listeners to bind to a new store
    * @param store Object
    * @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
    */
  var getStoreListeners: js.UndefOr[js.Function1[js.UndefOr[js.Any | IStore], _]] = js.undefined
  /** [Method] Hides this Component setting it to invisible using the configured hideMode
    * @returns Ext.Component this
    */
  @JSName("hide")
  var hide_ILoadMask: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Config Option] (String) */
  var maskCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var msg: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var msgCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Template method it is called when a new store is bound to the current instance
    * @param store Ext.data.AbstractStore The store being bound
    * @param initial Boolean True if this store is being bound as initialization of the instance.
    */
  var onBindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Possibly animates down to a target element  */
  @JSName("onHide")
  var onHide_ILoadMask: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Allows addition of behavior to the show operation  */
  @JSName("onShow")
  var onShow_ILoadMask: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Template method it is called when an existing store is unbound from the current instance
    * @param store Ext.data.AbstractStore The store being unbound
    * @param initial Boolean True if this store is being bound as initialization of the instance.
    */
  var onUnbindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] This method is called internally by Ext ZIndexManager to signal that a floating Component has either been moved to th
    * @param active Boolean True to activate the Component, false to deactivate it.
    * @param newActive Ext.Component The newly active Component which is taking over topmost zIndex position.
    */
  @JSName("setActive")
  var setActive_ILoadMask: js.UndefOr[
    js.Function2[/* active */ js.UndefOr[Boolean], /* newActive */ js.UndefOr[IComponent], Unit]
  ] = js.undefined
  /** [Method] Shows this Component rendering it first if autoRender or floating are true
    * @returns Ext.Component this
    */
  @JSName("show")
  var show_ILoadMask: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.undefined
  /** [Config Option] (Ext.Component) */
  var target: js.UndefOr[IComponent] = js.undefined
  /** [Method] Sends this Component to the back of lower z index than any other visible windows
    * @returns Ext.Component this
    */
  @JSName("toBack")
  var toBack_ILoadMask: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Brings this floating Component to the front of any other visible floating Components managed by the same ZIndexManag
    * @param preventFocus Boolean Specify true to prevent the Component from being focused.
    * @returns Ext.Component this
    */
  @JSName("toFront")
  var toFront_ILoadMask: js.UndefOr[js.Function1[/* preventFocus */ js.UndefOr[Boolean], IComponent]] = js.undefined
  /** [Method] Unbinds listeners from this component to the store
    * @param store Ext.data.AbstractStore The store to unbind from
    */
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var useMsg: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var useTargetEl: js.UndefOr[Boolean] = js.undefined
}

object ILoadMask {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    afterShow: () => Unit = null,
    bindStore: js.UndefOr[js.Any | IStore] => Unit = null,
    bindStoreListeners: js.UndefOr[IAbstractStore] => Unit = null,
    center: () => IComponent = null,
    getStore: () => IAbstractStore = null,
    getStoreListeners: js.UndefOr[js.Any | IStore] => _ = null,
    hide: () => IComponent = null,
    maskCls: java.lang.String = null,
    msg: java.lang.String = null,
    msgCls: java.lang.String = null,
    onBindStore: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit = null,
    onHide: () => Unit = null,
    onShow: () => Unit = null,
    onUnbindStore: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit = null,
    setActive: (/* active */ js.UndefOr[Boolean], /* newActive */ js.UndefOr[IComponent]) => Unit = null,
    show: () => IComponent = null,
    store: IStore = null,
    target: IComponent = null,
    toBack: () => IComponent = null,
    toFront: /* preventFocus */ js.UndefOr[Boolean] => IComponent = null,
    unbindStoreListeners: js.UndefOr[IAbstractStore] => Unit = null,
    useMsg: js.UndefOr[Boolean] = js.undefined,
    useTargetEl: js.UndefOr[Boolean] = js.undefined
  ): ILoadMask = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (afterShow != null) __obj.updateDynamic("afterShow")(js.Any.fromFunction0(afterShow))
    if (bindStore != null) __obj.updateDynamic("bindStore")(js.Any.fromFunction1(bindStore))
    if (bindStoreListeners != null) __obj.updateDynamic("bindStoreListeners")(js.Any.fromFunction1(bindStoreListeners))
    if (center != null) __obj.updateDynamic("center")(js.Any.fromFunction0(center))
    if (getStore != null) __obj.updateDynamic("getStore")(js.Any.fromFunction0(getStore))
    if (getStoreListeners != null) __obj.updateDynamic("getStoreListeners")(js.Any.fromFunction1(getStoreListeners))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (maskCls != null) __obj.updateDynamic("maskCls")(maskCls.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (msgCls != null) __obj.updateDynamic("msgCls")(msgCls.asInstanceOf[js.Any])
    if (onBindStore != null) __obj.updateDynamic("onBindStore")(js.Any.fromFunction2(onBindStore))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (onUnbindStore != null) __obj.updateDynamic("onUnbindStore")(js.Any.fromFunction2(onUnbindStore))
    if (setActive != null) __obj.updateDynamic("setActive")(js.Any.fromFunction2(setActive))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (toBack != null) __obj.updateDynamic("toBack")(js.Any.fromFunction0(toBack))
    if (toFront != null) __obj.updateDynamic("toFront")(js.Any.fromFunction1(toFront))
    if (unbindStoreListeners != null) __obj.updateDynamic("unbindStoreListeners")(js.Any.fromFunction1(unbindStoreListeners))
    if (!js.isUndefined(useMsg)) __obj.updateDynamic("useMsg")(useMsg.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useTargetEl)) __obj.updateDynamic("useTargetEl")(useTargetEl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoadMask]
  }
}

