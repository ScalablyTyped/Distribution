package typings.devextreme.mod.DevExpress.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSchedulerAppointment extends CollectionWidgetItem {
  /** @name dxSchedulerAppointment.allDay */
  var allDay: js.UndefOr[Boolean] = js.undefined
  /** @name dxSchedulerAppointment.description */
  var description: js.UndefOr[String] = js.undefined
  /** @name dxSchedulerAppointment.endDate */
  var endDate: js.UndefOr[Date] = js.undefined
  /** @name dxSchedulerAppointment.endDateTimeZone */
  var endDateTimeZone: js.UndefOr[String] = js.undefined
  /** @name dxSchedulerAppointment.recurrenceException */
  var recurrenceException: js.UndefOr[String] = js.undefined
  /** @name dxSchedulerAppointment.recurrenceRule */
  var recurrenceRule: js.UndefOr[String] = js.undefined
  /** @name dxSchedulerAppointment.startDate */
  var startDate: js.UndefOr[Date] = js.undefined
  /** @name dxSchedulerAppointment.startDateTimeZone */
  var startDateTimeZone: js.UndefOr[String] = js.undefined
  /** @name dxSchedulerAppointment.template */
  @JSName("template")
  var template_dxSchedulerAppointment: js.UndefOr[typings.devextreme.mod.DevExpress.core.template] = js.undefined
}

object dxSchedulerAppointment {
  @scala.inline
  def apply(
    allDay: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    endDate: Date = null,
    endDateTimeZone: String = null,
    html: String = null,
    recurrenceException: String = null,
    recurrenceRule: String = null,
    startDate: Date = null,
    startDateTimeZone: String = null,
    template: typings.devextreme.mod.DevExpress.core.template = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxSchedulerAppointment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allDay)) __obj.updateDynamic("allDay")(allDay.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (endDateTimeZone != null) __obj.updateDynamic("endDateTimeZone")(endDateTimeZone.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (recurrenceException != null) __obj.updateDynamic("recurrenceException")(recurrenceException.asInstanceOf[js.Any])
    if (recurrenceRule != null) __obj.updateDynamic("recurrenceRule")(recurrenceRule.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (startDateTimeZone != null) __obj.updateDynamic("startDateTimeZone")(startDateTimeZone.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSchedulerAppointment]
  }
}

