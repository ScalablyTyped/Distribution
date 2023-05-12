package typings.ffprobe.mod

import typings.ffprobe.ffprobeStrings.`WebVTT ID`
import typings.ffprobe.ffprobeStrings.`WebVTT Settings`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebvttSideData
  extends StObject
     with BaseSideData
     with _SideData {
  
  var data: js.UndefOr[String] = js.undefined
  
  var data_hash: String
  
  /**
    * Based on the C code related to Webvtt side data section
    * {@see https://github.com/FFmpeg/FFmpeg/blob/b37795688a9bfa6d5a2e9b2535c4b10ebc14ac5d/fftools/ffprobe.c#L2379-L2381}
    */
  @JSName("side_data_type")
  var side_data_type_WebvttSideData: (`WebVTT ID`) | (`WebVTT Settings`)
}
object WebvttSideData {
  
  inline def apply(data_hash: String, side_data_type: (`WebVTT ID`) | (`WebVTT Settings`)): WebvttSideData = {
    val __obj = js.Dynamic.literal(data_hash = data_hash.asInstanceOf[js.Any], side_data_type = side_data_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebvttSideData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebvttSideData] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setData_hash(value: String): Self = StObject.set(x, "data_hash", value.asInstanceOf[js.Any])
    
    inline def setSide_data_type(value: (`WebVTT ID`) | (`WebVTT Settings`)): Self = StObject.set(x, "side_data_type", value.asInstanceOf[js.Any])
  }
}
