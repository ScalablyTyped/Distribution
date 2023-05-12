package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductPharmaceutical
  extends StObject
     with DomainResource
     with _FhirResource {
  
  /**
    * The administrable dose form, after necessary reconstitution.
    */
  var administrableDoseForm: CodeableConcept
  
  /**
    * Characteristics e.g. a products onset of action.
    */
  var characteristics: js.UndefOr[js.Array[MedicinalProductPharmaceuticalCharacteristics]] = js.undefined
  
  /**
    * Accompanying device.
    */
  var device: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * An identifier for the pharmaceutical medicinal product.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Ingredient.
    */
  var ingredient: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MedicinalProductPharmaceutical: typings.fhir.fhirStrings.MedicinalProductPharmaceutical
  
  /**
    * The path by which the pharmaceutical product is taken into or makes contact with the body.
    */
  var routeOfAdministration: js.Array[MedicinalProductPharmaceuticalRouteOfAdministration]
  
  /**
    * Todo.
    */
  var unitOfPresentation: js.UndefOr[CodeableConcept] = js.undefined
}
object MedicinalProductPharmaceutical {
  
  inline def apply(
    administrableDoseForm: CodeableConcept,
    routeOfAdministration: js.Array[MedicinalProductPharmaceuticalRouteOfAdministration]
  ): MedicinalProductPharmaceutical = {
    val __obj = js.Dynamic.literal(administrableDoseForm = administrableDoseForm.asInstanceOf[js.Any], resourceType = "MedicinalProductPharmaceutical", routeOfAdministration = routeOfAdministration.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductPharmaceutical]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductPharmaceutical] (val x: Self) extends AnyVal {
    
    inline def setAdministrableDoseForm(value: CodeableConcept): Self = StObject.set(x, "administrableDoseForm", value.asInstanceOf[js.Any])
    
    inline def setCharacteristics(value: js.Array[MedicinalProductPharmaceuticalCharacteristics]): Self = StObject.set(x, "characteristics", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicsUndefined: Self = StObject.set(x, "characteristics", js.undefined)
    
    inline def setCharacteristicsVarargs(value: MedicinalProductPharmaceuticalCharacteristics*): Self = StObject.set(x, "characteristics", js.Array(value*))
    
    inline def setDevice(value: js.Array[Reference]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setDeviceVarargs(value: Reference*): Self = StObject.set(x, "device", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIngredient(value: js.Array[Reference]): Self = StObject.set(x, "ingredient", value.asInstanceOf[js.Any])
    
    inline def setIngredientUndefined: Self = StObject.set(x, "ingredient", js.undefined)
    
    inline def setIngredientVarargs(value: Reference*): Self = StObject.set(x, "ingredient", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MedicinalProductPharmaceutical): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRouteOfAdministration(value: js.Array[MedicinalProductPharmaceuticalRouteOfAdministration]): Self = StObject.set(x, "routeOfAdministration", value.asInstanceOf[js.Any])
    
    inline def setRouteOfAdministrationVarargs(value: MedicinalProductPharmaceuticalRouteOfAdministration*): Self = StObject.set(x, "routeOfAdministration", js.Array(value*))
    
    inline def setUnitOfPresentation(value: CodeableConcept): Self = StObject.set(x, "unitOfPresentation", value.asInstanceOf[js.Any])
    
    inline def setUnitOfPresentationUndefined: Self = StObject.set(x, "unitOfPresentation", js.undefined)
  }
}
