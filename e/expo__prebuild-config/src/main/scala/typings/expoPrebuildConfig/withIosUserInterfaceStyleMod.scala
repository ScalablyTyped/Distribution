package typings.expoPrebuildConfig

import typings.expoPrebuildConfig.anon.PickExpoConfigiosuserInte
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withIosUserInterfaceStyleMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-system-ui/withIosUserInterfaceStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUserInterfaceStyle(config: PickExpoConfigiosuserInte): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserInterfaceStyle")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setUserInterfaceStyle(
    config: PickExpoConfigiosuserInte,
    hasUIUserInterfaceStyleInfoPlist: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InfoPlist */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserInterfaceStyle")(config.asInstanceOf[js.Any], hasUIUserInterfaceStyleInfoPlist.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-system-ui/withIosUserInterfaceStyle", "withIosUserInterfaceStyle")
  @js.native
  val withIosUserInterfaceStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config-plugins.ConfigPlugin<void> */ Any = js.native
}
