package typings.devextreme.mod.DevExpress.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSchedulerAppointment extends CollectionWidgetItem {
  /** Specifies whether the appointment lasts all day. */
  var allDay: js.UndefOr[Boolean] = js.undefined
  /** Specifies a detail description of the appointment. */
  var description: js.UndefOr[String] = js.undefined
  /** Specifies the ending of the appointment. */
  var endDate: js.UndefOr[Date] = js.undefined
  /** Specifies the timezone of the appointment end date. Applies only if timeZone is not specified. */
  var endDateTimeZone: js.UndefOr[String] = js.undefined
  /** Specifies exceptions for the current recurring appointment. */
  var recurrenceException: js.UndefOr[String] = js.undefined
  /** Specifies a recurrence rule for generating recurring appointments in the scheduler. */
  var recurrenceRule: js.UndefOr[String] = js.undefined
  /** Specifies the start of the appointment. */
  var startDate: js.UndefOr[Date] = js.undefined
  /** Specifies the timezone of the appointment start date. Applies only if timeZone is not specified. */
  var startDateTimeZone: js.UndefOr[String] = js.undefined
  /** Specifies a template that should be used to render this appointment only. */
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

