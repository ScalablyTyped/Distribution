package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentTemplateList extends StObject {
  
  var documentTemplates: js.UndefOr[js.Array[DocumentTemplate]] = js.native
}
object DocumentTemplateList {
  
  @scala.inline
  def apply(): DocumentTemplateList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTemplateList]
  }
  
  @scala.inline
  implicit class DocumentTemplateListMutableBuilder[Self <: DocumentTemplateList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentTemplates(value: js.Array[DocumentTemplate]): Self = StObject.set(x, "documentTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentTemplatesUndefined: Self = StObject.set(x, "documentTemplates", js.undefined)
    
    @scala.inline
    def setDocumentTemplatesVarargs(value: DocumentTemplate*): Self = StObject.set(x, "documentTemplates", js.Array(value :_*))
  }
}
