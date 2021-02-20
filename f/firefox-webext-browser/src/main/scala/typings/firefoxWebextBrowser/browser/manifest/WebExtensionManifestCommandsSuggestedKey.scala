package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebExtensionManifestCommandsSuggestedKey extends StObject {
  
  var default: js.UndefOr[KeyName] = js.native
  
  /** @deprecated Unknown platform name */
  var additionalProperties: js.UndefOr[String] = js.native
  
  var android: js.UndefOr[String] = js.native
  
  var chromeos: js.UndefOr[String] = js.native
  
  var ios: js.UndefOr[String] = js.native
  
  var linux: js.UndefOr[KeyName] = js.native
  
  var mac: js.UndefOr[KeyName] = js.native
  
  var windows: js.UndefOr[KeyName] = js.native
}
object WebExtensionManifestCommandsSuggestedKey {
  
  @scala.inline
  def apply(): WebExtensionManifestCommandsSuggestedKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestCommandsSuggestedKey]
  }
  
  @scala.inline
  implicit class WebExtensionManifestCommandsSuggestedKeyMutableBuilder[Self <: WebExtensionManifestCommandsSuggestedKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalProperties(value: String): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    @scala.inline
    def setAndroid(value: String): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    @scala.inline
    def setChromeos(value: String): Self = StObject.set(x, "chromeos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChromeosUndefined: Self = StObject.set(x, "chromeos", js.undefined)
    
    @scala.inline
    def setDefault(value: KeyName): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setIos(value: String): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    
    @scala.inline
    def setLinux(value: KeyName): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinuxUndefined: Self = StObject.set(x, "linux", js.undefined)
    
    @scala.inline
    def setMac(value: KeyName): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    
    @scala.inline
    def setWindows(value: KeyName): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsUndefined: Self = StObject.set(x, "windows", js.undefined)
  }
}
