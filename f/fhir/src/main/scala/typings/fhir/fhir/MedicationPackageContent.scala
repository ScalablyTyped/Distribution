package typings.fhir.fhir

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
  implicit class MedicationPackageContentOps[Self <: MedicationPackageContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmount(value: Quantity): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setItemCodeableConcept(value: CodeableConcept): Self = this.set("itemCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemCodeableConcept: Self = this.set("itemCodeableConcept", js.undefined)
    
    @scala.inline
    def setItemReference(value: Reference): Self = this.set("itemReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemReference: Self = this.set("itemReference", js.undefined)
  }
}
