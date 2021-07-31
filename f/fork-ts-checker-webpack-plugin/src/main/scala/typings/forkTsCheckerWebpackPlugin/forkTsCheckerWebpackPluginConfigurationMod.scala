package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.esLintReporterConfigurationMod.EsLintReporterConfiguration
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginOptionsMod.ForkTsCheckerWebpackPluginOptions
import typings.forkTsCheckerWebpackPlugin.formatterConfigurationMod.FormatterConfiguration
import typings.forkTsCheckerWebpackPlugin.issueConfigurationMod.IssueConfiguration
import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.forkTsCheckerWebpackPlugin.loggerConfigurationMod.LoggerConfiguration
import typings.forkTsCheckerWebpackPlugin.typeScriptReporterConfigurationMod.TypeScriptReporterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forkTsCheckerWebpackPluginConfigurationMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/ForkTsCheckerWebpackPluginConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createForkTsCheckerWebpackPluginConfiguration(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): ForkTsCheckerWebpackPluginConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("createForkTsCheckerWebpackPluginConfiguration")(compiler.asInstanceOf[js.Any]).asInstanceOf[ForkTsCheckerWebpackPluginConfiguration]
  @scala.inline
  def createForkTsCheckerWebpackPluginConfiguration(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
    options: ForkTsCheckerWebpackPluginOptions
  ): ForkTsCheckerWebpackPluginConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("createForkTsCheckerWebpackPluginConfiguration")(compiler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ForkTsCheckerWebpackPluginConfiguration]
  
  trait ForkTsCheckerWebpackPluginConfiguration extends StObject {
    
    var async: Boolean
    
    var eslint: EsLintReporterConfiguration
    
    def formatter(issue: Issue): String
    @JSName("formatter")
    var formatter_Original: FormatterConfiguration
    
    var issue: IssueConfiguration
    
    var logger: LoggerConfiguration
    
    var typescript: TypeScriptReporterConfiguration
  }
  object ForkTsCheckerWebpackPluginConfiguration {
    
    @scala.inline
    def apply(
      async: Boolean,
      eslint: EsLintReporterConfiguration,
      formatter: /* issue */ Issue => String,
      issue: IssueConfiguration,
      logger: LoggerConfiguration,
      typescript: TypeScriptReporterConfiguration
    ): ForkTsCheckerWebpackPluginConfiguration = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], eslint = eslint.asInstanceOf[js.Any], formatter = js.Any.fromFunction1(formatter), issue = issue.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForkTsCheckerWebpackPluginConfiguration]
    }
    
    @scala.inline
    implicit class ForkTsCheckerWebpackPluginConfigurationMutableBuilder[Self <: ForkTsCheckerWebpackPluginConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEslint(value: EsLintReporterConfiguration): Self = StObject.set(x, "eslint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatter(value: /* issue */ Issue => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIssue(value: IssueConfiguration): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogger(value: LoggerConfiguration): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypescript(value: TypeScriptReporterConfiguration): Self = StObject.set(x, "typescript", value.asInstanceOf[js.Any])
    }
  }
}
