package typings.fhir.r3Mod

import typings.fhir.fhirStrings.audio
import typings.fhir.fhirStrings.photo
import typings.fhir.fhirStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Media
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * A procedure that is fulfilled in whole or in part by the creation of this media.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * If the use case requires BodySite to be handled as a separate resource (e.g. to identify and track separately) then use The standard extension[ body-site-instance](extension-body-site-instance.html).
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Recommended content types: image/jpeg, image/png, image/tiff, video/mpeg, audio/mp4, application/dicom. Application/dicom can contain the transfer syntax as a parameter.  For an media that covers a period of time (video/sound), the content.creationTime is the end time. Creation time is used for tracking, organizing versions and searching.
    */
  var content: Attachment
  
  /**
    * This will typically be the encounter the media occurred within.
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * An extension should be used if further typing of the device is needed.  Scondary devices used to support collecting a media can be represented using either extension or through the Observation.related element.
    */
  var device: js.UndefOr[Reference] = js.undefined
  
  /**
    * The duration might differ from occurrencePeriod if recording was paused.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes multiple slices in a single image, or an animated gif. If there is more than one frame, this SHALL have a value in order to alert interface software that a multi-frame capable rendering widget is required.
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
    * Comments made about the media by the performer, subject or other participants.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * The date and time(s) at which the media was collected.
    */
  var occurrenceDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time(s) at which the media was collected.
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The person who administered the collection of the image.
    */
  var operator: js.UndefOr[Reference] = js.undefined
  
  /**
    * Textual reasons can be caprued using reasonCode.text.
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Media: typings.fhir.fhirStrings.Media
  
  /**
    * Who/What this Media is a record of.
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Details of the type of the media - usually, how it was acquired (what type of device). If images sourced from a DICOM system, are wrapped in a Media resource, then this is the modality.
    */
  var subtype: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Whether the media is a photo (still image), an audio recording, or a video recording.
    */
  var `type`: photo | video | audio
  
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
  
  inline def apply(content: Attachment, `type`: photo | video | audio): Media = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], resourceType = "Media")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFrames(value: Double): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOccurrenceDateTime(value: String): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    inline def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    inline def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    inline def setOperator(value: Reference): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Media): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubtype(value: CodeableConcept): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    inline def setType(value: photo | video | audio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setView(value: CodeableConcept): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
