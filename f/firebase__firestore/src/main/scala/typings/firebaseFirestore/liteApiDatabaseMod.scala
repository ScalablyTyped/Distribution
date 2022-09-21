package typings.firebaseFirestore

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseFirestore.anon.MockUserToken
import typings.firebaseFirestore.componentsMod.FirestoreService
import typings.firebaseFirestore.credentialsMod.CredentialsProvider
import typings.firebaseFirestore.databaseInfoMod.DatabaseId
import typings.firebaseFirestore.firebaseFirestoreStrings.`firestore-lite`
import typings.firebaseFirestore.firebaseFirestoreStrings.firestore
import typings.firebaseFirestore.liteApiSettingsMod.FirestoreSettings
import typings.firebaseFirestore.liteApiSettingsMod.FirestoreSettingsImpl
import typings.firebaseFirestore.liteApiSettingsMod.PrivateSettings
import typings.firebaseFirestore.userMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liteApiDatabaseMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/lite-api/database", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/src/lite-api/database", "Firestore")
  @js.native
  open class Firestore protected ()
    extends StObject
       with FirestoreService {
    /** @hideconstructor */
    def this(
      _authCredentials: CredentialsProvider[User],
      _appCheckCredentials: CredentialsProvider[String],
      _databaseId: DatabaseId
    ) = this()
    def this(
      _authCredentials: CredentialsProvider[User],
      _appCheckCredentials: CredentialsProvider[String],
      _databaseId: DatabaseId,
      _app: FirebaseApp
    ) = this()
    
    val _app: js.UndefOr[FirebaseApp] = js.native
    
    /* CompleteClass */
    var _appCheckCredentials: CredentialsProvider[String] = js.native
    
    /* CompleteClass */
    var _authCredentials: CredentialsProvider[User] = js.native
    
    /* CompleteClass */
    var _databaseId: DatabaseId = js.native
    
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
  
  inline def connectFirestoreEmulator(firestore: Firestore, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectFirestoreEmulator(firestore: Firestore, host: String, port: Double, options: MockUserToken): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getFirestore(): Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")().asInstanceOf[Firestore]
  inline def getFirestore(app: FirebaseApp): Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any]).asInstanceOf[Firestore]
  inline def getFirestore(app: FirebaseApp, databaseId: String): Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any])).asInstanceOf[Firestore]
  inline def getFirestore(databaseId: String): Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(databaseId.asInstanceOf[js.Any]).asInstanceOf[Firestore]
  
  inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings): Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Firestore]
  inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings, databaseId: String): Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any])).asInstanceOf[Firestore]
  
  inline def terminate(firestore: Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      @JSName("firestore/lite")
      var firestoreSlashlite: Firestore
    }
    object NameServiceMapping {
      
      inline def apply(firestoreSlashlite: Firestore): NameServiceMapping = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("firestore/lite")(firestoreSlashlite.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def setFirestoreSlashlite(value: Firestore): Self = StObject.set(x, "firestore/lite", value.asInstanceOf[js.Any])
      }
    }
  }
}
