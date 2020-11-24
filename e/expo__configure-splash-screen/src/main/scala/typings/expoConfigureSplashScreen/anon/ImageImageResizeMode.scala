package typings.expoConfigureSplashScreen.anon

import typings.expoConfigureSplashScreen.constantsMod.SplashScreenImageResizeModeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageImageResizeMode extends js.Object {
  
  var image: js.UndefOr[String] = js.native
  
  var imageResizeMode: js.UndefOr[SplashScreenImageResizeModeType] = js.native
}
object ImageImageResizeMode {
  
  @scala.inline
  def apply(): ImageImageResizeMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageImageResizeMode]
  }
  
  @scala.inline
  implicit class ImageImageResizeModeOps[Self <: ImageImageResizeMode] (val x: Self) extends AnyVal {
    
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
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setImageResizeMode(value: SplashScreenImageResizeModeType): Self = this.set("imageResizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageResizeMode: Self = this.set("imageResizeMode", js.undefined)
  }
}
