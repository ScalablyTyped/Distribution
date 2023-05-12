package typings.falWorksEsbuildPluginGlobalExternals

import typings.esbuild.mod.Plugin
import typings.falWorksEsbuildPluginGlobalExternals.libModuleInfoMod.ModuleInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWithObjectMod {
  
  @JSImport("@fal-works/esbuild-plugin-global-externals/lib/with-object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def globalExternals[T /* <: String */](globals: Record[T, String | ModuleInfo]): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("globalExternals")(globals.asInstanceOf[js.Any]).asInstanceOf[Plugin]
}
