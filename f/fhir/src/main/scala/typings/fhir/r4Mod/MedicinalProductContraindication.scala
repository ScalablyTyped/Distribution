package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductContraindication
  extends StObject
     with DomainResource
     with _FhirResource {
  
  /**
    * A comorbidity (concurrent condition) or coinfection.
    */
  var comorbidity: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The disease, symptom or procedure for the contraindication.
    */
  var disease: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The status of the disease or symptom for the contraindication.
    */
  var diseaseStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Information about the use of the medicinal product in relation to other therapies described as part of the indication.
    */
  var otherTherapy: js.UndefOr[js.Array[MedicinalProductContraindicationOtherTherapy]] = js.undefined
  
  /**
    * The population group to which this applies.
    */
  var population: js.UndefOr[js.Array[Population]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MedicinalProductContraindication: typings.fhir.fhirStrings.MedicinalProductContraindication
  
  /**
    * The medication for which this is an indication.
    */
  var subject: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Information about the use of the medicinal product in relation to other therapies as part of the indication.
    */
  var therapeuticIndication: js.UndefOr[js.Array[Reference]] = js.undefined
}
object MedicinalProductContraindication {
  
  inline def apply(): MedicinalProductContraindication = {
    val __obj = js.Dynamic.literal(resourceType = "MedicinalProductContraindication")
    __obj.asInstanceOf[MedicinalProductContraindication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductContraindication] (val x: Self) extends AnyVal {
    
    inline def setComorbidity(value: js.Array[CodeableConcept]): Self = StObject.set(x, "comorbidity", value.asInstanceOf[js.Any])
    
    inline def setComorbidityUndefined: Self = StObject.set(x, "comorbidity", js.undefined)
    
    inline def setComorbidityVarargs(value: CodeableConcept*): Self = StObject.set(x, "comorbidity", js.Array(value*))
    
    inline def setDisease(value: CodeableConcept): Self = StObject.set(x, "disease", value.asInstanceOf[js.Any])
    
    inline def setDiseaseStatus(value: CodeableConcept): Self = StObject.set(x, "diseaseStatus", value.asInstanceOf[js.Any])
    
    inline def setDiseaseStatusUndefined: Self = StObject.set(x, "diseaseStatus", js.undefined)
    
    inline def setDiseaseUndefined: Self = StObject.set(x, "disease", js.undefined)
    
    inline def setOtherTherapy(value: js.Array[MedicinalProductContraindicationOtherTherapy]): Self = StObject.set(x, "otherTherapy", value.asInstanceOf[js.Any])
    
    inline def setOtherTherapyUndefined: Self = StObject.set(x, "otherTherapy", js.undefined)
    
    inline def setOtherTherapyVarargs(value: MedicinalProductContraindicationOtherTherapy*): Self = StObject.set(x, "otherTherapy", js.Array(value*))
    
    inline def setPopulation(value: js.Array[Population]): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
    
    inline def setPopulationUndefined: Self = StObject.set(x, "population", js.undefined)
    
    inline def setPopulationVarargs(value: Population*): Self = StObject.set(x, "population", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MedicinalProductContraindication): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: js.Array[Reference]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubjectVarargs(value: Reference*): Self = StObject.set(x, "subject", js.Array(value*))
    
    inline def setTherapeuticIndication(value: js.Array[Reference]): Self = StObject.set(x, "therapeuticIndication", value.asInstanceOf[js.Any])
    
    inline def setTherapeuticIndicationUndefined: Self = StObject.set(x, "therapeuticIndication", js.undefined)
    
    inline def setTherapeuticIndicationVarargs(value: Reference*): Self = StObject.set(x, "therapeuticIndication", js.Array(value*))
  }
}
