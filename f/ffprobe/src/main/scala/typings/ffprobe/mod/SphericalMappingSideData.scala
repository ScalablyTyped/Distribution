package typings.ffprobe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ffprobe.mod.UnknownSphericalMappingSideData
  - typings.ffprobe.mod.EquirectangularSphericalMappingSideData
  - typings.ffprobe.mod.CubeMapSphericalMappingSideData
  - typings.ffprobe.mod.TiltedEquirectangularSphericalMappingSideData
*/
trait SphericalMappingSideData
  extends StObject
     with _SideData
object SphericalMappingSideData {
  
  inline def CubeMapSphericalMappingSideData(padding: Double, pitch: Double, roll: Double, yaw: Double): typings.ffprobe.mod.CubeMapSphericalMappingSideData = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], projection = "cubemap", roll = roll.asInstanceOf[js.Any], side_data_type = "Spherical Mapping", yaw = yaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ffprobe.mod.CubeMapSphericalMappingSideData]
  }
  
  inline def EquirectangularSphericalMappingSideData(pitch: Double, roll: Double, yaw: Double): typings.ffprobe.mod.EquirectangularSphericalMappingSideData = {
    val __obj = js.Dynamic.literal(pitch = pitch.asInstanceOf[js.Any], projection = "equirectangular", roll = roll.asInstanceOf[js.Any], side_data_type = "Spherical Mapping", yaw = yaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ffprobe.mod.EquirectangularSphericalMappingSideData]
  }
  
  inline def TiltedEquirectangularSphericalMappingSideData(
    bound_bottom: Double,
    bound_left: Double,
    bound_right: Double,
    bound_top: Double,
    pitch: Double,
    roll: Double,
    yaw: Double
  ): typings.ffprobe.mod.TiltedEquirectangularSphericalMappingSideData = {
    val __obj = js.Dynamic.literal(bound_bottom = bound_bottom.asInstanceOf[js.Any], bound_left = bound_left.asInstanceOf[js.Any], bound_right = bound_right.asInstanceOf[js.Any], bound_top = bound_top.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], projection = "tiled equirectangular", roll = roll.asInstanceOf[js.Any], side_data_type = "Spherical Mapping", yaw = yaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ffprobe.mod.TiltedEquirectangularSphericalMappingSideData]
  }
  
  inline def UnknownSphericalMappingSideData(pitch: Double, roll: Double, yaw: Double): typings.ffprobe.mod.UnknownSphericalMappingSideData = {
    val __obj = js.Dynamic.literal(pitch = pitch.asInstanceOf[js.Any], projection = "unknown", roll = roll.asInstanceOf[js.Any], side_data_type = "Spherical Mapping", yaw = yaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ffprobe.mod.UnknownSphericalMappingSideData]
  }
}
