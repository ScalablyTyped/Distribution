package typings.fundamentalDashReact

import typings.fundamentalDashReact.libCalendarCalendarMod.CalendarBaseProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/DatePicker/DatePicker", JSImport.Namespace)
@js.native
object libDatePickerDatePickerMod extends js.Object {
  @js.native
  class default ()
    extends Component[DatePickerProps, js.Object, js.Any]
  
  type DatePicker = Component[DatePickerProps, js.Object, js.Any]
  type DatePickerProps = Anon_ButtonPropsCompact with CalendarBaseProps
}

