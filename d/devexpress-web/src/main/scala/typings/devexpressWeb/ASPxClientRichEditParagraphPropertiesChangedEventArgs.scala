package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.ParagraphPropertiesChanged event.
  */
trait ASPxClientRichEditParagraphPropertiesChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the changed paragraph's index.
    */
  var paragraphIndex: Double
  /**
    * Gets the active sub-document's identifier.
    */
  var subDocumentId: Double
}

object ASPxClientRichEditParagraphPropertiesChangedEventArgs {
  @scala.inline
  def apply(paragraphIndex: Double, subDocumentId: Double): ASPxClientRichEditParagraphPropertiesChangedEventArgs = {
    val __obj = js.Dynamic.literal(paragraphIndex = paragraphIndex.asInstanceOf[js.Any], subDocumentId = subDocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditParagraphPropertiesChangedEventArgs]
  }
}

