package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.PickExpoConfigios
import typings.expoConfigPlugins.anon.PickModPropsInfoPlistproj
import typings.expoConfigPlugins.anon.ProjectRoot
import typings.expoConfigPlugins.buildIosIosConfigDottypesMod.InfoPlist
import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import typings.expoConfigPlugins.buildPluginDottypesMod.ModProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosGoogleMod {
  
  @JSImport("@expo/config-plugins/build/ios/Google", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGoogleServicesFile(config: PickExpoConfigios): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getGoogleServicesFile")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getGoogleSignInReservedClientId(config: PickExpoConfigios, modRequest: PickModPropsInfoPlistproj): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getGoogleSignInReservedClientId")(config.asInstanceOf[js.Any], modRequest.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def setGoogleConfig(config: PickExpoConfigios, infoPlist: InfoPlist, modRequest: ModProps[InfoPlist]): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setGoogleConfig")(config.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any], modRequest.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
  
  inline def setGoogleServicesFile(config: PickExpoConfigios, hasProjectRootProject: ProjectRoot): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setGoogleServicesFile")(config.asInstanceOf[js.Any], hasProjectRootProject.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setGoogleSignInReservedClientId(config: PickExpoConfigios, infoPlist: InfoPlist, modRequest: PickModPropsInfoPlistproj): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setGoogleSignInReservedClientId")(config.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any], modRequest.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
  
  @JSImport("@expo/config-plugins/build/ios/Google", "withGoogle")
  @js.native
  val withGoogle: ConfigPlugin[Unit] = js.native
  
  @JSImport("@expo/config-plugins/build/ios/Google", "withGoogleServicesFile")
  @js.native
  val withGoogleServicesFile: ConfigPlugin[Unit] = js.native
}
