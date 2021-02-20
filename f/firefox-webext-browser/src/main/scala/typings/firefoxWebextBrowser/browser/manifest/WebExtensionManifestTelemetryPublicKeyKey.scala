package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebExtensionManifestTelemetryPublicKeyKey extends StObject {
  
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
  implicit class WebExtensionManifestTelemetryPublicKeyKeyMutableBuilder[Self <: WebExtensionManifestTelemetryPublicKeyKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrv(value: String): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrvUndefined: Self = StObject.set(x, "crv", js.undefined)
    
    @scala.inline
    def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKtyUndefined: Self = StObject.set(x, "kty", js.undefined)
    
    @scala.inline
    def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
