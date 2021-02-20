package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.Canceled
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginOptionsMod.ForkTsCheckerWebpackPluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forkTsCheckerWebpackPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Plugin * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Plugin * / any */ @JSImport("fork-ts-checker-webpack-plugin/lib/ForkTsCheckerWebpackPlugin", "ForkTsCheckerWebpackPlugin")
  @js.native
  class ForkTsCheckerWebpackPlugin () extends StObject {
    def this(options: ForkTsCheckerWebpackPluginOptions) = this()
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
    
    val options: js.Any = js.native
  }
  object ForkTsCheckerWebpackPlugin {
    
    /* static member */
    @JSImport("fork-ts-checker-webpack-plugin/lib/ForkTsCheckerWebpackPlugin", "ForkTsCheckerWebpackPlugin.getCompilerHooks")
    @js.native
    def getCompilerHooks(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Canceled = js.native
    
    /* static member */
    @JSImport("fork-ts-checker-webpack-plugin/lib/ForkTsCheckerWebpackPlugin", "ForkTsCheckerWebpackPlugin.version")
    @js.native
    val version: String = js.native
  }
}
