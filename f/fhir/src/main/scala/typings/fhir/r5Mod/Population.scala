package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Population
  extends StObject
     with BackboneType {
  
  /**
    * The age of the specific population.
    */
  var ageCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The age of the specific population.
    */
  var ageRange: js.UndefOr[Range] = js.undefined
  
  /**
    * The gender of the specific population.
    */
  var gender: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The existing physiological conditions of the specific population to which this applies.
    */
  var physiologicalCondition: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Race of the specific population.
    */
  var race: js.UndefOr[CodeableConcept] = js.undefined
}
object Population {
  
  inline def apply(): Population = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Population]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Population] (val x: Self) extends AnyVal {
    
    inline def setAgeCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "ageCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setAgeCodeableConceptUndefined: Self = StObject.set(x, "ageCodeableConcept", js.undefined)
    
    inline def setAgeRange(value: Range): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
    
    inline def setAgeRangeUndefined: Self = StObject.set(x, "ageRange", js.undefined)
    
    inline def setGender(value: CodeableConcept): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setPhysiologicalCondition(value: CodeableConcept): Self = StObject.set(x, "physiologicalCondition", value.asInstanceOf[js.Any])
    
    inline def setPhysiologicalConditionUndefined: Self = StObject.set(x, "physiologicalCondition", js.undefined)
    
    inline def setRace(value: CodeableConcept): Self = StObject.set(x, "race", value.asInstanceOf[js.Any])
    
    inline def setRaceUndefined: Self = StObject.set(x, "race", js.undefined)
  }
}
