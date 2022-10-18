package typings.expoPrebuildConfig

import typings.expoPrebuildConfig.anon.PickExpoConfigandroidNavi
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.`dark-content`
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.`light-content`
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.`sticky-immersive`
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.immersive
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.leanback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsUnversionedExpoNavigationBarWithAndroidNavigationBarMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-navigation-bar/withAndroidNavigationBar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNavigationBarColor(config: PickExpoConfigandroidNavi): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNavigationBarColor")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getNavigationBarImmersiveMode(config: PickExpoConfigandroidNavi): leanback | immersive | `sticky-immersive` | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNavigationBarImmersiveMode")(config.asInstanceOf[js.Any]).asInstanceOf[leanback | immersive | `sticky-immersive` | Null]
  
  inline def getNavigationBarStyle(config: PickExpoConfigandroidNavi): `light-content` | `dark-content` = ^.asInstanceOf[js.Dynamic].applyDynamic("getNavigationBarStyle")(config.asInstanceOf[js.Any]).asInstanceOf[`light-content` | `dark-content`]
  
  inline def setNavigationBarColors(
    config: PickExpoConfigandroidNavi,
    colors: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AndroidConfig.Resources.ResourceXML */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setNavigationBarColors")(config.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setNavigationBarStyles(
    config: PickExpoConfigandroidNavi,
    styles: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AndroidConfig.Resources.ResourceXML */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setNavigationBarStyles")(config.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-navigation-bar/withAndroidNavigationBar", "withNavigationBar")
  @js.native
  val withNavigationBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any = js.native
}
