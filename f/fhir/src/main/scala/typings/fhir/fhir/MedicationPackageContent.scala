package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * What is  in the package
  */
trait MedicationPackageContent
  extends StObject
     with BackboneElement {
  
  /**
    * Quantity present in the package
    */
  var amount: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The item in the package
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The item in the package
    */
  var itemReference: js.UndefOr[Reference] = js.undefined
}
object MedicationPackageContent {
  
  inline def apply(): MedicationPackageContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationPackageContent]
  }
  
  extension [Self <: MedicationPackageContent](x: Self) {
    
    inline def setAmount(value: Quantity): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setItemCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "itemCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setItemCodeableConceptUndefined: Self = StObject.set(x, "itemCodeableConcept", js.undefined)
    
    inline def setItemReference(value: Reference): Self = StObject.set(x, "itemReference", value.asInstanceOf[js.Any])
    
    inline def setItemReferenceUndefined: Self = StObject.set(x, "itemReference", js.undefined)
  }
}
