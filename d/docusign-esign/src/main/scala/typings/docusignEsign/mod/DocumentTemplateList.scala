package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentTemplateList extends js.Object {
  
  var documentTemplates: js.UndefOr[js.Array[DocumentTemplate]] = js.native
}
object DocumentTemplateList {
  
  @scala.inline
  def apply(): DocumentTemplateList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTemplateList]
  }
  
  @scala.inline
  implicit class DocumentTemplateListOps[Self <: DocumentTemplateList] (val x: Self) extends AnyVal {
    
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
    def setDocumentTemplatesVarargs(value: DocumentTemplate*): Self = this.set("documentTemplates", js.Array(value :_*))
    
    @scala.inline
    def setDocumentTemplates(value: js.Array[DocumentTemplate]): Self = this.set("documentTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentTemplates: Self = this.set("documentTemplates", js.undefined)
  }
}
