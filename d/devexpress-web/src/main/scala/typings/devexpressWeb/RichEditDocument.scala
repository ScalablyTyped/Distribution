package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a set properties providing the current information about certain document structural elements.
  */
trait RichEditDocument extends js.Object {
  /**
    * Provides information about numbered paragraphs in the document.
    */
  val abstractNumberingListsInfo: js.Array[AbstractNumberingList]
  /**
    * Provides the information about the active sub-document.
    */
  val activeSubDocument: SubDocument
  /**
    * Provides information about character styles in the current document.
    */
  val characterStylesInfo: js.Array[CharacterStyle]
  /**
    * Provides access to the document's main sub-document.
    */
  val mainSubDocument: SubDocument
  /**
    * Provides information about paragraph styles in the current document.
    */
  val paragraphStylesInfo: js.Array[ParagraphStyle]
  /**
    * Provides information about sections in the current document.
    */
  val sectionsInfo: js.Array[Section]
  /**
    * Provides information about spell checking in the current document.
    */
  val spellingInfo: SpellingInfo
  /**
    * Provides access to the document's sub-documents.
    */
  val subDocuments: js.Array[SubDocument]
  /**
    * Provides information about table styles in the current document.
    */
  val tableStylesInfo: js.Array[TableStyle]
  /**
    * Returns the sub-document with the specified identifier. A SubDocument value specifying the sub-document.
    * @param subDocumentId An integer value specifying the required sub-document.
    */
  def getSubDocumentById(subDocumentId: Double): SubDocument
}

object RichEditDocument {
  @scala.inline
  def apply(
    abstractNumberingListsInfo: js.Array[AbstractNumberingList],
    activeSubDocument: SubDocument,
    characterStylesInfo: js.Array[CharacterStyle],
    getSubDocumentById: Double => SubDocument,
    mainSubDocument: SubDocument,
    paragraphStylesInfo: js.Array[ParagraphStyle],
    sectionsInfo: js.Array[Section],
    spellingInfo: SpellingInfo,
    subDocuments: js.Array[SubDocument],
    tableStylesInfo: js.Array[TableStyle]
  ): RichEditDocument = {
    val __obj = js.Dynamic.literal(abstractNumberingListsInfo = abstractNumberingListsInfo.asInstanceOf[js.Any], activeSubDocument = activeSubDocument.asInstanceOf[js.Any], characterStylesInfo = characterStylesInfo.asInstanceOf[js.Any], getSubDocumentById = js.Any.fromFunction1(getSubDocumentById), mainSubDocument = mainSubDocument.asInstanceOf[js.Any], paragraphStylesInfo = paragraphStylesInfo.asInstanceOf[js.Any], sectionsInfo = sectionsInfo.asInstanceOf[js.Any], spellingInfo = spellingInfo.asInstanceOf[js.Any], subDocuments = subDocuments.asInstanceOf[js.Any], tableStylesInfo = tableStylesInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichEditDocument]
  }
}

