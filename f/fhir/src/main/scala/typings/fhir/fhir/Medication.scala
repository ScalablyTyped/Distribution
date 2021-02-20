package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
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
  implicit class MedicationMutableBuilder[Self <: Medication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setForm(value: CodeableConcept): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setImage(value: js.Array[Attachment]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setImageVarargs(value: Attachment*): Self = StObject.set(x, "image", js.Array(value :_*))
    
    @scala.inline
    def setIngredient(value: js.Array[MedicationIngredient]): Self = StObject.set(x, "ingredient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngredientUndefined: Self = StObject.set(x, "ingredient", js.undefined)
    
    @scala.inline
    def setIngredientVarargs(value: MedicationIngredient*): Self = StObject.set(x, "ingredient", js.Array(value :_*))
    
    @scala.inline
    def setIsBrand(value: Boolean): Self = StObject.set(x, "isBrand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBrandUndefined: Self = StObject.set(x, "isBrand", js.undefined)
    
    @scala.inline
    def setIsOverTheCounter(value: Boolean): Self = StObject.set(x, "isOverTheCounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOverTheCounterUndefined: Self = StObject.set(x, "isOverTheCounter", js.undefined)
    
    @scala.inline
    def setManufacturer(value: Reference): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def set_isBrand(value: Element): Self = StObject.set(x, "_isBrand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_isBrandUndefined: Self = StObject.set(x, "_isBrand", js.undefined)
    
    @scala.inline
    def set_isOverTheCounter(value: Element): Self = StObject.set(x, "_isOverTheCounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_isOverTheCounterUndefined: Self = StObject.set(x, "_isOverTheCounter", js.undefined)
    
    @scala.inline
    def set_package(value: MedicationPackage): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
