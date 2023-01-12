package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EpisodeOfCareDiagnosis
  extends StObject
     with BackboneElement {
  
  /**
    * A list of conditions/problems/diagnoses that this episode of care is intended to be providing care for.
    */
  var condition: Reference
  
  /**
    * Ranking of the diagnosis (for each role type).
    */
  var rank: js.UndefOr[Double] = js.undefined
  
  /**
    * Role that this diagnosis has within the episode of care (e.g. admission, billing, discharge …).
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}
object EpisodeOfCareDiagnosis {
  
  inline def apply(condition: Reference): EpisodeOfCareDiagnosis = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpisodeOfCareDiagnosis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EpisodeOfCareDiagnosis] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: Reference): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
