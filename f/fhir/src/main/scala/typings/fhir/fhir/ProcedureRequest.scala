package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request for a procedure or diagnostic to be performed
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait ProcedureRequest
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'asNeededBoolean'.
    */
  var _asNeededBoolean: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'authoredOn'.
    */
  var _authoredOn: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'doNotPerform'.
    */
  var _doNotPerform: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'intent'.
    */
  var _intent: js.UndefOr[Element] = js.undefined
  
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
    * Preconditions for procedure or diagnostic
    */
  var asNeededBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Preconditions for procedure or diagnostic
    */
  var asNeededCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Date request signed
    */
  var authoredOn: js.UndefOr[dateTime] = js.undefined
  
  /**
    * What request fulfills
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Location on Body
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Classification of procedure
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * What is being requested/ordered
    */
  var code: CodeableConcept
  
  /**
    * Encounter or Episode during which request was created
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * True if procedure should not be performed
    */
  var doNotPerform: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifiers assigned to this order
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * proposal | plan | order +
    */
  var intent: code
  
  /**
    * Comments
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * When procedure should occur
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * When procedure should occur
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * When procedure should occur
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * Requested perfomer
    */
  var performer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Performer role
    */
  var performerType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * routine | urgent | asap | stat
    */
  var priority: js.UndefOr[code] = js.undefined
  
  /**
    * Explanation/Justification for test
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Explanation/Justification for test
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Request provenance
    */
  var relevantHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * What request replaces
    */
  var replaces: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Who/what is requesting procedure or diagnostic
    */
  var requester: js.UndefOr[ProcedureRequestRequester] = js.undefined
  
  /**
    * Composite Request ID
    */
  var requisition: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Procedure Samples
    */
  var specimen: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * draft | active | suspended | completed | entered-in-error | cancelled
    */
  var status: code
  
  /**
    * Individual the service is ordered for
    */
  var subject: Reference
  
  /**
    * Additional clinical information
    */
  var supportingInfo: js.UndefOr[js.Array[Reference]] = js.undefined
}
object ProcedureRequest {
  
  inline def apply(code: CodeableConcept, intent: code, status: code, subject: Reference): ProcedureRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedureRequest]
  }
  
  extension [Self <: ProcedureRequest](x: Self) {
    
    inline def setAsNeededBoolean(value: Boolean): Self = StObject.set(x, "asNeededBoolean", value.asInstanceOf[js.Any])
    
    inline def setAsNeededBooleanUndefined: Self = StObject.set(x, "asNeededBoolean", js.undefined)
    
    inline def setAsNeededCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "asNeededCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setAsNeededCodeableConceptUndefined: Self = StObject.set(x, "asNeededCodeableConcept", js.undefined)
    
    inline def setAuthoredOn(value: dateTime): Self = StObject.set(x, "authoredOn", value.asInstanceOf[js.Any])
    
    inline def setAuthoredOnUndefined: Self = StObject.set(x, "authoredOn", js.undefined)
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value :_*))
    
    inline def setBodySite(value: js.Array[CodeableConcept]): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setBodySiteVarargs(value: CodeableConcept*): Self = StObject.set(x, "bodySite", js.Array(value :_*))
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value :_*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDefinition(value: js.Array[Reference]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDefinitionVarargs(value: Reference*): Self = StObject.set(x, "definition", js.Array(value :_*))
    
    inline def setDoNotPerform(value: Boolean): Self = StObject.set(x, "doNotPerform", value.asInstanceOf[js.Any])
    
    inline def setDoNotPerformUndefined: Self = StObject.set(x, "doNotPerform", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setIntent(value: code): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
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
    
    inline def setReplaces(value: js.Array[Reference]): Self = StObject.set(x, "replaces", value.asInstanceOf[js.Any])
    
    inline def setReplacesUndefined: Self = StObject.set(x, "replaces", js.undefined)
    
    inline def setReplacesVarargs(value: Reference*): Self = StObject.set(x, "replaces", js.Array(value :_*))
    
    inline def setRequester(value: ProcedureRequestRequester): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    inline def setRequisition(value: Identifier): Self = StObject.set(x, "requisition", value.asInstanceOf[js.Any])
    
    inline def setRequisitionUndefined: Self = StObject.set(x, "requisition", js.undefined)
    
    inline def setSpecimen(value: js.Array[Reference]): Self = StObject.set(x, "specimen", value.asInstanceOf[js.Any])
    
    inline def setSpecimenUndefined: Self = StObject.set(x, "specimen", js.undefined)
    
    inline def setSpecimenVarargs(value: Reference*): Self = StObject.set(x, "specimen", js.Array(value :_*))
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSupportingInfo(value: js.Array[Reference]): Self = StObject.set(x, "supportingInfo", value.asInstanceOf[js.Any])
    
    inline def setSupportingInfoUndefined: Self = StObject.set(x, "supportingInfo", js.undefined)
    
    inline def setSupportingInfoVarargs(value: Reference*): Self = StObject.set(x, "supportingInfo", js.Array(value :_*))
    
    inline def set_asNeededBoolean(value: Element): Self = StObject.set(x, "_asNeededBoolean", value.asInstanceOf[js.Any])
    
    inline def set_asNeededBooleanUndefined: Self = StObject.set(x, "_asNeededBoolean", js.undefined)
    
    inline def set_authoredOn(value: Element): Self = StObject.set(x, "_authoredOn", value.asInstanceOf[js.Any])
    
    inline def set_authoredOnUndefined: Self = StObject.set(x, "_authoredOn", js.undefined)
    
    inline def set_doNotPerform(value: Element): Self = StObject.set(x, "_doNotPerform", value.asInstanceOf[js.Any])
    
    inline def set_doNotPerformUndefined: Self = StObject.set(x, "_doNotPerform", js.undefined)
    
    inline def set_intent(value: Element): Self = StObject.set(x, "_intent", value.asInstanceOf[js.Any])
    
    inline def set_intentUndefined: Self = StObject.set(x, "_intent", js.undefined)
    
    inline def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    inline def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    inline def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
