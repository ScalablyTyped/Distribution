package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopeHtmlDefinitions extends StObject {
  
  /**
    * Holds the properties that define how to generate the responsive-formatted HTML for the document.
    */
  var htmlDefinitions: js.UndefOr[js.Array[DocumentHtmlDefinitionOriginal]] = js.undefined
}
object EnvelopeHtmlDefinitions {
  
  inline def apply(): EnvelopeHtmlDefinitions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeHtmlDefinitions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvelopeHtmlDefinitions] (val x: Self) extends AnyVal {
    
    inline def setHtmlDefinitions(value: js.Array[DocumentHtmlDefinitionOriginal]): Self = StObject.set(x, "htmlDefinitions", value.asInstanceOf[js.Any])
    
    inline def setHtmlDefinitionsUndefined: Self = StObject.set(x, "htmlDefinitions", js.undefined)
    
    inline def setHtmlDefinitionsVarargs(value: DocumentHtmlDefinitionOriginal*): Self = StObject.set(x, "htmlDefinitions", js.Array(value*))
  }
}
