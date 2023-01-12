package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupplyRequestWhen
  extends StObject
     with BackboneElement {
  
  /**
    * Code indicating when the request should be fulfilled.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Formal fulfillment schedule.
    */
  var schedule: js.UndefOr[Timing] = js.undefined
}
object SupplyRequestWhen {
  
  inline def apply(): SupplyRequestWhen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupplyRequestWhen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SupplyRequestWhen] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setSchedule(value: Timing): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
