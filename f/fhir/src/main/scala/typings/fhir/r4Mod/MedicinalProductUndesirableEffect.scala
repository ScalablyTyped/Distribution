package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductUndesirableEffect
  extends StObject
     with DomainResource
     with _FhirResource {
  
  /**
    * Classification of the effect.
    */
  var classification: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The frequency of occurrence of the effect.
    */
  var frequencyOfOccurrence: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The population group to which this applies.
    */
  var population: js.UndefOr[js.Array[Population]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MedicinalProductUndesirableEffect: typings.fhir.fhirStrings.MedicinalProductUndesirableEffect
  
  /**
    * The medication for which this is an indication.
    */
  var subject: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The symptom, condition or undesirable effect.
    */
  var symptomConditionEffect: js.UndefOr[CodeableConcept] = js.undefined
}
object MedicinalProductUndesirableEffect {
  
  inline def apply(): MedicinalProductUndesirableEffect = {
    val __obj = js.Dynamic.literal(resourceType = "MedicinalProductUndesirableEffect")
    __obj.asInstanceOf[MedicinalProductUndesirableEffect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductUndesirableEffect] (val x: Self) extends AnyVal {
    
    inline def setClassification(value: CodeableConcept): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setFrequencyOfOccurrence(value: CodeableConcept): Self = StObject.set(x, "frequencyOfOccurrence", value.asInstanceOf[js.Any])
    
    inline def setFrequencyOfOccurrenceUndefined: Self = StObject.set(x, "frequencyOfOccurrence", js.undefined)
    
    inline def setPopulation(value: js.Array[Population]): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
    
    inline def setPopulationUndefined: Self = StObject.set(x, "population", js.undefined)
    
    inline def setPopulationVarargs(value: Population*): Self = StObject.set(x, "population", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MedicinalProductUndesirableEffect): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: js.Array[Reference]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubjectVarargs(value: Reference*): Self = StObject.set(x, "subject", js.Array(value*))
    
    inline def setSymptomConditionEffect(value: CodeableConcept): Self = StObject.set(x, "symptomConditionEffect", value.asInstanceOf[js.Any])
    
    inline def setSymptomConditionEffectUndefined: Self = StObject.set(x, "symptomConditionEffect", js.undefined)
  }
}
