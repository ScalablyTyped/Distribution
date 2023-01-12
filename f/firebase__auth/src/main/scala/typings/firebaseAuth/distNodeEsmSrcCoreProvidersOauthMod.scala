package typings.firebaseAuth

import typings.firebaseAuth.distNodeEsmSrcCoreCredentialsOauthMod.OAuthCredential
import typings.firebaseAuth.distNodeEsmSrcCoreProvidersFederatedMod.FederatedAuthProvider
import typings.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.AuthProvider
import typings.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.UserCredential
import typings.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreProvidersOauthMod {
  
  /* note: abstract class */ @JSImport("@firebase/auth/dist/node-esm/src/core/providers/oauth", "BaseOAuthProvider")
  @js.native
  open class BaseOAuthProvider protected () extends FederatedAuthProvider {
    /**
      * Constructor for generic OAuth providers.
      *
      * @param providerId - Provider for which credentials should be generated.
      */
    def this(providerId: String) = this()
    
    /**
      * Add an OAuth scope to the credential.
      *
      * @param scope - Provider OAuth scope to add.
      */
    def addScope(scope: String): AuthProvider = js.native
    
    /**
      * Retrieve the current list of OAuth scopes.
      */
    def getScopes(): js.Array[String] = js.native
    
    /** @internal */
    /* private */ var scopes: Any = js.native
  }
  
  @JSImport("@firebase/auth/dist/node-esm/src/core/providers/oauth", "OAuthProvider")
  @js.native
  open class OAuthProvider protected () extends BaseOAuthProvider {
    /**
      * Constructor for generic OAuth providers.
      *
      * @param providerId - Provider for which credentials should be generated.
      */
    def this(providerId: String) = this()
    
    /** An internal credential method that accepts more permissive options */
    /* private */ var _credential: Any = js.native
    
    /**
      * Creates a {@link OAuthCredential} from a generic OAuth provider's access token or ID token.
      *
      * @remarks
      * The raw nonce is required when an ID token with a nonce field is provided. The SHA-256 hash of
      * the raw nonce must match the nonce field in the ID token.
      *
      * @example
      * ```javascript
      * // `googleUser` from the onsuccess Google Sign In callback.
      * // Initialize a generate OAuth provider with a `google.com` providerId.
      * const provider = new OAuthProvider('google.com');
      * const credential = provider.credential({
      *   idToken: googleUser.getAuthResponse().id_token,
      * });
      * const result = await signInWithCredential(credential);
      * ```
      *
      * @param params - Either the options object containing the ID token, access token and raw nonce
      * or the ID token string.
      */
    def credential(params: OAuthCredentialOptions): OAuthCredential = js.native
  }
  /* static members */
  object OAuthProvider {
    
    @JSImport("@firebase/auth/dist/node-esm/src/core/providers/oauth", "OAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
      * thrown during a sign-in, link, or reauthenticate operation.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromError(error: FirebaseError): OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[OAuthCredential | Null]
    
    inline def credentialFromJSON(json: String): OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[OAuthCredential]
    /**
      * Creates an {@link OAuthCredential} from a JSON string or a plain object.
      * @param json - A plain object or a JSON string
      */
    inline def credentialFromJSON(json: js.Object): OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[OAuthCredential]
    
    /**
      * Used to extract the underlying {@link OAuthCredential} from a {@link UserCredential}.
      *
      * @param userCredential - The user credential.
      */
    inline def credentialFromResult(userCredential: UserCredential): OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[OAuthCredential | Null]
    
    @JSImport("@firebase/auth/dist/node-esm/src/core/providers/oauth", "OAuthProvider.oauthCredentialFromTaggedObject")
    @js.native
    def oauthCredentialFromTaggedObject: Any = js.native
    inline def oauthCredentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oauthCredentialFromTaggedObject")(x.asInstanceOf[js.Any])
  }
  
  trait OAuthCredentialOptions extends StObject {
    
    /**
      * The OAuth access token used to initialize the {@link OAuthCredential}.
      */
    var accessToken: js.UndefOr[String] = js.undefined
    
    /**
      * The OAuth ID token used to initialize the {@link OAuthCredential}.
      */
    var idToken: js.UndefOr[String] = js.undefined
    
    /**
      * The raw nonce associated with the ID token.
      *
      * @remarks
      * It is required when an ID token with a nonce field is provided. The SHA-256 hash of the
      * raw nonce must match the nonce field in the ID token.
      */
    var rawNonce: js.UndefOr[String] = js.undefined
  }
  object OAuthCredentialOptions {
    
    inline def apply(): OAuthCredentialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OAuthCredentialOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OAuthCredentialOptions] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
      
      inline def setRawNonce(value: String): Self = StObject.set(x, "rawNonce", value.asInstanceOf[js.Any])
      
      inline def setRawNonceUndefined: Self = StObject.set(x, "rawNonce", js.undefined)
    }
  }
}
