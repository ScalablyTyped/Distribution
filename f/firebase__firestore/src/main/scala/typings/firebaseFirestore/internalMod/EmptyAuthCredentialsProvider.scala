package typings.firebaseFirestore.internalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/internal", "_EmptyAuthCredentialsProvider")
@js.native
open class EmptyAuthCredentialsProvider ()
  extends StObject
     with CredentialsProvider[User] {
  
  /** Requests a token for the current user. */
  /* CompleteClass */
  override def getToken(): js.Promise[Token | Null] = js.native
  
  /**
    * Marks the last retrieved token as invalid, making the next GetToken request
    * force-refresh the token.
    */
  /* CompleteClass */
  override def invalidateToken(): Unit = js.native
  
  /* CompleteClass */
  override def shutdown(): Unit = js.native
  
  /**
    * Starts the credentials provider and specifies a listener to be notified of
    * credential changes (sign-in / sign-out, token changes). It is immediately
    * called once with the initial user.
    *
    * The change listener is invoked on the provided AsyncQueue.
    */
  /* CompleteClass */
  override def start(asyncQueue: AsyncQueue, changeListener: CredentialChangeListener[User]): Unit = js.native
}
