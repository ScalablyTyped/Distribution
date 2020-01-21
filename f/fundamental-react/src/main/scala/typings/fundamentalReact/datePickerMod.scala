package typings.fundamentalReact

import typings.fundamentalReact.calendarMod.CalendarBaseProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/DatePicker/DatePicker", JSImport.Namespace)
@js.native
object datePickerMod extends js.Object {
  @js.native
  class default ()
    extends Component[DatePickerProps, js.Object, js.Any]
  
  type DatePicker = Component[DatePickerProps, js.Object, js.Any]
  type DatePickerProps = AnonButtonPropsCompact with CalendarBaseProps
}

