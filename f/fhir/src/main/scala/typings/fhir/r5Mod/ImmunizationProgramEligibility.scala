package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImmunizationProgramEligibility
  extends StObject
     with BackboneElement {
  
  /**
    * Indicates which program the patient had their eligility evaluated for.
    */
  var program: CodeableConcept
  
  /**
    * Indicates the patient's eligility status for for a specific payment program.
    */
  var programStatus: CodeableConcept
}
object ImmunizationProgramEligibility {
  
  inline def apply(program: CodeableConcept, programStatus: CodeableConcept): ImmunizationProgramEligibility = {
    val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any], programStatus = programStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunizationProgramEligibility]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImmunizationProgramEligibility] (val x: Self) extends AnyVal {
    
    inline def setProgram(value: CodeableConcept): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setProgramStatus(value: CodeableConcept): Self = StObject.set(x, "programStatus", value.asInstanceOf[js.Any])
  }
}
