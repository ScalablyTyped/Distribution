package typings.fhir.r4Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManufacturedItemDefinition
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Unique identifier.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The ingredients of this manufactured item. This is only needed if the ingredients are not specified by incoming references from the Ingredient resource.
    */
  var ingredient: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Dose form as manufactured and before any transformation into the pharmaceutical product.
    */
  var manufacturedDoseForm: CodeableConcept
  
  /**
    * Manufacturer of the item (Note that this should be named "manufacturer" but it currently causes technical issues).
    */
  var manufacturer: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * General characteristics of this item.
    */
  var property: js.UndefOr[js.Array[ManufacturedItemDefinitionProperty]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ManufacturedItemDefinition: typings.fhir.fhirStrings.ManufacturedItemDefinition
  
  /**
    * Allows filtering of manufactured items that are appropriate for use versus not.
    */
  var status: draft | active | retired | unknown
  
  /**
    * The “real world” units in which the quantity of the manufactured item is described.
    */
  var unitOfPresentation: js.UndefOr[CodeableConcept] = js.undefined
}
object ManufacturedItemDefinition {
  
  inline def apply(manufacturedDoseForm: CodeableConcept, status: draft | active | retired | unknown): ManufacturedItemDefinition = {
    val __obj = js.Dynamic.literal(manufacturedDoseForm = manufacturedDoseForm.asInstanceOf[js.Any], resourceType = "ManufacturedItemDefinition", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManufacturedItemDefinition]
  }
  
  extension [Self <: ManufacturedItemDefinition](x: Self) {
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIngredient(value: js.Array[CodeableConcept]): Self = StObject.set(x, "ingredient", value.asInstanceOf[js.Any])
    
    inline def setIngredientUndefined: Self = StObject.set(x, "ingredient", js.undefined)
    
    inline def setIngredientVarargs(value: CodeableConcept*): Self = StObject.set(x, "ingredient", js.Array(value*))
    
    inline def setManufacturedDoseForm(value: CodeableConcept): Self = StObject.set(x, "manufacturedDoseForm", value.asInstanceOf[js.Any])
    
    inline def setManufacturer(value: js.Array[Reference]): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setManufacturerVarargs(value: Reference*): Self = StObject.set(x, "manufacturer", js.Array(value*))
    
    inline def setProperty(value: js.Array[ManufacturedItemDefinitionProperty]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setPropertyVarargs(value: ManufacturedItemDefinitionProperty*): Self = StObject.set(x, "property", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ManufacturedItemDefinition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUnitOfPresentation(value: CodeableConcept): Self = StObject.set(x, "unitOfPresentation", value.asInstanceOf[js.Any])
    
    inline def setUnitOfPresentationUndefined: Self = StObject.set(x, "unitOfPresentation", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
