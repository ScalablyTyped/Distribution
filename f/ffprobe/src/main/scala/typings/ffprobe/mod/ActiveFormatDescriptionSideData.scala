package typings.ffprobe.mod

import typings.ffprobe.ffprobeStrings.`Active format description`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveFormatDescriptionSideData
  extends StObject
     with BaseSideData
     with _SideData {
  
  var active_format: js.UndefOr[Double] = js.undefined
  
  /**
    * Based on the C code related to Active format description side data section
    * {@see https://github.com/FFmpeg/FFmpeg/blob/b37795688a9bfa6d5a2e9b2535c4b10ebc14ac5d/fftools/ffprobe.c#L2383}
    */
  @JSName("side_data_type")
  var side_data_type_ActiveFormatDescriptionSideData: `Active format description`
}
object ActiveFormatDescriptionSideData {
  
  inline def apply(): ActiveFormatDescriptionSideData = {
    val __obj = js.Dynamic.literal(side_data_type = "Active format description")
    __obj.asInstanceOf[ActiveFormatDescriptionSideData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveFormatDescriptionSideData] (val x: Self) extends AnyVal {
    
    inline def setActive_format(value: Double): Self = StObject.set(x, "active_format", value.asInstanceOf[js.Any])
    
    inline def setActive_formatUndefined: Self = StObject.set(x, "active_format", js.undefined)
    
    inline def setSide_data_type(value: `Active format description`): Self = StObject.set(x, "side_data_type", value.asInstanceOf[js.Any])
  }
}
