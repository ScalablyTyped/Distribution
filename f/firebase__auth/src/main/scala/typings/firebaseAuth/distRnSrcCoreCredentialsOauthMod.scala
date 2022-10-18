package typings.firebaseAuth

import typings.firebaseAuth.distRnSrcCoreCredentialsAuthCredentialMod.AuthCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRnSrcCoreCredentialsOauthMod {
  
  @JSImport("@firebase/auth/dist/rn/src/core/credentials/oauth", "OAuthCredential")
  @js.native
  open class OAuthCredential protected () extends AuthCredential {
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
    
    /**
      * The OAuth access token associated with the credential if it belongs to an
      * {@link OAuthProvider}, such as `facebook.com`, `twitter.com`, etc.
      * @readonly
      */
    var accessToken: js.UndefOr[String] = js.native
    
    /* private */ var buildRequest: Any = js.native
    
    /**
      * The OAuth ID token associated with the credential if it belongs to an OIDC provider,
      * such as `google.com`.
      * @readonly
      */
    var idToken: js.UndefOr[String] = js.native
    
    /* private */ var nonce: Any = js.native
    
    /* private */ var pendingToken: Any = js.native
    
    /**
      * The OAuth access token secret associated with the credential if it belongs to an OAuth 1.0
      * provider, such as `twitter.com`.
      * @readonly
      */
    var secret: js.UndefOr[String] = js.native
  }
  /* static members */
  object OAuthCredential {
    
    @JSImport("@firebase/auth/dist/rn/src/core/credentials/oauth", "OAuthCredential")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _fromParams(params: OAuthCredentialParams): OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("_fromParams")(params.asInstanceOf[js.Any]).asInstanceOf[OAuthCredential]
    
    /**
      * Static method to deserialize a JSON representation of an object into an
      * {@link  AuthCredential}.
      *
      * @param json - Input can be either Object or the stringified representation of the object.
      * When string is provided, JSON.parse would be called first.
      *
      * @returns If the JSON input does not represent an {@link  AuthCredential}, null is returned.
      */
    inline def fromJSON(json: String): OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[OAuthCredential | Null]
    inline def fromJSON(json: js.Object): OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[OAuthCredential | Null]
  }
  
  trait OAuthCredentialParams extends StObject {
    
    var accessToken: js.UndefOr[String | Null] = js.undefined
    
    var idToken: js.UndefOr[String | Null] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var oauthToken: js.UndefOr[String] = js.undefined
    
    var oauthTokenSecret: js.UndefOr[String] = js.undefined
    
    var pendingToken: js.UndefOr[String] = js.undefined
    
    var providerId: String
    
    var secret: js.UndefOr[String] = js.undefined
    
    var signInMethod: String
  }
  object OAuthCredentialParams {
    
    inline def apply(providerId: String, signInMethod: String): OAuthCredentialParams = {
      val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], signInMethod = signInMethod.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuthCredentialParams]
    }
    
    extension [Self <: OAuthCredentialParams](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenNull: Self = StObject.set(x, "accessToken", null)
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setIdTokenNull: Self = StObject.set(x, "idToken", null)
      
      inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setOauthToken(value: String): Self = StObject.set(x, "oauthToken", value.asInstanceOf[js.Any])
      
      inline def setOauthTokenSecret(value: String): Self = StObject.set(x, "oauthTokenSecret", value.asInstanceOf[js.Any])
      
      inline def setOauthTokenSecretUndefined: Self = StObject.set(x, "oauthTokenSecret", js.undefined)
      
      inline def setOauthTokenUndefined: Self = StObject.set(x, "oauthToken", js.undefined)
      
      inline def setPendingToken(value: String): Self = StObject.set(x, "pendingToken", value.asInstanceOf[js.Any])
      
      inline def setPendingTokenUndefined: Self = StObject.set(x, "pendingToken", js.undefined)
      
      inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      inline def setSignInMethod(value: String): Self = StObject.set(x, "signInMethod", value.asInstanceOf[js.Any])
    }
  }
}
