package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.ContentRemoved event.
  */
trait ASPxClientRichEditContentRemovedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the text buffer interval related to the removed content.
    */
  var interval: Interval
  /**
    * Gets the active sub-document's identifier.
    */
  var subDocumentId: Double
}

object ASPxClientRichEditContentRemovedEventArgs {
  @scala.inline
  def apply(interval: Interval, subDocumentId: Double): ASPxClientRichEditContentRemovedEventArgs = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], subDocumentId = subDocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditContentRemovedEventArgs]
  }
}

