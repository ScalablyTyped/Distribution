package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentTemplate extends js.Object {
  
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
  implicit class DocumentTemplateOps[Self <: DocumentTemplate] (val x: Self) extends AnyVal {
    
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
    def setDocumentEndPage(value: String): Self = this.set("documentEndPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentEndPage: Self = this.set("documentEndPage", js.undefined)
    
    @scala.inline
    def setDocumentId(value: String): Self = this.set("documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentId: Self = this.set("documentId", js.undefined)
    
    @scala.inline
    def setDocumentStartPage(value: String): Self = this.set("documentStartPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentStartPage: Self = this.set("documentStartPage", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = this.set("templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateId: Self = this.set("templateId", js.undefined)
  }
}
