package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.Canceled
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginOptionsMod.ForkTsCheckerWebpackPluginOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/ForkTsCheckerWebpackPlugin", JSImport.Namespace)
@js.native
object forkTsCheckerWebpackPluginMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Plugin * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Plugin * / any */ @js.native
  class ForkTsCheckerWebpackPlugin () extends js.Object {
    def this(options: ForkTsCheckerWebpackPluginOptions) = this()
    val options: js.Any = js.native
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
  }
  
  /* static members */
  @js.native
  object ForkTsCheckerWebpackPlugin extends js.Object {
    val version: String = js.native
    def getCompilerHooks(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Canceled = js.native
  }
  
}

