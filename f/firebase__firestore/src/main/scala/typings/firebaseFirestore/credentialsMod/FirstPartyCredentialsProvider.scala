package typings.firebaseFirestore.credentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/api/credentials", "FirstPartyCredentialsProvider")
@js.native
class FirstPartyCredentialsProvider protected () extends CredentialsProvider {
  def this(gapi: Gapi, sessionIndex: String) = this()
  var gapi: js.Any = js.native
  var sessionIndex: js.Any = js.native
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

