package typings.extjs.Ext

import typings.extjs.Ext.util.IComponentDragger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWindow
  extends StObject
     with typings.extjs.Ext.panel.IPanel {
  
  /** [Method] Invoked after the Panel is Collapsed  */
  @JSName("afterCollapse")
  var afterCollapse_IWindow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Invoked after the Panel is Expanded  */
  @JSName("afterExpand")
  var afterExpand_IWindow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String/Ext.Element) */
  var animateTarget: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Applies the state to the object
    * @param state Object
    */
  @JSName("applyState")
  var applyState_IWindow: js.UndefOr[js.Function1[/* state */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  @JSName("autoRender")
  var autoRender_IWindow: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Ext.util.ComponentDragger) */
  @JSName("dd")
  var dd_IWindow: js.UndefOr[IComponentDragger] = js.undefined
  
  /** [Config Option] (String/Number/Ext.Component) */
  var defaultFocus: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var expandOnShow: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Gets the configured default focus item  */
  var getDefaultFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Boolean/Function) */
  var ghost: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var hideShadowOnDeactivate: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var isWindow: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var maximizable: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Fits the window within its current container and automatically replaces the maximize tool button with the restore
    * @param animate Boolean true to animate this Window to full size.
    * @returns Ext.window.Window this
    */
  var maximize: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Boolean], this.type]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var maximized: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var minimizable: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Placeholder method for minimizing the window
    * @returns Ext.window.Window this
    */
  var minimize: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var modal: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Function) */
  var onEsc: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Restores a maximized window back to its original size and position prior to being maximized and also replaces the re
    * @param animate Object
    * @returns Ext.window.Window this
    */
  var restore: js.UndefOr[js.Function1[/* animate */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Method] A shortcut method for toggling between maximize and restore based on the current maximized state of the window
    * @returns Ext.window.Window this
    */
  var toggleMaximize: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Config Option] (Number) */
  var x: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var y: js.UndefOr[Double] = js.undefined
}
object IWindow {
  
  inline def apply(): IWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWindow]
  }
  
  extension [Self <: IWindow](x: Self) {
    
    inline def setAfterCollapse(value: () => Unit): Self = StObject.set(x, "afterCollapse", js.Any.fromFunction0(value))
    
    inline def setAfterCollapseUndefined: Self = StObject.set(x, "afterCollapse", js.undefined)
    
    inline def setAfterExpand(value: () => Unit): Self = StObject.set(x, "afterExpand", js.Any.fromFunction0(value))
    
    inline def setAfterExpandUndefined: Self = StObject.set(x, "afterExpand", js.undefined)
    
    inline def setAnimateTarget(value: js.Any): Self = StObject.set(x, "animateTarget", value.asInstanceOf[js.Any])
    
    inline def setAnimateTargetUndefined: Self = StObject.set(x, "animateTarget", js.undefined)
    
    inline def setApplyState(value: /* state */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "applyState", js.Any.fromFunction1(value))
    
    inline def setApplyStateUndefined: Self = StObject.set(x, "applyState", js.undefined)
    
    inline def setAutoRender(value: Boolean): Self = StObject.set(x, "autoRender", value.asInstanceOf[js.Any])
    
    inline def setAutoRenderUndefined: Self = StObject.set(x, "autoRender", js.undefined)
    
    inline def setDd(value: IComponentDragger): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
    
    inline def setDdUndefined: Self = StObject.set(x, "dd", js.undefined)
    
    inline def setDefaultFocus(value: js.Any): Self = StObject.set(x, "defaultFocus", value.asInstanceOf[js.Any])
    
    inline def setDefaultFocusUndefined: Self = StObject.set(x, "defaultFocus", js.undefined)
    
    inline def setExpandOnShow(value: Boolean): Self = StObject.set(x, "expandOnShow", value.asInstanceOf[js.Any])
    
    inline def setExpandOnShowUndefined: Self = StObject.set(x, "expandOnShow", js.undefined)
    
    inline def setGetDefaultFocus(value: () => Unit): Self = StObject.set(x, "getDefaultFocus", js.Any.fromFunction0(value))
    
    inline def setGetDefaultFocusUndefined: Self = StObject.set(x, "getDefaultFocus", js.undefined)
    
    inline def setGhost(value: js.Any): Self = StObject.set(x, "ghost", value.asInstanceOf[js.Any])
    
    inline def setGhostUndefined: Self = StObject.set(x, "ghost", js.undefined)
    
    inline def setHideShadowOnDeactivate(value: Boolean): Self = StObject.set(x, "hideShadowOnDeactivate", value.asInstanceOf[js.Any])
    
    inline def setHideShadowOnDeactivateUndefined: Self = StObject.set(x, "hideShadowOnDeactivate", js.undefined)
    
    inline def setIsWindow(value: Boolean): Self = StObject.set(x, "isWindow", value.asInstanceOf[js.Any])
    
    inline def setIsWindowUndefined: Self = StObject.set(x, "isWindow", js.undefined)
    
    inline def setMaximizable(value: Boolean): Self = StObject.set(x, "maximizable", value.asInstanceOf[js.Any])
    
    inline def setMaximizableUndefined: Self = StObject.set(x, "maximizable", js.undefined)
    
    inline def setMaximize(value: /* animate */ js.UndefOr[Boolean] => IWindow): Self = StObject.set(x, "maximize", js.Any.fromFunction1(value))
    
    inline def setMaximizeUndefined: Self = StObject.set(x, "maximize", js.undefined)
    
    inline def setMaximized(value: Boolean): Self = StObject.set(x, "maximized", value.asInstanceOf[js.Any])
    
    inline def setMaximizedUndefined: Self = StObject.set(x, "maximized", js.undefined)
    
    inline def setMinimizable(value: Boolean): Self = StObject.set(x, "minimizable", value.asInstanceOf[js.Any])
    
    inline def setMinimizableUndefined: Self = StObject.set(x, "minimizable", js.undefined)
    
    inline def setMinimize(value: () => IWindow): Self = StObject.set(x, "minimize", js.Any.fromFunction0(value))
    
    inline def setMinimizeUndefined: Self = StObject.set(x, "minimize", js.undefined)
    
    inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    inline def setOnEsc(value: js.Any): Self = StObject.set(x, "onEsc", value.asInstanceOf[js.Any])
    
    inline def setOnEscUndefined: Self = StObject.set(x, "onEsc", js.undefined)
    
    inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
    
    inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
    
    inline def setRestore(value: /* animate */ js.UndefOr[js.Any] => IWindow): Self = StObject.set(x, "restore", js.Any.fromFunction1(value))
    
    inline def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
    
    inline def setToggleMaximize(value: () => IWindow): Self = StObject.set(x, "toggleMaximize", js.Any.fromFunction0(value))
    
    inline def setToggleMaximizeUndefined: Self = StObject.set(x, "toggleMaximize", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
