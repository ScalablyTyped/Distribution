package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumerateCallbacks[T] extends StObject {
  
  def onComplete(): Unit
  
  def onMatch(item: T): Unit | EnumerateAction
}
object EnumerateCallbacks {
  
  inline def apply[T](onComplete: () => Unit, onMatch: T => Unit | EnumerateAction): EnumerateCallbacks[T] = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onMatch = js.Any.fromFunction1(onMatch))
    __obj.asInstanceOf[EnumerateCallbacks[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumerateCallbacks[?], T] (val x: Self & EnumerateCallbacks[T]) extends AnyVal {
    
    inline def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
    
    inline def setOnMatch(value: T => Unit | EnumerateAction): Self = StObject.set(x, "onMatch", js.Any.fromFunction1(value))
  }
}
