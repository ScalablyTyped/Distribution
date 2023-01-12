package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventActionCall extends StObject {
  
  var functionName: js.UndefOr[String] = js.undefined
}
object EventActionCall {
  
  inline def apply(): EventActionCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventActionCall]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventActionCall] (val x: Self) extends AnyVal {
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
  }
}
