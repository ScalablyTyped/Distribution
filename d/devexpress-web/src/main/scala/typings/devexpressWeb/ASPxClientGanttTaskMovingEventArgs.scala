package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the TaskMoving event.
  */
trait ASPxClientGanttTaskMovingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Specifies the task key.
    */
  var key: Any
  
  /**
    * Specifies the task values after moving.
    */
  var newValues: Any
  
  /**
    * Specifies the task values.
    */
  var values: Any
}
object ASPxClientGanttTaskMovingEventArgs {
  
  inline def apply(cancel: Boolean, key: Any, newValues: Any, values: Any): ASPxClientGanttTaskMovingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], newValues = newValues.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttTaskMovingEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientGanttTaskMovingEventArgs] (val x: Self) extends AnyVal {
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNewValues(value: Any): Self = StObject.set(x, "newValues", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
