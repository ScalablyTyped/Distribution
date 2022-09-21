package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.Canceled
import typings.forkTsCheckerWebpackPlugin.pluginMod.ForkTsCheckerWebpackPlugin
import typings.forkTsCheckerWebpackPlugin.pluginOptionsMod.ForkTsCheckerWebpackPluginOptions
import typings.forkTsCheckerWebpackPlugin.poolMod.Pool
import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fork-ts-checker-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ () extends ForkTsCheckerWebpackPlugin {
    def this(options: ForkTsCheckerWebpackPluginOptions) = this()
  }
  @JSImport("fork-ts-checker-webpack-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("fork-ts-checker-webpack-plugin", "dependenciesPool")
  @js.native
  val dependenciesPool: Pool = js.native
  
  /* static member */
  inline def getCompilerHooks(compiler: Compiler): Canceled = ^.asInstanceOf[js.Dynamic].applyDynamic("getCompilerHooks")(compiler.asInstanceOf[js.Any]).asInstanceOf[Canceled]
  
  /**
    * Default pools for the plugin concurrency limit
    */
  /* static member */
  @JSImport("fork-ts-checker-webpack-plugin", "issuesPool")
  @js.native
  val issuesPool: Pool = js.native
  
  /**
    * @deprecated Use ForkTsCheckerWebpackPlugin.issuesPool instead
    */
  /* static member */
  @JSImport("fork-ts-checker-webpack-plugin", "pool")
  @js.native
  val pool: Pool = js.native
  
  /**
    * Current version of the plugin
    */
  /* static member */
  @JSImport("fork-ts-checker-webpack-plugin", "version")
  @js.native
  val version: String = js.native
}
