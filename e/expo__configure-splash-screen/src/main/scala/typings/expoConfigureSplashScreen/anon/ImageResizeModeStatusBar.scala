package typings.expoConfigureSplashScreen.anon

import typings.expoConfigureSplashScreen.constantsMod.SplashScreenImageResizeModeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageResizeModeStatusBar extends StObject {
  
  var imageResizeMode: js.UndefOr[SplashScreenImageResizeModeType] = js.undefined
  
  var statusBar: js.UndefOr[`3`] = js.undefined
}
object ImageResizeModeStatusBar {
  
  inline def apply(): ImageResizeModeStatusBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageResizeModeStatusBar]
  }
  
  extension [Self <: ImageResizeModeStatusBar](x: Self) {
    
    inline def setImageResizeMode(value: SplashScreenImageResizeModeType): Self = StObject.set(x, "imageResizeMode", value.asInstanceOf[js.Any])
    
    inline def setImageResizeModeUndefined: Self = StObject.set(x, "imageResizeMode", js.undefined)
    
    inline def setStatusBar(value: `3`): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
    
    inline def setStatusBarUndefined: Self = StObject.set(x, "statusBar", js.undefined)
  }
}
