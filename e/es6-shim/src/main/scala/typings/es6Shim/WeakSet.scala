package typings.es6Shim

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeakSet[T] extends StObject {
  
  def add(value: T): WeakSet[T]
  
  def delete(value: T): Boolean
  
  def has(value: T): Boolean
}
object WeakSet {
  
  @scala.inline
  def apply[T](add: T => WeakSet[T], delete: T => Boolean, has: T => Boolean): WeakSet[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), delete = js.Any.fromFunction1(delete), has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[WeakSet[T]]
  }
  
  @scala.inline
  implicit class WeakSetMutableBuilder[Self <: WeakSet[?], T] (val x: Self & WeakSet[T]) extends AnyVal {
    
    @scala.inline
    def setAdd(value: T => WeakSet[T]): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelete(value: T => Boolean): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: T => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
  }
}
