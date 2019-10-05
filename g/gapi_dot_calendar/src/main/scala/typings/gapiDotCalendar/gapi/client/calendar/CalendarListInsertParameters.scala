package typings.gapiDotCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarListInsertParameters extends js.Object {
  // Parameters
  // Optional query parameters
  var colorRgbFormat: js.UndefOr[Boolean] = js.undefined
  // CalendarList resource
  var resource: CalendarListInput
}

object CalendarListInsertParameters {
  @scala.inline
  def apply(resource: CalendarListInput, colorRgbFormat: js.UndefOr[Boolean] = js.undefined): CalendarListInsertParameters = {
    val __obj = js.Dynamic.literal(resource = resource)
    if (!js.isUndefined(colorRgbFormat)) __obj.updateDynamic("colorRgbFormat")(colorRgbFormat)
    __obj.asInstanceOf[CalendarListInsertParameters]
  }
}

