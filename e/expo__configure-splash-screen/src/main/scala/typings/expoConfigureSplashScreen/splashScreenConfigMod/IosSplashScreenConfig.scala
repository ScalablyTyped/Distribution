package typings.expoConfigureSplashScreen.splashScreenConfigMod

import typings.colorString.mod.Color
import typings.expoConfigureSplashScreen.anon.BackgroundColor
import typings.expoConfigureSplashScreen.anon.Hidden
import typings.expoConfigureSplashScreen.constantsMod.SplashScreenImageResizeModeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosSplashScreenConfig extends js.Object {
  
  var backgroundColor: Color = js.native
  
  var darkMode: js.UndefOr[BackgroundColor] = js.native
  
  var image: js.UndefOr[String] = js.native
  
  var imageResizeMode: js.UndefOr[SplashScreenImageResizeModeType] = js.native
  
  var statusBar: js.UndefOr[Hidden] = js.native
}
object IosSplashScreenConfig {
  
  @scala.inline
  def apply(backgroundColor: Color): IosSplashScreenConfig = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosSplashScreenConfig]
  }
  
  @scala.inline
  implicit class IosSplashScreenConfigOps[Self <: IosSplashScreenConfig] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: Color): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkMode(value: BackgroundColor): Self = this.set("darkMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDarkMode: Self = this.set("darkMode", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setImageResizeMode(value: SplashScreenImageResizeModeType): Self = this.set("imageResizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageResizeMode: Self = this.set("imageResizeMode", js.undefined)
    
    @scala.inline
    def setStatusBar(value: Hidden): Self = this.set("statusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusBar: Self = this.set("statusBar", js.undefined)
  }
}
