package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`webpack-infrastructure`
import typings.forkTsCheckerWebpackPlugin.libFormatterFormatterOptionsMod.FormatterOptions
import typings.forkTsCheckerWebpackPlugin.libIssueIssueMod.Issue
import typings.forkTsCheckerWebpackPlugin.libIssueIssueOptionsMod.IssueOptions
import typings.forkTsCheckerWebpackPlugin.libLoggerMod.Logger
import typings.forkTsCheckerWebpackPlugin.libTypescriptTypeScriptWorkerOptionsMod.TypeScriptWorkerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPluginOptionsMod {
  
  trait ForkTsCheckerWebpackPluginOptions extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var devServer: js.UndefOr[Boolean] = js.undefined
    
    var formatter: js.UndefOr[FormatterOptions] = js.undefined
    
    var issue: js.UndefOr[IssueOptions] = js.undefined
    
    var logger: js.UndefOr[Logger | `webpack-infrastructure`] = js.undefined
    
    var typescript: js.UndefOr[TypeScriptWorkerOptions] = js.undefined
  }
  object ForkTsCheckerWebpackPluginOptions {
    
    inline def apply(): ForkTsCheckerWebpackPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForkTsCheckerWebpackPluginOptions]
    }
    
    extension [Self <: ForkTsCheckerWebpackPluginOptions](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setDevServer(value: Boolean): Self = StObject.set(x, "devServer", value.asInstanceOf[js.Any])
      
      inline def setDevServerUndefined: Self = StObject.set(x, "devServer", js.undefined)
      
      inline def setFormatter(value: FormatterOptions): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterFunction1(value: /* issue */ Issue => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setIssue(value: IssueOptions): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
      
      inline def setIssueUndefined: Self = StObject.set(x, "issue", js.undefined)
      
      inline def setLogger(value: Logger | `webpack-infrastructure`): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setTypescript(value: TypeScriptWorkerOptions): Self = StObject.set(x, "typescript", value.asInstanceOf[js.Any])
      
      inline def setTypescriptUndefined: Self = StObject.set(x, "typescript", js.undefined)
    }
  }
}
