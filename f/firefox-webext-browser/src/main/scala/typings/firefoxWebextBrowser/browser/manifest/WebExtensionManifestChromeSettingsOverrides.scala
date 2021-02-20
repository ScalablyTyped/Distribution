package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebExtensionManifestChromeSettingsOverrides extends StObject {
  
  var homepage: js.UndefOr[String] = js.native
  
  var search_provider: js.UndefOr[WebExtensionManifestChromeSettingsOverridesSearchProvider] = js.native
}
object WebExtensionManifestChromeSettingsOverrides {
  
  @scala.inline
  def apply(): WebExtensionManifestChromeSettingsOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestChromeSettingsOverrides]
  }
  
  @scala.inline
  implicit class WebExtensionManifestChromeSettingsOverridesMutableBuilder[Self <: WebExtensionManifestChromeSettingsOverrides] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
    
    @scala.inline
    def setSearch_provider(value: WebExtensionManifestChromeSettingsOverridesSearchProvider): Self = StObject.set(x, "search_provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch_providerUndefined: Self = StObject.set(x, "search_provider", js.undefined)
  }
}
