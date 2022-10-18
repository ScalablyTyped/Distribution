package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods for getting the uid and token for the current user and
  * listening for changes.
  */
trait CredentialsProvider[T] extends StObject {
  
  /** Requests a token for the current user. */
  def getToken(): js.Promise[Token | Null]
  
  /**
    * Marks the last retrieved token as invalid, making the next GetToken request
    * force-refresh the token.
    */
  def invalidateToken(): Unit
  
  def shutdown(): Unit
  
  /**
    * Starts the credentials provider and specifies a listener to be notified of
    * credential changes (sign-in / sign-out, token changes). It is immediately
    * called once with the initial user.
    *
    * The change listener is invoked on the provided AsyncQueue.
    */
  def start(asyncQueue: AsyncQueue, changeListener: CredentialChangeListener[T]): Unit
}
object CredentialsProvider {
  
  inline def apply[T](
    getToken: () => js.Promise[Token | Null],
    invalidateToken: () => Unit,
    shutdown: () => Unit,
    start: (AsyncQueue, CredentialChangeListener[T]) => Unit
  ): CredentialsProvider[T] = {
    val __obj = js.Dynamic.literal(getToken = js.Any.fromFunction0(getToken), invalidateToken = js.Any.fromFunction0(invalidateToken), shutdown = js.Any.fromFunction0(shutdown), start = js.Any.fromFunction2(start))
    __obj.asInstanceOf[CredentialsProvider[T]]
  }
  
  extension [Self <: CredentialsProvider[?], T](x: Self & CredentialsProvider[T]) {
    
    inline def setGetToken(value: () => js.Promise[Token | Null]): Self = StObject.set(x, "getToken", js.Any.fromFunction0(value))
    
    inline def setInvalidateToken(value: () => Unit): Self = StObject.set(x, "invalidateToken", js.Any.fromFunction0(value))
    
    inline def setShutdown(value: () => Unit): Self = StObject.set(x, "shutdown", js.Any.fromFunction0(value))
    
    inline def setStart(value: (AsyncQueue, CredentialChangeListener[T]) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
  }
}
