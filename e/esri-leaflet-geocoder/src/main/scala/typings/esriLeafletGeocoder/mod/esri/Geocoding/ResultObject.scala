package typings.esriLeafletGeocoder.mod.esri.Geocoding

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.mod.GeoJSON_
import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.LatLngTuple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultObject
  extends /* key */ StringDictionary[js.Any] {
  
  var bounds: js.UndefOr[LatLngBoundsExpression] = js.native
  
  var geojson: js.UndefOr[GeoJSON_[_]] = js.native
  
  var latlng: js.UndefOr[LatLngExpression] = js.native
  
  var properties: js.UndefOr[js.Any] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object ResultObject {
  
  @scala.inline
  def apply(): ResultObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultObject]
  }
  
  @scala.inline
  implicit class ResultObjectOps[Self <: ResultObject] (val x: Self) extends AnyVal {
    
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
    def setBoundsVarargs(value: LatLngTuple*): Self = this.set("bounds", js.Array(value :_*))
    
    @scala.inline
    def setBounds(value: LatLngBoundsExpression): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    
    @scala.inline
    def setGeojson(value: GeoJSON_[_]): Self = this.set("geojson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeojson: Self = this.set("geojson", js.undefined)
    
    @scala.inline
    def setLatlng(value: LatLngExpression): Self = this.set("latlng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatlng: Self = this.set("latlng", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
