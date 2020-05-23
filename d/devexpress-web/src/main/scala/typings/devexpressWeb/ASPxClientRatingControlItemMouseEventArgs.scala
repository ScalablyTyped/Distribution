package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the rating control's ItemMouseOver and ItemMouseOut client events (such as ASPxClientRatingControl.ItemMouseOver and ASPxClientRatingControl.ItemMouseOut).
  */
trait ASPxClientRatingControlItemMouseEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the index of the item related to the event.
    */
  var index: Double
}

object ASPxClientRatingControlItemMouseEventArgs {
  @scala.inline
  def apply(index: Double): ASPxClientRatingControlItemMouseEventArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRatingControlItemMouseEventArgs]
  }
}

