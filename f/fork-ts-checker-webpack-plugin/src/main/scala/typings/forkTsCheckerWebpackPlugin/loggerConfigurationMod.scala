package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.loggerMod.Logger
import typings.forkTsCheckerWebpackPlugin.loggerOptionsMod.LoggerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerConfigurationMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/logger/LoggerConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLoggerConfiguration(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): LoggerConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("createLoggerConfiguration")(compiler.asInstanceOf[js.Any]).asInstanceOf[LoggerConfiguration]
  inline def createLoggerConfiguration(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
    options: LoggerOptions
  ): LoggerConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("createLoggerConfiguration")(compiler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LoggerConfiguration]
  
  trait LoggerConfiguration extends StObject {
    
    var devServer: Boolean
    
    var infrastructure: Logger
    
    var issues: Logger
  }
  object LoggerConfiguration {
    
    inline def apply(devServer: Boolean, infrastructure: Logger, issues: Logger): LoggerConfiguration = {
      val __obj = js.Dynamic.literal(devServer = devServer.asInstanceOf[js.Any], infrastructure = infrastructure.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoggerConfiguration]
    }
    
    extension [Self <: LoggerConfiguration](x: Self) {
      
      inline def setDevServer(value: Boolean): Self = StObject.set(x, "devServer", value.asInstanceOf[js.Any])
      
      inline def setInfrastructure(value: Logger): Self = StObject.set(x, "infrastructure", value.asInstanceOf[js.Any])
      
      inline def setIssues(value: Logger): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    }
  }
}
