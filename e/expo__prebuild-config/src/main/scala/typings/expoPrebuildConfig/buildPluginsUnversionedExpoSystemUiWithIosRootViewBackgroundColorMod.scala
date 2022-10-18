package typings.expoPrebuildConfig

import typings.expoPrebuildConfig.anon.PickExpoConfigbackgroundC
import typings.expoPrebuildConfig.anon.PickExpoConfigiosbackgrou
import typings.expoPrebuildConfig.anon.PickExpoConfigsdkVersion
import typings.expoPrebuildConfig.anon.PickExpoConfigsdkVersionb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsUnversionedExpoSystemUiWithIosRootViewBackgroundColorMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-system-ui/withIosRootViewBackgroundColor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRootViewBackgroundColor(config: PickExpoConfigiosbackgrou): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootViewBackgroundColor")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def setRootViewBackgroundColor(
    config: PickExpoConfigbackgroundC,
    infoPlist: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InfoPlist */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setRootViewBackgroundColor")(config.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def shouldUseLegacyBehavior(config: PickExpoConfigsdkVersion): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldUseLegacyBehavior")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def warnSystemUIMissing(config: PickExpoConfigsdkVersionb): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warnSystemUIMissing")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-system-ui/withIosRootViewBackgroundColor", "withIosRootViewBackgroundColor")
  @js.native
  val withIosRootViewBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any = js.native
}
