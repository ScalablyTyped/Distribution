package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the EndCellEditing event.
  */
trait ASPxClientGanttEndCellEditingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Specifies the task key.
    */
  var key: Any
  
  /**
    * Specifies the task values.
    */
  var values: Any
}
object ASPxClientGanttEndCellEditingEventArgs {
  
  inline def apply(cancel: Boolean, key: Any, values: Any): ASPxClientGanttEndCellEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttEndCellEditingEventArgs]
  }
  
  extension [Self <: ASPxClientGanttEndCellEditingEventArgs](x: Self) {
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
