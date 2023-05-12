package typings.ffprobe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LuminanceMasteringDisplayMetadataSideData
  extends StObject
     with BaseMasteringDisplayMetadataSideData
     with _MasteringDisplayMetadataSideData {
  
  var max_luminance: String
  
  /**
    * Based on the C code related to Luminance Mastering display metadata side data section
    * {@see https://github.com/FFmpeg/FFmpeg/blob/b37795688a9bfa6d5a2e9b2535c4b10ebc14ac5d/fftools/ffprobe.c#L2348-L2349}
    */
  var min_luminance: String
}
object LuminanceMasteringDisplayMetadataSideData {
  
  inline def apply(max_luminance: String, min_luminance: String): LuminanceMasteringDisplayMetadataSideData = {
    val __obj = js.Dynamic.literal(max_luminance = max_luminance.asInstanceOf[js.Any], min_luminance = min_luminance.asInstanceOf[js.Any], side_data_type = "Mastering display metadata")
    __obj.asInstanceOf[LuminanceMasteringDisplayMetadataSideData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LuminanceMasteringDisplayMetadataSideData] (val x: Self) extends AnyVal {
    
    inline def setMax_luminance(value: String): Self = StObject.set(x, "max_luminance", value.asInstanceOf[js.Any])
    
    inline def setMin_luminance(value: String): Self = StObject.set(x, "min_luminance", value.asInstanceOf[js.Any])
  }
}
