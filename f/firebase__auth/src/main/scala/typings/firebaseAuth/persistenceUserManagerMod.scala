package typings.firebaseAuth

import typings.firebaseAuth.firebaseAuthStrings.authEvent
import typings.firebaseAuth.firebaseAuthStrings.authUser
import typings.firebaseAuth.firebaseAuthStrings.firebase
import typings.firebaseAuth.firebaseAuthStrings.persistence
import typings.firebaseAuth.firebaseAuthStrings.redirectUser
import typings.firebaseAuth.modelAuthMod.ApiKey
import typings.firebaseAuth.modelAuthMod.AppName
import typings.firebaseAuth.modelAuthMod.AuthInternal
import typings.firebaseAuth.persistenceMod.PersistenceInternal
import typings.firebaseAuth.userMod.UserInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object persistenceUserManagerMod {
  
  @JSImport("@firebase/auth/dist/cordova/src/core/persistence/persistence_user_manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth/dist/cordova/src/core/persistence/persistence_user_manager", "PersistenceUserManager")
  @js.native
  /* private */ open class PersistenceUserManager () extends StObject {
    
    /* private */ val auth: Any = js.native
    
    /* private */ val boundEventHandler: Any = js.native
    
    def delete(): Unit = js.native
    
    /* private */ val fullPersistenceKey: Any = js.native
    
    /* private */ val fullUserKey: Any = js.native
    
    def getCurrentUser(): js.Promise[UserInternal | Null] = js.native
    
    var persistence: PersistenceInternal = js.native
    
    def removeCurrentUser(): js.Promise[Unit] = js.native
    
    def savePersistenceForRedirect(): js.Promise[Unit] = js.native
    
    def setCurrentUser(user: UserInternal): js.Promise[Unit] = js.native
    
    def setPersistence(newPersistence: PersistenceInternal): js.Promise[Unit] = js.native
    
    /* private */ val userKey: Any = js.native
  }
  /* static members */
  object PersistenceUserManager {
    
    @JSImport("@firebase/auth/dist/cordova/src/core/persistence/persistence_user_manager", "PersistenceUserManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(auth: AuthInternal, persistenceHierarchy: js.Array[PersistenceInternal]): js.Promise[PersistenceUserManager] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(auth.asInstanceOf[js.Any], persistenceHierarchy.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PersistenceUserManager]]
    inline def create(auth: AuthInternal, persistenceHierarchy: js.Array[PersistenceInternal], userKey: KeyName): js.Promise[PersistenceUserManager] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(auth.asInstanceOf[js.Any], persistenceHierarchy.asInstanceOf[js.Any], userKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PersistenceUserManager]]
  }
  
  inline def persistenceKeyName(key: String, apiKey: ApiKey, appName: AppName): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_persistenceKeyName")(key.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any], appName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAuth.firebaseAuthStrings.authUser
    - typings.firebaseAuth.firebaseAuthStrings.authEvent
    - typings.firebaseAuth.firebaseAuthStrings.redirectUser
    - typings.firebaseAuth.firebaseAuthStrings.persistence
  */
  trait KeyName extends StObject
  object KeyName {
    
    inline def AUTH_EVENT: authEvent = "authEvent".asInstanceOf[authEvent]
    
    inline def AUTH_USER: authUser = "authUser".asInstanceOf[authUser]
    
    inline def PERSISTENCE_USER: persistence = "persistence".asInstanceOf[persistence]
    
    inline def REDIRECT_USER: redirectUser = "redirectUser".asInstanceOf[redirectUser]
  }
  
  object Namespace {
    
    inline def PERSISTENCE: firebase = "firebase".asInstanceOf[firebase]
  }
  type Namespace = firebase
}
