package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a set properties providing the current information about certain document structural elements.
  */
@js.native
trait RichEditDocument extends js.Object {
  
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
    * Returns the sub-document with the specified identifier. A SubDocument value specifying the sub-document.
    * @param subDocumentId An integer value specifying the required sub-document.
    */
  def getSubDocumentById(subDocumentId: Double): SubDocument = js.native
  
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
  implicit class RichEditDocumentOps[Self <: RichEditDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbstractNumberingListsInfoVarargs(value: AbstractNumberingList*): Self = this.set("abstractNumberingListsInfo", js.Array(value :_*))
    
    @scala.inline
    def setAbstractNumberingListsInfo(value: js.Array[AbstractNumberingList]): Self = this.set("abstractNumberingListsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveSubDocument(value: SubDocument): Self = this.set("activeSubDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterStylesInfoVarargs(value: CharacterStyle*): Self = this.set("characterStylesInfo", js.Array(value :_*))
    
    @scala.inline
    def setCharacterStylesInfo(value: js.Array[CharacterStyle]): Self = this.set("characterStylesInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSubDocumentById(value: Double => SubDocument): Self = this.set("getSubDocumentById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMainSubDocument(value: SubDocument): Self = this.set("mainSubDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphStylesInfoVarargs(value: ParagraphStyle*): Self = this.set("paragraphStylesInfo", js.Array(value :_*))
    
    @scala.inline
    def setParagraphStylesInfo(value: js.Array[ParagraphStyle]): Self = this.set("paragraphStylesInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionsInfoVarargs(value: Section*): Self = this.set("sectionsInfo", js.Array(value :_*))
    
    @scala.inline
    def setSectionsInfo(value: js.Array[Section]): Self = this.set("sectionsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellingInfo(value: SpellingInfo): Self = this.set("spellingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDocumentsVarargs(value: SubDocument*): Self = this.set("subDocuments", js.Array(value :_*))
    
    @scala.inline
    def setSubDocuments(value: js.Array[SubDocument]): Self = this.set("subDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableStylesInfoVarargs(value: TableStyle*): Self = this.set("tableStylesInfo", js.Array(value :_*))
    
    @scala.inline
    def setTableStylesInfo(value: js.Array[TableStyle]): Self = this.set("tableStylesInfo", value.asInstanceOf[js.Any])
  }
}
