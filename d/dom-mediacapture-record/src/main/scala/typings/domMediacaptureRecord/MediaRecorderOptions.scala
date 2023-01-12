package typings.domMediacaptureRecord

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaRecorderOptions extends StObject {
  
  var audioBitrateMode: js.UndefOr[BitrateMode] = js.undefined
  
  var audioBitsPerSecond: js.UndefOr[Double] = js.undefined
  
  var bitsPerSecond: js.UndefOr[Double] = js.undefined
  
  var mimeType: js.UndefOr[String] = js.undefined
  
  var videoBitsPerSecond: js.UndefOr[Double] = js.undefined
}
object MediaRecorderOptions {
  
  inline def apply(): MediaRecorderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaRecorderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaRecorderOptions] (val x: Self) extends AnyVal {
    
    inline def setAudioBitrateMode(value: BitrateMode): Self = StObject.set(x, "audioBitrateMode", value.asInstanceOf[js.Any])
    
    inline def setAudioBitrateModeUndefined: Self = StObject.set(x, "audioBitrateMode", js.undefined)
    
    inline def setAudioBitsPerSecond(value: Double): Self = StObject.set(x, "audioBitsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setAudioBitsPerSecondUndefined: Self = StObject.set(x, "audioBitsPerSecond", js.undefined)
    
    inline def setBitsPerSecond(value: Double): Self = StObject.set(x, "bitsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setBitsPerSecondUndefined: Self = StObject.set(x, "bitsPerSecond", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setVideoBitsPerSecond(value: Double): Self = StObject.set(x, "videoBitsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setVideoBitsPerSecondUndefined: Self = StObject.set(x, "videoBitsPerSecond", js.undefined)
  }
}
