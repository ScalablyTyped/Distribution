package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client event that occurs after a spelling check is complete.
  */
@JSGlobal("ASPxClientSpellCheckerAfterCheckEventArgs")
@js.native
class ASPxClientSpellCheckerAfterCheckEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientSpellCheckerAfterCheckEventArgs {
  /**
    * Initializes a new instance of the class.
    * @param controlId The control ID.
    * @param checkedText The checked text.
    * @param reason Specifies whether spell checking is finished or stopped by the user.
    */
  def this(controlId: String, checkedText: String) = this()
  def this(controlId: String, checkedText: String, reason: String) = this()
}
