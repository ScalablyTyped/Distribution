package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginConfigurationMod.ForkTsCheckerWebpackPluginConfiguration
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStateMod.ForkTsCheckerWebpackPluginState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/hooks/tapAfterCompileToGetIssues", JSImport.Namespace)
@js.native
object tapAfterCompileToGetIssuesMod extends js.Object {
  
  def tapAfterCompileToGetIssues(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
    configuration: ForkTsCheckerWebpackPluginConfiguration,
    state: ForkTsCheckerWebpackPluginState
  ): Unit = js.native
}
