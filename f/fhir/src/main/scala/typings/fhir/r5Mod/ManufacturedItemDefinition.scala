package typings.fhir.r5Mod

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
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Physical parts of the manufactured item, that it is intrisically made from. This is distinct from the ingredients that are part of its chemical makeup.
    */
  var component: js.UndefOr[js.Array[ManufacturedItemDefinitionComponent]] = js.undefined
  
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
    * Manufacturer of the item, one of several possible.
    */
  var manufacturer: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Allows specifying that an item is on the market for sale, or that it is not available, and the dates and locations associated.
    */
  var marketingStatus: js.UndefOr[js.Array[MarketingStatus]] = js.undefined
  
  /**
    * A descriptive name applied to this item.
    */
  var name: js.UndefOr[String] = js.undefined
  
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
    * The “real-world” units in which the quantity of the manufactured item is described.
    */
  var unitOfPresentation: js.UndefOr[CodeableConcept] = js.undefined
}
object ManufacturedItemDefinition {
  
  inline def apply(manufacturedDoseForm: CodeableConcept, status: draft | active | retired | unknown): ManufacturedItemDefinition = {
    val __obj = js.Dynamic.literal(manufacturedDoseForm = manufacturedDoseForm.asInstanceOf[js.Any], resourceType = "ManufacturedItemDefinition", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManufacturedItemDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManufacturedItemDefinition] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: js.Array[ManufacturedItemDefinitionComponent]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setComponentVarargs(value: ManufacturedItemDefinitionComponent*): Self = StObject.set(x, "component", js.Array(value*))
    
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
    
    inline def setMarketingStatus(value: js.Array[MarketingStatus]): Self = StObject.set(x, "marketingStatus", value.asInstanceOf[js.Any])
    
    inline def setMarketingStatusUndefined: Self = StObject.set(x, "marketingStatus", js.undefined)
    
    inline def setMarketingStatusVarargs(value: MarketingStatus*): Self = StObject.set(x, "marketingStatus", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProperty(value: js.Array[ManufacturedItemDefinitionProperty]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setPropertyVarargs(value: ManufacturedItemDefinitionProperty*): Self = StObject.set(x, "property", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ManufacturedItemDefinition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUnitOfPresentation(value: CodeableConcept): Self = StObject.set(x, "unitOfPresentation", value.asInstanceOf[js.Any])
    
    inline def setUnitOfPresentationUndefined: Self = StObject.set(x, "unitOfPresentation", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
