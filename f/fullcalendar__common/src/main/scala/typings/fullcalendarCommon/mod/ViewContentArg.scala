package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewContentArg extends StObject {
  
  var view: ViewApi
}
object ViewContentArg {
  
  inline def apply(view: ViewApi): ViewContentArg = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewContentArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewContentArg] (val x: Self) extends AnyVal {
    
    inline def setView(value: ViewApi): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
