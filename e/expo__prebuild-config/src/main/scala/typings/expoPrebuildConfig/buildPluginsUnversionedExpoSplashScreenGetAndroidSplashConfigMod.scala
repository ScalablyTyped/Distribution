package typings.expoPrebuildConfig

import typings.expoPrebuildConfig.anon.PickExpoConfigsplashandro
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.contain
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.cover
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.native
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsUnversionedExpoSplashScreenGetAndroidSplashConfigMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/getAndroidSplashConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAndroidDarkSplashConfig(config: PickExpoConfigsplashandro): SplashScreenConfig | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAndroidDarkSplashConfig")(config.asInstanceOf[js.Any]).asInstanceOf[SplashScreenConfig | Null]
  
  inline def getAndroidSplashConfig(config: PickExpoConfigsplashandro): SplashScreenConfig | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAndroidSplashConfig")(config.asInstanceOf[js.Any]).asInstanceOf[SplashScreenConfig | Null]
  
  trait SplashScreenConfig extends StObject {
    
    var backgroundColor: String | Null
    
    var hdpi: String | Null
    
    var mdpi: String | Null
    
    var resizeMode: contain | cover | native
    
    var xhdpi: String | Null
    
    var xxhdpi: String | Null
    
    var xxxhdpi: String | Null
  }
  object SplashScreenConfig {
    
    inline def apply(resizeMode: contain | cover | native): SplashScreenConfig = {
      val __obj = js.Dynamic.literal(resizeMode = resizeMode.asInstanceOf[js.Any], backgroundColor = null, hdpi = null, mdpi = null, xhdpi = null, xxhdpi = null, xxxhdpi = null)
      __obj.asInstanceOf[SplashScreenConfig]
    }
    
    extension [Self <: SplashScreenConfig](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
      
      inline def setHdpi(value: String): Self = StObject.set(x, "hdpi", value.asInstanceOf[js.Any])
      
      inline def setHdpiNull: Self = StObject.set(x, "hdpi", null)
      
      inline def setMdpi(value: String): Self = StObject.set(x, "mdpi", value.asInstanceOf[js.Any])
      
      inline def setMdpiNull: Self = StObject.set(x, "mdpi", null)
      
      inline def setResizeMode(value: contain | cover | native): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
      
      inline def setXhdpi(value: String): Self = StObject.set(x, "xhdpi", value.asInstanceOf[js.Any])
      
      inline def setXhdpiNull: Self = StObject.set(x, "xhdpi", null)
      
      inline def setXxhdpi(value: String): Self = StObject.set(x, "xxhdpi", value.asInstanceOf[js.Any])
      
      inline def setXxhdpiNull: Self = StObject.set(x, "xxhdpi", null)
      
      inline def setXxxhdpi(value: String): Self = StObject.set(x, "xxxhdpi", value.asInstanceOf[js.Any])
      
      inline def setXxxhdpiNull: Self = StObject.set(x, "xxxhdpi", null)
    }
  }
}
