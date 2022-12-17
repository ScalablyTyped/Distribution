package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.Canceled
import typings.forkTsCheckerWebpackPlugin.libPluginOptionsMod.ForkTsCheckerWebpackPluginOptions
import typings.forkTsCheckerWebpackPlugin.libUtilsAsyncPoolMod.Pool
import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPluginMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/plugin", "ForkTsCheckerWebpackPlugin")
  @js.native
  open class ForkTsCheckerWebpackPlugin () extends StObject {
    def this(options: ForkTsCheckerWebpackPluginOptions) = this()
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    /* private */ val options: Any = js.native
  }
  object ForkTsCheckerWebpackPlugin {
    
    @JSImport("fork-ts-checker-webpack-plugin/lib/plugin", "ForkTsCheckerWebpackPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("fork-ts-checker-webpack-plugin/lib/plugin", "ForkTsCheckerWebpackPlugin.dependenciesPool")
    @js.native
    val dependenciesPool: Pool = js.native
    
    /* static member */
    inline def getCompilerHooks(compiler: Compiler): Canceled = ^.asInstanceOf[js.Dynamic].applyDynamic("getCompilerHooks")(compiler.asInstanceOf[js.Any]).asInstanceOf[Canceled]
    
    /**
      * Default pools for the plugin concurrency limit
      */
    /* static member */
    @JSImport("fork-ts-checker-webpack-plugin/lib/plugin", "ForkTsCheckerWebpackPlugin.issuesPool")
    @js.native
    val issuesPool: Pool = js.native
    
    /**
      * @deprecated Use ForkTsCheckerWebpackPlugin.issuesPool instead
      */
    /* static member */
    @JSImport("fork-ts-checker-webpack-plugin/lib/plugin", "ForkTsCheckerWebpackPlugin.pool")
    @js.native
    val pool: Pool = js.native
    
    /**
      * Current version of the plugin
      */
    /* static member */
    @JSImport("fork-ts-checker-webpack-plugin/lib/plugin", "ForkTsCheckerWebpackPlugin.version")
    @js.native
    val version: String = js.native
  }
}
