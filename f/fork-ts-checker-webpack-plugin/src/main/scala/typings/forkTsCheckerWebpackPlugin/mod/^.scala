package typings.forkTsCheckerWebpackPlugin.mod

import typings.forkTsCheckerWebpackPlugin.anon.Canceled
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginMod.ForkTsCheckerWebpackPlugin
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginOptionsMod.ForkTsCheckerWebpackPluginOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin", JSImport.Namespace)
@js.native
class ^ () extends ForkTsCheckerWebpackPlugin {
  def this(options: ForkTsCheckerWebpackPluginOptions) = this()
}

@JSImport("fork-ts-checker-webpack-plugin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: String = js.native
  def getCompilerHooks(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): Canceled = js.native
}

