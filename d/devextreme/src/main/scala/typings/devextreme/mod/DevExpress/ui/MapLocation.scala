package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapLocation extends js.Object {
  
  /**
    * [descr:MapLocation.lat]
    */
  var lat: js.UndefOr[Double] = js.native
  
  /**
    * [descr:MapLocation.lng]
    */
  var lng: js.UndefOr[Double] = js.native
}
object MapLocation {
  
  @scala.inline
  def apply(): MapLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLocation]
  }
  
  @scala.inline
  implicit class MapLocationOps[Self <: MapLocation] (val x: Self) extends AnyVal {
    
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
    def setLat(value: Double): Self = this.set("lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLat: Self = this.set("lat", js.undefined)
    
    @scala.inline
    def setLng(value: Double): Self = this.set("lng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLng: Self = this.set("lng", js.undefined)
  }
}
