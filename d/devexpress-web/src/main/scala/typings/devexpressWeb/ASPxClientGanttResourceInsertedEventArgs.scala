package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the ResourceInserted event.
  */
trait ASPxClientGanttResourceInsertedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Specified the resource key.
    */
  var key: Any
  
  /**
    * Specifies the resource values.
    */
  var values: Any
}
object ASPxClientGanttResourceInsertedEventArgs {
  
  inline def apply(key: Any, values: Any): ASPxClientGanttResourceInsertedEventArgs = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttResourceInsertedEventArgs]
  }
  
  extension [Self <: ASPxClientGanttResourceInsertedEventArgs](x: Self) {
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
