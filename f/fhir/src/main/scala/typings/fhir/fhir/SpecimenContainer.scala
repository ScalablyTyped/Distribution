package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Direct container of specimen (tube/slide, etc.)
  */
@js.native
trait SpecimenContainer extends BackboneElement {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Additive associated with container
    */
  var additiveCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Additive associated with container
    */
  var additiveReference: js.UndefOr[Reference] = js.native
  
  /**
    * Container volume or size
    */
  var capacity: js.UndefOr[Quantity] = js.native
  
  /**
    * Textual description of the container
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Id for the container
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Quantity of specimen within container
    */
  var specimenQuantity: js.UndefOr[Quantity] = js.native
  
  /**
    * Kind of container directly associated with specimen
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}
object SpecimenContainer {
  
  @scala.inline
  def apply(): SpecimenContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecimenContainer]
  }
  
  @scala.inline
  implicit class SpecimenContainerMutableBuilder[Self <: SpecimenContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditiveCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "additiveCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditiveCodeableConceptUndefined: Self = StObject.set(x, "additiveCodeableConcept", js.undefined)
    
    @scala.inline
    def setAdditiveReference(value: Reference): Self = StObject.set(x, "additiveReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditiveReferenceUndefined: Self = StObject.set(x, "additiveReference", js.undefined)
    
    @scala.inline
    def setCapacity(value: Quantity): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setSpecimenQuantity(value: Quantity): Self = StObject.set(x, "specimenQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecimenQuantityUndefined: Self = StObject.set(x, "specimenQuantity", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
