package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a set properties providing the current information about certain document structural elements.
  */
@JSGlobal("RichEditDocument")
@js.native
class RichEditDocument () extends js.Object {
  /**
    * Provides information about numbered paragraphs in the document.
    */
  val abstractNumberingListsInfo: js.Array[AbstractNumberingList] = js.native
  /**
    * Provides the information about the active sub-document.
    */
  val activeSubDocument: SubDocument = js.native
  /**
    * Provides information about character styles in the current document.
    */
  val characterStylesInfo: js.Array[CharacterStyle] = js.native
  /**
    * Provides access to the document's main sub-document.
    */
  val mainSubDocument: SubDocument = js.native
  /**
    * Provides information about paragraph styles in the current document.
    */
  val paragraphStylesInfo: js.Array[ParagraphStyle] = js.native
  /**
    * Provides information about sections in the current document.
    */
  val sectionsInfo: js.Array[Section] = js.native
  /**
    * Provides information about spell checking in the current document.
    */
  val spellingInfo: SpellingInfo = js.native
  /**
    * Provides access to the document's sub-documents.
    */
  val subDocuments: js.Array[SubDocument] = js.native
  /**
    * Provides information about table styles in the current document.
    */
  val tableStylesInfo: js.Array[TableStyle] = js.native
  /**
    * Returns the sub-document with the specified identifier. A SubDocument value specifying the sub-document.
    * @param subDocumentId An integer value specifying the required sub-document.
    */
  def getSubDocumentById(subDocumentId: Double): SubDocument = js.native
}

