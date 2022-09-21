package typings.devextremeRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infernoHooksRefObjectMod {
  
  trait MutableRefObject[T] extends StObject {
    
    var current: T
  }
  object MutableRefObject {
    
    inline def apply[T](current: T): MutableRefObject[T] = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutableRefObject[T]]
    }
    
    extension [Self <: MutableRefObject[?], T](x: Self & MutableRefObject[T]) {
      
      inline def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    }
  }
}
