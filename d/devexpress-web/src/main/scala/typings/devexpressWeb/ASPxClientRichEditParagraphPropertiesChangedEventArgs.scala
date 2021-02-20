package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.ParagraphPropertiesChanged event.
  */
@js.native
trait ASPxClientRichEditParagraphPropertiesChangedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the changed paragraph's index.
    */
  var paragraphIndex: Double = js.native
  
  /**
    * Gets the active sub-document's identifier.
    */
  var subDocumentId: Double = js.native
}
object ASPxClientRichEditParagraphPropertiesChangedEventArgs {
  
  @scala.inline
  def apply(paragraphIndex: Double, subDocumentId: Double): ASPxClientRichEditParagraphPropertiesChangedEventArgs = {
    val __obj = js.Dynamic.literal(paragraphIndex = paragraphIndex.asInstanceOf[js.Any], subDocumentId = subDocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditParagraphPropertiesChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientRichEditParagraphPropertiesChangedEventArgsMutableBuilder[Self <: ASPxClientRichEditParagraphPropertiesChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParagraphIndex(value: Double): Self = StObject.set(x, "paragraphIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDocumentId(value: Double): Self = StObject.set(x, "subDocumentId", value.asInstanceOf[js.Any])
  }
}
