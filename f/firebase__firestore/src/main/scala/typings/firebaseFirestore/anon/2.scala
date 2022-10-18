package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`[R] extends StObject {
  
  def forEach(cb: js.Function1[/* r */ R, Unit]): Unit
}
object `2` {
  
  inline def apply[R](forEach: js.Function1[/* r */ R, Unit] => Unit): `2`[R] = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
    __obj.asInstanceOf[`2`[R]]
  }
  
  extension [Self <: `2`[?], R](x: Self & `2`[R]) {
    
    inline def setForEach(value: js.Function1[/* r */ R, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
  }
}
