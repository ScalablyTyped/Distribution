package typings.expoConfigureSplashScreen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DarkModeImage extends js.Object {
  
  var darkMode: js.UndefOr[`2`] = js.native
  
  var image: js.UndefOr[String] = js.native
}
object DarkModeImage {
  
  @scala.inline
  def apply(): DarkModeImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DarkModeImage]
  }
  
  @scala.inline
  implicit class DarkModeImageOps[Self <: DarkModeImage] (val x: Self) extends AnyVal {
    
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
    def setDarkMode(value: `2`): Self = this.set("darkMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDarkMode: Self = this.set("darkMode", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
  }
}
