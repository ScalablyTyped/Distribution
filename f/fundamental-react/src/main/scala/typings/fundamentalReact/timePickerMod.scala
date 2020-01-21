package typings.fundamentalReact

import typings.fundamentalReact.timeMod.TimeBaseProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/TimePicker/TimePicker", JSImport.Namespace)
@js.native
object timePickerMod extends js.Object {
  @js.native
  class default ()
    extends Component[TimePickerProps, js.Object, js.Any]
  
  /* static members */
  @js.native
  object default extends js.Object {
    var displayName: typings.fundamentalReact.fundamentalReactStrings.TimePicker = js.native
  }
  
  type TimePicker = Component[TimePickerProps, js.Object, js.Any]
  type TimePickerProps = AnonButtonPropsDisabled with TimeBaseProps
}

