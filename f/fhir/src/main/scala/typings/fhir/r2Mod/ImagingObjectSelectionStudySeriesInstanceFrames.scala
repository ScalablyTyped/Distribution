package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagingObjectSelectionStudySeriesInstanceFrames
  extends StObject
     with BackboneElement {
  
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * One or more non-duplicate frame numbers in the selected instance.
    */
  var frameNumbers: js.Array[Double]
  
  /**
    * WADO-RS URL enables retrieval of the frames using DICOM WADO-RS API.
    */
  var url: String
}
object ImagingObjectSelectionStudySeriesInstanceFrames {
  
  inline def apply(frameNumbers: js.Array[Double], url: String): ImagingObjectSelectionStudySeriesInstanceFrames = {
    val __obj = js.Dynamic.literal(frameNumbers = frameNumbers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingObjectSelectionStudySeriesInstanceFrames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagingObjectSelectionStudySeriesInstanceFrames] (val x: Self) extends AnyVal {
    
    inline def setFrameNumbers(value: js.Array[Double]): Self = StObject.set(x, "frameNumbers", value.asInstanceOf[js.Any])
    
    inline def setFrameNumbersVarargs(value: Double*): Self = StObject.set(x, "frameNumbers", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
