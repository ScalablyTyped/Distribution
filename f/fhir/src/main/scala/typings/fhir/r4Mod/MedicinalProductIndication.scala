package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductIndication
  extends StObject
     with DomainResource
     with _FhirResource {
  
  /**
    * Comorbidity (concurrent condition) or co-infection as part of the indication.
    */
  var comorbidity: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The status of the disease or symptom for which the indication applies.
    */
  var diseaseStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The disease, symptom or procedure that is the indication for treatment.
    */
  var diseaseSymptomProcedure: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Timing or duration information as part of the indication.
    */
  var duration: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The intended effect, aim or strategy to be achieved by the indication.
    */
  var intendedEffect: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Information about the use of the medicinal product in relation to other therapies described as part of the indication.
    */
  var otherTherapy: js.UndefOr[js.Array[MedicinalProductIndicationOtherTherapy]] = js.undefined
  
  /**
    * The population group to which this applies.
    */
  var population: js.UndefOr[js.Array[Population]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MedicinalProductIndication: typings.fhir.fhirStrings.MedicinalProductIndication
  
  /**
    * The medication for which this is an indication.
    */
  var subject: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Describe the undesirable effects of the medicinal product.
    */
  var undesirableEffect: js.UndefOr[js.Array[Reference]] = js.undefined
}
object MedicinalProductIndication {
  
  inline def apply(): MedicinalProductIndication = {
    val __obj = js.Dynamic.literal(resourceType = "MedicinalProductIndication")
    __obj.asInstanceOf[MedicinalProductIndication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductIndication] (val x: Self) extends AnyVal {
    
    inline def setComorbidity(value: js.Array[CodeableConcept]): Self = StObject.set(x, "comorbidity", value.asInstanceOf[js.Any])
    
    inline def setComorbidityUndefined: Self = StObject.set(x, "comorbidity", js.undefined)
    
    inline def setComorbidityVarargs(value: CodeableConcept*): Self = StObject.set(x, "comorbidity", js.Array(value*))
    
    inline def setDiseaseStatus(value: CodeableConcept): Self = StObject.set(x, "diseaseStatus", value.asInstanceOf[js.Any])
    
    inline def setDiseaseStatusUndefined: Self = StObject.set(x, "diseaseStatus", js.undefined)
    
    inline def setDiseaseSymptomProcedure(value: CodeableConcept): Self = StObject.set(x, "diseaseSymptomProcedure", value.asInstanceOf[js.Any])
    
    inline def setDiseaseSymptomProcedureUndefined: Self = StObject.set(x, "diseaseSymptomProcedure", js.undefined)
    
    inline def setDuration(value: Quantity): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setIntendedEffect(value: CodeableConcept): Self = StObject.set(x, "intendedEffect", value.asInstanceOf[js.Any])
    
    inline def setIntendedEffectUndefined: Self = StObject.set(x, "intendedEffect", js.undefined)
    
    inline def setOtherTherapy(value: js.Array[MedicinalProductIndicationOtherTherapy]): Self = StObject.set(x, "otherTherapy", value.asInstanceOf[js.Any])
    
    inline def setOtherTherapyUndefined: Self = StObject.set(x, "otherTherapy", js.undefined)
    
    inline def setOtherTherapyVarargs(value: MedicinalProductIndicationOtherTherapy*): Self = StObject.set(x, "otherTherapy", js.Array(value*))
    
    inline def setPopulation(value: js.Array[Population]): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
    
    inline def setPopulationUndefined: Self = StObject.set(x, "population", js.undefined)
    
    inline def setPopulationVarargs(value: Population*): Self = StObject.set(x, "population", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MedicinalProductIndication): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: js.Array[Reference]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubjectVarargs(value: Reference*): Self = StObject.set(x, "subject", js.Array(value*))
    
    inline def setUndesirableEffect(value: js.Array[Reference]): Self = StObject.set(x, "undesirableEffect", value.asInstanceOf[js.Any])
    
    inline def setUndesirableEffectUndefined: Self = StObject.set(x, "undesirableEffect", js.undefined)
    
    inline def setUndesirableEffectVarargs(value: Reference*): Self = StObject.set(x, "undesirableEffect", js.Array(value*))
  }
}
