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
}

