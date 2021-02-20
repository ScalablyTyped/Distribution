package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.loggerFactoryMod.LoggerType
import typings.forkTsCheckerWebpackPlugin.loggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerOptionsMod {
  
  @js.native
  trait LoggerOptions extends StObject {
    
    var devServer: js.UndefOr[Boolean] = js.native
    
    var infrastructure: js.UndefOr[LoggerType | Logger] = js.native
    
    var issues: js.UndefOr[LoggerType | Logger] = js.native
  }
  object LoggerOptions {
    
    @scala.inline
    def apply(): LoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerOptions]
    }
    
    @scala.inline
    implicit class LoggerOptionsMutableBuilder[Self <: LoggerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevServer(value: Boolean): Self = StObject.set(x, "devServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevServerUndefined: Self = StObject.set(x, "devServer", js.undefined)
      
      @scala.inline
      def setInfrastructure(value: LoggerType | Logger): Self = StObject.set(x, "infrastructure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfrastructureUndefined: Self = StObject.set(x, "infrastructure", js.undefined)
      
      @scala.inline
      def setIssues(value: LoggerType | Logger): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    }
  }
}
