package typings.domMediacaptureRecord

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaRecorderOptions extends StObject {
  
  var audioBitrateMode: js.UndefOr[BitrateMode] = js.native
  
  var audioBitsPerSecond: js.UndefOr[Double] = js.native
  
  var bitsPerSecond: js.UndefOr[Double] = js.native
  
  var mimeType: js.UndefOr[String] = js.native
  
  var videoBitsPerSecond: js.UndefOr[Double] = js.native
}
object MediaRecorderOptions {
  
  @scala.inline
  def apply(): MediaRecorderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaRecorderOptions]
  }
  
  @scala.inline
  implicit class MediaRecorderOptionsMutableBuilder[Self <: MediaRecorderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioBitrateMode(value: BitrateMode): Self = StObject.set(x, "audioBitrateMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioBitrateModeUndefined: Self = StObject.set(x, "audioBitrateMode", js.undefined)
    
    @scala.inline
    def setAudioBitsPerSecond(value: Double): Self = StObject.set(x, "audioBitsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioBitsPerSecondUndefined: Self = StObject.set(x, "audioBitsPerSecond", js.undefined)
    
    @scala.inline
    def setBitsPerSecond(value: Double): Self = StObject.set(x, "bitsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitsPerSecondUndefined: Self = StObject.set(x, "bitsPerSecond", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setVideoBitsPerSecond(value: Double): Self = StObject.set(x, "videoBitsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoBitsPerSecondUndefined: Self = StObject.set(x, "videoBitsPerSecond", js.undefined)
  }
}
