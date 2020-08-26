package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginConfigurationMod.ForkTsCheckerWebpackPluginConfiguration
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStateMod.ForkTsCheckerWebpackPluginState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/hooks/tapDoneToAsyncGetIssues", JSImport.Namespace)
@js.native
object tapDoneToAsyncGetIssuesMod extends js.Object {
  def tapDoneToAsyncGetIssues(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
    configuration: ForkTsCheckerWebpackPluginConfiguration,
    state: ForkTsCheckerWebpackPluginState
  ): Unit = js.native
}

