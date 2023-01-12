package typings.firebaseAuth.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscribe extends StObject {
  
  def subscribe(n: Null, cb: js.Function1[/* event */ (Record[String, String]) | Null, Unit]): Unit
}
object Subscribe {
  
  inline def apply(subscribe: (Null, js.Function1[/* event */ (Record[String, String]) | Null, Unit]) => Unit): Subscribe = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction2(subscribe))
    __obj.asInstanceOf[Subscribe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Subscribe] (val x: Self) extends AnyVal {
    
    inline def setSubscribe(value: (Null, js.Function1[/* event */ (Record[String, String]) | Null, Unit]) => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
  }
}
