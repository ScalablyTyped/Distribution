package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionStage
  extends StObject
     with BackboneElement {
  
  /**
    * Reference to a formal record of the evidence on which the staging assessment is based.
    */
  var assessment: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A simple summary of the stage such as "Stage 3". The determination of the stage is disease-specific.
    */
  var summary: js.UndefOr[CodeableConcept] = js.undefined
}
object ConditionStage {
  
  inline def apply(): ConditionStage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionStage]
  }
  
  extension [Self <: ConditionStage](x: Self) {
    
    inline def setAssessment(value: js.Array[Reference]): Self = StObject.set(x, "assessment", value.asInstanceOf[js.Any])
    
    inline def setAssessmentUndefined: Self = StObject.set(x, "assessment", js.undefined)
    
    inline def setAssessmentVarargs(value: Reference*): Self = StObject.set(x, "assessment", js.Array(value*))
    
    inline def setSummary(value: CodeableConcept): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
