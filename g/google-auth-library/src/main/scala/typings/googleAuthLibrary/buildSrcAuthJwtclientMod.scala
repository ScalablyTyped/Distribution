package typings.googleAuthLibrary

import typings.googleAuthLibrary.buildSrcAuthCredentialsMod.CredentialBody
import typings.googleAuthLibrary.buildSrcAuthCredentialsMod.Credentials
import typings.googleAuthLibrary.buildSrcAuthCredentialsMod.JWTInput
import typings.googleAuthLibrary.buildSrcAuthGoogleauthMod.JSONClient
import typings.googleAuthLibrary.buildSrcAuthIdtokenclientMod.IdTokenProvider
import typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.OAuth2Client
import typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.RefreshOptions
import typings.gtoken.mod.GoogleToken
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAuthJwtclientMod {
  
  @JSImport("google-auth-library/build/src/auth/jwtclient", "JWT")
  @js.native
  open class JWT protected ()
    extends OAuth2Client
       with IdTokenProvider
       with JSONClient {
    /**
      * JWT service account credentials.
      *
      * Retrieve access token using gtoken.
      *
      * @param email service account email address.
      * @param keyFile path to private key file.
      * @param key value of key
      * @param scopes list of requested scopes or a single scope.
      * @param subject impersonated account's email address.
      * @param key_id the ID of the key
      */
    def this(options: JWTOptions) = this()
    def this(
      email: js.UndefOr[String],
      keyFile: js.UndefOr[String],
      key: js.UndefOr[String],
      scopes: js.UndefOr[String | js.Array[String]],
      subject: js.UndefOr[String],
      keyId: js.UndefOr[String]
    ) = this()
    
    /* private */ var access: Any = js.native
    
    var additionalClaims: js.UndefOr[js.Object] = js.native
    
    /**
      * Get the initial access token using gToken.
      * @param callback Optional callback.
      * @returns Promise that resolves with credentials
      */
    def authorize(): js.Promise[Credentials] = js.native
    def authorize(callback: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Credentials], Unit]): Unit = js.native
    
    /* private */ var authorizeAsync: Any = js.native
    
    /**
      * Create a gToken if it doesn't already exist.
      */
    /* private */ var createGToken: Any = js.native
    
    /**
      * Creates a copy of the credential with the specified scopes.
      * @param scopes List of requested scopes or a single scope.
      * @return The cloned instance.
      */
    def createScoped(): JWT = js.native
    def createScoped(scopes: String): JWT = js.native
    def createScoped(scopes: js.Array[String]): JWT = js.native
    
    var defaultScopes: js.UndefOr[String | js.Array[String]] = js.native
    
    var defaultServicePath: js.UndefOr[String] = js.native
    
    var email: js.UndefOr[String] = js.native
    
    /* CompleteClass */
    override def fetchIdToken(targetAudience: String): js.Promise[String] = js.native
    
    /**
      * Creates a JWT credentials instance using an API Key for authentication.
      * @param apiKey The API Key in string form.
      */
    def fromAPIKey(apiKey: String): Unit = js.native
    
    /**
      * Create a JWT credentials instance using the given input options.
      * @param json The input object.
      */
    def fromJSON(json: JWTInput): Unit = js.native
    
    /**
      * Create a JWT credentials instance using the given input stream.
      * @param inputStream The input stream.
      * @param callback Optional callback.
      */
    def fromStream(inputStream: Readable): js.Promise[Unit] = js.native
    def fromStream(inputStream: Readable, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    /* private */ var fromStreamAsync: Any = js.native
    
    /**
      * Using the key or keyFile on the JWT client, obtain an object that contains
      * the key and the client email.
      */
    def getCredentials(): js.Promise[CredentialBody] = js.native
    
    var gtoken: js.UndefOr[GoogleToken] = js.native
    
    /**
      * Are there any default or user scopes defined.
      */
    /* private */ var hasAnyScopes: Any = js.native
    
    /**
      * Determine if there are currently scopes available.
      */
    /* private */ var hasUserScopes: Any = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var keyFile: js.UndefOr[String] = js.native
    
    var keyId: js.UndefOr[String] = js.native
    
    var scope: js.UndefOr[String] = js.native
    
    var scopes: js.UndefOr[String | js.Array[String]] = js.native
    
    var subject: js.UndefOr[String] = js.native
    
    var useJWTAccessWithScope: js.UndefOr[Boolean] = js.native
  }
  
  trait JWTOptions
    extends StObject
       with RefreshOptions {
    
    var additionalClaims: js.UndefOr[js.Object] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var keyFile: js.UndefOr[String] = js.undefined
    
    var keyId: js.UndefOr[String] = js.undefined
    
    var scopes: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
  }
  object JWTOptions {
    
    inline def apply(): JWTOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JWTOptions]
    }
    
    extension [Self <: JWTOptions](x: Self) {
      
      inline def setAdditionalClaims(value: js.Object): Self = StObject.set(x, "additionalClaims", value.asInstanceOf[js.Any])
      
      inline def setAdditionalClaimsUndefined: Self = StObject.set(x, "additionalClaims", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyFile(value: String): Self = StObject.set(x, "keyFile", value.asInstanceOf[js.Any])
      
      inline def setKeyFileUndefined: Self = StObject.set(x, "keyFile", js.undefined)
      
      inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setScopes(value: String | js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
}
