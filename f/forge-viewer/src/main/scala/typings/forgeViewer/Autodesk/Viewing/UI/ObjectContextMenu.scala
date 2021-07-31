package typings.forgeViewer.Autodesk.Viewing.UI

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectContextMenu extends StObject {
  
  def buildMenu(event: Event, status: js.Object): js.Array[MenuItem]
  
  def hide(): Boolean
  
  def show(event: Event): Unit
}
object ObjectContextMenu {
  
  @scala.inline
  def apply(buildMenu: (Event, js.Object) => js.Array[MenuItem], hide: () => Boolean, show: Event => Unit): ObjectContextMenu = {
    val __obj = js.Dynamic.literal(buildMenu = js.Any.fromFunction2(buildMenu), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[ObjectContextMenu]
  }
  
  @scala.inline
  implicit class ObjectContextMenuMutableBuilder[Self <: ObjectContextMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildMenu(value: (Event, js.Object) => js.Array[MenuItem]): Self = StObject.set(x, "buildMenu", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHide(value: () => Boolean): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: Event => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
  }
}
