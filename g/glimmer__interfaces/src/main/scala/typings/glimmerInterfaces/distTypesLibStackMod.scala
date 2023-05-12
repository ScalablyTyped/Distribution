package typings.glimmerInterfaces

import typings.glimmerInterfaces.distTypesLibCoreMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibStackMod {
  
  trait Stack[T] extends StObject {
    
    var current: Option[T]
    
    def isEmpty(): Boolean
    
    def nth(from: Double): Option[T]
    
    def pop(): Option[T]
    
    def push(item: T): Unit
    
    var size: Double
    
    def toArray(): js.Array[T]
  }
  object Stack {
    
    inline def apply[T](
      isEmpty: () => Boolean,
      nth: Double => Option[T],
      pop: () => Option[T],
      push: T => Unit,
      size: Double,
      toArray: () => js.Array[T]
    ): Stack[T] = {
      val __obj = js.Dynamic.literal(isEmpty = js.Any.fromFunction0(isEmpty), nth = js.Any.fromFunction1(nth), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), size = size.asInstanceOf[js.Any], toArray = js.Any.fromFunction0(toArray), current = null)
      __obj.asInstanceOf[Stack[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Stack[?], T] (val x: Self & Stack[T]) extends AnyVal {
      
      inline def setCurrent(value: Option[T]): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentNull: Self = StObject.set(x, "current", null)
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setNth(value: Double => Option[T]): Self = StObject.set(x, "nth", js.Any.fromFunction1(value))
      
      inline def setPop(value: () => Option[T]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      inline def setPush(value: T => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setToArray(value: () => js.Array[T]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
    }
  }
}
