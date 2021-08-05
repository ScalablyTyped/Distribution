package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientQueryBuilder.SaveCommandExecute event.
  */
trait ASPxClientQueryBuilderSaveCommandExecuteEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Specifies whether or not the event was handled.
    */
  var handled: Boolean
}
object ASPxClientQueryBuilderSaveCommandExecuteEventArgs {
  
  inline def apply(handled: Boolean): ASPxClientQueryBuilderSaveCommandExecuteEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientQueryBuilderSaveCommandExecuteEventArgs]
  }
  
  extension [Self <: ASPxClientQueryBuilderSaveCommandExecuteEventArgs](x: Self) {
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
  }
}
