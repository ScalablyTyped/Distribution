package typings
package extjsLib.ExtNs

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

object IWindow {
  @scala.inline
  def apply(
    IPanel: extjsLib.ExtNs.panelNs.IPanel = null,
    afterCollapse: js.Function0[scala.Unit] = null,
    afterExpand: js.Function0[scala.Unit] = null,
    animateTarget: js.Any = null,
    applyState: js.Function1[/* state */ js.UndefOr[js.Any], scala.Unit] = null,
    autoRender: js.UndefOr[scala.Boolean] = js.undefined,
    baseCls: java.lang.String = null,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    collapsible: js.UndefOr[scala.Boolean] = js.undefined,
    constrain: js.UndefOr[scala.Boolean] = js.undefined,
    constrainHeader: js.UndefOr[scala.Boolean] = js.undefined,
    dd: extjsLib.ExtNs.utilNs.IComponentDragger = null,
    defaultFocus: js.Any = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    expandOnShow: js.UndefOr[scala.Boolean] = js.undefined,
    getDefaultFocus: js.Function0[scala.Unit] = null,
    ghost: js.Any = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    hideMode: java.lang.String = null,
    hideShadowOnDeactivate: js.UndefOr[scala.Boolean] = js.undefined,
    isWindow: js.UndefOr[scala.Boolean] = js.undefined,
    maximizable: js.UndefOr[scala.Boolean] = js.undefined,
    maximize: js.Function1[/* animate */ js.UndefOr[scala.Boolean], IWindow] = null,
    maximized: js.UndefOr[scala.Boolean] = js.undefined,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    minimizable: js.UndefOr[scala.Boolean] = js.undefined,
    minimize: js.Function0[IWindow] = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    onEsc: js.Any = null,
    onShow: js.Function0[scala.Unit] = null,
    overlapHeader: js.UndefOr[scala.Boolean] = js.undefined,
    plain: js.UndefOr[scala.Boolean] = js.undefined,
    resizable: js.Any = null,
    restore: js.Function1[/* animate */ js.UndefOr[js.Any], IWindow] = null,
    toggleMaximize: js.Function0[IWindow] = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): IWindow = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IPanel)
    if (afterCollapse != null) __obj.updateDynamic("afterCollapse")(afterCollapse)
    if (afterExpand != null) __obj.updateDynamic("afterExpand")(afterExpand)
    if (animateTarget != null) __obj.updateDynamic("animateTarget")(animateTarget)
    if (applyState != null) __obj.updateDynamic("applyState")(applyState)
    if (!js.isUndefined(autoRender)) __obj.updateDynamic("autoRender")(autoRender)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (!js.isUndefined(constrain)) __obj.updateDynamic("constrain")(constrain)
    if (!js.isUndefined(constrainHeader)) __obj.updateDynamic("constrainHeader")(constrainHeader)
    if (dd != null) __obj.updateDynamic("dd")(dd)
    if (defaultFocus != null) __obj.updateDynamic("defaultFocus")(defaultFocus)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(expandOnShow)) __obj.updateDynamic("expandOnShow")(expandOnShow)
    if (getDefaultFocus != null) __obj.updateDynamic("getDefaultFocus")(getDefaultFocus)
    if (ghost != null) __obj.updateDynamic("ghost")(ghost)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (hideMode != null) __obj.updateDynamic("hideMode")(hideMode)
    if (!js.isUndefined(hideShadowOnDeactivate)) __obj.updateDynamic("hideShadowOnDeactivate")(hideShadowOnDeactivate)
    if (!js.isUndefined(isWindow)) __obj.updateDynamic("isWindow")(isWindow)
    if (!js.isUndefined(maximizable)) __obj.updateDynamic("maximizable")(maximizable)
    if (maximize != null) __obj.updateDynamic("maximize")(maximize)
    if (!js.isUndefined(maximized)) __obj.updateDynamic("maximized")(maximized)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(minimizable)) __obj.updateDynamic("minimizable")(minimizable)
    if (minimize != null) __obj.updateDynamic("minimize")(minimize)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (onEsc != null) __obj.updateDynamic("onEsc")(onEsc)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (!js.isUndefined(overlapHeader)) __obj.updateDynamic("overlapHeader")(overlapHeader)
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (resizable != null) __obj.updateDynamic("resizable")(resizable)
    if (restore != null) __obj.updateDynamic("restore")(restore)
    if (toggleMaximize != null) __obj.updateDynamic("toggleMaximize")(toggleMaximize)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWindow]
  }
}

