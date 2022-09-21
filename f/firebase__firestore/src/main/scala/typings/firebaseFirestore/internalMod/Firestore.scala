package typings.firebaseFirestore.internalMod

import typings.firebaseApp.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/internal", "Firestore")
@js.native
open class Firestore protected ()
  extends StObject
     with Firestore2 {
  /** @hideconstructor */
  def this(
    authCredentialsProvider: CredentialsProvider[User],
    appCheckCredentialsProvider: CredentialsProvider[String],
    databaseId: DatabaseId
  ) = this()
  def this(
    authCredentialsProvider: CredentialsProvider[User],
    appCheckCredentialsProvider: CredentialsProvider[String],
    databaseId: DatabaseId,
    app: FirebaseApp
  ) = this()
  
  /* CompleteClass */
  var _appCheckCredentials: CredentialsProvider[String] = js.native
  
  /* CompleteClass */
  var _authCredentials: CredentialsProvider[User] = js.native
  
  /* CompleteClass */
  var _databaseId: DatabaseId = js.native
  
  var _firestoreClient: js.UndefOr[FirestoreClient] = js.native
  
  /* CompleteClass */
  override def _freezeSettings(): FirestoreSettingsImpl = js.native
  
  /* CompleteClass */
  var _persistenceKey: String = js.native
  
  val _queue: AsyncQueue = js.native
  
  /* CompleteClass */
  var _terminated: Boolean = js.native
}
