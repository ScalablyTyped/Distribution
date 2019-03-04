package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the AutoCorrect event.
  */
trait ASPxClientRichEditAutoCorrectEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies whether the event is handled.
    * Value: true, if the event is handled and further processing is not required; otherwise false.
    */
  var handled: scala.Boolean
  /**
    * Gets the input string's interval.
    * Value: An <see cref="Interval" /> value specifying the input string's interval within an active sub-document.
    */
  var interval: Interval
  /**
    * Gets the input string to check whether it should be replaced.
    * Value: A string that can be replaced.
    */
  var text: java.lang.String
}

object ASPxClientRichEditAutoCorrectEventArgs {
  @scala.inline
  def apply(handled: scala.Boolean, interval: Interval, text: java.lang.String): ASPxClientRichEditAutoCorrectEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled, interval = interval, text = text)
  
    __obj.asInstanceOf[ASPxClientRichEditAutoCorrectEventArgs]
  }
}

