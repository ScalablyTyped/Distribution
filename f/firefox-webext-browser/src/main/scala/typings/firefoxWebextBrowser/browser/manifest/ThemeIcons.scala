package typings.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeIcons extends js.Object {
  
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
  implicit class ThemeIconsOps[Self <: ThemeIcons] (val x: Self) extends AnyVal {
    
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
    def setDark(value: ExtensionURL): Self = this.set("dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: ExtensionURL): Self = this.set("light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
