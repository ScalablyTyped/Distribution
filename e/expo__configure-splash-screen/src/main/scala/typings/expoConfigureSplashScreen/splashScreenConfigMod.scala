package typings.expoConfigureSplashScreen

import typings.colorString.mod.Color
import typings.expoConfigureSplashScreen.anon.BackgroundColor
import typings.expoConfigureSplashScreen.anon.BackgroundColorImage
import typings.expoConfigureSplashScreen.anon.Hidden
import typings.expoConfigureSplashScreen.anon.HiddenStyle
import typings.expoConfigureSplashScreen.anon.Image
import typings.expoConfigureSplashScreen.anon.StatusBar
import typings.expoConfigureSplashScreen.anon.Style
import typings.expoConfigureSplashScreen.anon.Translucent
import typings.expoConfigureSplashScreen.constantsMod.SplashScreenImageResizeModeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splashScreenConfigMod {
  
  trait AndroidSplashScreenConfig extends StObject {
    
    var backgroundColor: Color
    
    var darkMode: js.UndefOr[Image] = js.undefined
    
    var image: js.UndefOr[String] = js.undefined
    
    var imageResizeMode: js.UndefOr[SplashScreenImageResizeModeType] = js.undefined
    
    var statusBar: js.UndefOr[Style] = js.undefined
  }
  object AndroidSplashScreenConfig {
    
    inline def apply(backgroundColor: Color): AndroidSplashScreenConfig = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[AndroidSplashScreenConfig]
    }
    
    extension [Self <: AndroidSplashScreenConfig](x: Self) {
      
      inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setDarkMode(value: Image): Self = StObject.set(x, "darkMode", value.asInstanceOf[js.Any])
      
      inline def setDarkModeUndefined: Self = StObject.set(x, "darkMode", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageResizeMode(value: SplashScreenImageResizeModeType): Self = StObject.set(x, "imageResizeMode", value.asInstanceOf[js.Any])
      
      inline def setImageResizeModeUndefined: Self = StObject.set(x, "imageResizeMode", js.undefined)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setStatusBar(value: Style): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
      
      inline def setStatusBarUndefined: Self = StObject.set(x, "statusBar", js.undefined)
    }
  }
  
  trait AndroidSplashScreenConfigJSON extends StObject {
    
    var backgroundColor: String
    
    var darkMode: js.UndefOr[StatusBar] = js.undefined
    
    var image: js.UndefOr[String] = js.undefined
    
    var imageResizeMode: js.UndefOr[String] = js.undefined
    
    var statusBar: js.UndefOr[Translucent] = js.undefined
  }
  object AndroidSplashScreenConfigJSON {
    
    inline def apply(backgroundColor: String): AndroidSplashScreenConfigJSON = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[AndroidSplashScreenConfigJSON]
    }
    
    extension [Self <: AndroidSplashScreenConfigJSON](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setDarkMode(value: StatusBar): Self = StObject.set(x, "darkMode", value.asInstanceOf[js.Any])
      
      inline def setDarkModeUndefined: Self = StObject.set(x, "darkMode", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageResizeMode(value: String): Self = StObject.set(x, "imageResizeMode", value.asInstanceOf[js.Any])
      
      inline def setImageResizeModeUndefined: Self = StObject.set(x, "imageResizeMode", js.undefined)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setStatusBar(value: Translucent): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
      
      inline def setStatusBarUndefined: Self = StObject.set(x, "statusBar", js.undefined)
    }
  }
  
  trait IosSplashScreenConfig extends StObject {
    
    var backgroundColor: Color
    
    var darkMode: js.UndefOr[BackgroundColor] = js.undefined
    
    var image: js.UndefOr[String] = js.undefined
    
    var imageResizeMode: js.UndefOr[SplashScreenImageResizeModeType] = js.undefined
    
    var statusBar: js.UndefOr[Hidden] = js.undefined
  }
  object IosSplashScreenConfig {
    
    inline def apply(backgroundColor: Color): IosSplashScreenConfig = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[IosSplashScreenConfig]
    }
    
    extension [Self <: IosSplashScreenConfig](x: Self) {
      
      inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setDarkMode(value: BackgroundColor): Self = StObject.set(x, "darkMode", value.asInstanceOf[js.Any])
      
      inline def setDarkModeUndefined: Self = StObject.set(x, "darkMode", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageResizeMode(value: SplashScreenImageResizeModeType): Self = StObject.set(x, "imageResizeMode", value.asInstanceOf[js.Any])
      
      inline def setImageResizeModeUndefined: Self = StObject.set(x, "imageResizeMode", js.undefined)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setStatusBar(value: Hidden): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
      
      inline def setStatusBarUndefined: Self = StObject.set(x, "statusBar", js.undefined)
    }
  }
  
  trait IosSplashScreenConfigJSON extends StObject {
    
    var backgroundColor: String
    
    var darkMode: js.UndefOr[BackgroundColorImage] = js.undefined
    
    var image: js.UndefOr[String] = js.undefined
    
    var imageResizeMode: js.UndefOr[String] = js.undefined
    
    var statusBar: js.UndefOr[HiddenStyle] = js.undefined
  }
  object IosSplashScreenConfigJSON {
    
    inline def apply(backgroundColor: String): IosSplashScreenConfigJSON = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[IosSplashScreenConfigJSON]
    }
    
    extension [Self <: IosSplashScreenConfigJSON](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setDarkMode(value: BackgroundColorImage): Self = StObject.set(x, "darkMode", value.asInstanceOf[js.Any])
      
      inline def setDarkModeUndefined: Self = StObject.set(x, "darkMode", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageResizeMode(value: String): Self = StObject.set(x, "imageResizeMode", value.asInstanceOf[js.Any])
      
      inline def setImageResizeModeUndefined: Self = StObject.set(x, "imageResizeMode", js.undefined)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setStatusBar(value: HiddenStyle): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
      
      inline def setStatusBarUndefined: Self = StObject.set(x, "statusBar", js.undefined)
    }
  }
}
