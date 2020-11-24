package typings.esriLeaflet.mod.leafletAugmentingMod.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialReference extends js.Object {
  
  var wkid: js.UndefOr[Double] = js.native
  
  var wkt: js.UndefOr[String] = js.native
}
object SpatialReference {
  
  @scala.inline
  def apply(): SpatialReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpatialReference]
  }
  
  @scala.inline
  implicit class SpatialReferenceOps[Self <: SpatialReference] (val x: Self) extends AnyVal {
    
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
    def setWkid(value: Double): Self = this.set("wkid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWkid: Self = this.set("wkid", js.undefined)
    
    @scala.inline
    def setWkt(value: String): Self = this.set("wkt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWkt: Self = this.set("wkt", js.undefined)
  }
}
