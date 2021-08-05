package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentTemplate extends StObject {
  
  var documentEndPage: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
    */
  var documentId: js.UndefOr[String] = js.undefined
  
  var documentStartPage: js.UndefOr[String] = js.undefined
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * The unique identifier of the template. If this is not provided, DocuSign generates an error and the call fails.
    */
  var templateId: js.UndefOr[String] = js.undefined
}
object DocumentTemplate {
  
  inline def apply(): DocumentTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTemplate]
  }
  
  extension [Self <: DocumentTemplate](x: Self) {
    
    inline def setDocumentEndPage(value: String): Self = StObject.set(x, "documentEndPage", value.asInstanceOf[js.Any])
    
    inline def setDocumentEndPageUndefined: Self = StObject.set(x, "documentEndPage", js.undefined)
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    inline def setDocumentStartPage(value: String): Self = StObject.set(x, "documentStartPage", value.asInstanceOf[js.Any])
    
    inline def setDocumentStartPageUndefined: Self = StObject.set(x, "documentStartPage", js.undefined)
    
    inline def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
  }
}
