package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateHtmlDefinitions extends StObject {
  
  /**
    * Holds the properties that define how to generate the responsive-formatted HTML for the document.
    */
  var htmlDefinitions: js.UndefOr[js.Array[DocumentHtmlDefinitionOriginal]] = js.undefined
}
object TemplateHtmlDefinitions {
  
  inline def apply(): TemplateHtmlDefinitions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateHtmlDefinitions]
  }
  
  extension [Self <: TemplateHtmlDefinitions](x: Self) {
    
    inline def setHtmlDefinitions(value: js.Array[DocumentHtmlDefinitionOriginal]): Self = StObject.set(x, "htmlDefinitions", value.asInstanceOf[js.Any])
    
    inline def setHtmlDefinitionsUndefined: Self = StObject.set(x, "htmlDefinitions", js.undefined)
    
    inline def setHtmlDefinitionsVarargs(value: DocumentHtmlDefinitionOriginal*): Self = StObject.set(x, "htmlDefinitions", js.Array(value :_*))
  }
}
