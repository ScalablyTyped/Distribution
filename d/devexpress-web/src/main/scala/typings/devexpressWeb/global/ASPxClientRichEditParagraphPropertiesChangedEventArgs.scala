package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.ParagraphPropertiesChanged event.
  */
@JSGlobal("ASPxClientRichEditParagraphPropertiesChangedEventArgs")
@js.native
class ASPxClientRichEditParagraphPropertiesChangedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientRichEditParagraphPropertiesChangedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditParagraphPropertiesChangedEventArgs object. For internal use only.
    * @param subDocumentId An identifier of a sub-document containing the changed paragraph.
    * @param paragraphIndex The changed paragraph's index.
    */
  def this(subDocumentId: Double, paragraphIndex: Double) = this()
  /**
    * Gets the changed paragraph's index.
    */
  /* CompleteClass */
  override var paragraphIndex: Double = js.native
  /**
    * Gets the active sub-document's identifier.
    */
  /* CompleteClass */
  override var subDocumentId: Double = js.native
}

