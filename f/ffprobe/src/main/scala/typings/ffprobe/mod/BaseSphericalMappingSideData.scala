package typings.ffprobe.mod

import typings.ffprobe.ffprobeStrings.`Spherical Mapping`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseSphericalMappingSideData
  extends StObject
     with BaseSideData {
  
  var pitch: Double
  
  /**
    * Based on the C code of the libauvutil spherical file
    * {@see https://github.com/FFmpeg/FFmpeg/blob/b37795688a9bfa6d5a2e9b2535c4b10ebc14ac5d/libavutil/spherical.c#L55-L59}
    */
  var projection: String
  
  var roll: Double
  
  /**
    * Based on the C code related to Spherical Mapping side data section
    * {@see https://github.com/FFmpeg/FFmpeg/blob/b37795688a9bfa6d5a2e9b2535c4b10ebc14ac5d/fftools/ffprobe.c#L2310-L2326}
    */
  @JSName("side_data_type")
  var side_data_type_BaseSphericalMappingSideData: `Spherical Mapping`
  
  var yaw: Double
}
object BaseSphericalMappingSideData {
  
  inline def apply(pitch: Double, projection: String, roll: Double, yaw: Double): BaseSphericalMappingSideData = {
    val __obj = js.Dynamic.literal(pitch = pitch.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any], side_data_type = "Spherical Mapping", yaw = yaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseSphericalMappingSideData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseSphericalMappingSideData] (val x: Self) extends AnyVal {
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setRoll(value: Double): Self = StObject.set(x, "roll", value.asInstanceOf[js.Any])
    
    inline def setSide_data_type(value: `Spherical Mapping`): Self = StObject.set(x, "side_data_type", value.asInstanceOf[js.Any])
    
    inline def setYaw(value: Double): Self = StObject.set(x, "yaw", value.asInstanceOf[js.Any])
  }
}
