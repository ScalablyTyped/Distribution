package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the TaskInserting event.
  */
trait ASPxClientGanttTaskInsertingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Specifies the task values.
    */
  var values: Any
}
object ASPxClientGanttTaskInsertingEventArgs {
  
  inline def apply(cancel: Boolean, values: Any): ASPxClientGanttTaskInsertingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttTaskInsertingEventArgs]
  }
  
  extension [Self <: ASPxClientGanttTaskInsertingEventArgs](x: Self) {
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
