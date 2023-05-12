package typings.falWorksEsbuildPluginGlobalExternals

import typings.esbuild.mod.Plugin
import typings.falWorksEsbuildPluginGlobalExternals.libModuleInfoMod.ModuleInfo
import typings.falWorksEsbuildPluginGlobalExternals.libWithRegExpMod.GlobalsMapper
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fal-works/esbuild-plugin-global-externals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: String */](globals: Record[T, String | ModuleInfo]): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(globals.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  inline def globalExternals[T /* <: String */](globals: Record[T, String | ModuleInfo]): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("globalExternals")(globals.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  inline def globalExternalsWithRegExp[T /* <: String */](globals: GlobalsMapper[T]): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("globalExternalsWithRegExp")(globals.asInstanceOf[js.Any]).asInstanceOf[Plugin]
}
