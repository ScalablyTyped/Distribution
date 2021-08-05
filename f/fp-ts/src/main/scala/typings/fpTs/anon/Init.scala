package typings.fpTs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Init[B /* <: A */, A] extends StObject {
  
  var init: js.Array[B]
  
  var rest: js.Array[A]
}
object Init {
  
  inline def apply[B /* <: A */, A](init: js.Array[B], rest: js.Array[A]): Init[B, A] = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Init[B, A]]
  }
  
  extension [Self <: Init[?, ?], B /* <: A */, A](x: Self & (Init[B, A])) {
    
    inline def setInit(value: js.Array[B]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitVarargs(value: B*): Self = StObject.set(x, "init", js.Array(value :_*))
    
    inline def setRest(value: js.Array[A]): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    
    inline def setRestVarargs(value: A*): Self = StObject.set(x, "rest", js.Array(value :_*))
  }
}
