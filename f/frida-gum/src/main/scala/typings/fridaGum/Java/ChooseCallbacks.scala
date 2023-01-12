package typings.fridaGum.Java

import typings.fridaGum.EnumerateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseCallbacks[T /* <: Members[T] */] extends StObject {
  
  /**
    * Called when all instances have been enumerated.
    */
  def onComplete(): Unit
  
  /**
    * Called with each live instance found with a ready-to-use `instance`
    * just as if you would have called `Java.cast()` with a raw handle to
    * this particular instance.
    *
    * May return `EnumerateAction.Stop` to stop the enumeration early.
    */
  def onMatch(instance: Wrapper[T]): Unit | EnumerateAction
}
object ChooseCallbacks {
  
  inline def apply[T /* <: Members[T] */](onComplete: () => Unit, onMatch: Wrapper[T] => Unit | EnumerateAction): ChooseCallbacks[T] = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onMatch = js.Any.fromFunction1(onMatch))
    __obj.asInstanceOf[ChooseCallbacks[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChooseCallbacks[?], T /* <: Members[T] */] (val x: Self & ChooseCallbacks[T]) extends AnyVal {
    
    inline def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
    
    inline def setOnMatch(value: Wrapper[T] => Unit | EnumerateAction): Self = StObject.set(x, "onMatch", js.Any.fromFunction1(value))
  }
}
