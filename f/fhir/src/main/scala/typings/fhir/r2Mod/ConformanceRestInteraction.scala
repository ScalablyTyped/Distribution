package typings.fhir.r2Mod

import typings.fhir.fhirStrings.`history-system`
import typings.fhir.fhirStrings.`search-system`
import typings.fhir.fhirStrings.transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformanceRestInteraction
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _documentation: js.UndefOr[Element] = js.undefined
  
  /**
    * A coded identifier of the operation, supported by the system.
    */
  var code: transaction | `search-system` | `history-system`
  
  /**
    * Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented.
    */
  var documentation: js.UndefOr[String] = js.undefined
}
object ConformanceRestInteraction {
  
  inline def apply(code: transaction | `search-system` | `history-system`): ConformanceRestInteraction = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformanceRestInteraction]
  }
  
  extension [Self <: ConformanceRestInteraction](x: Self) {
    
    inline def setCode(value: transaction | `search-system` | `history-system`): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
  }
}
