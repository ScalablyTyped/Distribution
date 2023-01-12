package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the ResourceUnassigning event.
  */
trait ASPxClientGanttResourceUnassigningEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Specifies the resource key.
    */
  var key: Any
  
  /**
    * Specifies the resource values.
    */
  var values: Any
}
object ASPxClientGanttResourceUnassigningEventArgs {
  
  inline def apply(cancel: Boolean, key: Any, values: Any): ASPxClientGanttResourceUnassigningEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttResourceUnassigningEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientGanttResourceUnassigningEventArgs] (val x: Self) extends AnyVal {
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
