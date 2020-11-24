package typings.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebExtensionManifestTelemetryPublicKeyKey extends js.Object {
  
  var crv: js.UndefOr[String] = js.native
  
  var kty: js.UndefOr[String] = js.native
  
  var x: js.UndefOr[String] = js.native
  
  var y: js.UndefOr[String] = js.native
}
object WebExtensionManifestTelemetryPublicKeyKey {
  
  @scala.inline
  def apply(): WebExtensionManifestTelemetryPublicKeyKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestTelemetryPublicKeyKey]
  }
  
  @scala.inline
  implicit class WebExtensionManifestTelemetryPublicKeyKeyOps[Self <: WebExtensionManifestTelemetryPublicKeyKey] (val x: Self) extends AnyVal {
    
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
    def setCrv(value: String): Self = this.set("crv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrv: Self = this.set("crv", js.undefined)
    
    @scala.inline
    def setKty(value: String): Self = this.set("kty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKty: Self = this.set("kty", js.undefined)
    
    @scala.inline
    def setX(value: String): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: String): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
