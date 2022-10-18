package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.BridgingHeader
import typings.expoConfigPlugins.anon.BridgingHeaderProject
import typings.expoConfigPlugins.anon.Project
import typings.expoConfigPlugins.anon.ProjectProjectRoot
import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosSwiftMod {
  
  @JSImport("@expo/config-plugins/build/ios/Swift", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBridgingHeaderFile(hasProjectRootProjectNameProjectBridgingHeader: BridgingHeader): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBridgingHeaderFile")(hasProjectRootProjectNameProjectBridgingHeader.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def ensureSwiftBridgingHeaderSetup(hasProjectRootProject: ProjectProjectRoot): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureSwiftBridgingHeaderSetup")(hasProjectRootProject.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getDesignatedSwiftBridgingHeaderFileReference(hasProject: Project): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDesignatedSwiftBridgingHeaderFileReference")(hasProject.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def linkBridgingHeaderFile(hasProjectBridgingHeader: BridgingHeaderProject): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("linkBridgingHeaderFile")(hasProjectBridgingHeader.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@expo/config-plugins/build/ios/Swift", "withNoopSwiftFile")
  @js.native
  val withNoopSwiftFile: ConfigPlugin[Unit] = js.native
  
  @JSImport("@expo/config-plugins/build/ios/Swift", "withSwiftBridgingHeader")
  @js.native
  val withSwiftBridgingHeader: ConfigPlugin[Unit] = js.native
}
