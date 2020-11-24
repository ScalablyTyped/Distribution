package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateDocuments extends js.Object {
  
  /**
    * An array of document objects that contain information about the documents associated with the template.
    */
  var templateDocuments: js.UndefOr[
    js.Array[/* This object contains details about the envelope document. */ EnvelopeDocument]
  ] = js.native
  
  /**
    * The id of the template. If a value is not provided, DocuSign generates a value.
    */
  var templateId: js.UndefOr[String] = js.native
}
object TemplateDocuments {
  
  @scala.inline
  def apply(): TemplateDocuments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateDocuments]
  }
  
  @scala.inline
  implicit class TemplateDocumentsOps[Self <: TemplateDocuments] (val x: Self) extends AnyVal {
    
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
    def setTemplateDocumentsVarargs(value: (/* This object contains details about the envelope document. */ EnvelopeDocument)*): Self = this.set("templateDocuments", js.Array(value :_*))
    
    @scala.inline
    def setTemplateDocuments(value: js.Array[/* This object contains details about the envelope document. */ EnvelopeDocument]): Self = this.set("templateDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateDocuments: Self = this.set("templateDocuments", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = this.set("templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateId: Self = this.set("templateId", js.undefined)
  }
}
