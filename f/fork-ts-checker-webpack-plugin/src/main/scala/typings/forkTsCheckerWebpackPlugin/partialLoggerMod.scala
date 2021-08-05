package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.loggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partialLoggerMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/logger/PartialLogger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPartialLogger(methods: js.Array[LoggerMethods], logger: Logger): Logger = (^.asInstanceOf[js.Dynamic].applyDynamic("createPartialLogger")(methods.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[Logger]
  
  /* Rewritten from type alias, can be one of: 
    - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.info
    - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.log
    - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.error
  */
  trait LoggerMethods extends StObject
  object LoggerMethods {
    
    inline def error: typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.error = "error".asInstanceOf[typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.error]
    
    inline def info: typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.info = "info".asInstanceOf[typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.info]
    
    inline def log: typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.log = "log".asInstanceOf[typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.log]
  }
}
