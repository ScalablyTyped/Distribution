package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResearchStudyRecruitment
  extends StObject
     with BackboneElement {
  
  /**
    * Group of participants who were enrolled in study.
    */
  var actualGroup: js.UndefOr[Reference] = js.undefined
  
  /**
    * Actual total number of participants enrolled in study.
    */
  var actualNumber: js.UndefOr[Double] = js.undefined
  
  /**
    * Inclusion and exclusion criteria.
    */
  var eligibility: js.UndefOr[Reference] = js.undefined
  
  /**
    * Estimated total number of participants to be enrolled.
    */
  var targetNumber: js.UndefOr[Double] = js.undefined
}
object ResearchStudyRecruitment {
  
  inline def apply(): ResearchStudyRecruitment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResearchStudyRecruitment]
  }
  
  extension [Self <: ResearchStudyRecruitment](x: Self) {
    
    inline def setActualGroup(value: Reference): Self = StObject.set(x, "actualGroup", value.asInstanceOf[js.Any])
    
    inline def setActualGroupUndefined: Self = StObject.set(x, "actualGroup", js.undefined)
    
    inline def setActualNumber(value: Double): Self = StObject.set(x, "actualNumber", value.asInstanceOf[js.Any])
    
    inline def setActualNumberUndefined: Self = StObject.set(x, "actualNumber", js.undefined)
    
    inline def setEligibility(value: Reference): Self = StObject.set(x, "eligibility", value.asInstanceOf[js.Any])
    
    inline def setEligibilityUndefined: Self = StObject.set(x, "eligibility", js.undefined)
    
    inline def setTargetNumber(value: Double): Self = StObject.set(x, "targetNumber", value.asInstanceOf[js.Any])
    
    inline def setTargetNumberUndefined: Self = StObject.set(x, "targetNumber", js.undefined)
  }
}
