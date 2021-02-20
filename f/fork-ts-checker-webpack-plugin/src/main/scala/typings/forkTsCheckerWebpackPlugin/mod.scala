package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.Canceled
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginMod.ForkTsCheckerWebpackPlugin
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginOptionsMod.ForkTsCheckerWebpackPluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fork-ts-checker-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends ForkTsCheckerWebpackPlugin {
    def this(options: ForkTsCheckerWebpackPluginOptions) = this()
  }
  
  /* static member */
  @JSImport("fork-ts-checker-webpack-plugin", "getCompilerHooks")
  @js.native
  def getCompilerHooks(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): Canceled = js.native
  
  /* static member */
  @JSImport("fork-ts-checker-webpack-plugin", "version")
  @js.native
  val version: String = js.native
}
