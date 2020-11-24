package typings.expoConfigureSplashScreen.anon

import typings.expoConfigureSplashScreen.constantsMod.SplashScreenImageResizeModeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageResizeModeStatusBar extends js.Object {
  
  var imageResizeMode: js.UndefOr[SplashScreenImageResizeModeType] = js.native
  
  var statusBar: js.UndefOr[`3`] = js.native
}
object ImageResizeModeStatusBar {
  
  @scala.inline
  def apply(): ImageResizeModeStatusBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageResizeModeStatusBar]
  }
  
  @scala.inline
  implicit class ImageResizeModeStatusBarOps[Self <: ImageResizeModeStatusBar] (val x: Self) extends AnyVal {
    
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
    def setImageResizeMode(value: SplashScreenImageResizeModeType): Self = this.set("imageResizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageResizeMode: Self = this.set("imageResizeMode", js.undefined)
    
    @scala.inline
    def setStatusBar(value: `3`): Self = this.set("statusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusBar: Self = this.set("statusBar", js.undefined)
  }
}
