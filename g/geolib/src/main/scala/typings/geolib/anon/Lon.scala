package typings.geolib.anon

import typings.geolib.typesMod.GeolibInputLongitude
import typings.geolib.typesMod.GeolibLongitudeInputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lon extends GeolibInputLongitude {
  
  var lon: GeolibLongitudeInputValue = js.native
}
object Lon {
  
  @scala.inline
  def apply(lon: GeolibLongitudeInputValue): Lon = {
    val __obj = js.Dynamic.literal(lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lon]
  }
  
  @scala.inline
  implicit class LonMutableBuilder[Self <: Lon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLon(value: GeolibLongitudeInputValue): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
  }
}
