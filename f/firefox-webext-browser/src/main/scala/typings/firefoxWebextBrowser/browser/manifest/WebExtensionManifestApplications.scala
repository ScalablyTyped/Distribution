package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestApplications extends StObject {
  
  var gecko: js.UndefOr[FirefoxSpecificProperties] = js.undefined
}
object WebExtensionManifestApplications {
  
  inline def apply(): WebExtensionManifestApplications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestApplications]
  }
  
  extension [Self <: WebExtensionManifestApplications](x: Self) {
    
    inline def setGecko(value: FirefoxSpecificProperties): Self = StObject.set(x, "gecko", value.asInstanceOf[js.Any])
    
    inline def setGeckoUndefined: Self = StObject.set(x, "gecko", js.undefined)
  }
}
