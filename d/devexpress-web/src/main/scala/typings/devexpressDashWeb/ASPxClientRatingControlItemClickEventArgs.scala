package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ItemClick event.
  */
trait ASPxClientRatingControlItemClickEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the index of the item related to the event.
    * Value: An integer value that represents the clicked item's index.
    */
  var index: Double
}

object ASPxClientRatingControlItemClickEventArgs {
  @scala.inline
  def apply(index: Double, processOnServer: Boolean): ASPxClientRatingControlItemClickEventArgs = {
    val __obj = js.Dynamic.literal(index = index, processOnServer = processOnServer)
  
    __obj.asInstanceOf[ASPxClientRatingControlItemClickEventArgs]
  }
}

