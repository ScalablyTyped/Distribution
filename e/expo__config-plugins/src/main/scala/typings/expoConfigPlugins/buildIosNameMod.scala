package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.PickExpoConfigname
import typings.expoConfigPlugins.buildIosIosConfigDottypesMod.InfoPlist
import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosNameMod {
  
  @JSImport("@expo/config-plugins/build/ios/Name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getName(config: PickExpoConfigname): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def setDisplayName(configOrName: String, param1: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setDisplayName")(configOrName.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
  inline def setDisplayName(configOrName: PickExpoConfigname, param1: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setDisplayName")(configOrName.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
  
  inline def setName(config: PickExpoConfigname, param1: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setName")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
  
  inline def setProductName(
    config: PickExpoConfigname,
    project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setProductName")(config.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@expo/config-plugins/build/ios/Name", "withDisplayName")
  @js.native
  val withDisplayName: ConfigPlugin[Unit] = js.native
  
  @JSImport("@expo/config-plugins/build/ios/Name", "withName")
  @js.native
  val withName: ConfigPlugin[Unit] = js.native
  
  @JSImport("@expo/config-plugins/build/ios/Name", "withProductName")
  @js.native
  val withProductName: ConfigPlugin[Unit] = js.native
}
