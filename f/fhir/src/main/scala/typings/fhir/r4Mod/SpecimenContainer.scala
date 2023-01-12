package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecimenContainer
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.
    */
  var additiveCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.
    */
  var additiveReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The capacity (volume or other measure) the container may contain.
    */
  var capacity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Textual description of the container.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier, etc. The container ID may differ from the specimen id in some circumstances.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The quantity of specimen in the container; may be volume, dimensions, or other appropriate measurements, depending on the specimen type.
    */
  var specimenQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The type of container associated with the specimen (e.g. slide, aliquot, etc.).
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object SpecimenContainer {
  
  inline def apply(): SpecimenContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecimenContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecimenContainer] (val x: Self) extends AnyVal {
    
    inline def setAdditiveCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "additiveCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setAdditiveCodeableConceptUndefined: Self = StObject.set(x, "additiveCodeableConcept", js.undefined)
    
    inline def setAdditiveReference(value: Reference): Self = StObject.set(x, "additiveReference", value.asInstanceOf[js.Any])
    
    inline def setAdditiveReferenceUndefined: Self = StObject.set(x, "additiveReference", js.undefined)
    
    inline def setCapacity(value: Quantity): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setSpecimenQuantity(value: Quantity): Self = StObject.set(x, "specimenQuantity", value.asInstanceOf[js.Any])
    
    inline def setSpecimenQuantityUndefined: Self = StObject.set(x, "specimenQuantity", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
