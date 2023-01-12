package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`history-instance`
import typings.fhir.fhirStrings.`history-type`
import typings.fhir.fhirStrings.`search-type`
import typings.fhir.fhirStrings.create
import typings.fhir.fhirStrings.delete_
import typings.fhir.fhirStrings.patch_
import typings.fhir.fhirStrings.read
import typings.fhir.fhirStrings.update
import typings.fhir.fhirStrings.vread
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapabilityStatementRestResourceInteraction
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _documentation: js.UndefOr[Element] = js.undefined
  
  /**
    * Coded identifier of the operation, supported by the system resource.
    */
  var code: read | vread | update | patch_ | delete_ | `history-instance` | `history-type` | create | `search-type`
  
  /**
    * Guidance specific to the implementation of this operation, such as 'delete is a logical delete' or 'updates are only allowed with version id' or 'creates permitted from pre-authorized certificates only'.
    */
  var documentation: js.UndefOr[String] = js.undefined
}
object CapabilityStatementRestResourceInteraction {
  
  inline def apply(
    code: read | vread | update | patch_ | delete_ | `history-instance` | `history-type` | create | `search-type`
  ): CapabilityStatementRestResourceInteraction = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRestResourceInteraction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapabilityStatementRestResourceInteraction] (val x: Self) extends AnyVal {
    
    inline def setCode(
      value: read | vread | update | patch_ | delete_ | `history-instance` | `history-type` | create | `search-type`
    ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
  }
}
