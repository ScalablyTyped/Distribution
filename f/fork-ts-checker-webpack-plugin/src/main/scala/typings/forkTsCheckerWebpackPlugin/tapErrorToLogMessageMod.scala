package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginConfigurationMod.ForkTsCheckerWebpackPluginConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tapErrorToLogMessageMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/hooks/tapErrorToLogMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tapErrorToLogMessage(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
    configuration: ForkTsCheckerWebpackPluginConfiguration
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tapErrorToLogMessage")(compiler.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
