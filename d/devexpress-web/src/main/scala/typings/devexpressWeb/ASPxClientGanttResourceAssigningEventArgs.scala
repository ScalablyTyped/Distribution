package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the ResourceAssigning event.
  */
trait ASPxClientGanttResourceAssigningEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Specifies resource values.
    */
  var values: Any
}
object ASPxClientGanttResourceAssigningEventArgs {
  
  inline def apply(cancel: Boolean, values: Any): ASPxClientGanttResourceAssigningEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttResourceAssigningEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientGanttResourceAssigningEventArgs] (val x: Self) extends AnyVal {
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
