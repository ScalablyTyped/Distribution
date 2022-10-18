package typings.firebaseAuth

import typings.firebaseAuth.distNodeEsmSrcCorePersistenceMod.PersistedBlob
import typings.firebaseAuth.distNodeEsmSrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distNodeEsmSrcModelIdTokenMod.IdTokenResponse
import typings.firebaseAuth.distNodeEsmSrcModelUserMod.UserInternal
import typings.firebaseAuth.distNodeEsmSrcModelUserMod.UserParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreUserUserImplMod {
  
  @JSImport("@firebase/auth/dist/node-esm/src/core/user/user_impl", "UserImpl")
  @js.native
  open class UserImpl protected ()
    extends StObject
       with UserInternal {
    def this(hasUidAuthStsTokenManagerOpt: UserParameters) = this()
    
    /* private */ var accessToken: Any = js.native
    
    /**
      * The display name of the user.
      */
    /* CompleteClass */
    override val displayName: String | Null = js.native
    
    /**
      * The email of the user.
      */
    /* CompleteClass */
    override val email: String | Null = js.native
    
    /**
      * The phone number normalized based on the E.164 standard (e.g. +16505550101) for the
      * user.
      *
      * @remarks
      * This is null if the user has no phone credential linked to the account.
      */
    /* CompleteClass */
    override val phoneNumber: String | Null = js.native
    
    /**
      * The profile photo URL of the user.
      */
    /* CompleteClass */
    override val photoURL: String | Null = js.native
    
    /* private */ val proactiveRefresh: Any = js.native
    
    /**
      * The provider used to authenticate the user.
      */
    /* CompleteClass */
    override val providerId: String = js.native
    @JSName("providerId")
    val providerId_UserImpl: String | Double = js.native
    
    @JSName("refreshToken")
    def refreshToken_MUserImpl: String = js.native
    
    /* private */ var reloadListener: Any = js.native
    
    /* private */ var reloadUserInfo: Any = js.native
    
    /**
      * The user's unique ID, scoped to the project.
      */
    /* CompleteClass */
    override val uid: String = js.native
  }
  /* static members */
  object UserImpl {
    
    @JSImport("@firebase/auth/dist/node-esm/src/core/user/user_impl", "UserImpl")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Initialize a User from an idToken server response
      * @param auth
      * @param idTokenResponse
      */
    inline def _fromIdTokenResponse(auth: AuthInternal, idTokenResponse: IdTokenResponse): js.Promise[UserInternal] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromIdTokenResponse")(auth.asInstanceOf[js.Any], idTokenResponse.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserInternal]]
    inline def _fromIdTokenResponse(auth: AuthInternal, idTokenResponse: IdTokenResponse, isAnonymous: Boolean): js.Promise[UserInternal] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromIdTokenResponse")(auth.asInstanceOf[js.Any], idTokenResponse.asInstanceOf[js.Any], isAnonymous.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserInternal]]
    
    inline def _fromJSON(auth: AuthInternal, `object`: PersistedBlob): UserInternal = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromJSON")(auth.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[UserInternal]
  }
}
