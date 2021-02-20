package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The list of diagnosis relevant to this episode of care
  */
@js.native
trait EpisodeOfCareDiagnosis extends BackboneElement {
  
  /**
    * Contains extended information for property 'rank'.
    */
  var _rank: js.UndefOr[Element] = js.native
  
  /**
    * Conditions/problems/diagnoses this episode of care is for
    */
  var condition: Reference = js.native
  
  /**
    * Ranking of the diagnosis (for each role type)
    */
  var rank: js.UndefOr[positiveInt] = js.native
  
  /**
    * Role that this diagnosis has within the episode of care (e.g. admission, billing, discharge …)
    */
  var role: js.UndefOr[CodeableConcept] = js.native
}
object EpisodeOfCareDiagnosis {
  
  @scala.inline
  def apply(condition: Reference): EpisodeOfCareDiagnosis = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpisodeOfCareDiagnosis]
  }
  
  @scala.inline
  implicit class EpisodeOfCareDiagnosisMutableBuilder[Self <: EpisodeOfCareDiagnosis] (val x: Self) extends AnyVal {
    
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
