package typings.ffprobe.mod

import typings.ffprobe.ffprobeStrings.`CPB properties`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CpbPropertiesSideData
  extends StObject
     with BaseSideData
     with _SideData {
  
  var avg_bitrate: Double
  
  var buffer_size: Double
  
  var max_bitrate: Double
  
  var min_bitrate: Double
  
  /**
    * Based on the C code related to CPB properties side data section
    * {@see https://github.com/FFmpeg/FFmpeg/blob/b37795688a9bfa6d5a2e9b2535c4b10ebc14ac5d/fftools/ffprobe.c#L2371-L2376}
    */
  @JSName("side_data_type")
  var side_data_type_CpbPropertiesSideData: `CPB properties`
  
  var vbv_delay: Double
}
object CpbPropertiesSideData {
  
  inline def apply(
    avg_bitrate: Double,
    buffer_size: Double,
    max_bitrate: Double,
    min_bitrate: Double,
    vbv_delay: Double
  ): CpbPropertiesSideData = {
    val __obj = js.Dynamic.literal(avg_bitrate = avg_bitrate.asInstanceOf[js.Any], buffer_size = buffer_size.asInstanceOf[js.Any], max_bitrate = max_bitrate.asInstanceOf[js.Any], min_bitrate = min_bitrate.asInstanceOf[js.Any], side_data_type = "CPB properties", vbv_delay = vbv_delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpbPropertiesSideData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CpbPropertiesSideData] (val x: Self) extends AnyVal {
    
    inline def setAvg_bitrate(value: Double): Self = StObject.set(x, "avg_bitrate", value.asInstanceOf[js.Any])
    
    inline def setBuffer_size(value: Double): Self = StObject.set(x, "buffer_size", value.asInstanceOf[js.Any])
    
    inline def setMax_bitrate(value: Double): Self = StObject.set(x, "max_bitrate", value.asInstanceOf[js.Any])
    
    inline def setMin_bitrate(value: Double): Self = StObject.set(x, "min_bitrate", value.asInstanceOf[js.Any])
    
    inline def setSide_data_type(value: `CPB properties`): Self = StObject.set(x, "side_data_type", value.asInstanceOf[js.Any])
    
    inline def setVbv_delay(value: Double): Self = StObject.set(x, "vbv_delay", value.asInstanceOf[js.Any])
  }
}
