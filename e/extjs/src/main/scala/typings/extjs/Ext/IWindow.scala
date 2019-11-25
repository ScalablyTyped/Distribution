package typings.extjs.Ext

import typings.extjs.Ext.util.IComponentDragger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWindow
  extends typings.extjs.Ext.panel.IPanel {
  /** [Method] Invoked after the Panel is Collapsed  */
  @JSName("afterCollapse")
  var afterCollapse_IWindow: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Invoked after the Panel is Expanded  */
  @JSName("afterExpand")
  var afterExpand_IWindow: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String/Ext.Element) */
  var animateTarget: js.UndefOr[js.Any] = js.undefined
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
  @scala.inline
  def apply(
    IPanel: typings.extjs.Ext.panel.IPanel = null,
    afterCollapse: () => Unit = null,
    afterExpand: () => Unit = null,
    animateTarget: js.Any = null,
    autoRender: js.UndefOr[Boolean] = js.undefined,
    dd: IComponentDragger = null,
    defaultFocus: js.Any = null,
    expandOnShow: js.UndefOr[Boolean] = js.undefined,
    getDefaultFocus: () => Unit = null,
    ghost: js.Any = null,
    hideShadowOnDeactivate: js.UndefOr[Boolean] = js.undefined,
    isWindow: js.UndefOr[Boolean] = js.undefined,
    maximizable: js.UndefOr[Boolean] = js.undefined,
    maximize: /* animate */ js.UndefOr[Boolean] => IWindow = null,
    maximized: js.UndefOr[Boolean] = js.undefined,
    minimizable: js.UndefOr[Boolean] = js.undefined,
    minimize: () => IWindow = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    onEsc: js.Any = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    restore: /* animate */ js.UndefOr[js.Any] => IWindow = null,
    toggleMaximize: () => IWindow = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): IWindow = {
    val __obj = js.Dynamic.literal()
    if (IPanel != null) js.Dynamic.global.Object.assign(__obj, IPanel)
    if (afterCollapse != null) __obj.updateDynamic("afterCollapse")(js.Any.fromFunction0(afterCollapse))
    if (afterExpand != null) __obj.updateDynamic("afterExpand")(js.Any.fromFunction0(afterExpand))
    if (animateTarget != null) __obj.updateDynamic("animateTarget")(animateTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRender)) __obj.updateDynamic("autoRender")(autoRender.asInstanceOf[js.Any])
    if (dd != null) __obj.updateDynamic("dd")(dd.asInstanceOf[js.Any])
    if (defaultFocus != null) __obj.updateDynamic("defaultFocus")(defaultFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(expandOnShow)) __obj.updateDynamic("expandOnShow")(expandOnShow.asInstanceOf[js.Any])
    if (getDefaultFocus != null) __obj.updateDynamic("getDefaultFocus")(js.Any.fromFunction0(getDefaultFocus))
    if (ghost != null) __obj.updateDynamic("ghost")(ghost.asInstanceOf[js.Any])
    if (!js.isUndefined(hideShadowOnDeactivate)) __obj.updateDynamic("hideShadowOnDeactivate")(hideShadowOnDeactivate.asInstanceOf[js.Any])
    if (!js.isUndefined(isWindow)) __obj.updateDynamic("isWindow")(isWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(maximizable)) __obj.updateDynamic("maximizable")(maximizable.asInstanceOf[js.Any])
    if (maximize != null) __obj.updateDynamic("maximize")(js.Any.fromFunction1(maximize))
    if (!js.isUndefined(maximized)) __obj.updateDynamic("maximized")(maximized.asInstanceOf[js.Any])
    if (!js.isUndefined(minimizable)) __obj.updateDynamic("minimizable")(minimizable.asInstanceOf[js.Any])
    if (minimize != null) __obj.updateDynamic("minimize")(js.Any.fromFunction0(minimize))
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (onEsc != null) __obj.updateDynamic("onEsc")(onEsc.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    if (restore != null) __obj.updateDynamic("restore")(js.Any.fromFunction1(restore))
    if (toggleMaximize != null) __obj.updateDynamic("toggleMaximize")(js.Any.fromFunction0(toggleMaximize))
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWindow]
  }
}

