package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextMenuItem extends StObject {
  
  def target(): Unit
  
  var title: String
}
object ContextMenuItem {
  
  inline def apply(target: () => Unit, title: String): ContextMenuItem = {
    val __obj = js.Dynamic.literal(target = js.Any.fromFunction0(target), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextMenuItem] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: () => Unit): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
