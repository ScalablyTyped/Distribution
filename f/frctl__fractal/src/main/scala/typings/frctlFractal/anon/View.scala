package typings.frctlFractal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait View extends StObject {
  
  var handle: String
  
  var view: String
}
object View {
  
  @scala.inline
  def apply(handle: String, view: String): View = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
  
  @scala.inline
  implicit class ViewMutableBuilder[Self <: View] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
