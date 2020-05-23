package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.ContentInserted event.
  */
trait ASPxClientRichEditContentInsertedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the text buffer interval related to the inserted content.
    */
  var interval: Interval
  /**
    * Gets the active sub-document's identifier.
    */
  var subDocumentId: Double
}

object ASPxClientRichEditContentInsertedEventArgs {
  @scala.inline
  def apply(interval: Interval, subDocumentId: Double): ASPxClientRichEditContentInsertedEventArgs = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], subDocumentId = subDocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditContentInsertedEventArgs]
  }
}

