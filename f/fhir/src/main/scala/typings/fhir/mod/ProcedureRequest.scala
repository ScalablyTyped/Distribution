package typings.fhir.mod

import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.aborted
import typings.fhir.fhirStrings.accepted
import typings.fhir.fhirStrings.asap
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.proposed
import typings.fhir.fhirStrings.received
import typings.fhir.fhirStrings.rejected
import typings.fhir.fhirStrings.requested
import typings.fhir.fhirStrings.routine
import typings.fhir.fhirStrings.stat
import typings.fhir.fhirStrings.suspended
import typings.fhir.fhirStrings.urgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcedureRequest
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _asNeededBoolean: js.UndefOr[Element] = js.undefined
  
  var _orderedOn: js.UndefOr[Element] = js.undefined
  
  var _priority: js.UndefOr[Element] = js.undefined
  
  var _scheduledDateTime: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * If a CodeableConcept is present, it indicates the pre-condition for performing the procedure.
    */
  var asNeededBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If a CodeableConcept is present, it indicates the pre-condition for performing the procedure.
    */
  var asNeededCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Knowing where the procedure is made is important for tracking if multiple sites are possible.
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The specific procedure that is ordered. Use text if the exact nature of the procedure cannot be coded.
    */
  var code: CodeableConcept
  
  /**
    * The encounter within which the procedure proposal or request was created.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifiers assigned to this order by the order or by the receiver.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Any other notes associated with this proposal or order - e.g. provider instructions.
    */
  var notes: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * The time when the request was made.
    */
  var orderedOn: js.UndefOr[String] = js.undefined
  
  /**
    * The healthcare professional responsible for proposing or ordering the procedure.
    */
  var orderer: js.UndefOr[Reference] = js.undefined
  
  /**
    * For example, the surgeon, anaethetist, endoscopist, etc.
    */
  var performer: js.UndefOr[Reference] = js.undefined
  
  /**
    * The clinical priority associated with this order.
    */
  var priority: js.UndefOr[routine | urgent | stat | asap] = js.undefined
  
  /**
    * The reason why the procedure is being proposed or ordered. This procedure request may be motivated by a Condition for instance.
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The reason why the procedure is being proposed or ordered. This procedure request may be motivated by a Condition for instance.
    */
  var reasonReference: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ProcedureRequest: typings.fhir.fhirStrings.ProcedureRequest
  
  /**
    * The timing schedule for the proposed or ordered procedure. The Schedule data type allows many different expressions.  E.g. "Every 8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:"; "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".
    */
  var scheduledDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The timing schedule for the proposed or ordered procedure. The Schedule data type allows many different expressions.  E.g. "Every 8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:"; "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".
    */
  var scheduledPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The timing schedule for the proposed or ordered procedure. The Schedule data type allows many different expressions.  E.g. "Every 8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:"; "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".
    */
  var scheduledTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * The status of the order.
    */
  var status: js.UndefOr[
    proposed | draft | requested | received | accepted | `in-progress` | completed | suspended | rejected | aborted
  ] = js.undefined
  
  /**
    * The person, animal or group that should receive the procedure.
    */
  var subject: Reference
}
object ProcedureRequest {
  
  inline def apply(code: CodeableConcept, subject: Reference): ProcedureRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "ProcedureRequest", subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedureRequest]
  }
  
  extension [Self <: ProcedureRequest](x: Self) {
    
    inline def setAsNeededBoolean(value: Boolean): Self = StObject.set(x, "asNeededBoolean", value.asInstanceOf[js.Any])
    
    inline def setAsNeededBooleanUndefined: Self = StObject.set(x, "asNeededBoolean", js.undefined)
    
    inline def setAsNeededCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "asNeededCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setAsNeededCodeableConceptUndefined: Self = StObject.set(x, "asNeededCodeableConcept", js.undefined)
    
    inline def setBodySite(value: js.Array[CodeableConcept]): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setBodySiteVarargs(value: CodeableConcept*): Self = StObject.set(x, "bodySite", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setNotes(value: js.Array[Annotation]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNotesVarargs(value: Annotation*): Self = StObject.set(x, "notes", js.Array(value*))
    
    inline def setOrderedOn(value: String): Self = StObject.set(x, "orderedOn", value.asInstanceOf[js.Any])
    
    inline def setOrderedOnUndefined: Self = StObject.set(x, "orderedOn", js.undefined)
    
    inline def setOrderer(value: Reference): Self = StObject.set(x, "orderer", value.asInstanceOf[js.Any])
    
    inline def setOrdererUndefined: Self = StObject.set(x, "orderer", js.undefined)
    
    inline def setPerformer(value: Reference): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPriority(value: routine | urgent | stat | asap): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReasonCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "reasonCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeableConceptUndefined: Self = StObject.set(x, "reasonCodeableConcept", js.undefined)
    
    inline def setReasonReference(value: Reference): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ProcedureRequest): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setScheduledDateTime(value: String): Self = StObject.set(x, "scheduledDateTime", value.asInstanceOf[js.Any])
    
    inline def setScheduledDateTimeUndefined: Self = StObject.set(x, "scheduledDateTime", js.undefined)
    
    inline def setScheduledPeriod(value: Period): Self = StObject.set(x, "scheduledPeriod", value.asInstanceOf[js.Any])
    
    inline def setScheduledPeriodUndefined: Self = StObject.set(x, "scheduledPeriod", js.undefined)
    
    inline def setScheduledTiming(value: Timing): Self = StObject.set(x, "scheduledTiming", value.asInstanceOf[js.Any])
    
    inline def setScheduledTimingUndefined: Self = StObject.set(x, "scheduledTiming", js.undefined)
    
    inline def setStatus(
      value: proposed | draft | requested | received | accepted | `in-progress` | completed | suspended | rejected | aborted
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def set_asNeededBoolean(value: Element): Self = StObject.set(x, "_asNeededBoolean", value.asInstanceOf[js.Any])
    
    inline def set_asNeededBooleanUndefined: Self = StObject.set(x, "_asNeededBoolean", js.undefined)
    
    inline def set_orderedOn(value: Element): Self = StObject.set(x, "_orderedOn", value.asInstanceOf[js.Any])
    
    inline def set_orderedOnUndefined: Self = StObject.set(x, "_orderedOn", js.undefined)
    
    inline def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    inline def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
    
    inline def set_scheduledDateTime(value: Element): Self = StObject.set(x, "_scheduledDateTime", value.asInstanceOf[js.Any])
    
    inline def set_scheduledDateTimeUndefined: Self = StObject.set(x, "_scheduledDateTime", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
