package typings.geolib.anon

import typings.geolib.typesMod.GeolibInputLongitude
import typings.geolib.typesMod.GeolibLongitudeInputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lng extends GeolibInputLongitude {
  
  var lng: GeolibLongitudeInputValue = js.native
}
object Lng {
  
  @scala.inline
  def apply(lng: GeolibLongitudeInputValue): Lng = {
    val __obj = js.Dynamic.literal(lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lng]
  }
  
  @scala.inline
  implicit class LngMutableBuilder[Self <: Lng] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLng(value: GeolibLongitudeInputValue): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
  }
}
