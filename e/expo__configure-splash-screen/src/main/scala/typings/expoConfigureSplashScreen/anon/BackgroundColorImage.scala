package typings.expoConfigureSplashScreen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColorImage extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[String] = js.undefined
}
object BackgroundColorImage {
  
  inline def apply(): BackgroundColorImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorImage]
  }
  
  extension [Self <: BackgroundColorImage](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
