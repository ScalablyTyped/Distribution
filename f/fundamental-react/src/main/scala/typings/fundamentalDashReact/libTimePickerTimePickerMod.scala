package typings.fundamentalDashReact

import typings.fundamentalDashReact.libTimeTimeMod.TimeBaseProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/TimePicker/TimePicker", JSImport.Namespace)
@js.native
object libTimePickerTimePickerMod extends js.Object {
  @js.native
  class default ()
    extends Component[TimePickerProps, js.Object, js.Any]
  
  /* static members */
  @js.native
  object default extends js.Object {
    var displayName: typings.fundamentalDashReact.fundamentalDashReactStrings.TimePicker = js.native
  }
  
  type TimePicker = Component[TimePickerProps, js.Object, js.Any]
  type TimePickerProps = Anon_ButtonPropsDisabled with TimeBaseProps
}

