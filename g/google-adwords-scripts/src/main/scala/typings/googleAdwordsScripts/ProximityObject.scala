package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProximityObject extends js.Object {
  
  var address: js.UndefOr[AddressObject] = js.native
  
  var bidModifier: js.UndefOr[Double] = js.native
  
  var latitude: Double = js.native
  
  var longitude: Double = js.native
  
  var radius: Double = js.native
  
  var radiusUnits: RadiusUnits = js.native
}
object ProximityObject {
  
  @scala.inline
  def apply(latitude: Double, longitude: Double, radius: Double, radiusUnits: RadiusUnits): ProximityObject = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], radiusUnits = radiusUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProximityObject]
  }
  
  @scala.inline
  implicit class ProximityObjectOps[Self <: ProximityObject] (val x: Self) extends AnyVal {
    
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
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUnits(value: RadiusUnits): Self = this.set("radiusUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress(value: AddressObject): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setBidModifier(value: Double): Self = this.set("bidModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBidModifier: Self = this.set("bidModifier", js.undefined)
  }
}
