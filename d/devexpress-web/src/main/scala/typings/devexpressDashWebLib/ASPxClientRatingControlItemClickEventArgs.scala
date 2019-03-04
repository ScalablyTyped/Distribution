package typings
package devexpressDashWebLib

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
  var index: scala.Double
}

object ASPxClientRatingControlItemClickEventArgs {
  @scala.inline
  def apply(index: scala.Double, processOnServer: scala.Boolean): ASPxClientRatingControlItemClickEventArgs = {
    val __obj = js.Dynamic.literal(index = index, processOnServer = processOnServer)
  
    __obj.asInstanceOf[ASPxClientRatingControlItemClickEventArgs]
  }
}

