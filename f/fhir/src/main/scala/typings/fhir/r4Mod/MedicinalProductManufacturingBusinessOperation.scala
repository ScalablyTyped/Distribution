package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductManufacturingBusinessOperation
  extends StObject
     with BackboneElement {
  
  var _effectiveDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Regulatory authorization reference number.
    */
  var authorisationReferenceNumber: js.UndefOr[Identifier] = js.undefined
  
  /**
    * To indicate if this proces is commercially confidential.
    */
  var confidentialityIndicator: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Regulatory authorization date.
    */
  var effectiveDate: js.UndefOr[String] = js.undefined
  
  /**
    * The manufacturer or establishment associated with the process.
    */
  var manufacturer: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The type of manufacturing operation.
    */
  var operationType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A regulator which oversees the operation.
    */
  var regulator: js.UndefOr[Reference] = js.undefined
}
object MedicinalProductManufacturingBusinessOperation {
  
  inline def apply(): MedicinalProductManufacturingBusinessOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicinalProductManufacturingBusinessOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductManufacturingBusinessOperation] (val x: Self) extends AnyVal {
    
    inline def setAuthorisationReferenceNumber(value: Identifier): Self = StObject.set(x, "authorisationReferenceNumber", value.asInstanceOf[js.Any])
    
    inline def setAuthorisationReferenceNumberUndefined: Self = StObject.set(x, "authorisationReferenceNumber", js.undefined)
    
    inline def setConfidentialityIndicator(value: CodeableConcept): Self = StObject.set(x, "confidentialityIndicator", value.asInstanceOf[js.Any])
    
    inline def setConfidentialityIndicatorUndefined: Self = StObject.set(x, "confidentialityIndicator", js.undefined)
    
    inline def setEffectiveDate(value: String): Self = StObject.set(x, "effectiveDate", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDateUndefined: Self = StObject.set(x, "effectiveDate", js.undefined)
    
    inline def setManufacturer(value: js.Array[Reference]): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setManufacturerVarargs(value: Reference*): Self = StObject.set(x, "manufacturer", js.Array(value*))
    
    inline def setOperationType(value: CodeableConcept): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setRegulator(value: Reference): Self = StObject.set(x, "regulator", value.asInstanceOf[js.Any])
    
    inline def setRegulatorUndefined: Self = StObject.set(x, "regulator", js.undefined)
    
    inline def set_effectiveDate(value: Element): Self = StObject.set(x, "_effectiveDate", value.asInstanceOf[js.Any])
    
    inline def set_effectiveDateUndefined: Self = StObject.set(x, "_effectiveDate", js.undefined)
  }
}
