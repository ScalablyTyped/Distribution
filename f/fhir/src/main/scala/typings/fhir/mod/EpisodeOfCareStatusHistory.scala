package typings.fhir.mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.finished
import typings.fhir.fhirStrings.onhold
import typings.fhir.fhirStrings.planned
import typings.fhir.fhirStrings.waitlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EpisodeOfCareStatusHistory
  extends StObject
     with BackboneElement {
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The period during this EpisodeOfCare that the specific status applied.
    */
  var period: Period
  
  /**
    * planned | waitlist | active | onhold | finished | cancelled.
    */
  var status: planned | waitlist | active | onhold | finished | cancelled
}
object EpisodeOfCareStatusHistory {
  
  inline def apply(period: Period, status: planned | waitlist | active | onhold | finished | cancelled): EpisodeOfCareStatusHistory = {
    val __obj = js.Dynamic.literal(period = period.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpisodeOfCareStatusHistory]
  }
  
  extension [Self <: EpisodeOfCareStatusHistory](x: Self) {
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: planned | waitlist | active | onhold | finished | cancelled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
