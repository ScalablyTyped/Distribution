package typings
package extjsLib.ExtNs.windowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IWindow
  extends extjsLib.ExtNs.panelNs.IPanel {
  /** [Method] Invoked after the Panel is Collapsed  */
  @JSName("afterCollapse")
  var afterCollapse_IWindow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Invoked after the Panel is Expanded  */
  @JSName("afterExpand")
  var afterExpand_IWindow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String/Ext.Element) */
  var animateTarget: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  @JSName("autoRender")
  var autoRender_IWindow: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Ext.util.ComponentDragger) */
  @JSName("dd")
  var dd_IWindow: js.UndefOr[extjsLib.ExtNs.utilNs.IComponentDragger] = js.undefined
  /** [Config Option] (String/Number/Ext.Component) */
  var defaultFocus: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var expandOnShow: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Gets the configured default focus item  */
  var getDefaultFocus: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean/Function) */
  var ghost: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var hideShadowOnDeactivate: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isWindow: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var maximizable: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Fits the window within its current container and automatically replaces the maximize tool button with the restore
  		* @param animate Boolean true to animate this Window to full size.
  		* @returns Ext.window.Window this
  		*/
  var maximize: js.UndefOr[js.Function1[/* animate */ js.UndefOr[scala.Boolean], this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var maximized: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var minimizable: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Placeholder method for minimizing the window
  		* @returns Ext.window.Window this
  		*/
  var minimize: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Function) */
  var onEsc: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[scala.Boolean] = js.undefined
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
  var x: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var y: js.UndefOr[scala.Double] = js.undefined
}

