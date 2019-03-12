package typings
package extjsLib.ExtNs.panelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITool
  extends extjsLib.ExtNs.IComponent {
  /** [Config Option] (Function) */
  var callback: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var isTool: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the type of the tool
  		* @param type String The new type. See the type config.
  		* @returns Ext.panel.Tool this
  		*/
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var stopEvent: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.Component) */
  var toolOwner: js.UndefOr[extjsLib.ExtNs.IComponent] = js.undefined
  /** [Config Option] (String/Object) */
  var tooltip: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var tooltipType: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ITool {
  @scala.inline
  def apply(
    IComponent: extjsLib.ExtNs.IComponent = null,
    afterRender: () => scala.Unit = null,
    baseCls: java.lang.String = null,
    callback: js.Any = null,
    disabledCls: java.lang.String = null,
    handler: js.Any = null,
    height: scala.Int | scala.Double = null,
    initComponent: () => scala.Unit = null,
    isTool: js.UndefOr[scala.Boolean] = js.undefined,
    onDestroy: () => scala.Unit = null,
    renderTpl: js.Any = null,
    scope: js.Any = null,
    setType: /* type */ js.UndefOr[java.lang.String] => ITool = null,
    stopEvent: js.UndefOr[scala.Boolean] = js.undefined,
    toolOwner: extjsLib.ExtNs.IComponent = null,
    tooltip: js.Any = null,
    tooltipType: java.lang.String = null,
    `type`: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): ITool = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (afterRender != null) __obj.updateDynamic("afterRender")(js.Any.fromFunction0(afterRender))
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (disabledCls != null) __obj.updateDynamic("disabledCls")(disabledCls)
    if (handler != null) __obj.updateDynamic("handler")(handler)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (initComponent != null) __obj.updateDynamic("initComponent")(js.Any.fromFunction0(initComponent))
    if (!js.isUndefined(isTool)) __obj.updateDynamic("isTool")(isTool)
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(js.Any.fromFunction0(onDestroy))
    if (renderTpl != null) __obj.updateDynamic("renderTpl")(renderTpl)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (setType != null) __obj.updateDynamic("setType")(js.Any.fromFunction1(setType))
    if (!js.isUndefined(stopEvent)) __obj.updateDynamic("stopEvent")(stopEvent)
    if (toolOwner != null) __obj.updateDynamic("toolOwner")(toolOwner)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipType != null) __obj.updateDynamic("tooltipType")(tooltipType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITool]
  }
}

