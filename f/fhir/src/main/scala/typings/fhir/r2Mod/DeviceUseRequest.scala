package typings.fhir.r2Mod

import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.aborted
import typings.fhir.fhirStrings.accepted
import typings.fhir.fhirStrings.asap
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.planned
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

trait DeviceUseRequest
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _notes: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _orderedOn: js.UndefOr[Element] = js.undefined
  
  var _priority: js.UndefOr[Element] = js.undefined
  
  var _recordedOn: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _timingDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Knowing where the device is targeted is important for tracking if multiple sites are possible.
    */
  var bodySiteCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Knowing where the device is targeted is important for tracking if multiple sites are possible.
    */
  var bodySiteReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The details of the device  to be used.
    */
  var device: Reference
  
  /**
    * An encounter that provides additional context in which this request is made.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifiers assigned to this order by the orderer or by the receiver.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Reason or justification for the use of this device.
    */
  var indication: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Details about this request that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.
    */
  var notes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The time when the request was made.
    */
  var orderedOn: js.UndefOr[String] = js.undefined
  
  /**
    * Characterizes how quickly the  use of device must be initiated. Includes concepts such as stat, urgent, routine.
    */
  var priority: js.UndefOr[routine | urgent | stat | asap] = js.undefined
  
  /**
    * The proposed act must be performed if the indicated conditions occur, e.g.., shortness of breath, SpO2 less than x%.
    */
  var prnReason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The time at which the request was made/recorded.
    */
  var recordedOn: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_DeviceUseRequest: typings.fhir.fhirStrings.DeviceUseRequest
  
  /**
    * The status of the request.
    */
  var status: js.UndefOr[
    proposed | planned | requested | received | accepted | `in-progress` | completed | suspended | rejected | aborted
  ] = js.undefined
  
  /**
    * The patient who will use the device.
    */
  var subject: Reference
  
  /**
    * The timing schedule for the use of the device The Schedule data type allows many different expressions, for example. "Every 8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:"; "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".
    */
  var timingDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The timing schedule for the use of the device The Schedule data type allows many different expressions, for example. "Every 8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:"; "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".
    */
  var timingPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The timing schedule for the use of the device The Schedule data type allows many different expressions, for example. "Every 8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:"; "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".
    */
  var timingTiming: js.UndefOr[Timing] = js.undefined
}
object DeviceUseRequest {
  
  inline def apply(device: Reference, subject: Reference): DeviceUseRequest = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], resourceType = "DeviceUseRequest", subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceUseRequest]
  }
  
  extension [Self <: DeviceUseRequest](x: Self) {
    
    inline def setBodySiteCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "bodySiteCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setBodySiteCodeableConceptUndefined: Self = StObject.set(x, "bodySiteCodeableConcept", js.undefined)
    
    inline def setBodySiteReference(value: Reference): Self = StObject.set(x, "bodySiteReference", value.asInstanceOf[js.Any])
    
    inline def setBodySiteReferenceUndefined: Self = StObject.set(x, "bodySiteReference", js.undefined)
    
    inline def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIndication(value: js.Array[CodeableConcept]): Self = StObject.set(x, "indication", value.asInstanceOf[js.Any])
    
    inline def setIndicationUndefined: Self = StObject.set(x, "indication", js.undefined)
    
    inline def setIndicationVarargs(value: CodeableConcept*): Self = StObject.set(x, "indication", js.Array(value*))
    
    inline def setNotes(value: js.Array[String]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNotesVarargs(value: String*): Self = StObject.set(x, "notes", js.Array(value*))
    
    inline def setOrderedOn(value: String): Self = StObject.set(x, "orderedOn", value.asInstanceOf[js.Any])
    
    inline def setOrderedOnUndefined: Self = StObject.set(x, "orderedOn", js.undefined)
    
    inline def setPriority(value: routine | urgent | stat | asap): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setPrnReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "prnReason", value.asInstanceOf[js.Any])
    
    inline def setPrnReasonUndefined: Self = StObject.set(x, "prnReason", js.undefined)
    
    inline def setPrnReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "prnReason", js.Array(value*))
    
    inline def setRecordedOn(value: String): Self = StObject.set(x, "recordedOn", value.asInstanceOf[js.Any])
    
    inline def setRecordedOnUndefined: Self = StObject.set(x, "recordedOn", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.DeviceUseRequest): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(
      value: proposed | planned | requested | received | accepted | `in-progress` | completed | suspended | rejected | aborted
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTimingDateTime(value: String): Self = StObject.set(x, "timingDateTime", value.asInstanceOf[js.Any])
    
    inline def setTimingDateTimeUndefined: Self = StObject.set(x, "timingDateTime", js.undefined)
    
    inline def setTimingPeriod(value: Period): Self = StObject.set(x, "timingPeriod", value.asInstanceOf[js.Any])
    
    inline def setTimingPeriodUndefined: Self = StObject.set(x, "timingPeriod", js.undefined)
    
    inline def setTimingTiming(value: Timing): Self = StObject.set(x, "timingTiming", value.asInstanceOf[js.Any])
    
    inline def setTimingTimingUndefined: Self = StObject.set(x, "timingTiming", js.undefined)
    
    inline def set_notes(value: js.Array[Element]): Self = StObject.set(x, "_notes", value.asInstanceOf[js.Any])
    
    inline def set_notesUndefined: Self = StObject.set(x, "_notes", js.undefined)
    
    inline def set_notesVarargs(value: Element*): Self = StObject.set(x, "_notes", js.Array(value*))
    
    inline def set_orderedOn(value: Element): Self = StObject.set(x, "_orderedOn", value.asInstanceOf[js.Any])
    
    inline def set_orderedOnUndefined: Self = StObject.set(x, "_orderedOn", js.undefined)
    
    inline def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    inline def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
    
    inline def set_recordedOn(value: Element): Self = StObject.set(x, "_recordedOn", value.asInstanceOf[js.Any])
    
    inline def set_recordedOnUndefined: Self = StObject.set(x, "_recordedOn", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_timingDateTime(value: Element): Self = StObject.set(x, "_timingDateTime", value.asInstanceOf[js.Any])
    
    inline def set_timingDateTimeUndefined: Self = StObject.set(x, "_timingDateTime", js.undefined)
  }
}
