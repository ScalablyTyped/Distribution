package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginConfigurationMod.ForkTsCheckerWebpackPluginConfiguration
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStateMod.ForkTsCheckerWebpackPluginState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/hooks/tapDoneToCollectRemoved", JSImport.Namespace)
@js.native
object tapDoneToCollectRemovedMod extends js.Object {
  def tapDoneToCollectRemoved(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
    configuration: ForkTsCheckerWebpackPluginConfiguration,
    state: ForkTsCheckerWebpackPluginState
  ): Unit = js.native
}

