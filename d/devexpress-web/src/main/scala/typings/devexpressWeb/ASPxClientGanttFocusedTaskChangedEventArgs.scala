package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the FocusedTaskChanged event.
  */
trait ASPxClientGanttFocusedTaskChangedEventArgs
  extends StObject
     with ASPxClientProcessingModeEventArgs {
  
  /**
    * Returns the task key.
    */
  var key: Any
  
  /**
    * Returns the task data.
    */
  var values: Any
}
object ASPxClientGanttFocusedTaskChangedEventArgs {
  
  inline def apply(key: Any, processOnServer: Boolean, values: Any): ASPxClientGanttFocusedTaskChangedEventArgs = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttFocusedTaskChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientGanttFocusedTaskChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
