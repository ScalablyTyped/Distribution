package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.loggerMod.Logger
import typings.forkTsCheckerWebpackPlugin.loggerOptionsMod.LoggerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerConfigurationMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/logger/LoggerConfiguration", "createLoggerConfiguration")
  @js.native
  def createLoggerConfiguration(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): LoggerConfiguration = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/logger/LoggerConfiguration", "createLoggerConfiguration")
  @js.native
  def createLoggerConfiguration(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
    options: LoggerOptions
  ): LoggerConfiguration = js.native
  
  @js.native
  trait LoggerConfiguration extends StObject {
    
    var devServer: Boolean = js.native
    
    var infrastructure: Logger = js.native
    
    var issues: Logger = js.native
  }
  object LoggerConfiguration {
    
    @scala.inline
    def apply(devServer: Boolean, infrastructure: Logger, issues: Logger): LoggerConfiguration = {
      val __obj = js.Dynamic.literal(devServer = devServer.asInstanceOf[js.Any], infrastructure = infrastructure.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoggerConfiguration]
    }
    
    @scala.inline
    implicit class LoggerConfigurationMutableBuilder[Self <: LoggerConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevServer(value: Boolean): Self = StObject.set(x, "devServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfrastructure(value: Logger): Self = StObject.set(x, "infrastructure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssues(value: Logger): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    }
  }
}
