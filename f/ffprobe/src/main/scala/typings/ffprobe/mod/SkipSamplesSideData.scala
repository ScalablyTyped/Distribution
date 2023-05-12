package typings.ffprobe.mod

import typings.ffprobe.ffprobeStrings.`Skip Samples`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkipSamplesSideData
  extends StObject
     with BaseSideData
     with _SideData {
  
  var discard_padding: Double
  
  var discard_reason: Double
  
  /**
    * Based on the C code related to Skip Samples side data section
    * {@see https://github.com/FFmpeg/FFmpeg/blob/b37795688a9bfa6d5a2e9b2535c4b10ebc14ac5d/fftools/ffprobe.c#L2328-L2331}
    */
  @JSName("side_data_type")
  var side_data_type_SkipSamplesSideData: `Skip Samples`
  
  var skip_reason: Double
  
  var skip_samples: Double
}
object SkipSamplesSideData {
  
  inline def apply(discard_padding: Double, discard_reason: Double, skip_reason: Double, skip_samples: Double): SkipSamplesSideData = {
    val __obj = js.Dynamic.literal(discard_padding = discard_padding.asInstanceOf[js.Any], discard_reason = discard_reason.asInstanceOf[js.Any], side_data_type = "Skip Samples", skip_reason = skip_reason.asInstanceOf[js.Any], skip_samples = skip_samples.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipSamplesSideData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SkipSamplesSideData] (val x: Self) extends AnyVal {
    
    inline def setDiscard_padding(value: Double): Self = StObject.set(x, "discard_padding", value.asInstanceOf[js.Any])
    
    inline def setDiscard_reason(value: Double): Self = StObject.set(x, "discard_reason", value.asInstanceOf[js.Any])
    
    inline def setSide_data_type(value: `Skip Samples`): Self = StObject.set(x, "side_data_type", value.asInstanceOf[js.Any])
    
    inline def setSkip_reason(value: Double): Self = StObject.set(x, "skip_reason", value.asInstanceOf[js.Any])
    
    inline def setSkip_samples(value: Double): Self = StObject.set(x, "skip_samples", value.asInstanceOf[js.Any])
  }
}
