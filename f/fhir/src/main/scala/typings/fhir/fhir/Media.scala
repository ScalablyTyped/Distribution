package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Media extends DomainResource {
  
  /**
    * Contains extended information for property 'duration'.
    */
  var _duration: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'frames'.
    */
  var _frames: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'height'.
    */
  var _height: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'width'.
    */
  var _width: js.UndefOr[Element] = js.native
  
  /**
    * Procedure that caused this media to be created
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Body part in media
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Actual Media - reference or data
    */
  var content: Attachment = js.native
  
  /**
    * Encounter / Episode associated with media
    */
  var context: js.UndefOr[Reference] = js.native
  
  /**
    * Observing Device
    */
  var device: js.UndefOr[Reference] = js.native
  
  /**
    * Length in seconds (audio / video)
    */
  var duration: js.UndefOr[unsignedInt] = js.native
  
  /**
    * Number of frames if > 1 (photo)
    */
  var frames: js.UndefOr[positiveInt] = js.native
  
  /**
    * Height of the image in pixels (photo/video)
    */
  var height: js.UndefOr[positiveInt] = js.native
  
  /**
    * Identifier(s) for the image
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Comments made about the media
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * When Media was collected
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * When Media was collected
    */
  var occurrencePeriod: js.UndefOr[Period] = js.native
  
  /**
    * The person who generated the image
    */
  var operator: js.UndefOr[Reference] = js.native
  
  /**
    * Why was event performed?
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Who/What this Media is a record of
    */
  var subject: js.UndefOr[Reference] = js.native
  
  /**
    * The type of acquisition equipment/process
    */
  var subtype: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * photo | video | audio
    */
  var `type`: code = js.native
  
  /**
    * Imaging view, e.g. Lateral or Antero-posterior
    */
  var view: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Width of the image in pixels (photo/video)
    */
  var width: js.UndefOr[positiveInt] = js.native
}
object Media {
  
  @scala.inline
  def apply(content: Attachment, `type`: code): Media = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Media]
  }
  
  @scala.inline
  implicit class MediaMutableBuilder[Self <: Media] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    @scala.inline
    def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value :_*))
    
    @scala.inline
    def setBodySite(value: CodeableConcept): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    @scala.inline
    def setContent(value: Attachment): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setDuration(value: unsignedInt): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setFrames(value: positiveInt): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    @scala.inline
    def setHeight(value: positiveInt): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setOccurrenceDateTime(value: dateTime): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    @scala.inline
    def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    @scala.inline
    def setOperator(value: Reference): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    @scala.inline
    def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value :_*))
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setSubtype(value: CodeableConcept): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    @scala.inline
    def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: CodeableConcept): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setWidth(value: positiveInt): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def set_duration(value: Element): Self = StObject.set(x, "_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_durationUndefined: Self = StObject.set(x, "_duration", js.undefined)
    
    @scala.inline
    def set_frames(value: Element): Self = StObject.set(x, "_frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_framesUndefined: Self = StObject.set(x, "_frames", js.undefined)
    
    @scala.inline
    def set_height(value: Element): Self = StObject.set(x, "_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_heightUndefined: Self = StObject.set(x, "_height", js.undefined)
    
    @scala.inline
    def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    @scala.inline
    def set_width(value: Element): Self = StObject.set(x, "_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_widthUndefined: Self = StObject.set(x, "_width", js.undefined)
  }
}
