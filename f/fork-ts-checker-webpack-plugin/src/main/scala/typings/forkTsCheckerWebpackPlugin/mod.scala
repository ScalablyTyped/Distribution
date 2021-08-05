package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.Canceled
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginMod.ForkTsCheckerWebpackPlugin
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginOptionsMod.ForkTsCheckerWebpackPluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fork-ts-checker-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends ForkTsCheckerWebpackPlugin {
    def this(options: ForkTsCheckerWebpackPluginOptions) = this()
  }
  @JSImport("fork-ts-checker-webpack-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getCompilerHooks(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): Canceled = ^.asInstanceOf[js.Dynamic].applyDynamic("getCompilerHooks")(compiler.asInstanceOf[js.Any]).asInstanceOf[Canceled]
  
  /* static member */
  @JSImport("fork-ts-checker-webpack-plugin", "version")
  @js.native
  val version: String = js.native
}
