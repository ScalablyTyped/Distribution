package typings.esriLeaflet.mod.leafletAugmentingMod.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerOptionsBase extends js.Object {
  /**
    * URL of an ArcGIS API for JavaScript proxy or ArcGIS Resource Proxy to use for proxying requests.
    */
  var proxy: js.UndefOr[String] = js.native
  /**
    * Will use this token to authenticate all calls to the service.
    */
  var token: js.UndefOr[String] = js.native
  /**
    * URL of the Map Service
    */
  var url: String = js.native
  /**
    * Dictates if the service should use CORS when making GET requests.
    */
  var useCors: js.UndefOr[Boolean] = js.native
}

object LayerOptionsBase {
  @scala.inline
  def apply(url: String): LayerOptionsBase = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerOptionsBase]
  }
  @scala.inline
  implicit class LayerOptionsBaseOps[Self <: LayerOptionsBase] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    @scala.inline
    def setUseCors(value: Boolean): Self = this.set("useCors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCors: Self = this.set("useCors", js.undefined)
  }
  
}

