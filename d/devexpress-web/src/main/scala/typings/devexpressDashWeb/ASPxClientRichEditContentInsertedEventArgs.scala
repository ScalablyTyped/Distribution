package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ContentInserted event.
  */
trait ASPxClientRichEditContentInsertedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the text buffer interval related to the inserted content.
    * Value: An object that stores the inserted content's length and position.
    */
  var interval: Interval
  /**
    * Gets the active sub-document's identifier.
    * Value: An integer value specifying the sub-document's identifier.
    */
  var subDocumentId: Double
}

object ASPxClientRichEditContentInsertedEventArgs {
  @scala.inline
  def apply(interval: Interval, subDocumentId: Double): ASPxClientRichEditContentInsertedEventArgs = {
    val __obj = js.Dynamic.literal(interval = interval, subDocumentId = subDocumentId)
  
    __obj.asInstanceOf[ASPxClientRichEditContentInsertedEventArgs]
  }
}

