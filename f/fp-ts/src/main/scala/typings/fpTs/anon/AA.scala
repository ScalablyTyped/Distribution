package typings.fpTs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AA[A] extends StObject {
  
  val _A: A
}
object AA {
  
  inline def apply[A](_A: A): AA[A] = {
    val __obj = js.Dynamic.literal(_A = _A.asInstanceOf[js.Any])
    __obj.asInstanceOf[AA[A]]
  }
  
  extension [Self <: AA[?], A](x: Self & AA[A]) {
    
    inline def set_A(value: A): Self = StObject.set(x, "_A", value.asInstanceOf[js.Any])
  }
}
