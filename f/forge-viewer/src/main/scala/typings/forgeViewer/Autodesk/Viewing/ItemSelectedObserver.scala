package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemSelectedObserver extends StObject {
  
  def onItemSelected(viewer: Viewer3D): Unit
}
object ItemSelectedObserver {
  
  @scala.inline
  def apply(onItemSelected: Viewer3D => Unit): ItemSelectedObserver = {
    val __obj = js.Dynamic.literal(onItemSelected = js.Any.fromFunction1(onItemSelected))
    __obj.asInstanceOf[ItemSelectedObserver]
  }
  
  @scala.inline
  implicit class ItemSelectedObserverMutableBuilder[Self <: ItemSelectedObserver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnItemSelected(value: Viewer3D => Unit): Self = StObject.set(x, "onItemSelected", js.Any.fromFunction1(value))
  }
}
