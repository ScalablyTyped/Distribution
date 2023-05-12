package typings.ffprobe.mod

import typings.ffprobe.ffprobeStrings.`Mastering display metadata`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseMasteringDisplayMetadataSideData
  extends StObject
     with BaseSideData {
  
  /**
    * Based on the C code related to Mastering display metadata side data section
    * {@see https://github.com/FFmpeg/FFmpeg/blob/b37795688a9bfa6d5a2e9b2535c4b10ebc14ac5d/fftools/ffprobe.c#L2333-L2350}
    */
  @JSName("side_data_type")
  var side_data_type_BaseMasteringDisplayMetadataSideData: `Mastering display metadata`
}
object BaseMasteringDisplayMetadataSideData {
  
  inline def apply(): BaseMasteringDisplayMetadataSideData = {
    val __obj = js.Dynamic.literal(side_data_type = "Mastering display metadata")
    __obj.asInstanceOf[BaseMasteringDisplayMetadataSideData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseMasteringDisplayMetadataSideData] (val x: Self) extends AnyVal {
    
    inline def setSide_data_type(value: `Mastering display metadata`): Self = StObject.set(x, "side_data_type", value.asInstanceOf[js.Any])
  }
}
