package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeDocumentHtmlDefinitions extends StObject {
  
  /**
    * Holds the properties that define how to generate the responsive-formatted HTML for the document.
    */
  var htmlDefinitions: js.UndefOr[js.Array[DocumentHtmlDefinitionOriginal]] = js.native
}
object EnvelopeDocumentHtmlDefinitions {
  
  @scala.inline
  def apply(): EnvelopeDocumentHtmlDefinitions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeDocumentHtmlDefinitions]
  }
  
  @scala.inline
  implicit class EnvelopeDocumentHtmlDefinitionsMutableBuilder[Self <: EnvelopeDocumentHtmlDefinitions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlDefinitions(value: js.Array[DocumentHtmlDefinitionOriginal]): Self = StObject.set(x, "htmlDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlDefinitionsUndefined: Self = StObject.set(x, "htmlDefinitions", js.undefined)
    
    @scala.inline
    def setHtmlDefinitionsVarargs(value: DocumentHtmlDefinitionOriginal*): Self = StObject.set(x, "htmlDefinitions", js.Array(value :_*))
  }
}
