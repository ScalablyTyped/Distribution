package typings.falWorksEsbuildPluginGlobalExternals

import typings.falWorksEsbuildPluginGlobalExternals.libModuleInfoMod.NormalizedModuleInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOnLoadMod {
  
  @JSImport("@fal-works/esbuild-plugin-global-externals/lib/on-load", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createContents(moduleInfo: NormalizedModuleInfo): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createContents")(moduleInfo.asInstanceOf[js.Any]).asInstanceOf[String]
}
