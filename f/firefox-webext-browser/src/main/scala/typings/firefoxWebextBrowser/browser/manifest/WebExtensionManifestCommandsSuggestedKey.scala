package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestCommandsSuggestedKey extends StObject {
  
  var default: js.UndefOr[KeyName] = js.undefined
  
  /** @deprecated Unknown platform name */
  var additionalProperties: js.UndefOr[String] = js.undefined
  
  var android: js.UndefOr[String] = js.undefined
  
  var chromeos: js.UndefOr[String] = js.undefined
  
  var ios: js.UndefOr[String] = js.undefined
  
  var linux: js.UndefOr[KeyName] = js.undefined
  
  var mac: js.UndefOr[KeyName] = js.undefined
  
  var windows: js.UndefOr[KeyName] = js.undefined
}
object WebExtensionManifestCommandsSuggestedKey {
  
  inline def apply(): WebExtensionManifestCommandsSuggestedKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestCommandsSuggestedKey]
  }
  
  extension [Self <: WebExtensionManifestCommandsSuggestedKey](x: Self) {
    
    inline def setAdditionalProperties(value: String): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    inline def setAndroid(value: String): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setChromeos(value: String): Self = StObject.set(x, "chromeos", value.asInstanceOf[js.Any])
    
    inline def setChromeosUndefined: Self = StObject.set(x, "chromeos", js.undefined)
    
    inline def setDefault(value: KeyName): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setIos(value: String): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    
    inline def setLinux(value: KeyName): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
    
    inline def setLinuxUndefined: Self = StObject.set(x, "linux", js.undefined)
    
    inline def setMac(value: KeyName): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    inline def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    
    inline def setWindows(value: KeyName): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
    
    inline def setWindowsUndefined: Self = StObject.set(x, "windows", js.undefined)
  }
}
