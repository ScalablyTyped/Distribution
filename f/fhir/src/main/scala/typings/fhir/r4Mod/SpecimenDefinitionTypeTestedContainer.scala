package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecimenDefinitionTypeTestedContainer
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _minimumVolumeString: js.UndefOr[Element] = js.undefined
  
  var _preparation: js.UndefOr[Element] = js.undefined
  
  /**
    * Substance introduced in the kind of container to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.
    */
  var additive: js.UndefOr[js.Array[SpecimenDefinitionTypeTestedContainerAdditive]] = js.undefined
  
  /**
    * Color of container cap.
    */
  var cap: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The capacity (volume or other measure) of this kind of container.
    */
  var capacity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The textual description of the kind of container.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The type of material of the container.
    */
  var material: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The minimum volume to be conditioned in the container.
    */
  var minimumVolumeQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The minimum volume to be conditioned in the container.
    */
  var minimumVolumeString: js.UndefOr[String] = js.undefined
  
  /**
    * Special processing that should be applied to the container for this kind of specimen.
    */
  var preparation: js.UndefOr[String] = js.undefined
  
  /**
    * The type of container used to contain this kind of specimen.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object SpecimenDefinitionTypeTestedContainer {
  
  inline def apply(): SpecimenDefinitionTypeTestedContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecimenDefinitionTypeTestedContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecimenDefinitionTypeTestedContainer] (val x: Self) extends AnyVal {
    
    inline def setAdditive(value: js.Array[SpecimenDefinitionTypeTestedContainerAdditive]): Self = StObject.set(x, "additive", value.asInstanceOf[js.Any])
    
    inline def setAdditiveUndefined: Self = StObject.set(x, "additive", js.undefined)
    
    inline def setAdditiveVarargs(value: SpecimenDefinitionTypeTestedContainerAdditive*): Self = StObject.set(x, "additive", js.Array(value*))
    
    inline def setCap(value: CodeableConcept): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
    
    inline def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
    
    inline def setCapacity(value: Quantity): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMaterial(value: CodeableConcept): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setMinimumVolumeQuantity(value: Quantity): Self = StObject.set(x, "minimumVolumeQuantity", value.asInstanceOf[js.Any])
    
    inline def setMinimumVolumeQuantityUndefined: Self = StObject.set(x, "minimumVolumeQuantity", js.undefined)
    
    inline def setMinimumVolumeString(value: String): Self = StObject.set(x, "minimumVolumeString", value.asInstanceOf[js.Any])
    
    inline def setMinimumVolumeStringUndefined: Self = StObject.set(x, "minimumVolumeString", js.undefined)
    
    inline def setPreparation(value: String): Self = StObject.set(x, "preparation", value.asInstanceOf[js.Any])
    
    inline def setPreparationUndefined: Self = StObject.set(x, "preparation", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_minimumVolumeString(value: Element): Self = StObject.set(x, "_minimumVolumeString", value.asInstanceOf[js.Any])
    
    inline def set_minimumVolumeStringUndefined: Self = StObject.set(x, "_minimumVolumeString", js.undefined)
    
    inline def set_preparation(value: Element): Self = StObject.set(x, "_preparation", value.asInstanceOf[js.Any])
    
    inline def set_preparationUndefined: Self = StObject.set(x, "_preparation", js.undefined)
  }
}
