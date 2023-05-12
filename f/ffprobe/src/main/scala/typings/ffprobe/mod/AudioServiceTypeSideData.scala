package typings.ffprobe.mod

import typings.ffprobe.ffprobeStrings.`Audio Service Type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioServiceTypeSideData
  extends StObject
     with BaseSideData
     with _SideData {
  
  var service_type: Double
  
  /**
    * Based on the C code related to Audio Service Type side data section
    * {@see https://github.com/FFmpeg/FFmpeg/blob/b37795688a9bfa6d5a2e9b2535c4b10ebc14ac5d/fftools/ffprobe.c#L2366-L2367}
    */
  @JSName("side_data_type")
  var side_data_type_AudioServiceTypeSideData: `Audio Service Type`
}
object AudioServiceTypeSideData {
  
  inline def apply(service_type: Double): AudioServiceTypeSideData = {
    val __obj = js.Dynamic.literal(service_type = service_type.asInstanceOf[js.Any], side_data_type = "Audio Service Type")
    __obj.asInstanceOf[AudioServiceTypeSideData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioServiceTypeSideData] (val x: Self) extends AnyVal {
    
    inline def setService_type(value: Double): Self = StObject.set(x, "service_type", value.asInstanceOf[js.Any])
    
    inline def setSide_data_type(value: `Audio Service Type`): Self = StObject.set(x, "side_data_type", value.asInstanceOf[js.Any])
  }
}
