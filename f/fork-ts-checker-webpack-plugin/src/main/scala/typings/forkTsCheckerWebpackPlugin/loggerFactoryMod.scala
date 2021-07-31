package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.loggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerFactoryMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/logger/LoggerFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createLogger(
    `type`: LoggerType,
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): Logger = (^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")(`type`.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any])).asInstanceOf[Logger]
  @scala.inline
  def createLogger(
    `type`: Logger,
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): Logger = (^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")(`type`.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any])).asInstanceOf[Logger]
  
  /* Rewritten from type alias, can be one of: 
    - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.console
    - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`webpack-infrastructure`
    - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.silent
  */
  trait LoggerType extends StObject
  object LoggerType {
    
    @scala.inline
    def console: typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.console = "console".asInstanceOf[typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.console]
    
    @scala.inline
    def silent: typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.silent = "silent".asInstanceOf[typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.silent]
    
    @scala.inline
    def `webpack-infrastructure`: typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`webpack-infrastructure` = "webpack-infrastructure".asInstanceOf[typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`webpack-infrastructure`]
  }
}
