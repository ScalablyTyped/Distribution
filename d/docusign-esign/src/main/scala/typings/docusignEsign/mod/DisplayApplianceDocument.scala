package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayApplianceDocument extends StObject {
  
  var attachmentDescription: js.UndefOr[String] = js.undefined
  
  var documentId: js.UndefOr[/* Integer that identifies the document in the envelope.*/ String] = js.undefined
  
  var documentType: js.UndefOr[String] = js.undefined
  
  var envelopeId: js.UndefOr[
    /*The envelope's GUID. \n\nExample: `93be49ab-afa0-4adf-933c-f752070d71ec`*/ String
  ] = js.undefined
  
  var externalDocumentId: js.UndefOr[String] = js.undefined
  
  var latestPDFId: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var pages: js.UndefOr[/*An array of page objects.*/ Double] = js.undefined
}
object DisplayApplianceDocument {
  
  @scala.inline
  def apply(): DisplayApplianceDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayApplianceDocument]
  }
  
  @scala.inline
  implicit class DisplayApplianceDocumentMutableBuilder[Self <: DisplayApplianceDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentDescription(value: String): Self = StObject.set(x, "attachmentDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentDescriptionUndefined: Self = StObject.set(x, "attachmentDescription", js.undefined)
    
    @scala.inline
    def setDocumentId(value: /* Integer that identifies the document in the envelope.*/ String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    @scala.inline
    def setDocumentType(value: String): Self = StObject.set(x, "documentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentTypeUndefined: Self = StObject.set(x, "documentType", js.undefined)
    
    @scala.inline
    def setEnvelopeId(value: /*The envelope's GUID. \n\nExample: `93be49ab-afa0-4adf-933c-f752070d71ec`*/ String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
    
    @scala.inline
    def setExternalDocumentId(value: String): Self = StObject.set(x, "externalDocumentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDocumentIdUndefined: Self = StObject.set(x, "externalDocumentId", js.undefined)
    
    @scala.inline
    def setLatestPDFId(value: String): Self = StObject.set(x, "latestPDFId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestPDFIdUndefined: Self = StObject.set(x, "latestPDFId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPages(value: /*An array of page objects.*/ Double): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
  }
}
