package typings.fhir.r4bMod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.`not-done`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.preparation
import typings.fhir.fhirStrings.stopped
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Media
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _createdDateTime: js.UndefOr[Element] = js.undefined
  
  var _deviceName: js.UndefOr[Element] = js.undefined
  
  var _issued: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * A procedure that is fulfilled in whole or in part by the creation of this media.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Only used if not implicit in code found in Observation.code.  In many systems, this may be represented as a related observation instead of an inline component.
    * If the use case requires BodySite to be handled as a separate resource (e.g. to identify and track separately) then use the standard extension[ bodySite](extension-bodysite.html).
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Recommended content types: image/jpeg, image/png, image/tiff, video/mpeg, audio/mp4, application/dicom. Application/dicom can contain the transfer syntax as a parameter.  For media that covers a period of time (video/sound), the content.creationTime is the end time. Creation time is used for tracking, organizing versions and searching.
    */
  var content: Attachment
  
  /**
    * The date and time(s) at which the media was collected.
    */
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time(s) at which the media was collected.
    */
  var createdPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * An extension should be used if further typing of the device is needed.  Secondary devices used to support collecting a media can be represented using either extension or through the Observation.related element.
    */
  var device: js.UndefOr[Reference] = js.undefined
  
  /**
    * The name of the device / manufacturer of the device  that was used to make the recording.
    */
  var deviceName: js.UndefOr[String] = js.undefined
  
  /**
    * The duration might differ from occurrencePeriod if recording was paused.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * This will typically be the encounter the media occurred within.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * if the number of frames is not supplied, the value may be unknown. Applications should not assume that there is only one frame unless it is explicitly stated.
    */
  var frames: js.UndefOr[Double] = js.undefined
  
  /**
    * Height of the image in pixels (photo/video).
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The identifier label and use can be used to determine what kind of identifier it is.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * It may be the same as the [`lastUpdated` ](resource-definitions.html#Meta.lastUpdated) time of the resource itself.  For Observations that do require review and verification for certain updates, it might not be the same as the `lastUpdated` time of the resource itself due to a non-clinically significant update that does not require the new version to be reviewed and verified again.
    */
  var issued: js.UndefOr[String] = js.undefined
  
  /**
    * Details of the type of the media - usually, how it was acquired (what type of device). If images sourced from a DICOM system, are wrapped in a Media resource, then this is the modality.
    */
  var modality: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Not to be used for observations, conclusions, etc. Instead use an [Observation](observation.html) based on the Media/ImagingStudy resource.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * The person who administered the collection of the image.
    */
  var operator: js.UndefOr[Reference] = js.undefined
  
  /**
    * Not to be used to link an event to an Encounter - use Media.encounter for that.
    * [The allowed reference resources may be adjusted as appropriate for the event resource].
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Textual reasons can be captured using reasonCode.text.
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Media: typings.fhir.fhirStrings.Media
  
  /**
    * A nominal state-transition diagram can be found in the [[event.html#statemachine | Event pattern]] documentation
    * Unknown does not represent "other" - one of the defined statuses must apply.  Unknown is used when the authoring system is not sure what the current status is.
    */
  var status: preparation | `in-progress` | `not-done` | `on-hold` | stopped | completed | `entered-in-error` | unknown
  
  /**
    * Who/What this Media is a record of.
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * A code that classifies whether the media is an image, video or audio recording or some other media category.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The name of the imaging view e.g. Lateral or Antero-posterior (AP).
    */
  var view: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Width of the image in pixels (photo/video).
    */
  var width: js.UndefOr[Double] = js.undefined
}
object Media {
  
  inline def apply(
    content: Attachment,
    status: preparation | `in-progress` | `not-done` | `on-hold` | stopped | completed | `entered-in-error` | unknown
  ): Media = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], resourceType = "Media", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Media]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Media] (val x: Self) extends AnyVal {
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setBodySite(value: CodeableConcept): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setContent(value: Attachment): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setCreatedPeriod(value: Period): Self = StObject.set(x, "createdPeriod", value.asInstanceOf[js.Any])
    
    inline def setCreatedPeriodUndefined: Self = StObject.set(x, "createdPeriod", js.undefined)
    
    inline def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setFrames(value: Double): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIssued(value: String): Self = StObject.set(x, "issued", value.asInstanceOf[js.Any])
    
    inline def setIssuedUndefined: Self = StObject.set(x, "issued", js.undefined)
    
    inline def setModality(value: CodeableConcept): Self = StObject.set(x, "modality", value.asInstanceOf[js.Any])
    
    inline def setModalityUndefined: Self = StObject.set(x, "modality", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOperator(value: Reference): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value*))
    
    inline def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Media): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(
      value: preparation | `in-progress` | `not-done` | `on-hold` | stopped | completed | `entered-in-error` | unknown
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setView(value: CodeableConcept): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def set_createdDateTime(value: Element): Self = StObject.set(x, "_createdDateTime", value.asInstanceOf[js.Any])
    
    inline def set_createdDateTimeUndefined: Self = StObject.set(x, "_createdDateTime", js.undefined)
    
    inline def set_deviceName(value: Element): Self = StObject.set(x, "_deviceName", value.asInstanceOf[js.Any])
    
    inline def set_deviceNameUndefined: Self = StObject.set(x, "_deviceName", js.undefined)
    
    inline def set_issued(value: Element): Self = StObject.set(x, "_issued", value.asInstanceOf[js.Any])
    
    inline def set_issuedUndefined: Self = StObject.set(x, "_issued", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
