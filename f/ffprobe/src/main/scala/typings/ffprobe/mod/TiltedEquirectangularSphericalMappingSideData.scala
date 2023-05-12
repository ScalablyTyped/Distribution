package typings.ffprobe.mod

import typings.ffprobe.ffprobeStrings.`tiled equirectangular`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TiltedEquirectangularSphericalMappingSideData
  extends StObject
     with BaseSphericalMappingSideData
     with SphericalMappingSideData {
  
  var bound_bottom: Double
  
  /**
    * Based on the C code related to Cube Map Spherical Mapping side data section
    * {@see https://github.com/FFmpeg/FFmpeg/blob/b37795688a9bfa6d5a2e9b2535c4b10ebc14ac5d/fftools/ffprobe.c#L2315-L2321}
    */
  var bound_left: Double
  
  var bound_right: Double
  
  var bound_top: Double
  
  @JSName("projection")
  var projection_TiltedEquirectangularSphericalMappingSideData: `tiled equirectangular`
}
object TiltedEquirectangularSphericalMappingSideData {
  
  inline def apply(
    bound_bottom: Double,
    bound_left: Double,
    bound_right: Double,
    bound_top: Double,
    pitch: Double,
    roll: Double,
    yaw: Double
  ): TiltedEquirectangularSphericalMappingSideData = {
    val __obj = js.Dynamic.literal(bound_bottom = bound_bottom.asInstanceOf[js.Any], bound_left = bound_left.asInstanceOf[js.Any], bound_right = bound_right.asInstanceOf[js.Any], bound_top = bound_top.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], projection = "tiled equirectangular", roll = roll.asInstanceOf[js.Any], side_data_type = "Spherical Mapping", yaw = yaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[TiltedEquirectangularSphericalMappingSideData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TiltedEquirectangularSphericalMappingSideData] (val x: Self) extends AnyVal {
    
    inline def setBound_bottom(value: Double): Self = StObject.set(x, "bound_bottom", value.asInstanceOf[js.Any])
    
    inline def setBound_left(value: Double): Self = StObject.set(x, "bound_left", value.asInstanceOf[js.Any])
    
    inline def setBound_right(value: Double): Self = StObject.set(x, "bound_right", value.asInstanceOf[js.Any])
    
    inline def setBound_top(value: Double): Self = StObject.set(x, "bound_top", value.asInstanceOf[js.Any])
    
    inline def setProjection(value: `tiled equirectangular`): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
  }
}
