package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeRegulatory
  extends StObject
     with BackboneElement {
  
  /**
    * The maximum number of units of the medication that can be dispensed in a period.
    */
  var maxDispense: js.UndefOr[MedicationKnowledgeRegulatoryMaxDispense] = js.undefined
  
  /**
    * The authority that is specifying the regulations.
    */
  var regulatoryAuthority: Reference
  
  /**
    * Specifies the schedule of a medication in jurisdiction.
    */
  var schedule: js.UndefOr[js.Array[MedicationKnowledgeRegulatorySchedule]] = js.undefined
  
  /**
    * Specifies if changes are allowed when dispensing a medication from a regulatory perspective.
    */
  var substitution: js.UndefOr[js.Array[MedicationKnowledgeRegulatorySubstitution]] = js.undefined
}
object MedicationKnowledgeRegulatory {
  
  inline def apply(regulatoryAuthority: Reference): MedicationKnowledgeRegulatory = {
    val __obj = js.Dynamic.literal(regulatoryAuthority = regulatoryAuthority.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationKnowledgeRegulatory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationKnowledgeRegulatory] (val x: Self) extends AnyVal {
    
    inline def setMaxDispense(value: MedicationKnowledgeRegulatoryMaxDispense): Self = StObject.set(x, "maxDispense", value.asInstanceOf[js.Any])
    
    inline def setMaxDispenseUndefined: Self = StObject.set(x, "maxDispense", js.undefined)
    
    inline def setRegulatoryAuthority(value: Reference): Self = StObject.set(x, "regulatoryAuthority", value.asInstanceOf[js.Any])
    
    inline def setSchedule(value: js.Array[MedicationKnowledgeRegulatorySchedule]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setScheduleVarargs(value: MedicationKnowledgeRegulatorySchedule*): Self = StObject.set(x, "schedule", js.Array(value*))
    
    inline def setSubstitution(value: js.Array[MedicationKnowledgeRegulatorySubstitution]): Self = StObject.set(x, "substitution", value.asInstanceOf[js.Any])
    
    inline def setSubstitutionUndefined: Self = StObject.set(x, "substitution", js.undefined)
    
    inline def setSubstitutionVarargs(value: MedicationKnowledgeRegulatorySubstitution*): Self = StObject.set(x, "substitution", js.Array(value*))
  }
}
