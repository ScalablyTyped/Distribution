package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimDiagnosis
  extends StObject
     with BackboneElement {
  
  /**
    * Required to adjudicate services rendered to condition presented.
    */
  var diagnosis: Coding
  
  /**
    * Required to maintain order of the diagnoses.
    */
  var sequence: Double
}
object ClaimDiagnosis {
  
  inline def apply(diagnosis: Coding, sequence: Double): ClaimDiagnosis = {
    val __obj = js.Dynamic.literal(diagnosis = diagnosis.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimDiagnosis]
  }
  
  extension [Self <: ClaimDiagnosis](x: Self) {
    
    inline def setDiagnosis(value: Coding): Self = StObject.set(x, "diagnosis", value.asInstanceOf[js.Any])
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
  }
}
