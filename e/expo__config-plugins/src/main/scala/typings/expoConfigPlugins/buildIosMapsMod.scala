package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.PickExpoConfigios
import typings.expoConfigPlugins.buildIosIosConfigDottypesMod.InfoPlist
import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import typings.expoConfigPlugins.buildUtilsGenerateCodeMod.MergeResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosMapsMod {
  
  @JSImport("@expo/config-plugins/build/ios/Maps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@expo/config-plugins/build/ios/Maps", "MATCH_INIT")
  @js.native
  val MATCH_INIT: js.RegExp = js.native
  
  inline def addGoogleMapsAppDelegateImport(src: String): MergeResults = ^.asInstanceOf[js.Dynamic].applyDynamic("addGoogleMapsAppDelegateImport")(src.asInstanceOf[js.Any]).asInstanceOf[MergeResults]
  
  inline def addGoogleMapsAppDelegateInit(src: String, apiKey: String): MergeResults = (^.asInstanceOf[js.Dynamic].applyDynamic("addGoogleMapsAppDelegateInit")(src.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[MergeResults]
  
  inline def addMapsCocoaPods(src: String): MergeResults = ^.asInstanceOf[js.Dynamic].applyDynamic("addMapsCocoaPods")(src.asInstanceOf[js.Any]).asInstanceOf[MergeResults]
  
  inline def getGoogleMapsApiKey(config: PickExpoConfigios): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getGoogleMapsApiKey")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def removeGoogleMapsAppDelegateImport(src: String): MergeResults = ^.asInstanceOf[js.Dynamic].applyDynamic("removeGoogleMapsAppDelegateImport")(src.asInstanceOf[js.Any]).asInstanceOf[MergeResults]
  
  inline def removeGoogleMapsAppDelegateInit(src: String): MergeResults = ^.asInstanceOf[js.Dynamic].applyDynamic("removeGoogleMapsAppDelegateInit")(src.asInstanceOf[js.Any]).asInstanceOf[MergeResults]
  
  inline def removeMapsCocoaPods(src: String): MergeResults = ^.asInstanceOf[js.Dynamic].applyDynamic("removeMapsCocoaPods")(src.asInstanceOf[js.Any]).asInstanceOf[MergeResults]
  
  inline def setGoogleMapsApiKey(config: PickExpoConfigios, hasGMSApiKeyInfoPlist: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setGoogleMapsApiKey")(config.asInstanceOf[js.Any], hasGMSApiKeyInfoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
  
  @JSImport("@expo/config-plugins/build/ios/Maps", "withMaps")
  @js.native
  val withMaps: ConfigPlugin[Unit] = js.native
}
