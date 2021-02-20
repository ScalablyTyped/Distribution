package typings.expoConfigureSplashScreen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DarkModeImage extends StObject {
  
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
  implicit class DarkModeImageMutableBuilder[Self <: DarkModeImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDarkMode(value: `2`): Self = StObject.set(x, "darkMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkModeUndefined: Self = StObject.set(x, "darkMode", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
