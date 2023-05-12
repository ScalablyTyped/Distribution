package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefObject[T] extends StObject {
  
  var current: T | Null
}
object RefObject {
  
  inline def apply[T](): RefObject[T] = {
    val __obj = js.Dynamic.literal(current = null)
    __obj.asInstanceOf[RefObject[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefObject[?], T] (val x: Self & RefObject[T]) extends AnyVal {
    
    inline def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentNull: Self = StObject.set(x, "current", null)
  }
}
