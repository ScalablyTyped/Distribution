package typings.firebaseFirestore.privateMod

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseFirestore.firebaseFirestoreStrings.`firestore-lite`
import typings.firebaseFirestore.firebaseFirestoreStrings.firestore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/private", "Firestore")
@js.native
open class Firestore protected ()
  extends StObject
     with FirestoreService {
  /** @hideconstructor */
  def this(
    _authCredentials: CredentialsProvider[User],
    _appCheckCredentials: CredentialsProvider[String],
    _databaseId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DatabaseId */ Any
  ) = this()
  def this(
    _authCredentials: CredentialsProvider[User],
    _appCheckCredentials: CredentialsProvider[String],
    _databaseId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DatabaseId */ Any,
    _app: FirebaseApp
  ) = this()
  
  val _app: js.UndefOr[FirebaseApp] = js.native
  
  /* CompleteClass */
  var _appCheckCredentials: CredentialsProvider[String] = js.native
  
  /* CompleteClass */
  var _authCredentials: CredentialsProvider[User] = js.native
  
  /* CompleteClass */
  var _databaseId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DatabaseId */ Any = js.native
  
  def _delete(): js.Promise[Unit] = js.native
  
  /* CompleteClass */
  override def _freezeSettings(): FirestoreSettingsImpl = js.native
  
  def _getSettings(): FirestoreSettingsImpl = js.native
  
  def _initialized: Boolean = js.native
  
  /* CompleteClass */
  var _persistenceKey: String = js.native
  
  def _setSettings(settings: PrivateSettings): Unit = js.native
  
  /* private */ var _settings: Any = js.native
  
  /* private */ var _settingsFrozen: Any = js.native
  
  /**
    * Terminates all components used by this client. Subclasses can override
    * this method to clean up their own dependencies, but must also call this
    * method.
    *
    * Only ever called once.
    */
  /* protected */ def _terminate(): js.Promise[Unit] = js.native
  
  /* private */ var _terminateTask: Any = js.native
  
  /* CompleteClass */
  var _terminated: Boolean = js.native
  @JSName("_terminated")
  def _terminated_MFirestore: Boolean = js.native
  
  /**
    * The {@link @firebase/app#FirebaseApp} associated with this `Firestore` service
    * instance.
    */
  def app: FirebaseApp = js.native
  
  /** Returns a JSON-serializable representation of this `Firestore` instance. */
  def toJSON(): js.Object = js.native
  
  /**
    * Whether it's a Firestore or Firestore Lite instance.
    */
  var `type`: `firestore-lite` | firestore = js.native
}
