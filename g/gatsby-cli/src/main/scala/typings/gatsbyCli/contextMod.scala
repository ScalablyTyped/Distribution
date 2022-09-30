package typings.gatsbyCli

import org.scalablytyped.runtime.Shortcut
import typings.gatsbyCli.reporterTypesMod.IRenderPageArgs
import typings.gatsbyCli.typesMod.IGatsbyCLIState
import typings.gatsbyCli.typesMod.ILog
import typings.react.mod.Context
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod extends Shortcut {
  
  @JSImport("gatsby-cli/lib/reporter/loggers/ink/context", JSImport.Default)
  @js.native
  val default: Context[IStoreStateContext] = js.native
  
  @JSImport("gatsby-cli/lib/reporter/loggers/ink/context", "StoreStateProvider")
  @js.native
  val StoreStateProvider: FC[js.Object] = js.native
  
  trait IStoreStateContext extends StObject {
    
    var logs: IGatsbyCLIState
    
    var messages: js.Array[ILog]
    
    var pageTree: IRenderPageArgs | Null
  }
  object IStoreStateContext {
    
    inline def apply(logs: IGatsbyCLIState, messages: js.Array[ILog]): IStoreStateContext = {
      val __obj = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], pageTree = null)
      __obj.asInstanceOf[IStoreStateContext]
    }
    
    extension [Self <: IStoreStateContext](x: Self) {
      
      inline def setLogs(value: IGatsbyCLIState): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      inline def setMessages(value: js.Array[ILog]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: ILog*): Self = StObject.set(x, "messages", js.Array(value*))
      
      inline def setPageTree(value: IRenderPageArgs): Self = StObject.set(x, "pageTree", value.asInstanceOf[js.Any])
      
      inline def setPageTreeNull: Self = StObject.set(x, "pageTree", null)
    }
  }
  
  type _To = Context[IStoreStateContext]
  
  /* This means you don't have to write `default`, but can instead just say `contextMod.foo` */
  override def _to: Context[IStoreStateContext] = default
}
