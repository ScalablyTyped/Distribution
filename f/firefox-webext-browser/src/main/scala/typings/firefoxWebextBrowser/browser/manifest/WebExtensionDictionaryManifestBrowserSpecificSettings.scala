package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionDictionaryManifestBrowserSpecificSettings extends StObject {
  
  var edge: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var gecko: js.UndefOr[FirefoxSpecificProperties] = js.undefined
}
object WebExtensionDictionaryManifestBrowserSpecificSettings {
  
  @scala.inline
  def apply(): WebExtensionDictionaryManifestBrowserSpecificSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionDictionaryManifestBrowserSpecificSettings]
  }
  
  @scala.inline
  implicit class WebExtensionDictionaryManifestBrowserSpecificSettingsMutableBuilder[Self <: WebExtensionDictionaryManifestBrowserSpecificSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdge(value: StringDictionary[js.Any]): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
    
    @scala.inline
    def setGecko(value: FirefoxSpecificProperties): Self = StObject.set(x, "gecko", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeckoUndefined: Self = StObject.set(x, "gecko", js.undefined)
  }
}
