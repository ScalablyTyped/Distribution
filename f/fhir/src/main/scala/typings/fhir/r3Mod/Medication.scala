package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.inactive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Medication
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _isBrand: js.UndefOr[Element] = js.undefined
  
  var _isOverTheCounter: js.UndefOr[Element] = js.undefined
  
  /**
    * Information that only applies to packages (not products).
    */
  @JSName("package")
  var _package: js.UndefOr[MedicationPackage] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Depending on the context of use, the code that was actually selected by the user (prescriber, dispenser, etc.) will have the coding.userSelected set to true.  As described in the coding datatype: "A coding may be marked as a "userSelected" if a user selected the particular coded value in a user interface (e.g. the user selects an item in a pick-list). If a user selected coding exists, it is the preferred choice for performing translations etc.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * When Medication is referenced from MedicationRequest, this is the ordered form.  When Medication is referenced within MedicationDispense, this is the dispensed form.  When Medication is referenced within MedicationAdministration, this is administered form.
    */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Photo(s) or graphic representation(s) of the medication.
    */
  var image: js.UndefOr[js.Array[Attachment]] = js.undefined
  
  /**
    * The ingredients need not be a complete list.  If an ingredient is not specified, this does not indicate whether an ingredient is present or absent.  If an ingredient is specified it does not mean that all ingredients are specified.  It is possible to specify both inactive and active ingredients.
    */
  var ingredient: js.UndefOr[js.Array[MedicationIngredient]] = js.undefined
  
  /**
    * Set to true if the item is attributable to a specific manufacturer.
    */
  var isBrand: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to true if the medication can be obtained without an order from a prescriber.
    */
  var isOverTheCounter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Describes the details of the manufacturer of the medication product.  This is not intended to represent the distributor of a medication product.
    */
  var manufacturer: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Medication: typings.fhir.fhirStrings.Medication
  
  /**
    * This status is not intended to specify if a medication is part of a formulary.
    */
  var status: js.UndefOr[active | inactive | `entered-in-error`] = js.undefined
}
object Medication {
  
  inline def apply(): Medication = {
    val __obj = js.Dynamic.literal(resourceType = "Medication")
    __obj.asInstanceOf[Medication]
  }
  
  extension [Self <: Medication](x: Self) {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setForm(value: CodeableConcept): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setImage(value: js.Array[Attachment]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setImageVarargs(value: Attachment*): Self = StObject.set(x, "image", js.Array(value*))
    
    inline def setIngredient(value: js.Array[MedicationIngredient]): Self = StObject.set(x, "ingredient", value.asInstanceOf[js.Any])
    
    inline def setIngredientUndefined: Self = StObject.set(x, "ingredient", js.undefined)
    
    inline def setIngredientVarargs(value: MedicationIngredient*): Self = StObject.set(x, "ingredient", js.Array(value*))
    
    inline def setIsBrand(value: Boolean): Self = StObject.set(x, "isBrand", value.asInstanceOf[js.Any])
    
    inline def setIsBrandUndefined: Self = StObject.set(x, "isBrand", js.undefined)
    
    inline def setIsOverTheCounter(value: Boolean): Self = StObject.set(x, "isOverTheCounter", value.asInstanceOf[js.Any])
    
    inline def setIsOverTheCounterUndefined: Self = StObject.set(x, "isOverTheCounter", js.undefined)
    
    inline def setManufacturer(value: Reference): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Medication): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | inactive | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def set_isBrand(value: Element): Self = StObject.set(x, "_isBrand", value.asInstanceOf[js.Any])
    
    inline def set_isBrandUndefined: Self = StObject.set(x, "_isBrand", js.undefined)
    
    inline def set_isOverTheCounter(value: Element): Self = StObject.set(x, "_isOverTheCounter", value.asInstanceOf[js.Any])
    
    inline def set_isOverTheCounterUndefined: Self = StObject.set(x, "_isOverTheCounter", js.undefined)
    
    inline def set_package(value: MedicationPackage): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
