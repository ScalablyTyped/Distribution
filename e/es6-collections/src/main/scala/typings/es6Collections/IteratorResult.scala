package typings.es6Collections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IteratorResult[T] extends StObject {
  
  var done: Boolean
  
  var value: js.UndefOr[T] = js.undefined
}
object IteratorResult {
  
  inline def apply[T](done: Boolean): IteratorResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorResult[T]]
  }
  
  extension [Self <: IteratorResult[?], T](x: Self & IteratorResult[T]) {
    
    inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
