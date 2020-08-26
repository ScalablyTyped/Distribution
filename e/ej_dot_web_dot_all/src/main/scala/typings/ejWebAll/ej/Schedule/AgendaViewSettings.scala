package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgendaViewSettings extends js.Object {
  /** You can customize the Date column display based on the requirement.
    * @Default {null}
    */
  var dateColumnTemplateId: js.UndefOr[String] = js.native
  /** You can display the summary of multiple week's appointment by setting this value.
    * @Default {7}
    */
  var daysInAgenda: js.UndefOr[Double] = js.native
  /** You can customize the time column display based on the requirement.
    * @Default {null}
    */
  var timeColumnTemplateId: js.UndefOr[String] = js.native
}

object AgendaViewSettings {
  @scala.inline
  def apply(): AgendaViewSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgendaViewSettings]
  }
  @scala.inline
  implicit class AgendaViewSettingsOps[Self <: AgendaViewSettings] (val x: Self) extends AnyVal {
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
    def setDateColumnTemplateId(value: String): Self = this.set("dateColumnTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateColumnTemplateId: Self = this.set("dateColumnTemplateId", js.undefined)
    @scala.inline
    def setDaysInAgenda(value: Double): Self = this.set("daysInAgenda", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDaysInAgenda: Self = this.set("daysInAgenda", js.undefined)
    @scala.inline
    def setTimeColumnTemplateId(value: String): Self = this.set("timeColumnTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeColumnTemplateId: Self = this.set("timeColumnTemplateId", js.undefined)
  }
  
}

