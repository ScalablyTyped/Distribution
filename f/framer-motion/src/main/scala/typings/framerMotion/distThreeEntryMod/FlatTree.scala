package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlatTree extends StObject {
  
  def add(child: WithDepth): Unit
  
  /* private */ var children: Any
  
  def forEach(callback: js.Function1[/* child */ WithDepth, Unit]): Unit
  
  /* private */ var isDirty: Any
  
  def remove(child: WithDepth): Unit
}
object FlatTree {
  
  inline def apply(
    add: WithDepth => Unit,
    children: Any,
    forEach: js.Function1[/* child */ WithDepth, Unit] => Unit,
    isDirty: Any,
    remove: WithDepth => Unit
  ): FlatTree = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), children = children.asInstanceOf[js.Any], forEach = js.Any.fromFunction1(forEach), isDirty = isDirty.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[FlatTree]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlatTree] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: WithDepth => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setForEach(value: js.Function1[/* child */ WithDepth, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    
    inline def setIsDirty(value: Any): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: WithDepth => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
