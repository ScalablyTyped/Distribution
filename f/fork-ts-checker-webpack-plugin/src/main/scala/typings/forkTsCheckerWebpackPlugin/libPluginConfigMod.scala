package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.libFormatterFormatterConfigMod.FormatterConfig
import typings.forkTsCheckerWebpackPlugin.libIssueIssueConfigMod.IssueConfig
import typings.forkTsCheckerWebpackPlugin.libIssueIssueMod.Issue
import typings.forkTsCheckerWebpackPlugin.libLoggerMod.Logger
import typings.forkTsCheckerWebpackPlugin.libPluginOptionsMod.ForkTsCheckerWebpackPluginOptions
import typings.forkTsCheckerWebpackPlugin.libTypescriptTypeScriptWorkerConfigMod.TypeScriptWorkerConfig
import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPluginConfigMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/plugin-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPluginConfig(compiler: Compiler): ForkTsCheckerWebpackPluginConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createPluginConfig")(compiler.asInstanceOf[js.Any]).asInstanceOf[ForkTsCheckerWebpackPluginConfig]
  inline def createPluginConfig(compiler: Compiler, options: ForkTsCheckerWebpackPluginOptions): ForkTsCheckerWebpackPluginConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("createPluginConfig")(compiler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ForkTsCheckerWebpackPluginConfig]
  
  trait ForkTsCheckerWebpackPluginConfig extends StObject {
    
    var async: Boolean
    
    var devServer: Boolean
    
    def formatter(issue: Issue): String
    @JSName("formatter")
    var formatter_Original: FormatterConfig
    
    var issue: IssueConfig
    
    var logger: Logger
    
    var typescript: TypeScriptWorkerConfig
  }
  object ForkTsCheckerWebpackPluginConfig {
    
    inline def apply(
      async: Boolean,
      devServer: Boolean,
      formatter: /* issue */ Issue => String,
      issue: IssueConfig,
      logger: Logger,
      typescript: TypeScriptWorkerConfig
    ): ForkTsCheckerWebpackPluginConfig = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], devServer = devServer.asInstanceOf[js.Any], formatter = js.Any.fromFunction1(formatter), issue = issue.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForkTsCheckerWebpackPluginConfig]
    }
    
    extension [Self <: ForkTsCheckerWebpackPluginConfig](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setDevServer(value: Boolean): Self = StObject.set(x, "devServer", value.asInstanceOf[js.Any])
      
      inline def setFormatter(value: /* issue */ Issue => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setIssue(value: IssueConfig): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setTypescript(value: TypeScriptWorkerConfig): Self = StObject.set(x, "typescript", value.asInstanceOf[js.Any])
    }
  }
}
