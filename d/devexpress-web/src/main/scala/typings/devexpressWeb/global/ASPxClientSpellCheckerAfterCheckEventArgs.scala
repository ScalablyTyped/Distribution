package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client event that occurs after a spelling check is complete.
  */
@JSGlobal("ASPxClientSpellCheckerAfterCheckEventArgs")
@js.native
class ASPxClientSpellCheckerAfterCheckEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientSpellCheckerAfterCheckEventArgs {
  def this(controlId: String, checkedText: String) = this()
  def this(controlId: String, checkedText: String, reason: String) = this()
  /**
    * Gets the text that has been checked.
    */
  /* CompleteClass */
  override var checkedText: String = js.native
  /**
    * Gets the programmatic identifier assigned to the control which has been checked.
    */
  /* CompleteClass */
  override var controlId: String = js.native
  /**
    * Gets a value specifying whether spell checking is finished or stopped by the user.
    */
  /* CompleteClass */
  override var reason: String = js.native
}

