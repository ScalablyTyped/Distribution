package typings.expoLocation.locationTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationGeocodedAddress extends js.Object {
  
  var city: String | Null = js.native
  
  var country: String | Null = js.native
  
  var district: String | Null = js.native
  
  var isoCountryCode: String | Null = js.native
  
  var name: String | Null = js.native
  
  var postalCode: String | Null = js.native
  
  var region: String | Null = js.native
  
  var street: String | Null = js.native
  
  var subregion: String | Null = js.native
  
  var timezone: String | Null = js.native
}
object LocationGeocodedAddress {
  
  @scala.inline
  def apply(): LocationGeocodedAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationGeocodedAddress]
  }
  
  @scala.inline
  implicit class LocationGeocodedAddressOps[Self <: LocationGeocodedAddress] (val x: Self) extends AnyVal {
    
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
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityNull: Self = this.set("city", null)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryNull: Self = this.set("country", null)
    
    @scala.inline
    def setDistrict(value: String): Self = this.set("district", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistrictNull: Self = this.set("district", null)
    
    @scala.inline
    def setIsoCountryCode(value: String): Self = this.set("isoCountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsoCountryCodeNull: Self = this.set("isoCountryCode", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeNull: Self = this.set("postalCode", null)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionNull: Self = this.set("region", null)
    
    @scala.inline
    def setStreet(value: String): Self = this.set("street", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetNull: Self = this.set("street", null)
    
    @scala.inline
    def setSubregion(value: String): Self = this.set("subregion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubregionNull: Self = this.set("subregion", null)
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneNull: Self = this.set("timezone", null)
  }
}
