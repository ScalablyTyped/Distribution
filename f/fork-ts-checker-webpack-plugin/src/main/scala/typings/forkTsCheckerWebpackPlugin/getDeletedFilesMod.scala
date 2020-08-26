package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStateMod.ForkTsCheckerWebpackPluginState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/hooks/getDeletedFiles", JSImport.Namespace)
@js.native
object getDeletedFilesMod extends js.Object {
  def getDeletedFiles(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
    state: ForkTsCheckerWebpackPluginState
  ): js.Array[String] = js.native
}

