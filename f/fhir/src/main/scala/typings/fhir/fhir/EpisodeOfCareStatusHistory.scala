package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Past list of status codes (the current status may be included to cover the start date of the status)
  */
trait EpisodeOfCareStatusHistory
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Duration the EpisodeOfCare was in the specified status
    */
  var period: Period
  
  /**
    * planned | waitlist | active | onhold | finished | cancelled | entered-in-error
    */
  var status: code
}
object EpisodeOfCareStatusHistory {
  
  inline def apply(period: Period, status: code): EpisodeOfCareStatusHistory = {
    val __obj = js.Dynamic.literal(period = period.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpisodeOfCareStatusHistory]
  }
  
  extension [Self <: EpisodeOfCareStatusHistory](x: Self) {
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
