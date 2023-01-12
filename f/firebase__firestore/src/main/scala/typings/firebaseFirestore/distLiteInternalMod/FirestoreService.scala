package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface implemented by FirebaseFirestore that provides compatibility
  * with the usage in this file.
  *
  * This interface mainly exists to remove a cyclic dependency.
  */
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirestoreService] (val x: Self) extends AnyVal {
    
    inline def set_appCheckCredentials(value: CredentialsProvider[String]): Self = StObject.set(x, "_appCheckCredentials", value.asInstanceOf[js.Any])
    
    inline def set_authCredentials(value: CredentialsProvider[User]): Self = StObject.set(x, "_authCredentials", value.asInstanceOf[js.Any])
    
    inline def set_databaseId(value: DatabaseId): Self = StObject.set(x, "_databaseId", value.asInstanceOf[js.Any])
    
    inline def set_freezeSettings(value: () => FirestoreSettingsImpl): Self = StObject.set(x, "_freezeSettings", js.Any.fromFunction0(value))
    
    inline def set_persistenceKey(value: String): Self = StObject.set(x, "_persistenceKey", value.asInstanceOf[js.Any])
    
    inline def set_terminated(value: Boolean): Self = StObject.set(x, "_terminated", value.asInstanceOf[js.Any])
  }
}
