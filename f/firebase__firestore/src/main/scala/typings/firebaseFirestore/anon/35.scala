package typings.firebaseFirestore.anon

import typings.firebaseFirestore.firestoreSrcLocalPersistencePromiseMod.PersistencePromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `35` extends StObject {
  
  def forEach(cb: js.Function1[/* el */ PersistencePromise[Any], Unit]): Unit
}
object `35` {
  
  inline def apply(forEach: js.Function1[/* el */ PersistencePromise[Any], Unit] => Unit): `35` = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
    __obj.asInstanceOf[`35`]
  }
  
  extension [Self <: `35`](x: Self) {
    
    inline def setForEach(value: js.Function1[/* el */ PersistencePromise[Any], Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
  }
}
