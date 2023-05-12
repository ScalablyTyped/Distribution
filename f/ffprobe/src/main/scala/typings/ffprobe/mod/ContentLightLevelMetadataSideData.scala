package typings.ffprobe.mod

import typings.ffprobe.ffprobeStrings.`Content light level metadata`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentLightLevelMetadataSideData
  extends StObject
     with BaseSideData
     with _SideData {
  
  var max_average: Double
  
  var max_content: Double
  
  /**
    * Based on the C code related to Content light level metadata side data section
    * {@see https://github.com/FFmpeg/FFmpeg/blob/b37795688a9bfa6d5a2e9b2535c4b10ebc14ac5d/fftools/ffprobe.c#L2352-L2354}
    */
  @JSName("side_data_type")
  var side_data_type_ContentLightLevelMetadataSideData: `Content light level metadata`
}
object ContentLightLevelMetadataSideData {
  
  inline def apply(max_average: Double, max_content: Double): ContentLightLevelMetadataSideData = {
    val __obj = js.Dynamic.literal(max_average = max_average.asInstanceOf[js.Any], max_content = max_content.asInstanceOf[js.Any], side_data_type = "Content light level metadata")
    __obj.asInstanceOf[ContentLightLevelMetadataSideData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentLightLevelMetadataSideData] (val x: Self) extends AnyVal {
    
    inline def setMax_average(value: Double): Self = StObject.set(x, "max_average", value.asInstanceOf[js.Any])
    
    inline def setMax_content(value: Double): Self = StObject.set(x, "max_content", value.asInstanceOf[js.Any])
    
    inline def setSide_data_type(value: `Content light level metadata`): Self = StObject.set(x, "side_data_type", value.asInstanceOf[js.Any])
  }
}
