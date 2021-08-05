package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Medical device request
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait DeviceRequest
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'authoredOn'.
    */
  var _authoredOn: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * When recorded
    */
  var authoredOn: js.UndefOr[dateTime] = js.undefined
  
  /**
    * What request fulfills
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Device requested
    */
  var codeCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Device requested
    */
  var codeReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Encounter or Episode motivating request
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Identifier of composite request
    */
  var groupIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * External Request identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * proposal | plan | original-order | encoded | reflex-order
    */
  var intent: CodeableConcept
  
  /**
    * Notes or comments
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Desired time or schedule for use
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Desired time or schedule for use
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Desired time or schedule for use
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * Requested Filler
    */
  var performer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Fille role
    */
  var performerType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * What request replaces
    */
  var priorRequest: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Indicates how quickly the {{title}} should be addressed with respect to other requests
    */
  var priority: js.UndefOr[code] = js.undefined
  
  /**
    * Coded Reason for request
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Linked Reason for request
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Request provenance
    */
  var relevantHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Who/what is requesting diagnostics
    */
  var requester: js.UndefOr[DeviceRequestRequester] = js.undefined
  
  /**
    * draft | active | suspended | completed | entered-in-error | cancelled
    */
  var status: js.UndefOr[code] = js.undefined
  
  /**
    * Focus of request
    */
  var subject: Reference
  
  /**
    * Additional clinical information
    */
  var supportingInfo: js.UndefOr[js.Array[Reference]] = js.undefined
}
object DeviceRequest {
  
  inline def apply(intent: CodeableConcept, subject: Reference): DeviceRequest = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceRequest]
  }
  
  extension [Self <: DeviceRequest](x: Self) {
    
    inline def setAuthoredOn(value: dateTime): Self = StObject.set(x, "authoredOn", value.asInstanceOf[js.Any])
    
    inline def setAuthoredOnUndefined: Self = StObject.set(x, "authoredOn", js.undefined)
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value :_*))
    
    inline def setCodeCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "codeCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setCodeCodeableConceptUndefined: Self = StObject.set(x, "codeCodeableConcept", js.undefined)
    
    inline def setCodeReference(value: Reference): Self = StObject.set(x, "codeReference", value.asInstanceOf[js.Any])
    
    inline def setCodeReferenceUndefined: Self = StObject.set(x, "codeReference", js.undefined)
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDefinition(value: js.Array[Reference]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDefinitionVarargs(value: Reference*): Self = StObject.set(x, "definition", js.Array(value :_*))
    
    inline def setGroupIdentifier(value: Identifier): Self = StObject.set(x, "groupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setGroupIdentifierUndefined: Self = StObject.set(x, "groupIdentifier", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setIntent(value: CodeableConcept): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    inline def setOccurrenceDateTime(value: dateTime): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    inline def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    inline def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    inline def setOccurrenceTiming(value: Timing): Self = StObject.set(x, "occurrenceTiming", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceTimingUndefined: Self = StObject.set(x, "occurrenceTiming", js.undefined)
    
    inline def setPerformer(value: Reference): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerType(value: CodeableConcept): Self = StObject.set(x, "performerType", value.asInstanceOf[js.Any])
    
    inline def setPerformerTypeUndefined: Self = StObject.set(x, "performerType", js.undefined)
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPriorRequest(value: js.Array[Reference]): Self = StObject.set(x, "priorRequest", value.asInstanceOf[js.Any])
    
    inline def setPriorRequestUndefined: Self = StObject.set(x, "priorRequest", js.undefined)
    
    inline def setPriorRequestVarargs(value: Reference*): Self = StObject.set(x, "priorRequest", js.Array(value :_*))
    
    inline def setPriority(value: code): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value :_*))
    
    inline def setReasonReference(value: js.Array[Reference]): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setReasonReferenceVarargs(value: Reference*): Self = StObject.set(x, "reasonReference", js.Array(value :_*))
    
    inline def setRelevantHistory(value: js.Array[Reference]): Self = StObject.set(x, "relevantHistory", value.asInstanceOf[js.Any])
    
    inline def setRelevantHistoryUndefined: Self = StObject.set(x, "relevantHistory", js.undefined)
    
    inline def setRelevantHistoryVarargs(value: Reference*): Self = StObject.set(x, "relevantHistory", js.Array(value :_*))
    
    inline def setRequester(value: DeviceRequestRequester): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSupportingInfo(value: js.Array[Reference]): Self = StObject.set(x, "supportingInfo", value.asInstanceOf[js.Any])
    
    inline def setSupportingInfoUndefined: Self = StObject.set(x, "supportingInfo", js.undefined)
    
    inline def setSupportingInfoVarargs(value: Reference*): Self = StObject.set(x, "supportingInfo", js.Array(value :_*))
    
    inline def set_authoredOn(value: Element): Self = StObject.set(x, "_authoredOn", value.asInstanceOf[js.Any])
    
    inline def set_authoredOnUndefined: Self = StObject.set(x, "_authoredOn", js.undefined)
    
    inline def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    inline def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    inline def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
