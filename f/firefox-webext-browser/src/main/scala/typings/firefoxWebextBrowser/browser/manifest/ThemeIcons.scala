package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeIcons extends StObject {
  
  /** The dark icon to use for light themes */
  var dark: ExtensionURL = js.native
  
  /** A light icon to use for dark themes */
  var light: ExtensionURL = js.native
  
  /** The size of the icons */
  var size: Double = js.native
}
object ThemeIcons {
  
  @scala.inline
  def apply(dark: ExtensionURL, light: ExtensionURL, size: Double): ThemeIcons = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeIcons]
  }
  
  @scala.inline
  implicit class ThemeIconsMutableBuilder[Self <: ThemeIcons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDark(value: ExtensionURL): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: ExtensionURL): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
