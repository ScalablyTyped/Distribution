package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentTemplate extends StObject {
  
  var documentEndPage: js.UndefOr[String] = js.native
  
  /**
    * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
    */
  var documentId: js.UndefOr[String] = js.native
  
  var documentStartPage: js.UndefOr[String] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * The unique identifier of the template. If this is not provided, DocuSign generates an error and the call fails.
    */
  var templateId: js.UndefOr[String] = js.native
}
object DocumentTemplate {
  
  @scala.inline
  def apply(): DocumentTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTemplate]
  }
  
  @scala.inline
  implicit class DocumentTemplateMutableBuilder[Self <: DocumentTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentEndPage(value: String): Self = StObject.set(x, "documentEndPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentEndPageUndefined: Self = StObject.set(x, "documentEndPage", js.undefined)
    
    @scala.inline
    def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    @scala.inline
    def setDocumentStartPage(value: String): Self = StObject.set(x, "documentStartPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentStartPageUndefined: Self = StObject.set(x, "documentStartPage", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
  }
}
