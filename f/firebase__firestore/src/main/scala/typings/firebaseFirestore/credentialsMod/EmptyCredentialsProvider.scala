package typings.firebaseFirestore.credentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/api/credentials", "EmptyCredentialsProvider")
@js.native
class EmptyCredentialsProvider () extends CredentialsProvider {
  /**
    * Stores the listener registered with setChangeListener()
    * This isn't actually necessary since the UID never changes, but we use this
    * to verify the listen contract is adhered to in tests.
    */
  var changeListener: js.Any = js.native
  /** Requests a token for the current user. */
  /* CompleteClass */
  override def getToken(): js.Promise[Token | Null] = js.native
  /**
    * Marks the last retrieved token as invalid, making the next GetToken request
    * force-refresh the token.
    */
  /* CompleteClass */
  override def invalidateToken(): Unit = js.native
  /** Removes the previously-set change listener. */
  /* CompleteClass */
  override def removeChangeListener(): Unit = js.native
  /**
    * Specifies a listener to be notified of credential changes
    * (sign-in / sign-out, token changes). It is immediately called once with the
    * initial user.
    */
  /* CompleteClass */
  override def setChangeListener(changeListener: CredentialChangeListener): Unit = js.native
}

