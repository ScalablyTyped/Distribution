package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentResponsiveHtmlPreview extends StObject {
  
  /**
    * Holds the properties that define how to generate the responsive-formatted HTML for the document.
    */
  var htmlDefinitions: js.UndefOr[js.Array[String]] = js.undefined
}
object DocumentResponsiveHtmlPreview {
  
  inline def apply(): DocumentResponsiveHtmlPreview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentResponsiveHtmlPreview]
  }
  
  extension [Self <: DocumentResponsiveHtmlPreview](x: Self) {
    
    inline def setHtmlDefinitions(value: js.Array[String]): Self = StObject.set(x, "htmlDefinitions", value.asInstanceOf[js.Any])
    
    inline def setHtmlDefinitionsUndefined: Self = StObject.set(x, "htmlDefinitions", js.undefined)
    
    inline def setHtmlDefinitionsVarargs(value: String*): Self = StObject.set(x, "htmlDefinitions", js.Array(value :_*))
  }
}
