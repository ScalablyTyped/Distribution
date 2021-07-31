package typings.firebase.mod.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @hidden
  */
trait Observer[T, E] extends StObject {
  
  def complete(): Unit
  @JSName("complete")
  var complete_Original: CompleteFn
  
  def error(error: E): Unit
  @JSName("error")
  var error_Original: ErrorFn[E]
  
  def next(value: T): Unit
  @JSName("next")
  var next_Original: NextFn[T]
}
object Observer {
  
  @scala.inline
  def apply[T, E](complete: () => Unit, error: E => Unit, next: T => Unit): Observer[T, E] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[Observer[T, E]]
  }
  
  @scala.inline
  implicit class ObserverMutableBuilder[Self <: Observer[?, ?], T, E] (val x: Self & (Observer[T, E])) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setError(value: E => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
  }
}
