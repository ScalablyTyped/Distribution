package typings.firebaseFirestore.distPrivateMod

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseFirestore.firebaseFirestoreStrings.`firestore-lite`
import typings.firebaseFirestore.firebaseFirestoreStrings.firestore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Cloud Firestore service interface.
  *
  * Do not call this constructor directly. Instead, use {@link getFirestore}.
  */
@js.native
trait Firestore2
  extends StObject
     with FirestoreService {
  
  val _app: js.UndefOr[FirebaseApp] = js.native
  
  def _delete(): js.Promise[Unit] = js.native
  
  def _getSettings(): FirestoreSettingsImpl = js.native
  
  def _initialized: Boolean = js.native
  
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
  
  @JSName("_terminated")
  def _terminated_MFirestore2: Boolean = js.native
  
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
