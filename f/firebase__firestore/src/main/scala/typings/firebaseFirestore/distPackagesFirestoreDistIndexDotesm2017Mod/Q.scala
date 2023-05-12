package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A CredentialsProvider that always yields an empty token.
  * @internal
  */ trait Q extends StObject {
  
  def getToken(): js.Promise[Null]
  
  def invalidateToken(): Unit
  
  def shutdown(): Unit
  
  def start(t: Any, e: Any): Unit
}
object Q {
  
  inline def apply(
    getToken: () => js.Promise[Null],
    invalidateToken: () => Unit,
    shutdown: () => Unit,
    start: (Any, Any) => Unit
  ): Q = {
    val __obj = js.Dynamic.literal(getToken = js.Any.fromFunction0(getToken), invalidateToken = js.Any.fromFunction0(invalidateToken), shutdown = js.Any.fromFunction0(shutdown), start = js.Any.fromFunction2(start))
    __obj.asInstanceOf[Q]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Q] (val x: Self) extends AnyVal {
    
    inline def setGetToken(value: () => js.Promise[Null]): Self = StObject.set(x, "getToken", js.Any.fromFunction0(value))
    
    inline def setInvalidateToken(value: () => Unit): Self = StObject.set(x, "invalidateToken", js.Any.fromFunction0(value))
    
    inline def setShutdown(value: () => Unit): Self = StObject.set(x, "shutdown", js.Any.fromFunction0(value))
    
    inline def setStart(value: (Any, Any) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
  }
}
