package typings.fhir.r2Mod

import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.accepted
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.failed
import typings.fhir.fhirStrings.planned
import typings.fhir.fhirStrings.proposed
import typings.fhir.fhirStrings.received
import typings.fhir.fhirStrings.rejected
import typings.fhir.fhirStrings.requested
import typings.fhir.fhirStrings.review
import typings.fhir.fhirStrings.suspended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticOrderItem
  extends StObject
     with BackboneElement {
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Anatomical location where the request test should be performed.  This is the target site.
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A code that identifies a particular diagnostic investigation, or panel of investigations, that have been requested.
    */
  var code: CodeableConcept
  
  /**
    * A summary of the events of interest that have occurred as this item of the request is processed.
    */
  var event: js.UndefOr[js.Array[DiagnosticOrderEvent]] = js.undefined
  
  /**
    * If the item is related to a specific specimen.
    */
  var specimen: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The status of this individual item within the order.
    */
  var status: js.UndefOr[
    proposed | draft | planned | requested | received | accepted | `in-progress` | review | completed | cancelled | suspended | rejected | failed
  ] = js.undefined
}
object DiagnosticOrderItem {
  
  inline def apply(code: CodeableConcept): DiagnosticOrderItem = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticOrderItem]
  }
  
  extension [Self <: DiagnosticOrderItem](x: Self) {
    
    inline def setBodySite(value: CodeableConcept): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: js.Array[DiagnosticOrderEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setEventVarargs(value: DiagnosticOrderEvent*): Self = StObject.set(x, "event", js.Array(value*))
    
    inline def setSpecimen(value: js.Array[Reference]): Self = StObject.set(x, "specimen", value.asInstanceOf[js.Any])
    
    inline def setSpecimenUndefined: Self = StObject.set(x, "specimen", js.undefined)
    
    inline def setSpecimenVarargs(value: Reference*): Self = StObject.set(x, "specimen", js.Array(value*))
    
    inline def setStatus(
      value: proposed | draft | planned | requested | received | accepted | `in-progress` | review | completed | cancelled | suspended | rejected | failed
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
