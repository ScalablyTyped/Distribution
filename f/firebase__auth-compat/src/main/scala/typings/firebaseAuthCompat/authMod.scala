package typings.firebaseAuthCompat

import typings.firebaseAppCompat.mod.FirebaseServiceInternals
import typings.firebaseAuthCompat.anon.DisableWarnings
import typings.firebaseAuthCompat.anon.LOCAL
import typings.firebaseAuthCompat.mod.FirebaseApp
import typings.firebaseAuthCompat.wrapMod.Wrapper
import typings.firebaseAuthTypes.mod.AuthSettings
import typings.firebaseAuthTypes.mod.EmulatorConfig
import typings.firebaseAuthTypes.mod.FirebaseAuth
import typings.firebaseAuthTypes.mod.User
import typings.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.firebaseAppCompat.mod.FirebaseService because var conflicts: app. Inlined INTERNAL */ @JSImport("@firebase/auth-compat/dist/auth-compat/src/auth", "Auth")
  @js.native
  open class Auth protected ()
    extends FirebaseAuth
       with Wrapper[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.Auth */ Any
        ]
       with Compat[Any] {
    def this(
      app: FirebaseApp,
      provider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Provider<'auth'> */ Any
    ) = this()
    
    var INTERNAL: js.UndefOr[FirebaseServiceInternals] = js.native
    
    /* CompleteClass */
    var _delegate: Any = js.native
    
    def _delete(): js.Promise[Unit] = js.native
    
    def addFrameworkForLogging(framework: String): Unit = js.native
    
    @JSName("app")
    val app_Auth: FirebaseApp = js.native
    
    @JSName("currentUser")
    def currentUser_MAuth: User | Null = js.native
    
    @JSName("emulatorConfig")
    def emulatorConfig_MAuth: EmulatorConfig | Null = js.native
    
    def fetchProvidersForEmail(email: String): js.Promise[js.Array[String]] = js.native
    
    @JSName("languageCode")
    def languageCode_MAuth: String | Null = js.native
    
    /* private */ var linkUnderlyingAuth: Any = js.native
    
    @JSName("settings")
    def settings_MAuth: AuthSettings = js.native
    
    @JSName("tenantId")
    def tenantId_MAuth: String | Null = js.native
    
    /* CompleteClass */
    override def unwrap(): /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.Auth */ Any = js.native
    
    def useEmulator(url: String, options: DisableWarnings): Unit = js.native
  }
  /* static members */
  object Auth {
    
    @JSImport("@firebase/auth-compat/dist/auth-compat/src/auth", "Auth")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/auth-compat/dist/auth-compat/src/auth", "Auth.Persistence")
    @js.native
    def Persistence: LOCAL = js.native
    inline def Persistence_=(x: LOCAL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Persistence")(x.asInstanceOf[js.Any])
  }
}
