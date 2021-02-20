package typings.firebaseAdmin

import typings.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object credentialMod {
  
  object credential {
    
    /**
      * Returns a credential created from the
      * {@link
      *    https://developers.google.com/identity/protocols/application-default-credentials
      *    Google Application Default Credentials}
      * that grants admin access to Firebase services. This credential can be used
      * in the call to
      * {@link
      *   https://firebase.google.com/docs/reference/admin/node/admin#.initializeApp
      *  `admin.initializeApp()`}.
      *
      * Google Application Default Credentials are available on any Google
      * infrastructure, such as Google App Engine and Google Compute Engine.
      *
      * See
      * {@link
      *   https://firebase.google.com/docs/admin/setup#initialize_the_sdk
      *   Initialize the SDK}
      * for more details.
      *
      * @example
      * ```javascript
      * admin.initializeApp({
      *   credential: admin.credential.applicationDefault(),
      *   databaseURL: "https://<DATABASE_NAME>.firebaseio.com"
      * });
      * ```
      *
      * @param {!Object=} httpAgent Optional [HTTP Agent](https://nodejs.org/api/http.html#http_class_http_agent)
      *   to be used when retrieving access tokens from Google token servers.
      *
      * @return {!admin.credential.Credential} A credential authenticated via Google
      *   Application Default Credentials that can be used to initialize an app.
      */
    @JSImport("firebase-admin/lib/credential", "credential.applicationDefault")
    @js.native
    def applicationDefault(): Credential = js.native
    @JSImport("firebase-admin/lib/credential", "credential.applicationDefault")
    @js.native
    def applicationDefault(httpAgent: Agent): Credential = js.native
    
    /**
      * Returns a credential created from the provided service account that grants
      * admin access to Firebase services. This credential can be used in the call
      * to
      * {@link
      *   https://firebase.google.com/docs/reference/admin/node/admin#.initializeApp
      *   `admin.initializeApp()`}.
      *
      * See
      * {@link
      *   https://firebase.google.com/docs/admin/setup#initialize_the_sdk
      *   Initialize the SDK}
      * for more details.
      *
      * @example
      * ```javascript
      * // Providing a path to a service account key JSON file
      * var serviceAccount = require("path/to/serviceAccountKey.json");
      * admin.initializeApp({
      *   credential: admin.credential.cert(serviceAccount),
      *   databaseURL: "https://<DATABASE_NAME>.firebaseio.com"
      * });
      * ```
      *
      * @example
      * ```javascript
      * // Providing a service account object inline
      * admin.initializeApp({
      *   credential: admin.credential.cert({
      *     projectId: "<PROJECT_ID>",
      *     clientEmail: "foo@<PROJECT_ID>.iam.gserviceaccount.com",
      *     privateKey: "-----BEGIN PRIVATE KEY-----<KEY>-----END PRIVATE KEY-----\n"
      *   }),
      *   databaseURL: "https://<DATABASE_NAME>.firebaseio.com"
      * });
      * ```
      *
      * @param serviceAccountPathOrObject The path to a service
      *   account key JSON file or an object representing a service account key.
      * @param httpAgent Optional [HTTP Agent](https://nodejs.org/api/http.html#http_class_http_agent)
      *   to be used when retrieving access tokens from Google token servers.
      *
      * @return A credential authenticated via the
      *   provided service account that can be used to initialize an app.
      */
    @JSImport("firebase-admin/lib/credential", "credential.cert")
    @js.native
    def cert(serviceAccountPathOrObject: String): Credential = js.native
    @JSImport("firebase-admin/lib/credential", "credential.cert")
    @js.native
    def cert(serviceAccountPathOrObject: String, httpAgent: Agent): Credential = js.native
    @JSImport("firebase-admin/lib/credential", "credential.cert")
    @js.native
    def cert(serviceAccountPathOrObject: ServiceAccount): Credential = js.native
    @JSImport("firebase-admin/lib/credential", "credential.cert")
    @js.native
    def cert(serviceAccountPathOrObject: ServiceAccount, httpAgent: Agent): Credential = js.native
    
    /**
      * Returns a credential created from the provided refresh token that grants
      * admin access to Firebase services. This credential can be used in the call
      * to
      * {@link
      *   https://firebase.google.com/docs/reference/admin/node/admin#.initializeApp
      *   `admin.initializeApp()`}.
      *
      * See
      * {@link
      *   https://firebase.google.com/docs/admin/setup#initialize_the_sdk
      *   Initialize the SDK}
      * for more details.
      *
      * @example
      * ```javascript
      * // Providing a path to a refresh token JSON file
      * var refreshToken = require("path/to/refreshToken.json");
      * admin.initializeApp({
      *   credential: admin.credential.refreshToken(refreshToken),
      *   databaseURL: "https://<DATABASE_NAME>.firebaseio.com"
      * });
      * ```
      *
      * @param refreshTokenPathOrObject The path to a Google
      *   OAuth2 refresh token JSON file or an object representing a Google OAuth2
      *   refresh token.
      * @param httpAgent Optional [HTTP Agent](https://nodejs.org/api/http.html#http_class_http_agent)
      *   to be used when retrieving access tokens from Google token servers.
      *
      * @return A credential authenticated via the
      *   provided service account that can be used to initialize an app.
      */
    @JSImport("firebase-admin/lib/credential", "credential.refreshToken")
    @js.native
    def refreshToken(refreshTokenPathOrObject: String): Credential = js.native
    @JSImport("firebase-admin/lib/credential", "credential.refreshToken")
    @js.native
    def refreshToken(refreshTokenPathOrObject: String, httpAgent: Agent): Credential = js.native
    @JSImport("firebase-admin/lib/credential", "credential.refreshToken")
    @js.native
    def refreshToken(refreshTokenPathOrObject: js.Object): Credential = js.native
    @JSImport("firebase-admin/lib/credential", "credential.refreshToken")
    @js.native
    def refreshToken(refreshTokenPathOrObject: js.Object, httpAgent: Agent): Credential = js.native
    
    /**
      * Interface that provides Google OAuth2 access tokens used to authenticate
      * with Firebase services.
      *
      * In most cases, you will not need to implement this yourself and can instead
      * use the default implementations provided by
      * {@link credential `admin.credential`}.
      */
    @js.native
    trait Credential extends StObject {
      
      /**
        * Returns a Google OAuth2 access token object used to authenticate with
        * Firebase services.
        *
        * This object contains the following properties:
        * * `access_token` (`string`): The actual Google OAuth2 access token.
        * * `expires_in` (`number`): The number of seconds from when the token was
        *   issued that it expires.
        *
        * @return A Google OAuth2 access token object.
        */
      def getAccessToken(): js.Promise[GoogleOAuthAccessToken] = js.native
    }
    object Credential {
      
      @scala.inline
      def apply(getAccessToken: () => js.Promise[GoogleOAuthAccessToken]): Credential = {
        val __obj = js.Dynamic.literal(getAccessToken = js.Any.fromFunction0(getAccessToken))
        __obj.asInstanceOf[Credential]
      }
      
      @scala.inline
      implicit class CredentialMutableBuilder[Self <: Credential] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetAccessToken(value: () => js.Promise[GoogleOAuthAccessToken]): Self = StObject.set(x, "getAccessToken", js.Any.fromFunction0(value))
      }
    }
  }
  
  @js.native
  trait GoogleOAuthAccessToken extends StObject {
    
    var access_token: String = js.native
    
    var expires_in: Double = js.native
  }
  object GoogleOAuthAccessToken {
    
    @scala.inline
    def apply(access_token: String, expires_in: Double): GoogleOAuthAccessToken = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoogleOAuthAccessToken]
    }
    
    @scala.inline
    implicit class GoogleOAuthAccessTokenMutableBuilder[Self <: GoogleOAuthAccessToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ServiceAccount extends StObject {
    
    var clientEmail: js.UndefOr[String] = js.native
    
    var privateKey: js.UndefOr[String] = js.native
    
    var projectId: js.UndefOr[String] = js.native
  }
  object ServiceAccount {
    
    @scala.inline
    def apply(): ServiceAccount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceAccount]
    }
    
    @scala.inline
    implicit class ServiceAccountMutableBuilder[Self <: ServiceAccount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientEmail(value: String): Self = StObject.set(x, "clientEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientEmailUndefined: Self = StObject.set(x, "clientEmail", js.undefined)
      
      @scala.inline
      def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      @scala.inline
      def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    }
  }
}
