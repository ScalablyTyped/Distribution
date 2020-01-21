package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.AutoCorrect event.
  */
@JSGlobal("ASPxClientRichEditAutoCorrectEventArgs")
@js.native
class ASPxClientRichEditAutoCorrectEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditAutoCorrectEventArgs object. For internal use only.
    * @param text The input string to check whether it should be replaced.
    * @param interval The Interval object specifying the input string.
    * @param handled true if the event is handled and no default processing is required; otherwise false.
    */
  def this(text: js.Any, interval: js.Any, handled: js.Any) = this()
  /**
    * Specifies whether the event is handled.
    */
  var handled: Boolean = js.native
  /**
    * Gets the input string's interval.
    */
  var interval: Interval = js.native
  /**
    * Gets the input string to check whether it should be replaced.
    */
  var text: String = js.native
}

