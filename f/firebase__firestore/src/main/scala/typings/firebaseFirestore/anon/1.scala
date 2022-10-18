package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`[R, S] extends StObject {
  
  def forEach(cb: js.Function2[/* r */ R, /* s */ S, Unit]): Unit
}
object `1` {
  
  inline def apply[R, S](forEach: js.Function2[/* r */ R, /* s */ S, Unit] => Unit): `1`[R, S] = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
    __obj.asInstanceOf[`1`[R, S]]
  }
  
  extension [Self <: `1`[?, ?], R, S](x: Self & (`1`[R, S])) {
    
    inline def setForEach(value: js.Function2[/* r */ R, /* s */ S, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
  }
}
