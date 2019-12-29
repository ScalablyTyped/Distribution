package typings.atFirebaseFirestore.distSrcApiCredentialsMod

import typings.atFirebaseAuthDashInteropDashTypes.atFirebaseAuthDashInteropDashTypesMod.FirebaseAuthInternalName
import typings.atFirebaseComponent.atFirebaseComponentMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/credentials", "FirebaseCredentialsProvider")
@js.native
class FirebaseCredentialsProvider protected () extends CredentialsProvider {
  def this(authProvider: Provider[FirebaseAuthInternalName]) = this()
  var auth: js.Any = js.native
  /** The listener registered with setChangeListener(). */
  var changeListener: js.Any = js.native
  /** Tracks the current User. */
  var currentUser: js.Any = js.native
  var forceRefresh: js.Any = js.native
  var getUser: js.Any = js.native
  var receivedInitialUser: js.Any = js.native
  /**
    * Counter used to detect if the token changed while a getToken request was
    * outstanding.
    */
  var tokenCounter: js.Any = js.native
  /**
    * The auth token listener registered with FirebaseApp, retained here so we
    * can unregister it.
    */
  var tokenListener: js.Any = js.native
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

