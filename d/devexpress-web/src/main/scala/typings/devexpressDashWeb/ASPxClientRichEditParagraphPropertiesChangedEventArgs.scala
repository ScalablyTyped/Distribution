package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ParagraphPropertiesChanged event.
  */
trait ASPxClientRichEditParagraphPropertiesChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the changed paragraph's index.
    * Value: An integer value specifying the changed paragraph's identifier.
    */
  var paragraphIndex: Double
  /**
    * Gets the active sub-document's identifier.
    * Value: An integer value specifying the sub-document's identifier
    */
  var subDocumentId: Double
}

object ASPxClientRichEditParagraphPropertiesChangedEventArgs {
  @scala.inline
  def apply(paragraphIndex: Double, subDocumentId: Double): ASPxClientRichEditParagraphPropertiesChangedEventArgs = {
    val __obj = js.Dynamic.literal(paragraphIndex = paragraphIndex, subDocumentId = subDocumentId)
  
    __obj.asInstanceOf[ASPxClientRichEditParagraphPropertiesChangedEventArgs]
  }
}

