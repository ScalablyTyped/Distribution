package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client events  concerned with column processing, and that allow the event's processing to be passed to the server side.
  */
trait ASPxClientGridViewColumnProcessingModeEventArgs
  extends StObject
     with ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets a grid column related to the event.
    */
  var column: ASPxClientGridViewColumn
}
object ASPxClientGridViewColumnProcessingModeEventArgs {
  
  inline def apply(column: ASPxClientGridViewColumn, processOnServer: Boolean): ASPxClientGridViewColumnProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewColumnProcessingModeEventArgs]
  }
  
  extension [Self <: ASPxClientGridViewColumnProcessingModeEventArgs](x: Self) {
    
    inline def setColumn(value: ASPxClientGridViewColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
