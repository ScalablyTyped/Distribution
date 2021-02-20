package typings.expoConfigureSplashScreen.anon

import typings.expoConfigureSplashScreen.constantsMod.SplashScreenImageResizeModeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageResizeModeStatusBar extends StObject {
  
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
  implicit class ImageResizeModeStatusBarMutableBuilder[Self <: ImageResizeModeStatusBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageResizeMode(value: SplashScreenImageResizeModeType): Self = StObject.set(x, "imageResizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageResizeModeUndefined: Self = StObject.set(x, "imageResizeMode", js.undefined)
    
    @scala.inline
    def setStatusBar(value: `3`): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarUndefined: Self = StObject.set(x, "statusBar", js.undefined)
  }
}
