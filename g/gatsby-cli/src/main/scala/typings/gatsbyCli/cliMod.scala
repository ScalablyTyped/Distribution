package typings.gatsbyCli

import typings.gatsbyCli.typesMod.IGatsbyCLIState
import typings.gatsbyCli.typesMod.ILog
import typings.react.mod.Component
import typings.react.mod.ErrorInfo
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cliMod {
  
  @JSImport("gatsby-cli/lib/reporter/loggers/ink/cli", JSImport.Default)
  @js.native
  open class default () extends CLI
  object default {
    
    @JSImport("gatsby-cli/lib/reporter/loggers/ink/cli", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getDerivedStateFromError(error: js.Error): ICLIState = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromError")(error.asInstanceOf[js.Any]).asInstanceOf[ICLIState]
  }
  
  @js.native
  trait CLI extends Component[ICLIProps, ICLIState, Any] {
    
    @JSName("componentDidCatch")
    def componentDidCatch_MCLI(error: js.Error, info: ErrorInfo): Unit = js.native
    
    var memoizedReactElementsForMessages: js.Array[ReactElement] = js.native
  }
  
  trait ICLIProps extends StObject {
    
    var logs: IGatsbyCLIState
    
    var messages: js.Array[ILog]
    
    var showPageTree: Boolean
    
    var showStatusBar: Boolean
  }
  object ICLIProps {
    
    inline def apply(logs: IGatsbyCLIState, messages: js.Array[ILog], showPageTree: Boolean, showStatusBar: Boolean): ICLIProps = {
      val __obj = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], showPageTree = showPageTree.asInstanceOf[js.Any], showStatusBar = showStatusBar.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICLIProps]
    }
    
    extension [Self <: ICLIProps](x: Self) {
      
      inline def setLogs(value: IGatsbyCLIState): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      inline def setMessages(value: js.Array[ILog]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: ILog*): Self = StObject.set(x, "messages", js.Array(value*))
      
      inline def setShowPageTree(value: Boolean): Self = StObject.set(x, "showPageTree", value.asInstanceOf[js.Any])
      
      inline def setShowStatusBar(value: Boolean): Self = StObject.set(x, "showStatusBar", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICLIState extends StObject {
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var hasError: Boolean
  }
  object ICLIState {
    
    inline def apply(hasError: Boolean): ICLIState = {
      val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICLIState]
    }
    
    extension [Self <: ICLIState](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
    }
  }
}
