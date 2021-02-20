package typings.geolib.anon

import typings.geolib.geolibNumbers.`1`
import typings.geolib.geolibStrings.lat
import typings.geolib.geolibStrings.latitude
import typings.geolib.geolibStrings.lng
import typings.geolib.geolibStrings.lon
import typings.geolib.geolibStrings.longitude
import typings.geolib.typesMod.AltitudeKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AltitudeLatitude extends StObject {
  
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
  implicit class AltitudeLatitudeMutableBuilder[Self <: AltitudeLatitude] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: AltitudeKeys): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setLatitude(value: lat | latitude | `1`): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: typings.geolib.geolibNumbers.`0` | lng | lon | longitude): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
  }
}
