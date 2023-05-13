package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait hh extends StObject {
  
  var _app: Any = js.native
  
  var _appCheckCredentials: Any = js.native
  
  var _authCredentials: Any = js.native
  
  var _databaseId: Any = js.native
  
  def _delete(): js.Promise[Unit] = js.native
  
  def _freezeSettings(): ah = js.native
  
  def _getSettings(): ah = js.native
  
  def _initialized: Boolean = js.native
  
  var _persistenceKey: String = js.native
  
  def _setSettings(t: Any): Unit = js.native
  
  var _settings: ah = js.native
  
  var _settingsFrozen: Boolean = js.native
  
  /**
    * Terminates all components used by this client. Subclasses can override
    * this method to clean up their own dependencies, but must also call this
    * method.
    *
    * Only ever called once.
    */ def _terminate(): js.Promise[Unit] = js.native
  
  var _terminateTask: js.UndefOr[js.Promise[Unit]] = js.native
  
  def _terminated: Boolean = js.native
  
  /**
    * The {@link @firebase/app#FirebaseApp} associated with this `Firestore` service
    * instance.
    */ def app: Any = js.native
  
  /** Returns a JSON-serializable representation of this `Firestore` instance. */ def toJSON(): typings.firebaseFirestore.anon.DatabaseId = js.native
  
  /**
    * Whether it's a Firestore or Firestore Lite instance.
    */
  var `type`: String = js.native
}
