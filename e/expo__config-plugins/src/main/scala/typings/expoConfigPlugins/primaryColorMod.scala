package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.PickExpoConfigprimaryColo
import typings.expoConfigPlugins.pluginTypesMod.ConfigPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primaryColorMod {
  
  @JSImport("@expo/config-plugins/build/android/PrimaryColor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPrimaryColor(config: PickExpoConfigprimaryColo): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrimaryColor")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@expo/config-plugins/build/android/PrimaryColor", "withPrimaryColor")
  @js.native
  val withPrimaryColor: ConfigPlugin[Unit] = js.native
  
  @JSImport("@expo/config-plugins/build/android/PrimaryColor", "withPrimaryColorColors")
  @js.native
  val withPrimaryColorColors: ConfigPlugin[Unit] = js.native
  
  @JSImport("@expo/config-plugins/build/android/PrimaryColor", "withPrimaryColorStyles")
  @js.native
  val withPrimaryColorStyles: ConfigPlugin[Unit] = js.native
}
