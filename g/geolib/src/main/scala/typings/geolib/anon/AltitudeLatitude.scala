package typings.geolib.anon

import typings.geolib.geolibNumbers.`1`
import typings.geolib.geolibStrings.lat
import typings.geolib.geolibStrings.latitude
import typings.geolib.geolibStrings.lng
import typings.geolib.geolibStrings.lon
import typings.geolib.geolibStrings.longitude
import typings.geolib.typesMod.AltitudeKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AltitudeLatitude extends js.Object {
  
  var altitude: js.UndefOr[AltitudeKeys] = js.native
  
  var latitude: js.UndefOr[lat | typings.geolib.geolibStrings.latitude | `1`] = js.native
  
  var longitude: js.UndefOr[
    typings.geolib.geolibNumbers.`0` | lng | lon | typings.geolib.geolibStrings.longitude
  ] = js.native
}
object AltitudeLatitude {
  
  @scala.inline
  def apply(): AltitudeLatitude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AltitudeLatitude]
  }
  
  @scala.inline
  implicit class AltitudeLatitudeOps[Self <: AltitudeLatitude] (val x: Self) extends AnyVal {
    
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
    def setAltitude(value: AltitudeKeys): Self = this.set("altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltitude: Self = this.set("altitude", js.undefined)
    
    @scala.inline
    def setLatitude(value: lat | latitude | `1`): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: typings.geolib.geolibNumbers.`0` | lng | lon | longitude): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
  }
}
