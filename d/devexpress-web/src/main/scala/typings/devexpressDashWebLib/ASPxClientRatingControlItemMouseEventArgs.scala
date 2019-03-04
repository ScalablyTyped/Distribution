package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the rating control's ItemMouseOver and ItemMouseOut client events (such as ItemMouseOut).
  */
trait ASPxClientRatingControlItemMouseEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the index of the item related to the event.
    * Value: An integer value that represents the related item's index.
    */
  var index: scala.Double
}

object ASPxClientRatingControlItemMouseEventArgs {
  @scala.inline
  def apply(index: scala.Double): ASPxClientRatingControlItemMouseEventArgs = {
    val __obj = js.Dynamic.literal(index = index)
  
    __obj.asInstanceOf[ASPxClientRatingControlItemMouseEventArgs]
  }
}

