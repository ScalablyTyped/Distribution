package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a set properties providing the current information about certain document structural elements.
  */
trait RichEditDocument extends js.Object {
  /**
    * Provides information about numbered paragraphs in the document.
    * Value: An array of AbstractNumberingList objects storing the information about numbered paragraphs.
    */
  var abstractNumberingListsInfo: js.Array[AbstractNumberingList]
  /**
    * Provides the information about the active sub-document.
    * Value: A <see cref="SubDocument" /> object storing information about the essential document functionality.
    */
  var activeSubDocument: SubDocument
  /**
    * Provides information about character styles in the current document.
    * Value: An array of CharacterStyle objects storing information about character styles.
    */
  var characterStylesInfo: js.Array[CharacterStyle]
  /**
    * Provides access to the document's main sub-document.
    * Value: A <see cref="SubDocument" /> object storing the main sub-document.
    */
  var mainSubDocument: SubDocument
  /**
    * Provides information about paragraph styles in the current document.
    * Value: An array of ParagraphStyle objects storing information about paragraph styles.
    */
  var paragraphStylesInfo: js.Array[ParagraphStyle]
  /**
    * Provides information about sections in the current document.
    * Value: An array of Section objects storing information about sections.
    */
  var sectionsInfo: js.Array[Section]
  /**
    * Provides information about spell checking in the current document.
    * Value: A <see cref="SpellingInfo" /> object.
    */
  var spellingInfo: SpellingInfo
  /**
    * Provides access to the document's sub-documents.
    * Value: An array of the <see cref="SubDocument[]" />
    */
  var subDocuments: js.Array[SubDocument]
  /**
    * Provides information about table styles in the current document.
    * Value: An array of TableStyle objects storing information about table styles.
    */
  var tableStylesInfo: js.Array[TableStyle]
  /**
    * Returns the sub-document with the specified identifier.
    * @param subDocumentId An integer value specifying the required sub-document.
    */
  def getSubDocumentById(subDocumentId: scala.Double): SubDocument
}

