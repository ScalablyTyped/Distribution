package typings.devextremeRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsInfernoHooksRefObjectMod {
  
  trait MutableRefObject[T] extends StObject {
    
    var current: T
  }
  object MutableRefObject {
    
    inline def apply[T](current: T): MutableRefObject[T] = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutableRefObject[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MutableRefObject[?], T] (val x: Self & MutableRefObject[T]) extends AnyVal {
      
      inline def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    }
  }
}
