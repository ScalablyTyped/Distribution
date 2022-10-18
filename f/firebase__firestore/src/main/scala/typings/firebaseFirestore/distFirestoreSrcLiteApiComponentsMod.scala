package typings.firebaseFirestore

import typings.firebaseFirestore.distFirestoreSrcApiCredentialsMod.CredentialsProvider
import typings.firebaseFirestore.distFirestoreSrcAuthUserMod.User
import typings.firebaseFirestore.distFirestoreSrcCoreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.distFirestoreSrcCoreDatabaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.distFirestoreSrcLiteApiSettingsMod.FirestoreSettingsImpl
import typings.firebaseFirestore.distFirestoreSrcRemoteDatastoreMod.Datastore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcLiteApiComponentsMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/lite-api/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/src/lite-api/components", "LOG_TAG")
  @js.native
  val LOG_TAG: /* "ComponentProvider" */ String = js.native
  
  inline def getDatastore(firestore: FirestoreService): Datastore = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatastore")(firestore.asInstanceOf[js.Any]).asInstanceOf[Datastore]
  
  inline def makeDatabaseInfo(databaseId: DatabaseId, appId: String, persistenceKey: String, settings: FirestoreSettingsImpl): DatabaseInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDatabaseInfo")(databaseId.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], persistenceKey.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[DatabaseInfo]
  
  inline def removeComponents(firestore: FirestoreService): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeComponents")(firestore.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseService * / any */ trait FirestoreService extends StObject {
    
    var _appCheckCredentials: CredentialsProvider[String]
    
    var _authCredentials: CredentialsProvider[User]
    
    var _databaseId: DatabaseId
    
    def _freezeSettings(): FirestoreSettingsImpl
    
    var _persistenceKey: String
    
    var _terminated: Boolean
  }
  object FirestoreService {
    
    inline def apply(
      _appCheckCredentials: CredentialsProvider[String],
      _authCredentials: CredentialsProvider[User],
      _databaseId: DatabaseId,
      _freezeSettings: () => FirestoreSettingsImpl,
      _persistenceKey: String,
      _terminated: Boolean
    ): FirestoreService = {
      val __obj = js.Dynamic.literal(_appCheckCredentials = _appCheckCredentials.asInstanceOf[js.Any], _authCredentials = _authCredentials.asInstanceOf[js.Any], _databaseId = _databaseId.asInstanceOf[js.Any], _freezeSettings = js.Any.fromFunction0(_freezeSettings), _persistenceKey = _persistenceKey.asInstanceOf[js.Any], _terminated = _terminated.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirestoreService]
    }
    
    extension [Self <: FirestoreService](x: Self) {
      
      inline def set_appCheckCredentials(value: CredentialsProvider[String]): Self = StObject.set(x, "_appCheckCredentials", value.asInstanceOf[js.Any])
      
      inline def set_authCredentials(value: CredentialsProvider[User]): Self = StObject.set(x, "_authCredentials", value.asInstanceOf[js.Any])
      
      inline def set_databaseId(value: DatabaseId): Self = StObject.set(x, "_databaseId", value.asInstanceOf[js.Any])
      
      inline def set_freezeSettings(value: () => FirestoreSettingsImpl): Self = StObject.set(x, "_freezeSettings", js.Any.fromFunction0(value))
      
      inline def set_persistenceKey(value: String): Self = StObject.set(x, "_persistenceKey", value.asInstanceOf[js.Any])
      
      inline def set_terminated(value: Boolean): Self = StObject.set(x, "_terminated", value.asInstanceOf[js.Any])
    }
  }
}
