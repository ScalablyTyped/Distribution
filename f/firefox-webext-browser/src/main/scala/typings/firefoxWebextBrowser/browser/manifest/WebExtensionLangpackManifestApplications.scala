package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebExtensionLangpackManifestApplications extends StObject {
  
  var gecko: js.UndefOr[FirefoxSpecificProperties] = js.native
}
object WebExtensionLangpackManifestApplications {
  
  @scala.inline
  def apply(): WebExtensionLangpackManifestApplications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionLangpackManifestApplications]
  }
  
  @scala.inline
  implicit class WebExtensionLangpackManifestApplicationsMutableBuilder[Self <: WebExtensionLangpackManifestApplications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGecko(value: FirefoxSpecificProperties): Self = StObject.set(x, "gecko", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeckoUndefined: Self = StObject.set(x, "gecko", js.undefined)
  }
}
