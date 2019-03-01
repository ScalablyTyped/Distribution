package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipSettings extends js.Object {
  /** Enables or disables the tooltip display.
    * @Default {false}
    */
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  /** Template design that customizes the tooltip. All the field names that are mapped from dataSource to the appropriate field properties within the appointmentSettings can be accessed
    * within the template.
    * @Default {null}
    */
  var templateId: js.UndefOr[java.lang.String] = js.undefined
}

object TooltipSettings {
  @scala.inline
  def apply(enable: js.UndefOr[scala.Boolean] = js.undefined, templateId: java.lang.String = null): TooltipSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (templateId != null) __obj.updateDynamic("templateId")(templateId)
    __obj.asInstanceOf[TooltipSettings]
  }
}

