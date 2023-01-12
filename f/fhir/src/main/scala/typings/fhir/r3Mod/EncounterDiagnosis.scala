package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncounterDiagnosis
  extends StObject
     with BackboneElement {
  
  /**
    * For systems that need to know which was the primary diagnosis, these will be marked with the standard extension primaryDiagnosis (which is a sequence value rather than a flag, 1 = primary diagnosis).
    */
  var condition: Reference
  
  /**
    * Ranking of the diagnosis (for each role type).
    */
  var rank: js.UndefOr[Double] = js.undefined
  
  /**
    * Role that this diagnosis has within the encounter (e.g. admission, billing, discharge …).
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}
object EncounterDiagnosis {
  
  inline def apply(condition: Reference): EncounterDiagnosis = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncounterDiagnosis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncounterDiagnosis] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: Reference): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
