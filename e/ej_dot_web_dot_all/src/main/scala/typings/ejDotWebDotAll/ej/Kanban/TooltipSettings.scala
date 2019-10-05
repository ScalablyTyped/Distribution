package typings.ejDotWebDotAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipSettings extends js.Object {
  /** To enable or disable the tooltip display.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  /** To customize the tooltip display based on your requirements.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.undefined
}

object TooltipSettings {
  @scala.inline
  def apply(enable: js.UndefOr[Boolean] = js.undefined, template: String = null): TooltipSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[TooltipSettings]
  }
}

