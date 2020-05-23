package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for an event that occurs before a spelling check is started. Represents the client-side equivalent of the BeforeCheckEventArgs class.
  */
trait ASPxClientSpellCheckerBeforeCheckEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the programmatic identifier assigned to the control which is going to be checked.
    */
  var controlId: String
}

object ASPxClientSpellCheckerBeforeCheckEventArgs {
  @scala.inline
  def apply(cancel: Boolean, controlId: String): ASPxClientSpellCheckerBeforeCheckEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], controlId = controlId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpellCheckerBeforeCheckEventArgs]
  }
}

