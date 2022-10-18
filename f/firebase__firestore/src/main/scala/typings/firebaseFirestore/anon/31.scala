package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `31` extends StObject {
  
  def forEach(cb: js.Function1[/* el */ PersistencePromise[Any], Unit]): Unit
}
object `31` {
  
  inline def apply(forEach: js.Function1[/* el */ PersistencePromise[Any], Unit] => Unit): `31` = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
    __obj.asInstanceOf[`31`]
  }
  
  extension [Self <: `31`](x: Self) {
    
    inline def setForEach(value: js.Function1[/* el */ PersistencePromise[Any], Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
  }
}
