package typings.ffprobe.mod

import typings.ffprobe.ffprobeStrings.cubemap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CubeMapSphericalMappingSideData
  extends StObject
     with BaseSphericalMappingSideData
     with SphericalMappingSideData {
  
  /**
    * Based on the C code related to Cube Map Spherical Mapping side data section
    * {@see https://github.com/FFmpeg/FFmpeg/blob/b37795688a9bfa6d5a2e9b2535c4b10ebc14ac5d/fftools/ffprobe.c#L2313}
    */
  var padding: Double
  
  @JSName("projection")
  var projection_CubeMapSphericalMappingSideData: cubemap
}
object CubeMapSphericalMappingSideData {
  
  inline def apply(padding: Double, pitch: Double, roll: Double, yaw: Double): CubeMapSphericalMappingSideData = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], projection = "cubemap", roll = roll.asInstanceOf[js.Any], side_data_type = "Spherical Mapping", yaw = yaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[CubeMapSphericalMappingSideData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CubeMapSphericalMappingSideData] (val x: Self) extends AnyVal {
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setProjection(value: cubemap): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
  }
}
