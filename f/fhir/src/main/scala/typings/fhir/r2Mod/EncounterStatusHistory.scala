package typings.fhir.r2Mod

import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.arrived
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.finished
import typings.fhir.fhirStrings.onleave
import typings.fhir.fhirStrings.planned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncounterStatusHistory
  extends StObject
     with BackboneElement {
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The time that the episode was in the specified status.
    */
  var period: Period
  
  /**
    * planned | arrived | in-progress | onleave | finished | cancelled.
    */
  var status: planned | arrived | `in-progress` | onleave | finished | cancelled
}
object EncounterStatusHistory {
  
  inline def apply(period: Period, status: planned | arrived | `in-progress` | onleave | finished | cancelled): EncounterStatusHistory = {
    val __obj = js.Dynamic.literal(period = period.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncounterStatusHistory]
  }
  
  extension [Self <: EncounterStatusHistory](x: Self) {
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: planned | arrived | `in-progress` | onleave | finished | cancelled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
