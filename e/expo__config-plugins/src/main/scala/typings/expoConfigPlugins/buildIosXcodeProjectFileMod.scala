package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.FileContents
import typings.expoConfigPlugins.anon.FilePath_
import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosXcodeProjectFileMod {
  
  @JSImport("@expo/config-plugins/build/ios/XcodeProjectFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBuildSourceFile(param0: FileContents): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuildSourceFile")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@expo/config-plugins/build/ios/XcodeProjectFile", "withBuildSourceFile")
  @js.native
  val withBuildSourceFile: ConfigPlugin[FilePath_] = js.native
}
