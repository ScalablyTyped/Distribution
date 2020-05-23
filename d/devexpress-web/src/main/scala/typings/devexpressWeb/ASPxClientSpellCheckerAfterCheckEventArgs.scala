package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client event that occurs after a spelling check is complete.
  */
trait ASPxClientSpellCheckerAfterCheckEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the text that has been checked.
    */
  var checkedText: String
  /**
    * Gets the programmatic identifier assigned to the control which has been checked.
    */
  var controlId: String
  /**
    * Gets a value specifying whether spell checking is finished or stopped by the user.
    */
  var reason: String
}

object ASPxClientSpellCheckerAfterCheckEventArgs {
  @scala.inline
  def apply(checkedText: String, controlId: String, reason: String): ASPxClientSpellCheckerAfterCheckEventArgs = {
    val __obj = js.Dynamic.literal(checkedText = checkedText.asInstanceOf[js.Any], controlId = controlId.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpellCheckerAfterCheckEventArgs]
  }
}

