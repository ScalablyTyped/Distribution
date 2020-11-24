package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayApplianceDocument extends js.Object {
  
  var attachmentDescription: js.UndefOr[String] = js.native
  
  var documentId: js.UndefOr[/* Integer that identifies the document in the envelope.*/ String] = js.native
  
  var documentType: js.UndefOr[String] = js.native
  
  var envelopeId: js.UndefOr[
    /*The envelope's GUID. \n\nExample: `93be49ab-afa0-4adf-933c-f752070d71ec`*/ String
  ] = js.native
  
  var externalDocumentId: js.UndefOr[String] = js.native
  
  var latestPDFId: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var pages: js.UndefOr[/*An array of page objects.*/ Double] = js.native
}
object DisplayApplianceDocument {
  
  @scala.inline
  def apply(): DisplayApplianceDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayApplianceDocument]
  }
  
  @scala.inline
  implicit class DisplayApplianceDocumentOps[Self <: DisplayApplianceDocument] (val x: Self) extends AnyVal {
    
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
    def setAttachmentDescription(value: String): Self = this.set("attachmentDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentDescription: Self = this.set("attachmentDescription", js.undefined)
    
    @scala.inline
    def setDocumentId(value: /* Integer that identifies the document in the envelope.*/ String): Self = this.set("documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentId: Self = this.set("documentId", js.undefined)
    
    @scala.inline
    def setDocumentType(value: String): Self = this.set("documentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentType: Self = this.set("documentType", js.undefined)
    
    @scala.inline
    def setEnvelopeId(value: /*The envelope's GUID. \n\nExample: `93be49ab-afa0-4adf-933c-f752070d71ec`*/ String): Self = this.set("envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeId: Self = this.set("envelopeId", js.undefined)
    
    @scala.inline
    def setExternalDocumentId(value: String): Self = this.set("externalDocumentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalDocumentId: Self = this.set("externalDocumentId", js.undefined)
    
    @scala.inline
    def setLatestPDFId(value: String): Self = this.set("latestPDFId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestPDFId: Self = this.set("latestPDFId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPages(value: /*An array of page objects.*/ Double): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
  }
}
