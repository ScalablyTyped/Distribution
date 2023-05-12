package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClinicalUseDefinitionIndication
  extends StObject
     with BackboneElement {
  
  var _durationString: js.UndefOr[Element] = js.undefined
  
  /**
    * The expression may be inlined or may be a reference to a named expression within a logic library referenced by the library element.
    */
  var applicability: js.UndefOr[Expression] = js.undefined
  
  /**
    * A comorbidity (concurrent condition) or coinfection as part of the indication.
    */
  var comorbidity: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * The status of the disease or symptom for the indication, for example "chronic" or "metastatic".
    */
  var diseaseStatus: js.UndefOr[CodeableReference] = js.undefined
  
  /**
    * The situation that is being documented as an indicaton for this item.
    */
  var diseaseSymptomProcedure: js.UndefOr[CodeableReference] = js.undefined
  
  /**
    * Timing or duration information, that may be associated with use with the indicated condition e.g. Adult patients suffering from myocardial infarction (from a few days until less than 35 days), ischaemic stroke (from 7 days until less than 6 months).
    */
  var durationRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Timing or duration information, that may be associated with use with the indicated condition e.g. Adult patients suffering from myocardial infarction (from a few days until less than 35 days), ischaemic stroke (from 7 days until less than 6 months).
    */
  var durationString: js.UndefOr[String] = js.undefined
  
  /**
    * The intended effect, aim or strategy to be achieved.
    */
  var intendedEffect: js.UndefOr[CodeableReference] = js.undefined
  
  /**
    * Information about the use of the medicinal product in relation to other therapies described as part of the indication.
    */
  var otherTherapy: js.UndefOr[js.Array[ClinicalUseDefinitionContraindicationOtherTherapy]] = js.undefined
  
  /**
    * An unwanted side effect or negative outcome that may happen if you use the drug (or other subject of this resource) for this indication.
    */
  var undesirableEffect: js.UndefOr[js.Array[Reference]] = js.undefined
}
object ClinicalUseDefinitionIndication {
  
  inline def apply(): ClinicalUseDefinitionIndication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClinicalUseDefinitionIndication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClinicalUseDefinitionIndication] (val x: Self) extends AnyVal {
    
    inline def setApplicability(value: Expression): Self = StObject.set(x, "applicability", value.asInstanceOf[js.Any])
    
    inline def setApplicabilityUndefined: Self = StObject.set(x, "applicability", js.undefined)
    
    inline def setComorbidity(value: js.Array[CodeableReference]): Self = StObject.set(x, "comorbidity", value.asInstanceOf[js.Any])
    
    inline def setComorbidityUndefined: Self = StObject.set(x, "comorbidity", js.undefined)
    
    inline def setComorbidityVarargs(value: CodeableReference*): Self = StObject.set(x, "comorbidity", js.Array(value*))
    
    inline def setDiseaseStatus(value: CodeableReference): Self = StObject.set(x, "diseaseStatus", value.asInstanceOf[js.Any])
    
    inline def setDiseaseStatusUndefined: Self = StObject.set(x, "diseaseStatus", js.undefined)
    
    inline def setDiseaseSymptomProcedure(value: CodeableReference): Self = StObject.set(x, "diseaseSymptomProcedure", value.asInstanceOf[js.Any])
    
    inline def setDiseaseSymptomProcedureUndefined: Self = StObject.set(x, "diseaseSymptomProcedure", js.undefined)
    
    inline def setDurationRange(value: Range): Self = StObject.set(x, "durationRange", value.asInstanceOf[js.Any])
    
    inline def setDurationRangeUndefined: Self = StObject.set(x, "durationRange", js.undefined)
    
    inline def setDurationString(value: String): Self = StObject.set(x, "durationString", value.asInstanceOf[js.Any])
    
    inline def setDurationStringUndefined: Self = StObject.set(x, "durationString", js.undefined)
    
    inline def setIntendedEffect(value: CodeableReference): Self = StObject.set(x, "intendedEffect", value.asInstanceOf[js.Any])
    
    inline def setIntendedEffectUndefined: Self = StObject.set(x, "intendedEffect", js.undefined)
    
    inline def setOtherTherapy(value: js.Array[ClinicalUseDefinitionContraindicationOtherTherapy]): Self = StObject.set(x, "otherTherapy", value.asInstanceOf[js.Any])
    
    inline def setOtherTherapyUndefined: Self = StObject.set(x, "otherTherapy", js.undefined)
    
    inline def setOtherTherapyVarargs(value: ClinicalUseDefinitionContraindicationOtherTherapy*): Self = StObject.set(x, "otherTherapy", js.Array(value*))
    
    inline def setUndesirableEffect(value: js.Array[Reference]): Self = StObject.set(x, "undesirableEffect", value.asInstanceOf[js.Any])
    
    inline def setUndesirableEffectUndefined: Self = StObject.set(x, "undesirableEffect", js.undefined)
    
    inline def setUndesirableEffectVarargs(value: Reference*): Self = StObject.set(x, "undesirableEffect", js.Array(value*))
    
    inline def set_durationString(value: Element): Self = StObject.set(x, "_durationString", value.asInstanceOf[js.Any])
    
    inline def set_durationStringUndefined: Self = StObject.set(x, "_durationString", js.undefined)
  }
}
