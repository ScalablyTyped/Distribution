package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentHtmlDefinitionOriginal extends js.Object {
  
  /**
    * The `documentId` is set by the API client. It is an integer that falls between `1` and 2,147,483,647. The value is encoded as a string without commas.
    * The values `1`, `2`, `3`, and so on are typically used to identify the first few documents in an envelope. Tab definitions include a `documentId`
    * property that specifies the document on which to place the tab.
    */
  var documentId: js.UndefOr[String] = js.native
  
  /**
    * The GUID of the document.
    */
  var documentIdGuid: js.UndefOr[String] = js.native
  
  var htmlDefinition: js.UndefOr[
    /* Holds the properties that define how to generate the responsive-formatted HTML for the document. */ DocumentHtmlDefinition
  ] = js.native
}
object DocumentHtmlDefinitionOriginal {
  
  @scala.inline
  def apply(): DocumentHtmlDefinitionOriginal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentHtmlDefinitionOriginal]
  }
  
  @scala.inline
  implicit class DocumentHtmlDefinitionOriginalOps[Self <: DocumentHtmlDefinitionOriginal] (val x: Self) extends AnyVal {
    
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
    def setDocumentId(value: String): Self = this.set("documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentId: Self = this.set("documentId", js.undefined)
    
    @scala.inline
    def setDocumentIdGuid(value: String): Self = this.set("documentIdGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentIdGuid: Self = this.set("documentIdGuid", js.undefined)
    
    @scala.inline
    def setHtmlDefinition(
      value: /* Holds the properties that define how to generate the responsive-formatted HTML for the document. */ DocumentHtmlDefinition
    ): Self = this.set("htmlDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlDefinition: Self = this.set("htmlDefinition", js.undefined)
  }
}
