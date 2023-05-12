package typings.glimmerInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibReferencesMod {
  
  trait Reference[T] extends StObject {
    
    def value(): T
  }
  object Reference {
    
    inline def apply[T](value: () => T): Reference[T] = {
      val __obj = js.Dynamic.literal(value = js.Any.fromFunction0(value))
      __obj.asInstanceOf[Reference[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Reference[?], T] (val x: Self & Reference[T]) extends AnyVal {
      
      inline def setValue(value: () => T): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
    }
  }
}
