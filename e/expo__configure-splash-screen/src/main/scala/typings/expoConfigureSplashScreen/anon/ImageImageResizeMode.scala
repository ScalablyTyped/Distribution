package typings.expoConfigureSplashScreen.anon

import typings.expoConfigureSplashScreen.constantsMod.SplashScreenImageResizeModeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageImageResizeMode extends StObject {
  
  var image: js.UndefOr[String] = js.undefined
  
  var imageResizeMode: js.UndefOr[SplashScreenImageResizeModeType] = js.undefined
}
object ImageImageResizeMode {
  
  inline def apply(): ImageImageResizeMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageImageResizeMode]
  }
  
  extension [Self <: ImageImageResizeMode](x: Self) {
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageResizeMode(value: SplashScreenImageResizeModeType): Self = StObject.set(x, "imageResizeMode", value.asInstanceOf[js.Any])
    
    inline def setImageResizeModeUndefined: Self = StObject.set(x, "imageResizeMode", js.undefined)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
