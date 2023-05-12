package typings.fullcalendarCore.anon

import typings.fullcalendarCore.internalCommonMod.ViewApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait View extends StObject {
  
  var view: ViewApi
}
object View {
  
  inline def apply(view: ViewApi): View = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: View] (val x: Self) extends AnyVal {
    
    inline def setView(value: ViewApi): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
