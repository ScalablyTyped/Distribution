package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a base class for the ASPxClientSpinEdit object.
  */
@JSGlobal("ASPxClientSpinEditBase")
@js.native
class ASPxClientSpinEditBase () extends ASPxClientButtonEditBase {
  /**
    * This event is not in effect for the ASPxClientSpinEditBase. Use the ASPxClientEdit.ValueChanged event instead. Alternatively, use an editor type specific event, such as ASPxClientSpinEdit.NumberChanged for an ASPxClientSpinEdit or ASPxClientTimeEdit.DateChanged for an ASPxClientTimeEdit.
    */
  @JSName("TextChanged")
  var TextChanged_ASPxClientSpinEditBase: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientSpinEditBase]] = js.native
}

