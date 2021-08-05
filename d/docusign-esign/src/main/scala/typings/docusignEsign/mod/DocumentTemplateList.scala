package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentTemplateList extends StObject {
  
  var documentTemplates: js.UndefOr[js.Array[DocumentTemplate]] = js.undefined
}
object DocumentTemplateList {
  
  inline def apply(): DocumentTemplateList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTemplateList]
  }
  
  extension [Self <: DocumentTemplateList](x: Self) {
    
    inline def setDocumentTemplates(value: js.Array[DocumentTemplate]): Self = StObject.set(x, "documentTemplates", value.asInstanceOf[js.Any])
    
    inline def setDocumentTemplatesUndefined: Self = StObject.set(x, "documentTemplates", js.undefined)
    
    inline def setDocumentTemplatesVarargs(value: DocumentTemplate*): Self = StObject.set(x, "documentTemplates", js.Array(value :_*))
  }
}
