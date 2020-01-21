package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipSettings extends js.Object {
  /** Enables or disables the tooltip display.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  /** Template design that customizes the tooltip. All the field names that are mapped from dataSource to the appropriate field properties within the appointmentSettings can be accessed
    * within the template.
    * @Default {null}
    */
  var templateId: js.UndefOr[String] = js.undefined
}

object TooltipSettings {
  @scala.inline
  def apply(enable: js.UndefOr[Boolean] = js.undefined, templateId: String = null): TooltipSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (templateId != null) __obj.updateDynamic("templateId")(templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipSettings]
  }
}

