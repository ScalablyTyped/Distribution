package typings.esriLeaflet.mod.leafletAugmentingMod.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for `L.esri.DynamicMapLayer`
  */
@js.native
trait DynamicMapLayerOptions
  extends RasterLayerOptions
     with LayerOptionsBase {
  
  /**
    * If enabled, appends a timestamp to each request to ensure a fresh image is created server-side.
    */
  var disableCache: js.UndefOr[Boolean] = js.native
  
  /**
    * JSON object literal used to manipulate the layer symbology defined in the service itself. Requires a 10.1
    * (or above) map service which supports dynamicLayers requests.
    */
  var dynamicLayers: js.UndefOr[js.Any] = js.native
  
  /**
    * Output format of the image.
    * @default 'png24'
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    *     SQL filters to define what features will be included in the image rendered by the service. An object is
    *     used with keys that map each query to its respective layer.
    *
    * { 3: "STATE_NAME='Kansas'", 9: "POP2007>25000" }
    */
  var layerDefs: js.UndefOr[js.Any] = js.native
  
  /**
    * An array of Layer IDs like [3,4,5] to show from the service.
    */
  var layers: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Allow the server to produce transparent images.
    */
  var transparent: js.UndefOr[Boolean] = js.native
}
object DynamicMapLayerOptions {
  
  @scala.inline
  def apply(url: String): DynamicMapLayerOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicMapLayerOptions]
  }
  
  @scala.inline
  implicit class DynamicMapLayerOptionsOps[Self <: DynamicMapLayerOptions] (val x: Self) extends AnyVal {
    
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
    def setDisableCache(value: Boolean): Self = this.set("disableCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableCache: Self = this.set("disableCache", js.undefined)
    
    @scala.inline
    def setDynamicLayers(value: js.Any): Self = this.set("dynamicLayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicLayers: Self = this.set("dynamicLayers", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setLayerDefs(value: js.Any): Self = this.set("layerDefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerDefs: Self = this.set("layerDefs", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: js.Any*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[_]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransparent: Self = this.set("transparent", js.undefined)
  }
}
