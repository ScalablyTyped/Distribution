package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipSettings extends js.Object {
  /** Enables or disables the tooltip display.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
  /** Template design that customizes the tooltip. All the field names that are mapped from dataSource to the appropriate field properties within the appointmentSettings can be accessed
    * within the template.
    * @Default {null}
    */
  var templateId: js.UndefOr[String] = js.native
}

object TooltipSettings {
  @scala.inline
  def apply(): TooltipSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipSettings]
  }
  @scala.inline
  implicit class TooltipSettingsOps[Self <: TooltipSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setTemplateId(value: String): Self = this.set("templateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateId: Self = this.set("templateId", js.undefined)
  }
  
}

