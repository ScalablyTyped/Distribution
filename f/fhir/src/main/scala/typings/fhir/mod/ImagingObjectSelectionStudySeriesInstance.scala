package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagingObjectSelectionStudySeriesInstance
  extends StObject
     with BackboneElement {
  
  var _sopClass: js.UndefOr[Element] = js.undefined
  
  var _uid: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * The specific set of frames referenced in this imaging object selection. The URL retrieves the pixel data, and is encapsulated in a multipart MIME response.
    */
  var frames: js.UndefOr[js.Array[ImagingObjectSelectionStudySeriesInstanceFrames]] = js.undefined
  
  /**
    * DICOM SOP instances can be an image or other data object. The SOP class UID provide the accurate information about what type the instance is.
    */
  var sopClass: String
  
  /**
    * SOP instance UID is required to fully identify the DICOM SOP instance in the selection.
    */
  var uid: String
  
  /**
    * WADO-RS URL enables retrieval of the SOP instance using DICOM WADO-RS API.
    */
  var url: String
}
object ImagingObjectSelectionStudySeriesInstance {
  
  inline def apply(sopClass: String, uid: String, url: String): ImagingObjectSelectionStudySeriesInstance = {
    val __obj = js.Dynamic.literal(sopClass = sopClass.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingObjectSelectionStudySeriesInstance]
  }
  
  extension [Self <: ImagingObjectSelectionStudySeriesInstance](x: Self) {
    
    inline def setFrames(value: js.Array[ImagingObjectSelectionStudySeriesInstanceFrames]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    inline def setFramesVarargs(value: ImagingObjectSelectionStudySeriesInstanceFrames*): Self = StObject.set(x, "frames", js.Array(value*))
    
    inline def setSopClass(value: String): Self = StObject.set(x, "sopClass", value.asInstanceOf[js.Any])
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_sopClass(value: Element): Self = StObject.set(x, "_sopClass", value.asInstanceOf[js.Any])
    
    inline def set_sopClassUndefined: Self = StObject.set(x, "_sopClass", js.undefined)
    
    inline def set_uid(value: Element): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
    
    inline def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
