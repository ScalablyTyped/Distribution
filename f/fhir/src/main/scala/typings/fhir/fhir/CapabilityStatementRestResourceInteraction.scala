package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * What operations are supported?
  */
trait CapabilityStatementRestResourceInteraction
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  
  /**
    * read | vread | update | patch | delete | history-instance | history-type | create | search-type
    */
  var code: typings.fhir.fhir.code
  
  /**
    * Anything special about operation behavior
    */
  var documentation: js.UndefOr[String] = js.undefined
}
object CapabilityStatementRestResourceInteraction {
  
  inline def apply(code: code): CapabilityStatementRestResourceInteraction = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRestResourceInteraction]
  }
  
  extension [Self <: CapabilityStatementRestResourceInteraction](x: Self) {
    
    inline def setCode(value: code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
  }
}
