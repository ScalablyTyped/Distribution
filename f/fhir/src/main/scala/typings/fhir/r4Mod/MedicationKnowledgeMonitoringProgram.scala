package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeMonitoringProgram
  extends StObject
     with BackboneElement {
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Name of the reviewing program.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Type of program under which the medication is monitored.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object MedicationKnowledgeMonitoringProgram {
  
  inline def apply(): MedicationKnowledgeMonitoringProgram = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationKnowledgeMonitoringProgram]
  }
  
  extension [Self <: MedicationKnowledgeMonitoringProgram](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
