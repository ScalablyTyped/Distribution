package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the ResourceAssigned event.
  */
trait ASPxClientGanttResourceAssignedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Specifies the resource assignment key.
    */
  var key: Any
  
  /**
    * Specifies the resource values.
    */
  var values: Any
}
object ASPxClientGanttResourceAssignedEventArgs {
  
  inline def apply(key: Any, values: Any): ASPxClientGanttResourceAssignedEventArgs = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttResourceAssignedEventArgs]
  }
  
  extension [Self <: ASPxClientGanttResourceAssignedEventArgs](x: Self) {
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
