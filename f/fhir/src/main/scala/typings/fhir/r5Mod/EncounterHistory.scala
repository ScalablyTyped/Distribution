package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.discharged
import typings.fhir.fhirStrings.discontinued
import typings.fhir.fhirStrings.planned
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncounterHistory
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _plannedEndDate: js.UndefOr[Element] = js.undefined
  
  var _plannedStartDate: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The start and end time associated with this set of values associated with the encounter, may be different to the planned times for various reasons.
    */
  var actualPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Concepts representing classification of patient encounter such as ambulatory (outpatient), inpatient, emergency, home health or others due to local variations.
    */
  var `class`: CodeableConcept
  
  /**
    * This is also used for associating a child's encounter back to the mother's encounter.
    * Refer to the Notes section in the Patient resource for further details.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifier(s) by which this encounter is known.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * If the precision on these values is low (e.g. to the day only) then this may be considered was an all day (or multi-day) encounter, unless the duration is included, where that amount of time occurred sometime during the interval.
    * May differ from the time in `Encounter.period` due to leave of absence(s).
    */
  var length: js.UndefOr[Duration] = js.undefined
  
  /**
    * Virtual encounters can be recorded in the Encounter by specifying a location reference to a location of type "kind" such as "client's home" and an encounter.class = "virtual".
    */
  var location: js.UndefOr[js.Array[EncounterHistoryLocation]] = js.undefined
  
  /**
    * The planned end date/time (or discharge date) of the encounter.
    */
  var plannedEndDate: js.UndefOr[String] = js.undefined
  
  /**
    * The planned start date/time (or admission date) of the encounter.
    */
  var plannedStartDate: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_EncounterHistory: typings.fhir.fhirStrings.EncounterHistory
  
  /**
    * Broad categorization of the service that is to be provided (e.g. cardiology).
    */
  var serviceType: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * Note that internal business rules will determine the appropriate transitions that may occur between statuses (and also classes).
    */
  var status: planned | `in-progress` | `on-hold` | discharged | completed | cancelled | discontinued | `entered-in-error` | unknown
  
  /**
    * While the encounter is always about the patient, the patient might not actually be known in all contexts of use, and there may be a group of patients that could be anonymous (such as in a group therapy for Alcoholics Anonymous - where the recording of the encounter could be used for billing on the number of people/staff and not important to the context of the specific patients) or alternately in veterinary care a herd of sheep receiving treatment (where the animals are not individually tracked).
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * The subjectStatus value can be used to track the patient's status within the encounter. It details whether the patient has arrived or departed, has been triaged or is currently in a waiting status.
    */
  var subjectStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Since there are many ways to further classify encounters, this element is 0..*.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object EncounterHistory {
  
  inline def apply(
    `class`: CodeableConcept,
    status: planned | `in-progress` | `on-hold` | discharged | completed | cancelled | discontinued | `entered-in-error` | unknown
  ): EncounterHistory = {
    val __obj = js.Dynamic.literal(resourceType = "EncounterHistory", status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncounterHistory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncounterHistory] (val x: Self) extends AnyVal {
    
    inline def setActualPeriod(value: Period): Self = StObject.set(x, "actualPeriod", value.asInstanceOf[js.Any])
    
    inline def setActualPeriodUndefined: Self = StObject.set(x, "actualPeriod", js.undefined)
    
    inline def setClass(value: CodeableConcept): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLength(value: Duration): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setLocation(value: js.Array[EncounterHistoryLocation]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: EncounterHistoryLocation*): Self = StObject.set(x, "location", js.Array(value*))
    
    inline def setPlannedEndDate(value: String): Self = StObject.set(x, "plannedEndDate", value.asInstanceOf[js.Any])
    
    inline def setPlannedEndDateUndefined: Self = StObject.set(x, "plannedEndDate", js.undefined)
    
    inline def setPlannedStartDate(value: String): Self = StObject.set(x, "plannedStartDate", value.asInstanceOf[js.Any])
    
    inline def setPlannedStartDateUndefined: Self = StObject.set(x, "plannedStartDate", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.EncounterHistory): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setServiceType(value: js.Array[CodeableReference]): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
    
    inline def setServiceTypeUndefined: Self = StObject.set(x, "serviceType", js.undefined)
    
    inline def setServiceTypeVarargs(value: CodeableReference*): Self = StObject.set(x, "serviceType", js.Array(value*))
    
    inline def setStatus(
      value: planned | `in-progress` | `on-hold` | discharged | completed | cancelled | discontinued | `entered-in-error` | unknown
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectStatus(value: CodeableConcept): Self = StObject.set(x, "subjectStatus", value.asInstanceOf[js.Any])
    
    inline def setSubjectStatusUndefined: Self = StObject.set(x, "subjectStatus", js.undefined)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def set_plannedEndDate(value: Element): Self = StObject.set(x, "_plannedEndDate", value.asInstanceOf[js.Any])
    
    inline def set_plannedEndDateUndefined: Self = StObject.set(x, "_plannedEndDate", js.undefined)
    
    inline def set_plannedStartDate(value: Element): Self = StObject.set(x, "_plannedStartDate", value.asInstanceOf[js.Any])
    
    inline def set_plannedStartDateUndefined: Self = StObject.set(x, "_plannedStartDate", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
