package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The list of diagnosis relevant to this encounter
  */
trait EncounterDiagnosis
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'rank'.
    */
  var _rank: js.UndefOr[Element] = js.undefined
  
  /**
    * Reason the encounter takes place (resource)
    */
  var condition: Reference
  
  /**
    * Ranking of the diagnosis (for each role type)
    */
  var rank: js.UndefOr[positiveInt] = js.undefined
  
  /**
    * Role that this diagnosis has within the encounter (e.g. admission, billing, discharge …)
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}
object EncounterDiagnosis {
  
  @scala.inline
  def apply(condition: Reference): EncounterDiagnosis = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncounterDiagnosis]
  }
  
  @scala.inline
  implicit class EncounterDiagnosisMutableBuilder[Self <: EncounterDiagnosis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: Reference): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: positiveInt): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    
    @scala.inline
    def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def set_rank(value: Element): Self = StObject.set(x, "_rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_rankUndefined: Self = StObject.set(x, "_rank", js.undefined)
  }
}
