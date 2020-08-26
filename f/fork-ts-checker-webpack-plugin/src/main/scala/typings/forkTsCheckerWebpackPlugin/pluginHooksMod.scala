package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.Canceled
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/hooks/pluginHooks", JSImport.Namespace)
@js.native
object pluginHooksMod extends js.Object {
  def getForkTsCheckerWebpackPluginHooks(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.MultiCompiler */ js.Any
  ): Canceled = js.native
  type ForkTsCheckerWebpackPluginHooks = ReturnType[js.Function0[Canceled]]
}

