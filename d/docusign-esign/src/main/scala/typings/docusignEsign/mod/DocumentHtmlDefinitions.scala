package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentHtmlDefinitions extends StObject {
  
  /**
    * Holds the properties that define how to generate the responsive-formatted HTML for the document.
    */
  var htmlDefinitions: js.UndefOr[js.Array[String]] = js.native
}
object DocumentHtmlDefinitions {
  
  @scala.inline
  def apply(): DocumentHtmlDefinitions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentHtmlDefinitions]
  }
  
  @scala.inline
  implicit class DocumentHtmlDefinitionsMutableBuilder[Self <: DocumentHtmlDefinitions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlDefinitions(value: js.Array[String]): Self = StObject.set(x, "htmlDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlDefinitionsUndefined: Self = StObject.set(x, "htmlDefinitions", js.undefined)
    
    @scala.inline
    def setHtmlDefinitionsVarargs(value: String*): Self = StObject.set(x, "htmlDefinitions", js.Array(value :_*))
  }
}
