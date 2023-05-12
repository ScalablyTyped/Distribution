package typings.ffprobe.mod

import typings.ffprobe.ffprobeStrings.`2D`
import typings.ffprobe.ffprobeStrings.`Stereo 3D`
import typings.ffprobe.ffprobeStrings.`frame alternate`
import typings.ffprobe.ffprobeStrings.`interleaved columns`
import typings.ffprobe.ffprobeStrings.`interleaved lines`
import typings.ffprobe.ffprobeStrings.`side by side`
import typings.ffprobe.ffprobeStrings.`top and bottom`
import typings.ffprobe.ffprobeStrings.checkerboard
import typings.ffprobe.ffprobeStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stereo3dSideData
  extends StObject
     with BaseSideData
     with _SideData {
  
  var inverted: Double
  
  /**
    * Based on the C code related to Stereo 3D side data section
    * {@see https://github.com/FFmpeg/FFmpeg/blob/b37795688a9bfa6d5a2e9b2535c4b10ebc14ac5d/fftools/ffprobe.c#L2306-L2308}
    */
  @JSName("side_data_type")
  var side_data_type_Stereo3dSideData: `Stereo 3D`
  
  /**
    * Based on the C code of the libauvutil stereo3d file
    * {@see https://github.com/FFmpeg/FFmpeg/blob/b37795688a9bfa6d5a2e9b2535c4b10ebc14ac5d/libavutil/stereo3d.c#L47-L56}
    */
  var `type`: unknown | `2D` | (`side by side`) | (`top and bottom`) | (`frame alternate`) | checkerboard | (/* side by side (quincunx subsampling) */ String) | (`interleaved lines`) | (`interleaved columns`)
}
object Stereo3dSideData {
  
  inline def apply(
    inverted: Double,
    `type`: unknown | `2D` | (`side by side`) | (`top and bottom`) | (`frame alternate`) | checkerboard | (/* side by side (quincunx subsampling) */ String) | (`interleaved lines`) | (`interleaved columns`)
  ): Stereo3dSideData = {
    val __obj = js.Dynamic.literal(inverted = inverted.asInstanceOf[js.Any], side_data_type = "Stereo 3D")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stereo3dSideData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Stereo3dSideData] (val x: Self) extends AnyVal {
    
    inline def setInverted(value: Double): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    inline def setSide_data_type(value: `Stereo 3D`): Self = StObject.set(x, "side_data_type", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: unknown | `2D` | (`side by side`) | (`top and bottom`) | (`frame alternate`) | checkerboard | (/* side by side (quincunx subsampling) */ String) | (`interleaved lines`) | (`interleaved columns`)
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
