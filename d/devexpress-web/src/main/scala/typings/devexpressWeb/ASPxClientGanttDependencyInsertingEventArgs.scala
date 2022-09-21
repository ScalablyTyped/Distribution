package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the DependencyInserting event.
  */
trait ASPxClientGanttDependencyInsertingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Specifies the dependency values.
    */
  var values: Any
}
object ASPxClientGanttDependencyInsertingEventArgs {
  
  inline def apply(cancel: Boolean, values: Any): ASPxClientGanttDependencyInsertingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttDependencyInsertingEventArgs]
  }
  
  extension [Self <: ASPxClientGanttDependencyInsertingEventArgs](x: Self) {
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
