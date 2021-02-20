package typings.extjs.Ext

import typings.extjs.Ext.data.IAbstractStore
import typings.extjs.Ext.data.IStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ILoadMaskMutableBuilder[Self <: ILoadMask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterShow(value: () => Unit): Self = StObject.set(x, "afterShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAfterShowUndefined: Self = StObject.set(x, "afterShow", js.undefined)
    
    @scala.inline
    def setBindStore(value: js.UndefOr[js.Any | IStore] => Unit): Self = StObject.set(x, "bindStore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = StObject.set(x, "bindStoreListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindStoreListenersUndefined: Self = StObject.set(x, "bindStoreListeners", js.undefined)
    
    @scala.inline
    def setBindStoreUndefined: Self = StObject.set(x, "bindStore", js.undefined)
    
    @scala.inline
    def setCenter(value: () => IComponent): Self = StObject.set(x, "center", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setDoConstrain(value: /* constrainTo */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "doConstrain", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoConstrainUndefined: Self = StObject.set(x, "doConstrain", js.undefined)
    
    @scala.inline
    def setGetStore(value: () => IAbstractStore): Self = StObject.set(x, "getStore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStoreListeners(value: js.UndefOr[js.Any | IStore] => _): Self = StObject.set(x, "getStoreListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStoreListenersUndefined: Self = StObject.set(x, "getStoreListeners", js.undefined)
    
    @scala.inline
    def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
    
    @scala.inline
    def setHide(value: () => IComponent): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setMaskCls(value: java.lang.String): Self = StObject.set(x, "maskCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskClsUndefined: Self = StObject.set(x, "maskCls", js.undefined)
    
    @scala.inline
    def setMsg(value: java.lang.String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgCls(value: java.lang.String): Self = StObject.set(x, "msgCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgClsUndefined: Self = StObject.set(x, "msgCls", js.undefined)
    
    @scala.inline
    def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
    
    @scala.inline
    def setOnBindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "onBindStore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnBindStoreUndefined: Self = StObject.set(x, "onBindStore", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setOnUnbindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "onUnbindStore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnUnbindStoreUndefined: Self = StObject.set(x, "onUnbindStore", js.undefined)
    
    @scala.inline
    def setSetActive(value: (/* active */ js.UndefOr[Boolean], /* newActive */ js.UndefOr[IComponent]) => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetActiveUndefined: Self = StObject.set(x, "setActive", js.undefined)
    
    @scala.inline
    def setShow(value: () => IComponent): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setStore(value: IStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    @scala.inline
    def setTarget(value: IComponent): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setToBack(value: () => IComponent): Self = StObject.set(x, "toBack", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToBackUndefined: Self = StObject.set(x, "toBack", js.undefined)
    
    @scala.inline
    def setToFront(value: /* preventFocus */ js.UndefOr[Boolean] => IComponent): Self = StObject.set(x, "toFront", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToFrontUndefined: Self = StObject.set(x, "toFront", js.undefined)
    
    @scala.inline
    def setUnbindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = StObject.set(x, "unbindStoreListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnbindStoreListenersUndefined: Self = StObject.set(x, "unbindStoreListeners", js.undefined)
    
    @scala.inline
    def setUseMsg(value: Boolean): Self = StObject.set(x, "useMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseMsgUndefined: Self = StObject.set(x, "useMsg", js.undefined)
    
    @scala.inline
    def setUseTargetEl(value: Boolean): Self = StObject.set(x, "useTargetEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTargetElUndefined: Self = StObject.set(x, "useTargetEl", js.undefined)
  }
}
