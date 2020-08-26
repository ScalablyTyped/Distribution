package typings.esriLeaflet.mod.leafletAugmentingMod.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for `L.esri.Service`
  */
@js.native
trait ServiceOptions extends js.Object {
  /**
    * URL of an ArcGIS API for JavaScript proxy or ArcGIS Resource Proxy to use for proxying POST requests.
    */
  var proxy: js.UndefOr[String] = js.native
  /**
    * Operation timeout
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * URL of the ArcGIS service you would like to consume.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * If this service should use CORS when making GET requests.
    */
  var useCors: js.UndefOr[Boolean] = js.native
}

object ServiceOptions {
  @scala.inline
  def apply(): ServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceOptions]
  }
  @scala.inline
  implicit class ServiceOptionsOps[Self <: ServiceOptions] (val x: Self) extends AnyVal {
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
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUseCors(value: Boolean): Self = this.set("useCors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCors: Self = this.set("useCors", js.undefined)
  }
  
}

