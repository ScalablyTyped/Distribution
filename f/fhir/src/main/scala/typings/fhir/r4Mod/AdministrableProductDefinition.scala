package typings.fhir.r4Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdministrableProductDefinition
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The dose form of the final product after necessary reconstitution or processing. Contrasts to the manufactured dose form (see ManufacturedItemDefinition). If the manufactured form was 'powder for solution for injection', the administrable dose form could be 'solution for injection' (once mixed with another item having manufactured form 'solvent for solution for injection').
    */
  var administrableDoseForm: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A device that is integral to the medicinal product, in effect being considered as an "ingredient" of the medicinal product. This is not intended for devices that are just co-packaged.
    */
  var device: js.UndefOr[Reference] = js.undefined
  
  /**
    * The medicinal product that this is a prepared administrable form of. This element is not a reference to the item(s) that make up this administrable form (for which see AdministrableProductDefinition.producedFrom). It is medicinal product as a whole, which may have several components (as well as packaging, devices etc.), that are given to the patient in this final administrable form. A single medicinal product may have several different administrable products (e.g. a tablet and a cream), and these could have different administrable forms (e.g. tablet as oral solid, or tablet crushed).
    */
  var formOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * An identifier for the administrable product.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The ingredients of this administrable medicinal product. This is only needed if the ingredients are not specified either using ManufacturedItemDefiniton (via AdministrableProductDefinition.producedFrom) to state which component items are used to make this, or using by incoming references from the Ingredient resource, to state in detail which substances exist within this. This element allows a basic coded ingredient to be used.
    */
  var ingredient: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The constituent manufactured item(s) that this administrable product is produced from. Either a single item, or several that are mixed before administration (e.g. a power item and a solvent item, to make a consumable solution). Note the items this is produced from are not raw ingredients (see AdministrableProductDefinition.ingredient), but manufactured medication items (ManufacturedItemDefinitions), which may be combined or prepared and transformed for patient use. The constituent items that this administrable form is produced from are all part of the product (for which see AdministrableProductDefinition.formOf).
    */
  var producedFrom: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Characteristics e.g. a products onset of action.
    */
  var property: js.UndefOr[js.Array[AdministrableProductDefinitionProperty]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_AdministrableProductDefinition: typings.fhir.fhirStrings.AdministrableProductDefinition
  
  /**
    * The path by which the product is taken into or makes contact with the body. In some regions this is referred to as the licenced or approved route.
    */
  var routeOfAdministration: js.Array[AdministrableProductDefinitionRouteOfAdministration]
  
  /**
    * Allows filtering of administrable products that are appropriate for use versus not.
    */
  var status: draft | active | retired | unknown
  
  /**
    * The presentation type in which this item is given to a patient. e.g. for a spray - 'puff' (as in 'contains 100 mcg per puff'), or for a liquid - 'vial' (as in 'contains 5 ml per vial').
    */
  var unitOfPresentation: js.UndefOr[CodeableConcept] = js.undefined
}
object AdministrableProductDefinition {
  
  inline def apply(
    routeOfAdministration: js.Array[AdministrableProductDefinitionRouteOfAdministration],
    status: draft | active | retired | unknown
  ): AdministrableProductDefinition = {
    val __obj = js.Dynamic.literal(resourceType = "AdministrableProductDefinition", routeOfAdministration = routeOfAdministration.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdministrableProductDefinition]
  }
  
  extension [Self <: AdministrableProductDefinition](x: Self) {
    
    inline def setAdministrableDoseForm(value: CodeableConcept): Self = StObject.set(x, "administrableDoseForm", value.asInstanceOf[js.Any])
    
    inline def setAdministrableDoseFormUndefined: Self = StObject.set(x, "administrableDoseForm", js.undefined)
    
    inline def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setFormOf(value: js.Array[Reference]): Self = StObject.set(x, "formOf", value.asInstanceOf[js.Any])
    
    inline def setFormOfUndefined: Self = StObject.set(x, "formOf", js.undefined)
    
    inline def setFormOfVarargs(value: Reference*): Self = StObject.set(x, "formOf", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIngredient(value: js.Array[CodeableConcept]): Self = StObject.set(x, "ingredient", value.asInstanceOf[js.Any])
    
    inline def setIngredientUndefined: Self = StObject.set(x, "ingredient", js.undefined)
    
    inline def setIngredientVarargs(value: CodeableConcept*): Self = StObject.set(x, "ingredient", js.Array(value*))
    
    inline def setProducedFrom(value: js.Array[Reference]): Self = StObject.set(x, "producedFrom", value.asInstanceOf[js.Any])
    
    inline def setProducedFromUndefined: Self = StObject.set(x, "producedFrom", js.undefined)
    
    inline def setProducedFromVarargs(value: Reference*): Self = StObject.set(x, "producedFrom", js.Array(value*))
    
    inline def setProperty(value: js.Array[AdministrableProductDefinitionProperty]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setPropertyVarargs(value: AdministrableProductDefinitionProperty*): Self = StObject.set(x, "property", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.AdministrableProductDefinition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRouteOfAdministration(value: js.Array[AdministrableProductDefinitionRouteOfAdministration]): Self = StObject.set(x, "routeOfAdministration", value.asInstanceOf[js.Any])
    
    inline def setRouteOfAdministrationVarargs(value: AdministrableProductDefinitionRouteOfAdministration*): Self = StObject.set(x, "routeOfAdministration", js.Array(value*))
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUnitOfPresentation(value: CodeableConcept): Self = StObject.set(x, "unitOfPresentation", value.asInstanceOf[js.Any])
    
    inline def setUnitOfPresentationUndefined: Self = StObject.set(x, "unitOfPresentation", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
