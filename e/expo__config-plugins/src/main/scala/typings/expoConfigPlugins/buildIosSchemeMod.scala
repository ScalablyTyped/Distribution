package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.PartialPickExpoConfigsche
import typings.expoConfigPlugins.anon.Scheme
import typings.expoConfigPlugins.buildIosIosConfigDottypesMod.InfoPlist
import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosSchemeMod {
  
  @JSImport("@expo/config-plugins/build/ios/Scheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def appendScheme(scheme: String, infoPlist: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("appendScheme")(scheme.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
  inline def appendScheme(scheme: Null, infoPlist: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("appendScheme")(scheme.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
  
  inline def getScheme(config: Scheme): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScheme")(config.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getSchemesFromPlist(infoPlist: InfoPlist): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemesFromPlist")(infoPlist.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def hasScheme(scheme: String, infoPlist: InfoPlist): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasScheme")(scheme.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def removeScheme(scheme: String, infoPlist: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("removeScheme")(scheme.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
  inline def removeScheme(scheme: Null, infoPlist: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("removeScheme")(scheme.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
  
  inline def setScheme(config: PartialPickExpoConfigsche, infoPlist: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setScheme")(config.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
  
  @JSImport("@expo/config-plugins/build/ios/Scheme", "withScheme")
  @js.native
  val withScheme: ConfigPlugin[Unit] = js.native
}
