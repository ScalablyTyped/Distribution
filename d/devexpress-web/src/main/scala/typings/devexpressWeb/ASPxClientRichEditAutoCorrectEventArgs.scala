package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.AutoCorrect event.
  */
trait ASPxClientRichEditAutoCorrectEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies whether the event is handled.
    */
  var handled: Boolean
  /**
    * Gets the input string's interval.
    */
  var interval: Interval
  /**
    * Gets the input string to check whether it should be replaced.
    */
  var text: String
}

object ASPxClientRichEditAutoCorrectEventArgs {
  @scala.inline
  def apply(handled: Boolean, interval: Interval, text: String): ASPxClientRichEditAutoCorrectEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditAutoCorrectEventArgs]
  }
}

