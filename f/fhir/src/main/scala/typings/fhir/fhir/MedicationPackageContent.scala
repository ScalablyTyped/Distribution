package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * What is  in the package
  */
@js.native
trait MedicationPackageContent extends BackboneElement {
  
  /**
    * Quantity present in the package
    */
  var amount: js.UndefOr[Quantity] = js.native
  
  /**
    * The item in the package
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * The item in the package
    */
  var itemReference: js.UndefOr[Reference] = js.native
}
object MedicationPackageContent {
  
  @scala.inline
  def apply(): MedicationPackageContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationPackageContent]
  }
  
  @scala.inline
  implicit class MedicationPackageContentMutableBuilder[Self <: MedicationPackageContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Quantity): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setItemCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "itemCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCodeableConceptUndefined: Self = StObject.set(x, "itemCodeableConcept", js.undefined)
    
    @scala.inline
    def setItemReference(value: Reference): Self = StObject.set(x, "itemReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemReferenceUndefined: Self = StObject.set(x, "itemReference", js.undefined)
  }
}
