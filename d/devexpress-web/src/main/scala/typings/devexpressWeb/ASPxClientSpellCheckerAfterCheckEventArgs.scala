package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client event that occurs after a spelling check is complete.
  */
@JSGlobal("ASPxClientSpellCheckerAfterCheckEventArgs")
@js.native
class ASPxClientSpellCheckerAfterCheckEventArgs protected () extends ASPxClientEventArgs {
  def this(controlId: String, checkedText: String) = this()
  def this(controlId: String, checkedText: String, reason: String) = this()
  /**
    * Gets the text that has been checked.
    */
  var checkedText: String = js.native
  /**
    * Gets the programmatic identifier assigned to the control which has been checked.
    */
  var controlId: String = js.native
  /**
    * Gets a value specifying whether spell checking is finished or stopped by the user.
    */
  var reason: String = js.native
}

