package typings.firebaseFirestore.credentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialsProvider extends js.Object {
  /** Requests a token for the current user. */
  def getToken(): js.Promise[Token | Null]
  /**
    * Marks the last retrieved token as invalid, making the next GetToken request
    * force-refresh the token.
    */
  def invalidateToken(): Unit
  /** Removes the previously-set change listener. */
  def removeChangeListener(): Unit
  /**
    * Specifies a listener to be notified of credential changes
    * (sign-in / sign-out, token changes). It is immediately called once with the
    * initial user.
    */
  def setChangeListener(changeListener: CredentialChangeListener): Unit
}

object CredentialsProvider {
  @scala.inline
  def apply(
    getToken: () => js.Promise[Token | Null],
    invalidateToken: () => Unit,
    removeChangeListener: () => Unit,
    setChangeListener: CredentialChangeListener => Unit
  ): CredentialsProvider = {
    val __obj = js.Dynamic.literal(getToken = js.Any.fromFunction0(getToken), invalidateToken = js.Any.fromFunction0(invalidateToken), removeChangeListener = js.Any.fromFunction0(removeChangeListener), setChangeListener = js.Any.fromFunction1(setChangeListener))
  
    __obj.asInstanceOf[CredentialsProvider]
  }
}

