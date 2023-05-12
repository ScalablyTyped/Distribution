package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`not-done`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.intended
import typings.fhir.fhirStrings.stopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceUsage
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _dateAsserted: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _timingDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * This indicates how or if the device is being used.
    */
  var adherence: js.UndefOr[DeviceUsageAdherence] = js.undefined
  
  /**
    * A plan, proposal or order that is fulfilled in whole or in part by this DeviceUsage.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Indicates the anotomic location on the subject's body where the device was used ( i.e. the target).
    */
  var bodySite: js.UndefOr[CodeableReference] = js.undefined
  
  /**
    * This attribute indicates a category for the statement - The device statement may be made in an inpatient or outpatient settting (inpatient | outpatient | community | patientspecified).
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The encounter or episode of care that establishes the context for this device use statement.
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * The time at which the statement was recorded by informationSource.
    */
  var dateAsserted: js.UndefOr[String] = js.undefined
  
  /**
    * The most common use cases for deriving a DeviceUsage comes from creating it from a request or from an observation or a claim. it should be noted that the amount of information that is available varies from the type resource that you derive the DeviceUsage from.
    */
  var derivedFrom: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Code or Reference to device used.
    */
  var device: CodeableReference
  
  /**
    * An external identifier for this statement such as an IRI.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Who reported the device was being used by the patient.
    */
  var informationSource: js.UndefOr[Reference] = js.undefined
  
  /**
    * Details about the device statement that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * The patient who used the device.
    */
  var patient: Reference
  
  /**
    * When the status is not done, the reason code indicates why it was not done.
    */
  var reason: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_DeviceUsage: typings.fhir.fhirStrings.DeviceUsage
  
  /**
    * DeviceUseStatment is a statement at a point in time.  The status is only representative at the point when it was asserted.  The value set for contains codes that assert the status of the use  by the patient (for example, stopped or on hold) as well as codes that assert the status of the resource itself (for example, entered in error).
    * This element is labeled as a modifier because the status contains the codes that mark the statement as not currently valid.
    */
  var status: active | completed | `not-done` | `entered-in-error` | intended | stopped | `on-hold`
  
  /**
    * How often the device was used.
    */
  var timingDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * How often the device was used.
    */
  var timingPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * How often the device was used.
    */
  var timingTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * The reason for asserting the usage status - for example forgot, lost, stolen, broken.
    */
  var usageReason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The status of the device usage, for example always, sometimes, never. This is not the same as the status of the statement.
    */
  var usageStatus: js.UndefOr[CodeableConcept] = js.undefined
}
object DeviceUsage {
  
  inline def apply(
    device: CodeableReference,
    patient: Reference,
    status: active | completed | `not-done` | `entered-in-error` | intended | stopped | `on-hold`
  ): DeviceUsage = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], resourceType = "DeviceUsage", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceUsage] (val x: Self) extends AnyVal {
    
    inline def setAdherence(value: DeviceUsageAdherence): Self = StObject.set(x, "adherence", value.asInstanceOf[js.Any])
    
    inline def setAdherenceUndefined: Self = StObject.set(x, "adherence", js.undefined)
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setBodySite(value: CodeableReference): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDateAsserted(value: String): Self = StObject.set(x, "dateAsserted", value.asInstanceOf[js.Any])
    
    inline def setDateAssertedUndefined: Self = StObject.set(x, "dateAsserted", js.undefined)
    
    inline def setDerivedFrom(value: js.Array[Reference]): Self = StObject.set(x, "derivedFrom", value.asInstanceOf[js.Any])
    
    inline def setDerivedFromUndefined: Self = StObject.set(x, "derivedFrom", js.undefined)
    
    inline def setDerivedFromVarargs(value: Reference*): Self = StObject.set(x, "derivedFrom", js.Array(value*))
    
    inline def setDevice(value: CodeableReference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInformationSource(value: Reference): Self = StObject.set(x, "informationSource", value.asInstanceOf[js.Any])
    
    inline def setInformationSourceUndefined: Self = StObject.set(x, "informationSource", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setReason(value: js.Array[CodeableReference]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableReference*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.DeviceUsage): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | completed | `not-done` | `entered-in-error` | intended | stopped | `on-hold`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTimingDateTime(value: String): Self = StObject.set(x, "timingDateTime", value.asInstanceOf[js.Any])
    
    inline def setTimingDateTimeUndefined: Self = StObject.set(x, "timingDateTime", js.undefined)
    
    inline def setTimingPeriod(value: Period): Self = StObject.set(x, "timingPeriod", value.asInstanceOf[js.Any])
    
    inline def setTimingPeriodUndefined: Self = StObject.set(x, "timingPeriod", js.undefined)
    
    inline def setTimingTiming(value: Timing): Self = StObject.set(x, "timingTiming", value.asInstanceOf[js.Any])
    
    inline def setTimingTimingUndefined: Self = StObject.set(x, "timingTiming", js.undefined)
    
    inline def setUsageReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "usageReason", value.asInstanceOf[js.Any])
    
    inline def setUsageReasonUndefined: Self = StObject.set(x, "usageReason", js.undefined)
    
    inline def setUsageReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "usageReason", js.Array(value*))
    
    inline def setUsageStatus(value: CodeableConcept): Self = StObject.set(x, "usageStatus", value.asInstanceOf[js.Any])
    
    inline def setUsageStatusUndefined: Self = StObject.set(x, "usageStatus", js.undefined)
    
    inline def set_dateAsserted(value: Element): Self = StObject.set(x, "_dateAsserted", value.asInstanceOf[js.Any])
    
    inline def set_dateAssertedUndefined: Self = StObject.set(x, "_dateAsserted", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_timingDateTime(value: Element): Self = StObject.set(x, "_timingDateTime", value.asInstanceOf[js.Any])
    
    inline def set_timingDateTimeUndefined: Self = StObject.set(x, "_timingDateTime", js.undefined)
  }
}
