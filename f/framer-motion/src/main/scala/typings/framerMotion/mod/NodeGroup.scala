package typings.framerMotion.mod

import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeGroup extends StObject {
  
  def add(node: IProjectionNode[Any]): Unit
  
  var dirty: VoidFunction
  
  def remove(node: IProjectionNode[Any]): Unit
}
object NodeGroup {
  
  inline def apply(add: IProjectionNode[Any] => Unit, dirty: () => Unit, remove: IProjectionNode[Any] => Unit): NodeGroup = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), dirty = js.Any.fromFunction0(dirty), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[NodeGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeGroup] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: IProjectionNode[Any] => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setDirty(value: () => Unit): Self = StObject.set(x, "dirty", js.Any.fromFunction0(value))
    
    inline def setRemove(value: IProjectionNode[Any] => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
