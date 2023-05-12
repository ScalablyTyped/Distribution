package typings.ffprobe.mod

import typings.ffprobe.ffprobeStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnknownSideData
  extends StObject
     with BaseSideData
     with _SideData {
  
  /**
    * Based on the C code related to the default side data section
    * {@see https://github.com/FFmpeg/FFmpeg/blob/b37795688a9bfa6d5a2e9b2535c4b10ebc14ac5d/fftools/ffprobe.c#L2298}
    */
  @JSName("side_data_type")
  var side_data_type_UnknownSideData: unknown
}
object UnknownSideData {
  
  inline def apply(): UnknownSideData = {
    val __obj = js.Dynamic.literal(side_data_type = "unknown")
    __obj.asInstanceOf[UnknownSideData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnknownSideData] (val x: Self) extends AnyVal {
    
    inline def setSide_data_type(value: unknown): Self = StObject.set(x, "side_data_type", value.asInstanceOf[js.Any])
  }
}
