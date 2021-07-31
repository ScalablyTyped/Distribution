package typings.gatsbyCli

import typings.gatsbyCli.typesMod.IGatsbyCLIState
import typings.react.mod.Component
import typings.react.mod.ErrorInfo
import typings.react.mod.ReactElement
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cliMod {
  
  @JSImport("gatsby-cli/lib/reporter/loggers/ink/cli", JSImport.Default)
  @js.native
  class default () extends CLI
  object default {
    
    @JSImport("gatsby-cli/lib/reporter/loggers/ink/cli", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def getDerivedStateFromError(error: Error): ICLIState = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromError")(error.asInstanceOf[js.Any]).asInstanceOf[ICLIState]
  }
  
  @js.native
  trait CLI
    extends Component[ICLIProps, ICLIState, js.Any] {
    
    @JSName("componentDidCatch")
    def componentDidCatch_MCLI(error: Error, info: ErrorInfo): Unit = js.native
    
    var memoizedReactElementsForMessages: js.Array[ReactElement] = js.native
  }
  
  trait ICLIProps extends StObject {
    
    var logs: IGatsbyCLIState
    
    var showStatusBar: Boolean
  }
  object ICLIProps {
    
    @scala.inline
    def apply(logs: IGatsbyCLIState, showStatusBar: Boolean): ICLIProps = {
      val __obj = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any], showStatusBar = showStatusBar.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICLIProps]
    }
    
    @scala.inline
    implicit class ICLIPropsMutableBuilder[Self <: ICLIProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogs(value: IGatsbyCLIState): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowStatusBar(value: Boolean): Self = StObject.set(x, "showStatusBar", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICLIState extends StObject {
    
    var error: js.UndefOr[Error] = js.undefined
    
    var hasError: Boolean
  }
  object ICLIState {
    
    @scala.inline
    def apply(hasError: Boolean): ICLIState = {
      val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICLIState]
    }
    
    @scala.inline
    implicit class ICLIStateMutableBuilder[Self <: ICLIState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
    }
  }
}
