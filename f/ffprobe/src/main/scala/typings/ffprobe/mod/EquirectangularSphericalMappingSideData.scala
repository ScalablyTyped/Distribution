package typings.ffprobe.mod

import typings.ffprobe.ffprobeStrings.equirectangular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EquirectangularSphericalMappingSideData
  extends StObject
     with BaseSphericalMappingSideData
     with SphericalMappingSideData {
  
  @JSName("projection")
  var projection_EquirectangularSphericalMappingSideData: equirectangular
}
object EquirectangularSphericalMappingSideData {
  
  inline def apply(pitch: Double, roll: Double, yaw: Double): EquirectangularSphericalMappingSideData = {
    val __obj = js.Dynamic.literal(pitch = pitch.asInstanceOf[js.Any], projection = "equirectangular", roll = roll.asInstanceOf[js.Any], side_data_type = "Spherical Mapping", yaw = yaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[EquirectangularSphericalMappingSideData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EquirectangularSphericalMappingSideData] (val x: Self) extends AnyVal {
    
    inline def setProjection(value: equirectangular): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
  }
}
