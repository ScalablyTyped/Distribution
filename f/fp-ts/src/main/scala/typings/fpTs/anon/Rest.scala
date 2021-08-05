package typings.fpTs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rest[A] extends StObject {
  
  var init: js.Array[A]
  
  var rest: js.Array[A]
}
object Rest {
  
  inline def apply[A](init: js.Array[A], rest: js.Array[A]): Rest[A] = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rest[A]]
  }
  
  extension [Self <: Rest[?], A](x: Self & Rest[A]) {
    
    inline def setInit(value: js.Array[A]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitVarargs(value: A*): Self = StObject.set(x, "init", js.Array(value :_*))
    
    inline def setRest(value: js.Array[A]): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    
    inline def setRestVarargs(value: A*): Self = StObject.set(x, "rest", js.Array(value :_*))
  }
}
