package typings.extjs.Ext.panel

import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITool extends IComponent {
  /** [Config Option] (Function) */
  var callback: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var isTool: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the type of the tool
  		* @param type String The new type. See the type config.
  		* @returns Ext.panel.Tool this
  		*/
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[String], this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var stopEvent: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.Component) */
  var toolOwner: js.UndefOr[IComponent] = js.undefined
  /** [Config Option] (String/Object) */
  var tooltip: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var tooltipType: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.undefined
}

object ITool {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    callback: js.Any = null,
    handler: js.Any = null,
    isTool: js.UndefOr[Boolean] = js.undefined,
    scope: js.Any = null,
    setType: /* type */ js.UndefOr[String] => ITool = null,
    stopEvent: js.UndefOr[Boolean] = js.undefined,
    toolOwner: IComponent = null,
    tooltip: js.Any = null,
    tooltipType: String = null,
    `type`: String = null
  ): ITool = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (!js.isUndefined(isTool)) __obj.updateDynamic("isTool")(isTool.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (setType != null) __obj.updateDynamic("setType")(js.Any.fromFunction1(setType))
    if (!js.isUndefined(stopEvent)) __obj.updateDynamic("stopEvent")(stopEvent.asInstanceOf[js.Any])
    if (toolOwner != null) __obj.updateDynamic("toolOwner")(toolOwner.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipType != null) __obj.updateDynamic("tooltipType")(tooltipType.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITool]
  }
}

