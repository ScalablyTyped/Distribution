package typings.expoConfigureSplashScreen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DarkModeImage extends StObject {
  
  var darkMode: js.UndefOr[`2`] = js.undefined
  
  var image: js.UndefOr[String] = js.undefined
}
object DarkModeImage {
  
  inline def apply(): DarkModeImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DarkModeImage]
  }
  
  extension [Self <: DarkModeImage](x: Self) {
    
    inline def setDarkMode(value: `2`): Self = StObject.set(x, "darkMode", value.asInstanceOf[js.Any])
    
    inline def setDarkModeUndefined: Self = StObject.set(x, "darkMode", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
