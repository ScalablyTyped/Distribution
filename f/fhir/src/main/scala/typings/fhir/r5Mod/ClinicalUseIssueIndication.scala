package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClinicalUseIssueIndication
  extends StObject
     with BackboneElement {
  
  /**
    * A comorbidity (concurrent condition) or coinfection as part of the indication.
    */
  var comorbidity: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * The status of the disease or symptom for the indication.
    */
  var diseaseStatus: js.UndefOr[CodeableReference] = js.undefined
  
  /**
    * The situation that is being documented as an indicaton for this item.
    */
  var diseaseSymptomProcedure: js.UndefOr[CodeableReference] = js.undefined
  
  /**
    * Timing or duration information.
    */
  var duration: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The intended effect, aim or strategy to be achieved.
    */
  var intendedEffect: js.UndefOr[CodeableReference] = js.undefined
  
  /**
    * Information about the use of the medicinal product in relation to other therapies described as part of the indication.
    */
  var otherTherapy: js.UndefOr[js.Array[ClinicalUseIssueContraindicationOtherTherapy]] = js.undefined
  
  /**
    * The specific undesirable effects of the medicinal product.
    */
  var undesirableEffect: js.UndefOr[js.Array[Reference]] = js.undefined
}
object ClinicalUseIssueIndication {
  
  inline def apply(): ClinicalUseIssueIndication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClinicalUseIssueIndication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClinicalUseIssueIndication] (val x: Self) extends AnyVal {
    
    inline def setComorbidity(value: js.Array[CodeableReference]): Self = StObject.set(x, "comorbidity", value.asInstanceOf[js.Any])
    
    inline def setComorbidityUndefined: Self = StObject.set(x, "comorbidity", js.undefined)
    
    inline def setComorbidityVarargs(value: CodeableReference*): Self = StObject.set(x, "comorbidity", js.Array(value*))
    
    inline def setDiseaseStatus(value: CodeableReference): Self = StObject.set(x, "diseaseStatus", value.asInstanceOf[js.Any])
    
    inline def setDiseaseStatusUndefined: Self = StObject.set(x, "diseaseStatus", js.undefined)
    
    inline def setDiseaseSymptomProcedure(value: CodeableReference): Self = StObject.set(x, "diseaseSymptomProcedure", value.asInstanceOf[js.Any])
    
    inline def setDiseaseSymptomProcedureUndefined: Self = StObject.set(x, "diseaseSymptomProcedure", js.undefined)
    
    inline def setDuration(value: Quantity): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setIntendedEffect(value: CodeableReference): Self = StObject.set(x, "intendedEffect", value.asInstanceOf[js.Any])
    
    inline def setIntendedEffectUndefined: Self = StObject.set(x, "intendedEffect", js.undefined)
    
    inline def setOtherTherapy(value: js.Array[ClinicalUseIssueContraindicationOtherTherapy]): Self = StObject.set(x, "otherTherapy", value.asInstanceOf[js.Any])
    
    inline def setOtherTherapyUndefined: Self = StObject.set(x, "otherTherapy", js.undefined)
    
    inline def setOtherTherapyVarargs(value: ClinicalUseIssueContraindicationOtherTherapy*): Self = StObject.set(x, "otherTherapy", js.Array(value*))
    
    inline def setUndesirableEffect(value: js.Array[Reference]): Self = StObject.set(x, "undesirableEffect", value.asInstanceOf[js.Any])
    
    inline def setUndesirableEffectUndefined: Self = StObject.set(x, "undesirableEffect", js.undefined)
    
    inline def setUndesirableEffectVarargs(value: Reference*): Self = StObject.set(x, "undesirableEffect", js.Array(value*))
  }
}
