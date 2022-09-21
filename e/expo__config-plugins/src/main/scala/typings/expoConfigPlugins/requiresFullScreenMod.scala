package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.PickExpoConfigios
import typings.expoConfigPlugins.anon.PickExpoConfigiossdkVersi
import typings.expoConfigPlugins.iosConfigTypesMod.InfoPlist
import typings.expoConfigPlugins.pluginTypesMod.ConfigPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requiresFullScreenMod {
  
  @JSImport("@expo/config-plugins/build/ios/RequiresFullScreen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRequiresFullScreen(config: PickExpoConfigiossdkVersi): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequiresFullScreen")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def setRequiresFullScreen(config: PickExpoConfigios, infoPlist: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setRequiresFullScreen")(config.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
  
  @JSImport("@expo/config-plugins/build/ios/RequiresFullScreen", "withRequiresFullScreen")
  @js.native
  val withRequiresFullScreen: ConfigPlugin[Unit] = js.native
}
