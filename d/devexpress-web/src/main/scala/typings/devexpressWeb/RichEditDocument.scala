package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a set properties providing the current information about certain document structural elements.
  */
trait RichEditDocument extends StObject {
  
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
    * Returns the sub-document with the specified identifier. A SubDocument value specifying the sub-document.
    * @param subDocumentId An integer value specifying the required sub-document.
    */
  def getSubDocumentById(subDocumentId: Double): SubDocument
  
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
  
  @scala.inline
  implicit class RichEditDocumentMutableBuilder[Self <: RichEditDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbstractNumberingListsInfo(value: js.Array[AbstractNumberingList]): Self = StObject.set(x, "abstractNumberingListsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbstractNumberingListsInfoVarargs(value: AbstractNumberingList*): Self = StObject.set(x, "abstractNumberingListsInfo", js.Array(value :_*))
    
    @scala.inline
    def setActiveSubDocument(value: SubDocument): Self = StObject.set(x, "activeSubDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterStylesInfo(value: js.Array[CharacterStyle]): Self = StObject.set(x, "characterStylesInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterStylesInfoVarargs(value: CharacterStyle*): Self = StObject.set(x, "characterStylesInfo", js.Array(value :_*))
    
    @scala.inline
    def setGetSubDocumentById(value: Double => SubDocument): Self = StObject.set(x, "getSubDocumentById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMainSubDocument(value: SubDocument): Self = StObject.set(x, "mainSubDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphStylesInfo(value: js.Array[ParagraphStyle]): Self = StObject.set(x, "paragraphStylesInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphStylesInfoVarargs(value: ParagraphStyle*): Self = StObject.set(x, "paragraphStylesInfo", js.Array(value :_*))
    
    @scala.inline
    def setSectionsInfo(value: js.Array[Section]): Self = StObject.set(x, "sectionsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionsInfoVarargs(value: Section*): Self = StObject.set(x, "sectionsInfo", js.Array(value :_*))
    
    @scala.inline
    def setSpellingInfo(value: SpellingInfo): Self = StObject.set(x, "spellingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDocuments(value: js.Array[SubDocument]): Self = StObject.set(x, "subDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDocumentsVarargs(value: SubDocument*): Self = StObject.set(x, "subDocuments", js.Array(value :_*))
    
    @scala.inline
    def setTableStylesInfo(value: js.Array[TableStyle]): Self = StObject.set(x, "tableStylesInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableStylesInfoVarargs(value: TableStyle*): Self = StObject.set(x, "tableStylesInfo", js.Array(value :_*))
  }
}
