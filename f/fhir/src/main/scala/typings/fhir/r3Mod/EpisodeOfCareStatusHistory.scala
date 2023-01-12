package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
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
  var status: planned | waitlist | active | onhold | finished | cancelled | `entered-in-error`
}
object EpisodeOfCareStatusHistory {
  
  inline def apply(
    period: Period,
    status: planned | waitlist | active | onhold | finished | cancelled | `entered-in-error`
  ): EpisodeOfCareStatusHistory = {
    val __obj = js.Dynamic.literal(period = period.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpisodeOfCareStatusHistory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EpisodeOfCareStatusHistory] (val x: Self) extends AnyVal {
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: planned | waitlist | active | onhold | finished | cancelled | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
