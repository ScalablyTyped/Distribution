package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the DependencyInserted event.
  */
trait ASPxClientGanttDependencyInsertedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Specifies the dependency key.
    */
  var key: Any
  
  /**
    * Specifies the dependency values.
    */
  var values: Any
}
object ASPxClientGanttDependencyInsertedEventArgs {
  
  inline def apply(key: Any, values: Any): ASPxClientGanttDependencyInsertedEventArgs = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttDependencyInsertedEventArgs]
  }
  
  extension [Self <: ASPxClientGanttDependencyInsertedEventArgs](x: Self) {
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
