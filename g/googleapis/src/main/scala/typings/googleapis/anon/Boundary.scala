package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Boundary extends js.Object {
  
  var boundary: js.UndefOr[js.Array[js.Array[Latitude]]] = js.native
  
  var cachePolicy: js.UndefOr[String] = js.native
  
  var countryCode: js.UndefOr[String] = js.native
  
  var latitude: js.UndefOr[Double] = js.native
  
  var longitude: js.UndefOr[Double] = js.native
  
  var mapType: js.UndefOr[String] = js.native
  
  var viewport: js.UndefOr[Hi] = js.native
  
  var zoom: js.UndefOr[Double] = js.native
}
object Boundary {
  
  @scala.inline
  def apply(): Boundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Boundary]
  }
  
  @scala.inline
  implicit class BoundaryOps[Self <: Boundary] (val x: Self) extends AnyVal {
    
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
    def setBoundaryVarargs(value: js.Array[Latitude]*): Self = this.set("boundary", js.Array(value :_*))
    
    @scala.inline
    def setBoundary(value: js.Array[js.Array[Latitude]]): Self = this.set("boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
    
    @scala.inline
    def setCachePolicy(value: String): Self = this.set("cachePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCachePolicy: Self = this.set("cachePolicy", js.undefined)
    
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    
    @scala.inline
    def setMapType(value: String): Self = this.set("mapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapType: Self = this.set("mapType", js.undefined)
    
    @scala.inline
    def setViewport(value: Hi): Self = this.set("viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewport: Self = this.set("viewport", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
