package typings.firebaseAuth

import typings.firebaseAuth.rnSrcApiAuthenticationMfaMod.PhoneOrOauthTokenResponse
import typings.firebaseAuth.rnSrcModelAuthMod.AuthInternal
import typings.firebaseAuth.rnSrcModelIdTokenMod.IdTokenResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rnSrcCoreCredentialsAuthCredentialMod {
  
  @JSImport("@firebase/auth/dist/rn/src/core/credentials/auth_credential", "AuthCredential")
  @js.native
  open class AuthCredential protected () extends StObject {
    /** @internal */
    /* protected */ def this(
      /**
      * The authentication provider ID for the credential.
      *
      * @remarks
      * For example, 'facebook.com', or 'google.com'.
      */
    providerId: String,
      /**
      * The authentication sign in method for the credential.
      *
      * @remarks
      * For example, {@link SignInMethod}.EMAIL_PASSWORD, or
      * {@link SignInMethod}.EMAIL_LINK. This corresponds to the sign-in method
      * identifier as returned in {@link fetchSignInMethodsForEmail}.
      */
    signInMethod: String
    ) = this()
    
    /** @internal */
    def _getIdTokenResponse(_auth: AuthInternal): js.Promise[PhoneOrOauthTokenResponse] = js.native
    
    /** @internal */
    def _getReauthenticationResolver(_auth: AuthInternal): js.Promise[IdTokenResponse] = js.native
    
    /** @internal */
    def _linkToIdToken(_auth: AuthInternal, _idToken: String): js.Promise[IdTokenResponse] = js.native
    
    /**
      * The authentication provider ID for the credential.
      *
      * @remarks
      * For example, 'facebook.com', or 'google.com'.
      */
    val providerId: String = js.native
    
    /**
      * The authentication sign in method for the credential.
      *
      * @remarks
      * For example, {@link SignInMethod}.EMAIL_PASSWORD, or
      * {@link SignInMethod}.EMAIL_LINK. This corresponds to the sign-in method
      * identifier as returned in {@link fetchSignInMethodsForEmail}.
      */
    val signInMethod: String = js.native
    
    /**
      * Returns a JSON-serializable representation of this object.
      *
      * @returns a JSON-serializable representation of this object.
      */
    def toJSON(): js.Object = js.native
  }
}
