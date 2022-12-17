package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.BridgingHeader
import typings.expoConfigPlugins.anon.ProjectAny
import typings.expoConfigPlugins.anon.ProjectName
import typings.expoConfigPlugins.anon.ProjectProjectRoot
import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosSwiftMod {
  
  @JSImport("@expo/config-plugins/build/ios/Swift", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBridgingHeaderFile(param0: ProjectName): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBridgingHeaderFile")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def ensureSwiftBridgingHeaderSetup(param0: ProjectProjectRoot): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureSwiftBridgingHeaderSetup")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getDesignatedSwiftBridgingHeaderFileReference(param0: ProjectAny): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDesignatedSwiftBridgingHeaderFileReference")(param0.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def linkBridgingHeaderFile(param0: BridgingHeader): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("linkBridgingHeaderFile")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@expo/config-plugins/build/ios/Swift", "withNoopSwiftFile")
  @js.native
  val withNoopSwiftFile: ConfigPlugin[Unit] = js.native
  
  @JSImport("@expo/config-plugins/build/ios/Swift", "withSwiftBridgingHeader")
  @js.native
  val withSwiftBridgingHeader: ConfigPlugin[Unit] = js.native
}
