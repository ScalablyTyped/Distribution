package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ContentRemoved event.
  */
trait ASPxClientRichEditContentRemovedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the text buffer interval related to the removed content.
    * Value: An object that stores the removed content's length and position.
    */
  var interval: Interval
  /**
    * Gets the active sub-document's identifier.
    * Value: An integer value specifying the sub-document's identifier
    */
  var subDocumentId: scala.Double
}

object ASPxClientRichEditContentRemovedEventArgs {
  @scala.inline
  def apply(interval: Interval, subDocumentId: scala.Double): ASPxClientRichEditContentRemovedEventArgs = {
    val __obj = js.Dynamic.literal(interval = interval, subDocumentId = subDocumentId)
  
    __obj.asInstanceOf[ASPxClientRichEditContentRemovedEventArgs]
  }
}

