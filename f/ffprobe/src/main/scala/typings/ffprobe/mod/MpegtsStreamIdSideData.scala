package typings.ffprobe.mod

import typings.ffprobe.ffprobeStrings.`MPEGTS Stream ID`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MpegtsStreamIdSideData
  extends StObject
     with BaseSideData
     with _SideData {
  
  var id: Double
  
  /**
    * Based on the C code related to MPEGTS Stream ID side data section
    * {@see https://github.com/FFmpeg/FFmpeg/blob/b37795688a9bfa6d5a2e9b2535c4b10ebc14ac5d/fftools/ffprobe.c#L2369}
    */
  @JSName("side_data_type")
  var side_data_type_MpegtsStreamIdSideData: `MPEGTS Stream ID`
}
object MpegtsStreamIdSideData {
  
  inline def apply(id: Double): MpegtsStreamIdSideData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], side_data_type = "MPEGTS Stream ID")
    __obj.asInstanceOf[MpegtsStreamIdSideData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MpegtsStreamIdSideData] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSide_data_type(value: `MPEGTS Stream ID`): Self = StObject.set(x, "side_data_type", value.asInstanceOf[js.Any])
  }
}
