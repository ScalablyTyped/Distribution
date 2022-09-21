package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.typeScriptWorkerConfigMod.TypeScriptWorkerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeScriptSupportMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript/type-script-support", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertTypeScriptSupport(config: TypeScriptWorkerConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTypeScriptSupport")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
