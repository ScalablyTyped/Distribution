package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.esLintReporterOptionsMod.EsLintReporterOptions
import typings.forkTsCheckerWebpackPlugin.formatterOptionsMod.FormatterOptions
import typings.forkTsCheckerWebpackPlugin.issueOptionsMod.IssueOptions
import typings.forkTsCheckerWebpackPlugin.loggerOptionsMod.LoggerOptions
import typings.forkTsCheckerWebpackPlugin.typeScriptReporterOptionsMod.TypeScriptReporterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forkTsCheckerWebpackPluginOptionsMod {
  
  trait ForkTsCheckerWebpackPluginOptions extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var eslint: js.UndefOr[EsLintReporterOptions] = js.undefined
    
    var formatter: js.UndefOr[FormatterOptions] = js.undefined
    
    var issue: js.UndefOr[IssueOptions] = js.undefined
    
    var logger: js.UndefOr[LoggerOptions] = js.undefined
    
    var typescript: js.UndefOr[TypeScriptReporterOptions] = js.undefined
  }
  object ForkTsCheckerWebpackPluginOptions {
    
    inline def apply(): ForkTsCheckerWebpackPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForkTsCheckerWebpackPluginOptions]
    }
    
    extension [Self <: ForkTsCheckerWebpackPluginOptions](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setEslint(value: EsLintReporterOptions): Self = StObject.set(x, "eslint", value.asInstanceOf[js.Any])
      
      inline def setEslintUndefined: Self = StObject.set(x, "eslint", js.undefined)
      
      inline def setFormatter(value: FormatterOptions): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setIssue(value: IssueOptions): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
      
      inline def setIssueUndefined: Self = StObject.set(x, "issue", js.undefined)
      
      inline def setLogger(value: LoggerOptions): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setTypescript(value: TypeScriptReporterOptions): Self = StObject.set(x, "typescript", value.asInstanceOf[js.Any])
      
      inline def setTypescriptUndefined: Self = StObject.set(x, "typescript", js.undefined)
    }
  }
}
