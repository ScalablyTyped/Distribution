package typings.extjs.Ext

import typings.extjs.Ext.util.IComponentDragger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWindow
  extends typings.extjs.Ext.panel.IPanel {
  
  /** [Method] Invoked after the Panel is Collapsed  */
  @JSName("afterCollapse")
  var afterCollapse_IWindow: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Invoked after the Panel is Expanded  */
  @JSName("afterExpand")
  var afterExpand_IWindow: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String/Ext.Element) */
  var animateTarget: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  @JSName("autoRender")
  var autoRender_IWindow: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Ext.util.ComponentDragger) */
  @JSName("dd")
  var dd_IWindow: js.UndefOr[IComponentDragger] = js.native
  
  /** [Config Option] (String/Number/Ext.Component) */
  var defaultFocus: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var expandOnShow: js.UndefOr[Boolean] = js.native
  
  /** [Method] Gets the configured default focus item  */
  var getDefaultFocus: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean/Function) */
  var ghost: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var hideShadowOnDeactivate: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Boolean) */
  var isWindow: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var maximizable: js.UndefOr[Boolean] = js.native
  
  /** [Method] Fits the window within its current container and automatically replaces the maximize tool button with the restore
    * @param animate Boolean true to animate this Window to full size.
    * @returns Ext.window.Window this
    */
  var maximize: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Boolean], this.type]] = js.native
  
  /** [Config Option] (Boolean) */
  var maximized: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var minimizable: js.UndefOr[Boolean] = js.native
  
  /** [Method] Placeholder method for minimizing the window
    * @returns Ext.window.Window this
    */
  var minimize: js.UndefOr[js.Function0[this.type]] = js.native
  
  /** [Config Option] (Boolean) */
  var modal: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Function) */
  var onEsc: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[Boolean] = js.native
  
  /** [Method] Restores a maximized window back to its original size and position prior to being maximized and also replaces the re
    * @param animate Object
    * @returns Ext.window.Window this
    */
  var restore: js.UndefOr[js.Function1[/* animate */ js.UndefOr[js.Any], this.type]] = js.native
  
  /** [Method] A shortcut method for toggling between maximize and restore based on the current maximized state of the window
    * @returns Ext.window.Window this
    */
  var toggleMaximize: js.UndefOr[js.Function0[this.type]] = js.native
  
  /** [Config Option] (Number) */
  var x: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var y: js.UndefOr[Double] = js.native
}
object IWindow {
  
  @scala.inline
  def apply(): IWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWindow]
  }
  
  @scala.inline
  implicit class IWindowMutableBuilder[Self <: IWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterCollapse(value: () => Unit): Self = StObject.set(x, "afterCollapse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAfterCollapseUndefined: Self = StObject.set(x, "afterCollapse", js.undefined)
    
    @scala.inline
    def setAfterExpand(value: () => Unit): Self = StObject.set(x, "afterExpand", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAfterExpandUndefined: Self = StObject.set(x, "afterExpand", js.undefined)
    
    @scala.inline
    def setAnimateTarget(value: js.Any): Self = StObject.set(x, "animateTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateTargetUndefined: Self = StObject.set(x, "animateTarget", js.undefined)
    
    @scala.inline
    def setAutoRender(value: Boolean): Self = StObject.set(x, "autoRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRenderUndefined: Self = StObject.set(x, "autoRender", js.undefined)
    
    @scala.inline
    def setDd(value: IComponentDragger): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDdUndefined: Self = StObject.set(x, "dd", js.undefined)
    
    @scala.inline
    def setDefaultFocus(value: js.Any): Self = StObject.set(x, "defaultFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFocusUndefined: Self = StObject.set(x, "defaultFocus", js.undefined)
    
    @scala.inline
    def setExpandOnShow(value: Boolean): Self = StObject.set(x, "expandOnShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandOnShowUndefined: Self = StObject.set(x, "expandOnShow", js.undefined)
    
    @scala.inline
    def setGetDefaultFocus(value: () => Unit): Self = StObject.set(x, "getDefaultFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultFocusUndefined: Self = StObject.set(x, "getDefaultFocus", js.undefined)
    
    @scala.inline
    def setGhost(value: js.Any): Self = StObject.set(x, "ghost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGhostUndefined: Self = StObject.set(x, "ghost", js.undefined)
    
    @scala.inline
    def setHideShadowOnDeactivate(value: Boolean): Self = StObject.set(x, "hideShadowOnDeactivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideShadowOnDeactivateUndefined: Self = StObject.set(x, "hideShadowOnDeactivate", js.undefined)
    
    @scala.inline
    def setIsWindow(value: Boolean): Self = StObject.set(x, "isWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWindowUndefined: Self = StObject.set(x, "isWindow", js.undefined)
    
    @scala.inline
    def setMaximizable(value: Boolean): Self = StObject.set(x, "maximizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximizableUndefined: Self = StObject.set(x, "maximizable", js.undefined)
    
    @scala.inline
    def setMaximize(value: /* animate */ js.UndefOr[Boolean] => IWindow): Self = StObject.set(x, "maximize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaximizeUndefined: Self = StObject.set(x, "maximize", js.undefined)
    
    @scala.inline
    def setMaximized(value: Boolean): Self = StObject.set(x, "maximized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximizedUndefined: Self = StObject.set(x, "maximized", js.undefined)
    
    @scala.inline
    def setMinimizable(value: Boolean): Self = StObject.set(x, "minimizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimizableUndefined: Self = StObject.set(x, "minimizable", js.undefined)
    
    @scala.inline
    def setMinimize(value: () => IWindow): Self = StObject.set(x, "minimize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMinimizeUndefined: Self = StObject.set(x, "minimize", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    @scala.inline
    def setOnEsc(value: js.Any): Self = StObject.set(x, "onEsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEscUndefined: Self = StObject.set(x, "onEsc", js.undefined)
    
    @scala.inline
    def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
    
    @scala.inline
    def setRestore(value: /* animate */ js.UndefOr[js.Any] => IWindow): Self = StObject.set(x, "restore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
    
    @scala.inline
    def setToggleMaximize(value: () => IWindow): Self = StObject.set(x, "toggleMaximize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggleMaximizeUndefined: Self = StObject.set(x, "toggleMaximize", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
