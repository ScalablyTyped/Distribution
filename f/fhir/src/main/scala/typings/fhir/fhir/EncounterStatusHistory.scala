package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of past encounter statuses
  */
trait EncounterStatusHistory
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The time that the episode was in the specified status
    */
  var period: Period
  
  /**
    * planned | arrived | triaged | in-progress | onleave | finished | cancelled +
    */
  var status: code
}
object EncounterStatusHistory {
  
  inline def apply(period: Period, status: code): EncounterStatusHistory = {
    val __obj = js.Dynamic.literal(period = period.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncounterStatusHistory]
  }
  
  extension [Self <: EncounterStatusHistory](x: Self) {
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
