package typings.ffprobe.mod

import typings.ffprobe.ffprobeStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnknownSphericalMappingSideData
  extends StObject
     with BaseSphericalMappingSideData
     with SphericalMappingSideData {
  
  @JSName("projection")
  var projection_UnknownSphericalMappingSideData: unknown
}
object UnknownSphericalMappingSideData {
  
  inline def apply(pitch: Double, roll: Double, yaw: Double): UnknownSphericalMappingSideData = {
    val __obj = js.Dynamic.literal(pitch = pitch.asInstanceOf[js.Any], projection = "unknown", roll = roll.asInstanceOf[js.Any], side_data_type = "Spherical Mapping", yaw = yaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnknownSphericalMappingSideData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnknownSphericalMappingSideData] (val x: Self) extends AnyVal {
    
    inline def setProjection(value: unknown): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
  }
}
