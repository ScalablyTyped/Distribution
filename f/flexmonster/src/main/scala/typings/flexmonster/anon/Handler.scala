package typings.flexmonster.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Handler extends StObject {
  
  var handler: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var label: String
}
object Handler {
  
  @scala.inline
  def apply(label: String): Handler = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler]
  }
  
  @scala.inline
  implicit class HandlerMutableBuilder[Self <: Handler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: () => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
