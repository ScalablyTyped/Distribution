package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.ParagraphPropertiesChanged event.
  */
@JSGlobal("ASPxClientRichEditParagraphPropertiesChangedEventArgs")
@js.native
open class ASPxClientRichEditParagraphPropertiesChangedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientRichEditParagraphPropertiesChangedEventArgs {
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
  var paragraphIndex: Double = js.native
  
  /**
    * Gets the active sub-document's identifier.
    */
  /* CompleteClass */
  var subDocumentId: Double = js.native
}
