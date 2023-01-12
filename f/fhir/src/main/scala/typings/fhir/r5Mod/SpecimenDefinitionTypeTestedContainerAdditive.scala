package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecimenDefinitionTypeTestedContainerAdditive
  extends StObject
     with BackboneElement {
  
  /**
    * Substance introduced in the kind of container to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.
    */
  var additiveCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Substance introduced in the kind of container to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.
    */
  var additiveReference: js.UndefOr[Reference] = js.undefined
}
object SpecimenDefinitionTypeTestedContainerAdditive {
  
  inline def apply(): SpecimenDefinitionTypeTestedContainerAdditive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecimenDefinitionTypeTestedContainerAdditive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecimenDefinitionTypeTestedContainerAdditive] (val x: Self) extends AnyVal {
    
    inline def setAdditiveCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "additiveCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setAdditiveCodeableConceptUndefined: Self = StObject.set(x, "additiveCodeableConcept", js.undefined)
    
    inline def setAdditiveReference(value: Reference): Self = StObject.set(x, "additiveReference", value.asInstanceOf[js.Any])
    
    inline def setAdditiveReferenceUndefined: Self = StObject.set(x, "additiveReference", js.undefined)
  }
}
