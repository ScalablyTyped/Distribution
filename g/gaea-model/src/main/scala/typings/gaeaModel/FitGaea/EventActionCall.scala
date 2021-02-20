package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventActionCall extends StObject {
  
  var functionName: js.UndefOr[String] = js.native
}
object EventActionCall {
  
  @scala.inline
  def apply(): EventActionCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventActionCall]
  }
  
  @scala.inline
  implicit class EventActionCallMutableBuilder[Self <: EventActionCall] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
  }
}
