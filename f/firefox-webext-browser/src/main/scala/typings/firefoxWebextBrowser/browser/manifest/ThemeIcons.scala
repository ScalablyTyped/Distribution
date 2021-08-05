package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeIcons extends StObject {
  
  /** The dark icon to use for light themes */
  var dark: ExtensionURL
  
  /** A light icon to use for dark themes */
  var light: ExtensionURL
  
  /** The size of the icons */
  var size: Double
}
object ThemeIcons {
  
  inline def apply(dark: ExtensionURL, light: ExtensionURL, size: Double): ThemeIcons = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeIcons]
  }
  
  extension [Self <: ThemeIcons](x: Self) {
    
    inline def setDark(value: ExtensionURL): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setLight(value: ExtensionURL): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
