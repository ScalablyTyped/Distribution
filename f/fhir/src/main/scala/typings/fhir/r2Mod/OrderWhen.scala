package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderWhen
  extends StObject
     with BackboneElement {
  
  /**
    * Code specifies when request should be done. The code may simply be a priority code.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A formal schedule.
    */
  var schedule: js.UndefOr[Timing] = js.undefined
}
object OrderWhen {
  
  inline def apply(): OrderWhen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderWhen]
  }
  
  extension [Self <: OrderWhen](x: Self) {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setSchedule(value: Timing): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
