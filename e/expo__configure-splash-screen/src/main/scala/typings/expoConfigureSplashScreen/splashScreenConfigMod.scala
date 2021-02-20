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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splashScreenConfigMod {
  
  @js.native
  trait AndroidSplashScreenConfig extends StObject {
    
    var backgroundColor: Color = js.native
    
    var darkMode: js.UndefOr[Image] = js.native
    
    var image: js.UndefOr[String] = js.native
    
    var imageResizeMode: js.UndefOr[SplashScreenImageResizeModeType] = js.native
    
    var statusBar: js.UndefOr[Style] = js.native
  }
  object AndroidSplashScreenConfig {
    
    @scala.inline
    def apply(backgroundColor: Color): AndroidSplashScreenConfig = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[AndroidSplashScreenConfig]
    }
    
    @scala.inline
    implicit class AndroidSplashScreenConfigMutableBuilder[Self <: AndroidSplashScreenConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkMode(value: Image): Self = StObject.set(x, "darkMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkModeUndefined: Self = StObject.set(x, "darkMode", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageResizeMode(value: SplashScreenImageResizeModeType): Self = StObject.set(x, "imageResizeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageResizeModeUndefined: Self = StObject.set(x, "imageResizeMode", js.undefined)
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setStatusBar(value: Style): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusBarUndefined: Self = StObject.set(x, "statusBar", js.undefined)
    }
  }
  
  @js.native
  trait AndroidSplashScreenConfigJSON extends StObject {
    
    var backgroundColor: String = js.native
    
    var darkMode: js.UndefOr[StatusBar] = js.native
    
    var image: js.UndefOr[String] = js.native
    
    var imageResizeMode: js.UndefOr[String] = js.native
    
    var statusBar: js.UndefOr[Translucent] = js.native
  }
  object AndroidSplashScreenConfigJSON {
    
    @scala.inline
    def apply(backgroundColor: String): AndroidSplashScreenConfigJSON = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[AndroidSplashScreenConfigJSON]
    }
    
    @scala.inline
    implicit class AndroidSplashScreenConfigJSONMutableBuilder[Self <: AndroidSplashScreenConfigJSON] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkMode(value: StatusBar): Self = StObject.set(x, "darkMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkModeUndefined: Self = StObject.set(x, "darkMode", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageResizeMode(value: String): Self = StObject.set(x, "imageResizeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageResizeModeUndefined: Self = StObject.set(x, "imageResizeMode", js.undefined)
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setStatusBar(value: Translucent): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusBarUndefined: Self = StObject.set(x, "statusBar", js.undefined)
    }
  }
  
  @js.native
  trait IosSplashScreenConfig extends StObject {
    
    var backgroundColor: Color = js.native
    
    var darkMode: js.UndefOr[BackgroundColor] = js.native
    
    var image: js.UndefOr[String] = js.native
    
    var imageResizeMode: js.UndefOr[SplashScreenImageResizeModeType] = js.native
    
    var statusBar: js.UndefOr[Hidden] = js.native
  }
  object IosSplashScreenConfig {
    
    @scala.inline
    def apply(backgroundColor: Color): IosSplashScreenConfig = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[IosSplashScreenConfig]
    }
    
    @scala.inline
    implicit class IosSplashScreenConfigMutableBuilder[Self <: IosSplashScreenConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkMode(value: BackgroundColor): Self = StObject.set(x, "darkMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkModeUndefined: Self = StObject.set(x, "darkMode", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageResizeMode(value: SplashScreenImageResizeModeType): Self = StObject.set(x, "imageResizeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageResizeModeUndefined: Self = StObject.set(x, "imageResizeMode", js.undefined)
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setStatusBar(value: Hidden): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusBarUndefined: Self = StObject.set(x, "statusBar", js.undefined)
    }
  }
  
  @js.native
  trait IosSplashScreenConfigJSON extends StObject {
    
    var backgroundColor: String = js.native
    
    var darkMode: js.UndefOr[BackgroundColorImage] = js.native
    
    var image: js.UndefOr[String] = js.native
    
    var imageResizeMode: js.UndefOr[String] = js.native
    
    var statusBar: js.UndefOr[HiddenStyle] = js.native
  }
  object IosSplashScreenConfigJSON {
    
    @scala.inline
    def apply(backgroundColor: String): IosSplashScreenConfigJSON = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[IosSplashScreenConfigJSON]
    }
    
    @scala.inline
    implicit class IosSplashScreenConfigJSONMutableBuilder[Self <: IosSplashScreenConfigJSON] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkMode(value: BackgroundColorImage): Self = StObject.set(x, "darkMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkModeUndefined: Self = StObject.set(x, "darkMode", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageResizeMode(value: String): Self = StObject.set(x, "imageResizeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageResizeModeUndefined: Self = StObject.set(x, "imageResizeMode", js.undefined)
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setStatusBar(value: HiddenStyle): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusBarUndefined: Self = StObject.set(x, "statusBar", js.undefined)
    }
  }
}
