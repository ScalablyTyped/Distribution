package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- extjsLib.ExtNs.utilNs.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ trait ILoadMask extends IComponent {
  /** [Method] Invoked after the Component is shown after onShow is called */
  @JSName("afterShow")
  var afterShow_ILoadMask: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Changes the data store bound to this LoadMask
  		* @param store Ext.data.Store The store to bind to this LoadMask
  		*/
  var bindStore: js.UndefOr[
    js.Function1[/* store */ js.UndefOr[js.Any | extjsLib.ExtNs.dataNs.IStore], scala.Unit]
  ] = js.undefined
  /** [Method] Binds listeners for this component to the store
  		* @param store Ext.data.AbstractStore The store to bind to
  		*/
  var bindStoreListeners: js.UndefOr[
    js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], scala.Unit]
  ] = js.undefined
  /** [Method] Center this Component in its container
  		* @returns Ext.Component this
  		*/
  @JSName("center")
  var center_ILoadMask: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Gets the current store instance
  		* @returns Ext.data.AbstractStore The store, null if one does not exist.
  		*/
  var getStore: js.UndefOr[js.Function0[extjsLib.ExtNs.dataNs.IAbstractStore]] = js.undefined
  /** [Method] Gets the listeners to bind to a new store
  		* @param store Object
  		* @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
  		*/
  var getStoreListeners: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any | extjsLib.ExtNs.dataNs.IStore], _]] = js.undefined
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
  var onBindStore: js.UndefOr[
    js.Function2[
      /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], 
      /* initial */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Possibly animates down to a target element  */
  @JSName("onHide")
  var onHide_ILoadMask: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Allows addition of behavior to the show operation  */
  @JSName("onShow")
  var onShow_ILoadMask: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Template method it is called when an existing store is unbound from the current instance
  		* @param store Ext.data.AbstractStore The store being unbound
  		* @param initial Boolean True if this store is being bound as initialization of the instance.
  		*/
  var onUnbindStore: js.UndefOr[
    js.Function2[
      /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], 
      /* initial */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method is called internally by Ext ZIndexManager to signal that a floating Component has either been moved to th
  		* @param active Boolean True to activate the Component, false to deactivate it.
  		* @param newActive Ext.Component The newly active Component which is taking over topmost zIndex position.
  		*/
  @JSName("setActive")
  var setActive_ILoadMask: js.UndefOr[
    js.Function2[
      /* active */ js.UndefOr[scala.Boolean], 
      /* newActive */ js.UndefOr[IComponent], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Shows this Component rendering it first if autoRender or floating are true
  		* @returns Ext.Component this
  		*/
  @JSName("show")
  var show_ILoadMask: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[extjsLib.ExtNs.dataNs.IStore] = js.undefined
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
  var toFront_ILoadMask: js.UndefOr[js.Function1[/* preventFocus */ js.UndefOr[scala.Boolean], IComponent]] = js.undefined
  /** [Method] Unbinds listeners from this component to the store
  		* @param store Ext.data.AbstractStore The store to unbind from
  		*/
  var unbindStoreListeners: js.UndefOr[
    js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var useMsg: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var useTargetEl: js.UndefOr[scala.Boolean] = js.undefined
}

object ILoadMask {
  @scala.inline
  def apply(
    IBindable: extjsLib.ExtNs.utilNs.IBindable = null,
    IComponent: IComponent = null,
    afterRender: js.Function0[scala.Unit] = null,
    afterShow: js.Function0[scala.Unit] = null,
    baseCls: java.lang.String = null,
    bindStore: js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IStore], scala.Unit] = null,
    bindStoreListeners: js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], scala.Unit] = null,
    center: js.Function0[IComponent] = null,
    doConstrain: js.Function1[/* constrainTo */ js.UndefOr[js.Any], scala.Unit] = null,
    getStore: js.Function0[extjsLib.ExtNs.dataNs.IAbstractStore] = null,
    getStoreListeners: js.Function1[/* store */ js.UndefOr[js.Any], _] = null,
    hide: js.Function0[IComponent] = null,
    maskCls: java.lang.String = null,
    msg: java.lang.String = null,
    msgCls: java.lang.String = null,
    onBindStore: js.Function2[
      /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], 
      /* initial */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    onDestroy: js.Function0[scala.Unit] = null,
    onDisable: js.Function0[scala.Unit] = null,
    onHide: js.Function0[scala.Unit] = null,
    onShow: js.Function0[scala.Unit] = null,
    onUnbindStore: js.Function2[
      /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], 
      /* initial */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    renderTpl: js.Any = null,
    setActive: js.Function2[
      /* active */ js.UndefOr[scala.Boolean], 
      /* newActive */ js.UndefOr[IComponent], 
      scala.Unit
    ] = null,
    show: js.Function0[IComponent] = null,
    store: extjsLib.ExtNs.dataNs.IStore = null,
    target: IComponent = null,
    toBack: js.Function0[IComponent] = null,
    toFront: js.Function1[/* preventFocus */ js.UndefOr[scala.Boolean], IComponent] = null,
    unbindStoreListeners: js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], scala.Unit] = null,
    useMsg: js.UndefOr[scala.Boolean] = js.undefined,
    useTargetEl: js.UndefOr[scala.Boolean] = js.undefined
  ): ILoadMask = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IBindable)
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (afterRender != null) __obj.updateDynamic("afterRender")(afterRender)
    if (afterShow != null) __obj.updateDynamic("afterShow")(afterShow)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (bindStore != null) __obj.updateDynamic("bindStore")(bindStore)
    if (bindStoreListeners != null) __obj.updateDynamic("bindStoreListeners")(bindStoreListeners)
    if (center != null) __obj.updateDynamic("center")(center)
    if (doConstrain != null) __obj.updateDynamic("doConstrain")(doConstrain)
    if (getStore != null) __obj.updateDynamic("getStore")(getStore)
    if (getStoreListeners != null) __obj.updateDynamic("getStoreListeners")(getStoreListeners)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (maskCls != null) __obj.updateDynamic("maskCls")(maskCls)
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (msgCls != null) __obj.updateDynamic("msgCls")(msgCls)
    if (onBindStore != null) __obj.updateDynamic("onBindStore")(onBindStore)
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(onDestroy)
    if (onDisable != null) __obj.updateDynamic("onDisable")(onDisable)
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (onUnbindStore != null) __obj.updateDynamic("onUnbindStore")(onUnbindStore)
    if (renderTpl != null) __obj.updateDynamic("renderTpl")(renderTpl)
    if (setActive != null) __obj.updateDynamic("setActive")(setActive)
    if (show != null) __obj.updateDynamic("show")(show)
    if (store != null) __obj.updateDynamic("store")(store)
    if (target != null) __obj.updateDynamic("target")(target)
    if (toBack != null) __obj.updateDynamic("toBack")(toBack)
    if (toFront != null) __obj.updateDynamic("toFront")(toFront)
    if (unbindStoreListeners != null) __obj.updateDynamic("unbindStoreListeners")(unbindStoreListeners)
    if (!js.isUndefined(useMsg)) __obj.updateDynamic("useMsg")(useMsg)
    if (!js.isUndefined(useTargetEl)) __obj.updateDynamic("useTargetEl")(useTargetEl)
    __obj.asInstanceOf[ILoadMask]
  }
}

