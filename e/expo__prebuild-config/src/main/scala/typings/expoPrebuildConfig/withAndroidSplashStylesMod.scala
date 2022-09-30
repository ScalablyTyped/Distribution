package typings.expoPrebuildConfig

import typings.expoConfigTypes.mod.ExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withAndroidSplashStylesMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/withAndroidSplashStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSplashBackgroundColor(config: ExpoConfig): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getSplashBackgroundColor")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getSplashDarkBackgroundColor(config: ExpoConfig): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getSplashDarkBackgroundColor")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def removeOldSplashStyleGroup(
    styles: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AndroidConfig.Resources.ResourceXML */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeOldSplashStyleGroup")(styles.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def setSplashColorsForTheme(
    colors: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AndroidConfig.Resources.ResourceXML */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setSplashColorsForTheme")(colors.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def setSplashColorsForTheme(
    colors: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AndroidConfig.Resources.ResourceXML */ Any,
    backgroundColor: String
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setSplashColorsForTheme")(colors.asInstanceOf[js.Any], backgroundColor.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setSplashStylesForTheme(
    styles: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AndroidConfig.Resources.ResourceXML */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setSplashStylesForTheme")(styles.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/withAndroidSplashStyles", "withAndroidSplashStyles")
  @js.native
  val withAndroidSplashStyles: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any = js.native
}
