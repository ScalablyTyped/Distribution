package typings.firebaseFirestore.indexEsm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An AppCheck token provider that always yields an empty token.
  * @internal
  */ trait H_ extends StObject {
  
  def getToken(): js.Promise[W]
  
  def invalidateToken(): Unit
  
  def shutdown(): Unit
  
  def start(t: Any, e: Any): Unit
}
object H_ {
  
  inline def apply(
    getToken: () => js.Promise[W],
    invalidateToken: () => Unit,
    shutdown: () => Unit,
    start: (Any, Any) => Unit
  ): H_ = {
    val __obj = js.Dynamic.literal(getToken = js.Any.fromFunction0(getToken), invalidateToken = js.Any.fromFunction0(invalidateToken), shutdown = js.Any.fromFunction0(shutdown), start = js.Any.fromFunction2(start))
    __obj.asInstanceOf[H_]
  }
  
  extension [Self <: H_](x: Self) {
    
    inline def setGetToken(value: () => js.Promise[W]): Self = StObject.set(x, "getToken", js.Any.fromFunction0(value))
    
    inline def setInvalidateToken(value: () => Unit): Self = StObject.set(x, "invalidateToken", js.Any.fromFunction0(value))
    
    inline def setShutdown(value: () => Unit): Self = StObject.set(x, "shutdown", js.Any.fromFunction0(value))
    
    inline def setStart(value: (Any, Any) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
  }
}
