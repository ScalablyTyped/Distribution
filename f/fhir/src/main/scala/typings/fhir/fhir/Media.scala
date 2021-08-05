package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Media
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'duration'.
    */
  var _duration: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'frames'.
    */
  var _frames: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'height'.
    */
  var _height: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'width'.
    */
  var _width: js.UndefOr[Element] = js.undefined
  
  /**
    * Procedure that caused this media to be created
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Body part in media
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Actual Media - reference or data
    */
  var content: Attachment
  
  /**
    * Encounter / Episode associated with media
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Observing Device
    */
  var device: js.UndefOr[Reference] = js.undefined
  
  /**
    * Length in seconds (audio / video)
    */
  var duration: js.UndefOr[unsignedInt] = js.undefined
  
  /**
    * Number of frames if > 1 (photo)
    */
  var frames: js.UndefOr[positiveInt] = js.undefined
  
  /**
    * Height of the image in pixels (photo/video)
    */
  var height: js.UndefOr[positiveInt] = js.undefined
  
  /**
    * Identifier(s) for the image
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Comments made about the media
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * When Media was collected
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * When Media was collected
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The person who generated the image
    */
  var operator: js.UndefOr[Reference] = js.undefined
  
  /**
    * Why was event performed?
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Who/What this Media is a record of
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * The type of acquisition equipment/process
    */
  var subtype: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * photo | video | audio
    */
  var `type`: code
  
  /**
    * Imaging view, e.g. Lateral or Antero-posterior
    */
  var view: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Width of the image in pixels (photo/video)
    */
  var width: js.UndefOr[positiveInt] = js.undefined
}
object Media {
  
  inline def apply(content: Attachment, `type`: code): Media = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Media]
  }
  
  extension [Self <: Media](x: Self) {
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value :_*))
    
    inline def setBodySite(value: CodeableConcept): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setContent(value: Attachment): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setDuration(value: unsignedInt): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFrames(value: positiveInt): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    inline def setHeight(value: positiveInt): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    inline def setOccurrenceDateTime(value: dateTime): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    inline def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    inline def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    inline def setOperator(value: Reference): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value :_*))
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubtype(value: CodeableConcept): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    inline def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setView(value: CodeableConcept): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWidth(value: positiveInt): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def set_duration(value: Element): Self = StObject.set(x, "_duration", value.asInstanceOf[js.Any])
    
    inline def set_durationUndefined: Self = StObject.set(x, "_duration", js.undefined)
    
    inline def set_frames(value: Element): Self = StObject.set(x, "_frames", value.asInstanceOf[js.Any])
    
    inline def set_framesUndefined: Self = StObject.set(x, "_frames", js.undefined)
    
    inline def set_height(value: Element): Self = StObject.set(x, "_height", value.asInstanceOf[js.Any])
    
    inline def set_heightUndefined: Self = StObject.set(x, "_height", js.undefined)
    
    inline def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_width(value: Element): Self = StObject.set(x, "_width", value.asInstanceOf[js.Any])
    
    inline def set_widthUndefined: Self = StObject.set(x, "_width", js.undefined)
  }
}
