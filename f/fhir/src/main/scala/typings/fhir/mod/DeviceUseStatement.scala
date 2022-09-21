package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceUseStatement
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _notes: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _recordedOn: js.UndefOr[Element] = js.undefined
  
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
    * The details of the device used.
    */
  var device: Reference
  
  /**
    * An external identifier for this statement such as an IRI.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Reason or justification for the use of the device.
    */
  var indication: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Details about the device statement that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.
    */
  var notes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The time at which the statement was made/recorded.
    */
  var recordedOn: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_DeviceUseStatement: typings.fhir.fhirStrings.DeviceUseStatement
  
  /**
    * The patient who used the device.
    */
  var subject: Reference
  
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
    * The time period over which the device was used.
    */
  var whenUsed: js.UndefOr[Period] = js.undefined
}
object DeviceUseStatement {
  
  inline def apply(device: Reference, subject: Reference): DeviceUseStatement = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], resourceType = "DeviceUseStatement", subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceUseStatement]
  }
  
  extension [Self <: DeviceUseStatement](x: Self) {
    
    inline def setBodySiteCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "bodySiteCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setBodySiteCodeableConceptUndefined: Self = StObject.set(x, "bodySiteCodeableConcept", js.undefined)
    
    inline def setBodySiteReference(value: Reference): Self = StObject.set(x, "bodySiteReference", value.asInstanceOf[js.Any])
    
    inline def setBodySiteReferenceUndefined: Self = StObject.set(x, "bodySiteReference", js.undefined)
    
    inline def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIndication(value: js.Array[CodeableConcept]): Self = StObject.set(x, "indication", value.asInstanceOf[js.Any])
    
    inline def setIndicationUndefined: Self = StObject.set(x, "indication", js.undefined)
    
    inline def setIndicationVarargs(value: CodeableConcept*): Self = StObject.set(x, "indication", js.Array(value*))
    
    inline def setNotes(value: js.Array[String]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNotesVarargs(value: String*): Self = StObject.set(x, "notes", js.Array(value*))
    
    inline def setRecordedOn(value: String): Self = StObject.set(x, "recordedOn", value.asInstanceOf[js.Any])
    
    inline def setRecordedOnUndefined: Self = StObject.set(x, "recordedOn", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.DeviceUseStatement): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTimingDateTime(value: String): Self = StObject.set(x, "timingDateTime", value.asInstanceOf[js.Any])
    
    inline def setTimingDateTimeUndefined: Self = StObject.set(x, "timingDateTime", js.undefined)
    
    inline def setTimingPeriod(value: Period): Self = StObject.set(x, "timingPeriod", value.asInstanceOf[js.Any])
    
    inline def setTimingPeriodUndefined: Self = StObject.set(x, "timingPeriod", js.undefined)
    
    inline def setTimingTiming(value: Timing): Self = StObject.set(x, "timingTiming", value.asInstanceOf[js.Any])
    
    inline def setTimingTimingUndefined: Self = StObject.set(x, "timingTiming", js.undefined)
    
    inline def setWhenUsed(value: Period): Self = StObject.set(x, "whenUsed", value.asInstanceOf[js.Any])
    
    inline def setWhenUsedUndefined: Self = StObject.set(x, "whenUsed", js.undefined)
    
    inline def set_notes(value: js.Array[Element]): Self = StObject.set(x, "_notes", value.asInstanceOf[js.Any])
    
    inline def set_notesUndefined: Self = StObject.set(x, "_notes", js.undefined)
    
    inline def set_notesVarargs(value: Element*): Self = StObject.set(x, "_notes", js.Array(value*))
    
    inline def set_recordedOn(value: Element): Self = StObject.set(x, "_recordedOn", value.asInstanceOf[js.Any])
    
    inline def set_recordedOnUndefined: Self = StObject.set(x, "_recordedOn", js.undefined)
    
    inline def set_timingDateTime(value: Element): Self = StObject.set(x, "_timingDateTime", value.asInstanceOf[js.Any])
    
    inline def set_timingDateTimeUndefined: Self = StObject.set(x, "_timingDateTime", js.undefined)
  }
}
