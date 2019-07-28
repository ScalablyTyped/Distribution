package typings.ejDotWebDotAll.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgendaViewSettings extends js.Object {
  /** You can customize the Date column display based on the requirement.
    * @Default {null}
    */
  var dateColumnTemplateId: js.UndefOr[String] = js.undefined
  /** You can display the summary of multiple week's appointment by setting this value.
    * @Default {7}
    */
  var daysInAgenda: js.UndefOr[Double] = js.undefined
  /** You can customize the time column display based on the requirement.
    * @Default {null}
    */
  var timeColumnTemplateId: js.UndefOr[String] = js.undefined
}

object AgendaViewSettings {
  @scala.inline
  def apply(
    dateColumnTemplateId: String = null,
    daysInAgenda: Int | Double = null,
    timeColumnTemplateId: String = null
  ): AgendaViewSettings = {
    val __obj = js.Dynamic.literal()
    if (dateColumnTemplateId != null) __obj.updateDynamic("dateColumnTemplateId")(dateColumnTemplateId)
    if (daysInAgenda != null) __obj.updateDynamic("daysInAgenda")(daysInAgenda.asInstanceOf[js.Any])
    if (timeColumnTemplateId != null) __obj.updateDynamic("timeColumnTemplateId")(timeColumnTemplateId)
    __obj.asInstanceOf[AgendaViewSettings]
  }
}

