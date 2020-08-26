package typings.esriLeaflet.mod.leafletAugmentingMod.esri

import typings.leaflet.mod.TileLayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for `L.esri.BasemapLayer`
  */
@js.native
trait BasemapLayerOptions extends TileLayerOptions {
  /**
    *     Will use this token to authenticate all calls to the service.
    *
    */
  var token: js.UndefOr[String] = js.native
}

object BasemapLayerOptions {
  @scala.inline
  def apply(): BasemapLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasemapLayerOptions]
  }
  @scala.inline
  implicit class BasemapLayerOptionsOps[Self <: BasemapLayerOptions] (val x: Self) extends AnyVal {
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
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
  
}

