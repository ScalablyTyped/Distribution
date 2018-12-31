package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client event that occurs after a spelling check is complete.
  */
trait ASPxClientSpellCheckerAfterCheckEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the text that has been checked.
    * Value: A string, containing checked text.
    */
  var checkedText: java.lang.String
  /**
    * Gets the programmatic identifier assigned to the control which has been checked.
    * Value: A string, containing the control's identifier.
    */
  var controlId: java.lang.String
  /**
    * Gets a value specifying whether spell checking is finished or stopped by the user.
    * Value: A string value identifying the reason ("Default" or "User").
    */
  var reason: java.lang.String
}

