package typings.geolib.anon

import typings.geolib.typesMod.AltitudeKeys
import typings.geolib.typesMod.LatitudeKeys
import typings.geolib.typesMod.LongitudeKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Altitude extends js.Object {
  
  var altitude: js.Array[AltitudeKeys] = js.native
  
  var latitude: js.Array[LatitudeKeys] = js.native
  
  var longitude: js.Array[LongitudeKeys] = js.native
}
object Altitude {
  
  @scala.inline
  def apply(
    altitude: js.Array[AltitudeKeys],
    latitude: js.Array[LatitudeKeys],
    longitude: js.Array[LongitudeKeys]
  ): Altitude = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Altitude]
  }
  
  @scala.inline
  implicit class AltitudeOps[Self <: Altitude] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAltitudeVarargs(value: AltitudeKeys*): Self = this.set("altitude", js.Array(value :_*))
    
    @scala.inline
    def setAltitude(value: js.Array[AltitudeKeys]): Self = this.set("altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeVarargs(value: LatitudeKeys*): Self = this.set("latitude", js.Array(value :_*))
    
    @scala.inline
    def setLatitude(value: js.Array[LatitudeKeys]): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeVarargs(value: LongitudeKeys*): Self = this.set("longitude", js.Array(value :_*))
    
    @scala.inline
    def setLongitude(value: js.Array[LongitudeKeys]): Self = this.set("longitude", value.asInstanceOf[js.Any])
  }
}
