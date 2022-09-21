package typings.firebaseFirestore.indexEsm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A CredentialsProvider that always yields an empty token.
  * @internal
  */ trait q extends StObject {
  
  def getToken(): js.Promise[Null]
  
  def invalidateToken(): Unit
  
  def shutdown(): Unit
  
  def start(t: Any, e: Any): Unit
}
object q {
  
  inline def apply(
    getToken: () => js.Promise[Null],
    invalidateToken: () => Unit,
    shutdown: () => Unit,
    start: (Any, Any) => Unit
  ): q = {
    val __obj = js.Dynamic.literal(getToken = js.Any.fromFunction0(getToken), invalidateToken = js.Any.fromFunction0(invalidateToken), shutdown = js.Any.fromFunction0(shutdown), start = js.Any.fromFunction2(start))
    __obj.asInstanceOf[q]
  }
  
  extension [Self <: q](x: Self) {
    
    inline def setGetToken(value: () => js.Promise[Null]): Self = StObject.set(x, "getToken", js.Any.fromFunction0(value))
    
    inline def setInvalidateToken(value: () => Unit): Self = StObject.set(x, "invalidateToken", js.Any.fromFunction0(value))
    
    inline def setShutdown(value: () => Unit): Self = StObject.set(x, "shutdown", js.Any.fromFunction0(value))
    
    inline def setStart(value: (Any, Any) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
  }
}
