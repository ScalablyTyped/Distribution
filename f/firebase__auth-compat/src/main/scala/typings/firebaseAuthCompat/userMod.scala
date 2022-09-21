package typings.firebaseAuthCompat

import typings.firebaseAuthCompat.anon.DisplayName
import typings.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userMod {
  
  @JSImport("@firebase/auth-compat/dist/auth-compat/src/user", "User")
  @js.native
  /* private */ open class User ()
    extends StObject
       with typings.firebaseAuthTypes.mod.User
       with Compat[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.User */ Any
        ] {
    
    /* CompleteClass */
    var _delegate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.User */ Any = js.native
    
    /* private */ def auth: Any = js.native
    
    /* CompleteClass */
    var displayName: String | Null = js.native
    
    /* CompleteClass */
    var email: String | Null = js.native
    
    /* CompleteClass */
    var phoneNumber: String | Null = js.native
    
    /* CompleteClass */
    var photoURL: String | Null = js.native
    
    /* CompleteClass */
    var providerId: String = js.native
    
    /* CompleteClass */
    var uid: String = js.native
    
    def updateProfile(profile: DisplayName): js.Promise[Unit] = js.native
  }
  /* static members */
  object User {
    
    @JSImport("@firebase/auth-compat/dist/auth-compat/src/user", "User")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/auth-compat/dist/auth-compat/src/user", "User.USER_MAP")
    @js.native
    val USER_MAP: Any = js.native
    
    inline def getOrCreate(
      user: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.User */ Any
    ): User = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrCreate")(user.asInstanceOf[js.Any]).asInstanceOf[User]
  }
}
