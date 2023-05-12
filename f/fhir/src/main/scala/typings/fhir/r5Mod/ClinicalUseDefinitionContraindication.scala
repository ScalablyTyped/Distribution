package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClinicalUseDefinitionContraindication
  extends StObject
     with BackboneElement {
  
  /**
    * The expression may be inlined or may be a reference to a named expression within a logic library referenced by the library element.
    */
  var applicability: js.UndefOr[Expression] = js.undefined
  
  /**
    * A comorbidity (concurrent condition) or coinfection.
    */
  var comorbidity: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * The status of the disease or symptom for the contraindication, for example "chronic" or "metastatic".
    */
  var diseaseStatus: js.UndefOr[CodeableReference] = js.undefined
  
  /**
    * The situation that is being documented as contraindicating against this item.
    */
  var diseaseSymptomProcedure: js.UndefOr[CodeableReference] = js.undefined
  
  /**
    * The indication which this is a contraidication for.
    */
  var indication: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Information about the use of the medicinal product in relation to other therapies described as part of the contraindication.
    */
  var otherTherapy: js.UndefOr[js.Array[ClinicalUseDefinitionContraindicationOtherTherapy]] = js.undefined
}
object ClinicalUseDefinitionContraindication {
  
  inline def apply(): ClinicalUseDefinitionContraindication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClinicalUseDefinitionContraindication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClinicalUseDefinitionContraindication] (val x: Self) extends AnyVal {
    
    inline def setApplicability(value: Expression): Self = StObject.set(x, "applicability", value.asInstanceOf[js.Any])
    
    inline def setApplicabilityUndefined: Self = StObject.set(x, "applicability", js.undefined)
    
    inline def setComorbidity(value: js.Array[CodeableReference]): Self = StObject.set(x, "comorbidity", value.asInstanceOf[js.Any])
    
    inline def setComorbidityUndefined: Self = StObject.set(x, "comorbidity", js.undefined)
    
    inline def setComorbidityVarargs(value: CodeableReference*): Self = StObject.set(x, "comorbidity", js.Array(value*))
    
    inline def setDiseaseStatus(value: CodeableReference): Self = StObject.set(x, "diseaseStatus", value.asInstanceOf[js.Any])
    
    inline def setDiseaseStatusUndefined: Self = StObject.set(x, "diseaseStatus", js.undefined)
    
    inline def setDiseaseSymptomProcedure(value: CodeableReference): Self = StObject.set(x, "diseaseSymptomProcedure", value.asInstanceOf[js.Any])
    
    inline def setDiseaseSymptomProcedureUndefined: Self = StObject.set(x, "diseaseSymptomProcedure", js.undefined)
    
    inline def setIndication(value: js.Array[Reference]): Self = StObject.set(x, "indication", value.asInstanceOf[js.Any])
    
    inline def setIndicationUndefined: Self = StObject.set(x, "indication", js.undefined)
    
    inline def setIndicationVarargs(value: Reference*): Self = StObject.set(x, "indication", js.Array(value*))
    
    inline def setOtherTherapy(value: js.Array[ClinicalUseDefinitionContraindicationOtherTherapy]): Self = StObject.set(x, "otherTherapy", value.asInstanceOf[js.Any])
    
    inline def setOtherTherapyUndefined: Self = StObject.set(x, "otherTherapy", js.undefined)
    
    inline def setOtherTherapyVarargs(value: ClinicalUseDefinitionContraindicationOtherTherapy*): Self = StObject.set(x, "otherTherapy", js.Array(value*))
  }
}
