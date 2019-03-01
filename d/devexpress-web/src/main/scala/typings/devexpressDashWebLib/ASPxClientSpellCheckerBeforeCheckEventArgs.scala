package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for an event that occurs before a spelling check is started. Represents the client-side equivalent of the BeforeCheckEventArgs class.
  */
trait ASPxClientSpellCheckerBeforeCheckEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the programmatic identifier assigned to the control which is going to be checked.
    * Value: A string, containing the control's identifier.
    */
  var controlId: java.lang.String
}

object ASPxClientSpellCheckerBeforeCheckEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, controlId: java.lang.String): ASPxClientSpellCheckerBeforeCheckEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("controlId")(controlId)
    __obj.asInstanceOf[ASPxClientSpellCheckerBeforeCheckEventArgs]
  }
}

