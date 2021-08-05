package typings.expoConfigureSplashScreen.anon

import typings.expoConfigureSplashScreen.constantsMod.SplashScreenImageResizeModeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageResizeMode extends StObject {
  
  var imageResizeMode: js.UndefOr[SplashScreenImageResizeModeType] = js.undefined
}
object ImageResizeMode {
  
  inline def apply(): ImageResizeMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageResizeMode]
  }
  
  extension [Self <: ImageResizeMode](x: Self) {
    
    inline def setImageResizeMode(value: SplashScreenImageResizeModeType): Self = StObject.set(x, "imageResizeMode", value.asInstanceOf[js.Any])
    
    inline def setImageResizeModeUndefined: Self = StObject.set(x, "imageResizeMode", js.undefined)
  }
}
