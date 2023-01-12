package typings.forgeViewer.Autodesk.Viewing.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuItem extends StObject {
  
  def target(): Unit | js.Array[MenuItem]
  
  var title: String
}
object MenuItem {
  
  inline def apply(target: () => Unit | js.Array[MenuItem], title: String): MenuItem = {
    val __obj = js.Dynamic.literal(target = js.Any.fromFunction0(target), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuItem] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: () => Unit | js.Array[MenuItem]): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
