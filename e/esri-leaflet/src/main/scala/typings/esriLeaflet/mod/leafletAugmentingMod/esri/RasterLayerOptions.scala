package typings.esriLeaflet.mod.leafletAugmentingMod.esri

import typings.leaflet.mod.ImageOverlayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for RasterLayer
  */
@js.native
trait RasterLayerOptions extends ImageOverlayOptions {
  
  /**
    * Server response content type.
    * @default 'image'
    */
  var f: js.UndefOr[String] = js.native
  
  /**
    *     Closest zoom level the layer will be displayed on the map.
    */
  var maxZoom: js.UndefOr[Double] = js.native
  
  /**
    * Furthest zoom level the layer will be displayed on the map.
    */
  var minZoom: js.UndefOr[Double] = js.native
  
  /**
    * Position of the layer relative to other overlays.
    * @default 'front'
    */
  var position: js.UndefOr[String] = js.native
}
object RasterLayerOptions {
  
  @scala.inline
  def apply(): RasterLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterLayerOptions]
  }
  
  @scala.inline
  implicit class RasterLayerOptionsOps[Self <: RasterLayerOptions] (val x: Self) extends AnyVal {
    
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
    def setF(value: String): Self = this.set("f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteF: Self = this.set("f", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
