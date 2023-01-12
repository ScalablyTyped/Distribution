package typings.fhir.r2Mod

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
  
  var _deviceName: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * The actual content of the media - inline or by direct reference to the media source file.
    */
  var content: Attachment
  
  /**
    * The name of the device / manufacturer of the device  that was used to make the recording.
    */
  var deviceName: js.UndefOr[String] = js.undefined
  
  /**
    * The duration of the recording in seconds - for audio and video.
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
    * Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The person who administered the collection of the image.
    */
  var operator: js.UndefOr[Reference] = js.undefined
  
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
    
    inline def setContent(value: Attachment): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFrames(value: Double): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setOperator(value: Reference): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
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
    
    inline def set_deviceName(value: Element): Self = StObject.set(x, "_deviceName", value.asInstanceOf[js.Any])
    
    inline def set_deviceNameUndefined: Self = StObject.set(x, "_deviceName", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
