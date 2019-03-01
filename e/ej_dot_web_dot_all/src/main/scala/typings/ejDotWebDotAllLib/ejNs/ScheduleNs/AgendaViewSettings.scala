package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgendaViewSettings extends js.Object {
  /** You can customize the Date column display based on the requirement.
    * @Default {null}
    */
  var dateColumnTemplateId: js.UndefOr[java.lang.String] = js.undefined
  /** You can display the summary of multiple week's appointment by setting this value.
    * @Default {7}
    */
  var daysInAgenda: js.UndefOr[scala.Double] = js.undefined
  /** You can customize the time column display based on the requirement.
    * @Default {null}
    */
  var timeColumnTemplateId: js.UndefOr[java.lang.String] = js.undefined
}

object AgendaViewSettings {
  @scala.inline
  def apply(
    dateColumnTemplateId: java.lang.String = null,
    daysInAgenda: scala.Int | scala.Double = null,
    timeColumnTemplateId: java.lang.String = null
  ): AgendaViewSettings = {
    val __obj = js.Dynamic.literal()
    if (dateColumnTemplateId != null) __obj.updateDynamic("dateColumnTemplateId")(dateColumnTemplateId)
    if (daysInAgenda != null) __obj.updateDynamic("daysInAgenda")(daysInAgenda.asInstanceOf[js.Any])
    if (timeColumnTemplateId != null) __obj.updateDynamic("timeColumnTemplateId")(timeColumnTemplateId)
    __obj.asInstanceOf[AgendaViewSettings]
  }
}

