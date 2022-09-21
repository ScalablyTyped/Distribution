package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the TaskUpdated event.
  */
trait ASPxClientGanttTaskUpdatedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Specifies the task key.
    */
  var key: Any
  
  /**
    * Specifies the task values.
    */
  var values: Any
}
object ASPxClientGanttTaskUpdatedEventArgs {
  
  inline def apply(key: Any, values: Any): ASPxClientGanttTaskUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttTaskUpdatedEventArgs]
  }
  
  extension [Self <: ASPxClientGanttTaskUpdatedEventArgs](x: Self) {
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
