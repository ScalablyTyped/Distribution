package typings.domWebcodecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioDataCopyToOptions extends StObject {
  
  var format: js.UndefOr[AudioSampleFormat] = js.undefined
  
  var frameCount: js.UndefOr[Double] = js.undefined
  
  var frameOffset: js.UndefOr[Double] = js.undefined
  
  var planeIndex: Double
}
object AudioDataCopyToOptions {
  
  inline def apply(planeIndex: Double): AudioDataCopyToOptions = {
    val __obj = js.Dynamic.literal(planeIndex = planeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioDataCopyToOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioDataCopyToOptions] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: AudioSampleFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFrameCount(value: Double): Self = StObject.set(x, "frameCount", value.asInstanceOf[js.Any])
    
    inline def setFrameCountUndefined: Self = StObject.set(x, "frameCount", js.undefined)
    
    inline def setFrameOffset(value: Double): Self = StObject.set(x, "frameOffset", value.asInstanceOf[js.Any])
    
    inline def setFrameOffsetUndefined: Self = StObject.set(x, "frameOffset", js.undefined)
    
    inline def setPlaneIndex(value: Double): Self = StObject.set(x, "planeIndex", value.asInstanceOf[js.Any])
  }
}
