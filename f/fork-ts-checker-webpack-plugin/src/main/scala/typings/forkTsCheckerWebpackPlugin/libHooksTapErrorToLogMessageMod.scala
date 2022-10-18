package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.libPluginConfigMod.ForkTsCheckerWebpackPluginConfig
import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksTapErrorToLogMessageMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/hooks/tap-error-to-log-message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tapErrorToLogMessage(compiler: Compiler, config: ForkTsCheckerWebpackPluginConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tapErrorToLogMessage")(compiler.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
