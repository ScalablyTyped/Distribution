package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.inactive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormularyItem
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * A code (or set of codes) that specify the product or service that is identified by this formulary item.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Business identifier for this formulary item.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_FormularyItem: typings.fhir.fhirStrings.FormularyItem
  
  /**
    * This status is intended to identify if the formulary item in a local system is in active use within the formulary.  For example, a formulary might include a medicinal product and the status relates to its inclusion.  At some point in the future, if the status of the formulary item is changed to "inactive" that means that it is no longer valid in the formulary.  But the product itself might still be in active use and might be included in other formularies.
    */
  var status: js.UndefOr[active | `entered-in-error` | inactive] = js.undefined
}
object FormularyItem {
  
  inline def apply(): FormularyItem = {
    val __obj = js.Dynamic.literal(resourceType = "FormularyItem")
    __obj.asInstanceOf[FormularyItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormularyItem] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.FormularyItem): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | `entered-in-error` | inactive): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
