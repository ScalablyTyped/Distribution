package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForEach extends StObject {
  
  def forEach(cb: js.Function1[/* el */ PersistencePromise[Any], Unit]): Unit
}
object ForEach {
  
  inline def apply(forEach: js.Function1[/* el */ PersistencePromise[Any], Unit] => Unit): ForEach = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
    __obj.asInstanceOf[ForEach]
  }
  
  extension [Self <: ForEach](x: Self) {
    
    inline def setForEach(value: js.Function1[/* el */ PersistencePromise[Any], Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
  }
}
