package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllDayContentArg extends StObject {
  
  var text: String
  
  var view: ViewApi
}
object AllDayContentArg {
  
  inline def apply(text: String, view: ViewApi): AllDayContentArg = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDayContentArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllDayContentArg] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setView(value: ViewApi): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
