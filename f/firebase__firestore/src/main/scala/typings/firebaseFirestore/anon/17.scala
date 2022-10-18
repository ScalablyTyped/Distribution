package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distLiteFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  def forEach(cb: js.Function1[/* el */ PersistencePromise[Any], Unit]): Unit
}
object `17` {
  
  inline def apply(forEach: js.Function1[/* el */ PersistencePromise[Any], Unit] => Unit): `17` = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
    __obj.asInstanceOf[`17`]
  }
  
  extension [Self <: `17`](x: Self) {
    
    inline def setForEach(value: js.Function1[/* el */ PersistencePromise[Any], Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
  }
}
