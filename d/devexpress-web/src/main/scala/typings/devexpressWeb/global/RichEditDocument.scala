package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a set properties providing the current information about certain document structural elements.
  */
@JSGlobal("RichEditDocument")
@js.native
open class RichEditDocument ()
  extends StObject
     with typings.devexpressWeb.RichEditDocument {
  
  /**
    * Provides information about numbered paragraphs in the document.
    */
  /* CompleteClass */
  override val abstractNumberingListsInfo: js.Array[typings.devexpressWeb.AbstractNumberingList] = js.native
  
  /**
    * Provides the information about the active sub-document.
    */
  /* CompleteClass */
  override val activeSubDocument: typings.devexpressWeb.SubDocument = js.native
  
  /**
    * Provides information about character styles in the current document.
    */
  /* CompleteClass */
  override val characterStylesInfo: js.Array[typings.devexpressWeb.CharacterStyle] = js.native
  
  /**
    * Returns the sub-document with the specified identifier. A SubDocument value specifying the sub-document.
    * @param subDocumentId An integer value specifying the required sub-document.
    */
  /* CompleteClass */
  override def getSubDocumentById(subDocumentId: Double): typings.devexpressWeb.SubDocument = js.native
  
  /**
    * Provides access to the document's main sub-document.
    */
  /* CompleteClass */
  override val mainSubDocument: typings.devexpressWeb.SubDocument = js.native
  
  /**
    * Provides information about paragraph styles in the current document.
    */
  /* CompleteClass */
  override val paragraphStylesInfo: js.Array[typings.devexpressWeb.ParagraphStyle] = js.native
  
  /**
    * Provides information about sections in the current document.
    */
  /* CompleteClass */
  override val sectionsInfo: js.Array[typings.devexpressWeb.Section] = js.native
  
  /**
    * Provides information about spell checking in the current document.
    */
  /* CompleteClass */
  override val spellingInfo: typings.devexpressWeb.SpellingInfo = js.native
  
  /**
    * Provides access to the document's sub-documents.
    */
  /* CompleteClass */
  override val subDocuments: js.Array[typings.devexpressWeb.SubDocument] = js.native
  
  /**
    * Provides information about table styles in the current document.
    */
  /* CompleteClass */
  override val tableStylesInfo: js.Array[typings.devexpressWeb.TableStyle] = js.native
}
