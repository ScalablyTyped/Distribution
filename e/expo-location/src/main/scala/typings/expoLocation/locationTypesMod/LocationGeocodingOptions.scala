package typings.expoLocation.locationTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationGeocodingOptions extends js.Object {
  
  /**
    * Whether to force using Google Maps API instead of the native implementation.
    * Used by default only on Web platform. Requires providing an API key by `setGoogleApiKey`.
    */
  var useGoogleMaps: js.UndefOr[Boolean] = js.native
}
object LocationGeocodingOptions {
  
  @scala.inline
  def apply(): LocationGeocodingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationGeocodingOptions]
  }
  
  @scala.inline
  implicit class LocationGeocodingOptionsOps[Self <: LocationGeocodingOptions] (val x: Self) extends AnyVal {
    
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
    def setUseGoogleMaps(value: Boolean): Self = this.set("useGoogleMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseGoogleMaps: Self = this.set("useGoogleMaps", js.undefined)
  }
}
