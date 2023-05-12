package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a wrapper around IndexedDb with a simplified interface that uses
  * Promise-like return values to chain operations. Real promises cannot be used
  * since .then() continuations are executed asynchronously (e.g. via
  * .setImmediate), which would cause IndexedDB to end the transaction.
  * See PersistencePromise for more details.
  */ trait bt extends StObject {
  
  def B(t: Any): Unit
  
  var F: Any
  
  /**
    * Opens the specified database, creating or upgrading it if necessary.
    */ def O(t: Any): Any
  
  var V: Any
  
  def close(): Unit
  
  var db: Any
  
  var name: Any
  
  def runTransaction(t: Any, e: Any, n: Any, s: Any): js.Promise[Any]
  
  var version: Any
}
object bt {
  
  inline def apply(
    B: Any => Unit,
    F: Any,
    O: Any => Any,
    V: Any,
    close: () => Unit,
    db: Any,
    name: Any,
    runTransaction: (Any, Any, Any, Any) => js.Promise[Any],
    version: Any
  ): bt = {
    val __obj = js.Dynamic.literal(B = js.Any.fromFunction1(B), F = F.asInstanceOf[js.Any], O = js.Any.fromFunction1(O), V = V.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), db = db.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], runTransaction = js.Any.fromFunction4(runTransaction), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[bt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: bt] (val x: Self) extends AnyVal {
    
    inline def setB(value: Any => Unit): Self = StObject.set(x, "B", js.Any.fromFunction1(value))
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setDb(value: Any): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    inline def setF(value: Any): Self = StObject.set(x, "F", value.asInstanceOf[js.Any])
    
    inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setO(value: Any => Any): Self = StObject.set(x, "O", js.Any.fromFunction1(value))
    
    inline def setRunTransaction(value: (Any, Any, Any, Any) => js.Promise[Any]): Self = StObject.set(x, "runTransaction", js.Any.fromFunction4(value))
    
    inline def setV(value: Any): Self = StObject.set(x, "V", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Any): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
