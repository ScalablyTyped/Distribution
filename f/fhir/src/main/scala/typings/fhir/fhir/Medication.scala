package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition of a Medication
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Medication extends DomainResource {
  
  /**
    * Contains extended information for property 'isBrand'.
    */
  var _isBrand: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'isOverTheCounter'.
    */
  var _isOverTheCounter: js.UndefOr[Element] = js.native
  
  /**
    * Details about packaged medications
    */
  @JSName("package")
  var _package: js.UndefOr[MedicationPackage] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Codes that identify this medication
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * powder | tablets | capsule +
    */
  var form: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Picture of the medication
    */
  var image: js.UndefOr[js.Array[Attachment]] = js.native
  
  /**
    * Active or inactive ingredient
    */
  var ingredient: js.UndefOr[js.Array[MedicationIngredient]] = js.native
  
  /**
    * True if a brand
    */
  var isBrand: js.UndefOr[Boolean] = js.native
  
  /**
    * True if medication does not require a prescription
    */
  var isOverTheCounter: js.UndefOr[Boolean] = js.native
  
  /**
    * Manufacturer of the item
    */
  var manufacturer: js.UndefOr[Reference] = js.native
  
  /**
    * active | inactive | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
}
object Medication {
  
  @scala.inline
  def apply(): Medication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Medication]
  }
  
  @scala.inline
  implicit class MedicationOps[Self <: Medication] (val x: Self) extends AnyVal {
    
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
    def set_isBrand(value: Element): Self = this.set("_isBrand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_isBrand: Self = this.set("_isBrand", js.undefined)
    
    @scala.inline
    def set_isOverTheCounter(value: Element): Self = this.set("_isOverTheCounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_isOverTheCounter: Self = this.set("_isOverTheCounter", js.undefined)
    
    @scala.inline
    def set_package(value: MedicationPackage): Self = this.set("package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_package: Self = this.set("package", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setForm(value: CodeableConcept): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setImageVarargs(value: Attachment*): Self = this.set("image", js.Array(value :_*))
    
    @scala.inline
    def setImage(value: js.Array[Attachment]): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setIngredientVarargs(value: MedicationIngredient*): Self = this.set("ingredient", js.Array(value :_*))
    
    @scala.inline
    def setIngredient(value: js.Array[MedicationIngredient]): Self = this.set("ingredient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIngredient: Self = this.set("ingredient", js.undefined)
    
    @scala.inline
    def setIsBrand(value: Boolean): Self = this.set("isBrand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBrand: Self = this.set("isBrand", js.undefined)
    
    @scala.inline
    def setIsOverTheCounter(value: Boolean): Self = this.set("isOverTheCounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOverTheCounter: Self = this.set("isOverTheCounter", js.undefined)
    
    @scala.inline
    def setManufacturer(value: Reference): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturer: Self = this.set("manufacturer", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
