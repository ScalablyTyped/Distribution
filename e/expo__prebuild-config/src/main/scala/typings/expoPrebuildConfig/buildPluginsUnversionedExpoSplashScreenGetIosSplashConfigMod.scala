package typings.expoPrebuildConfig

import typings.expoConfigTypes.mod.ExpoConfig
import typings.expoPrebuildConfig.anon.TabletBackgroundColor
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsUnversionedExpoSplashScreenGetIosSplashConfigMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/getIosSplashConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIosSplashConfig(config: ExpoConfig): IOSSplashConfig | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getIosSplashConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IOSSplashConfig | Null]
  
  type ExpoConfigIosSplash = NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@expo/config-types.@expo/config-types.IOS | undefined>['splash'] */ js.Any
  ]
  
  trait IOSSplashConfig extends StObject {
    
    var backgroundColor: String
    
    var dark: js.UndefOr[TabletBackgroundColor] = js.undefined
    
    var image: js.UndefOr[String | Null] = js.undefined
    
    var resizeMode: NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/getIosSplashConfig.ExpoConfigIosSplash['resizeMode'] */ js.Any
      ]
    
    var tabletBackgroundColor: String | Null
    
    var tabletImage: String | Null
  }
  object IOSSplashConfig {
    
    inline def apply(
      backgroundColor: String,
      resizeMode: NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/getIosSplashConfig.ExpoConfigIosSplash['resizeMode'] */ js.Any
        ]
    ): IOSSplashConfig = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], resizeMode = resizeMode.asInstanceOf[js.Any], tabletBackgroundColor = null, tabletImage = null)
      __obj.asInstanceOf[IOSSplashConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOSSplashConfig] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setDark(value: TabletBackgroundColor): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setResizeMode(
        value: NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/getIosSplashConfig.ExpoConfigIosSplash['resizeMode'] */ js.Any
            ]
      ): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
      
      inline def setTabletBackgroundColor(value: String): Self = StObject.set(x, "tabletBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setTabletBackgroundColorNull: Self = StObject.set(x, "tabletBackgroundColor", null)
      
      inline def setTabletImage(value: String): Self = StObject.set(x, "tabletImage", value.asInstanceOf[js.Any])
      
      inline def setTabletImageNull: Self = StObject.set(x, "tabletImage", null)
    }
  }
}
