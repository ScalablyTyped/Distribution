package typings.fundamentalDashReact

import typings.fundamentalDashReact.libCalendarCalendarMod.CalendarBaseProps
import typings.fundamentalDashReact.libDatePickerDatePickerMod.DatePicker
import typings.fundamentalDashReact.libDatePickerDatePickerMod.DatePickerProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/DatePicker/DatePicker", JSImport.Namespace)
@js.native
object libDatePickerDatePickerMod extends js.Object {
  @js.native
  class default () extends DatePicker
  
  type DatePicker = Component[DatePickerProps, js.Object, js.Any]
  type DatePickerProps = Anon_ButtonProps with CalendarBaseProps
}

