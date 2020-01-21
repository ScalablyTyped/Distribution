package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for an event that occurs before a spelling check is started. Represents the client-side equivalent of the BeforeCheckEventArgs class.
  */
@JSGlobal("ASPxClientSpellCheckerBeforeCheckEventArgs")
@js.native
class ASPxClientSpellCheckerBeforeCheckEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSpellCheckerBeforeCheckEventArgs class with specified settings.
    * @param controlId A string, containing the control's programmatic identifier.
    */
  def this(controlId: String) = this()
  /**
    * Gets the programmatic identifier assigned to the control which is going to be checked.
    */
  var controlId: String = js.native
}

