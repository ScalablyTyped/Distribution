package typings.firebaseAdmin

import typings.firebaseAdmin.credentialMod.Credential
import typings.firebaseAdmin.credentialMod.GoogleOAuthAccessToken
import typings.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object credentialInternalMod {
  
  @JSImport("firebase-admin/lib/app/credential-internal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/app/credential-internal", "ComputeEngineCredential")
  @js.native
  open class ComputeEngineCredential ()
    extends StObject
       with Credential {
    def this(httpAgent: Agent) = this()
    
    /* private */ var accountId: Any = js.native
    
    /* private */ var buildRequest: Any = js.native
    
    /**
      * Returns a Google OAuth2 access token object used to authenticate with
      * Firebase services.
      *
      * @returns A Google OAuth2 access token object.
      */
    /* CompleteClass */
    override def getAccessToken(): js.Promise[GoogleOAuthAccessToken] = js.native
    
    /**
      * getIDToken returns a OIDC token from the compute metadata service
      * that can be used to make authenticated calls to audience
      * @param audience the URL the returned ID token will be used to call.
      */
    def getIDToken(audience: String): js.Promise[String] = js.native
    
    def getProjectId(): js.Promise[String] = js.native
    
    def getServiceAccountEmail(): js.Promise[String] = js.native
    
    /* private */ val httpAgent: Any = js.native
    
    /* private */ val httpClient: Any = js.native
    
    /* private */ var projectId: Any = js.native
  }
  
  @JSImport("firebase-admin/lib/app/credential-internal", "RefreshTokenCredential")
  @js.native
  open class RefreshTokenCredential protected ()
    extends StObject
       with Credential {
    /**
      * Creates a new RefreshTokenCredential from the given parameters.
      *
      * @param refreshTokenPathOrObject - Refresh token json object or path to a refresh token
      *   (user credentials) json file.
      * @param httpAgent - Optional http.Agent to use when calling the remote token server.
      * @param implicit - An optinal boolean indicating whether this credential was implicitly
      *   discovered from the environment, as opposed to being explicitly specified by the developer.
      *
      * @constructor
      */
    def this(refreshTokenPathOrObject: String) = this()
    def this(refreshTokenPathOrObject: js.Object) = this()
    def this(refreshTokenPathOrObject: String, httpAgent: Agent) = this()
    def this(refreshTokenPathOrObject: js.Object, httpAgent: Agent) = this()
    def this(refreshTokenPathOrObject: String, httpAgent: Unit, `implicit`: Boolean) = this()
    def this(refreshTokenPathOrObject: String, httpAgent: Agent, `implicit`: Boolean) = this()
    def this(refreshTokenPathOrObject: js.Object, httpAgent: Unit, `implicit`: Boolean) = this()
    def this(refreshTokenPathOrObject: js.Object, httpAgent: Agent, `implicit`: Boolean) = this()
    
    /**
      * Returns a Google OAuth2 access token object used to authenticate with
      * Firebase services.
      *
      * @returns A Google OAuth2 access token object.
      */
    /* CompleteClass */
    override def getAccessToken(): js.Promise[GoogleOAuthAccessToken] = js.native
    
    /* private */ val httpAgent: Any = js.native
    
    /* private */ val httpClient: Any = js.native
    
    val `implicit`: Boolean = js.native
    
    /* private */ val refreshToken: Any = js.native
  }
  
  @JSImport("firebase-admin/lib/app/credential-internal", "ServiceAccountCredential")
  @js.native
  open class ServiceAccountCredential protected ()
    extends StObject
       with Credential {
    /**
      * Creates a new ServiceAccountCredential from the given parameters.
      *
      * @param serviceAccountPathOrObject - Service account json object or path to a service account json file.
      * @param httpAgent - Optional http.Agent to use when calling the remote token server.
      * @param implicit - An optinal boolean indicating whether this credential was implicitly discovered from the
      *   environment, as opposed to being explicitly specified by the developer.
      *
      * @constructor
      */
    def this(serviceAccountPathOrObject: String) = this()
    def this(serviceAccountPathOrObject: js.Object) = this()
    def this(serviceAccountPathOrObject: String, httpAgent: Agent) = this()
    def this(serviceAccountPathOrObject: js.Object, httpAgent: Agent) = this()
    def this(serviceAccountPathOrObject: String, httpAgent: Unit, `implicit`: Boolean) = this()
    def this(serviceAccountPathOrObject: String, httpAgent: Agent, `implicit`: Boolean) = this()
    def this(serviceAccountPathOrObject: js.Object, httpAgent: Unit, `implicit`: Boolean) = this()
    def this(serviceAccountPathOrObject: js.Object, httpAgent: Agent, `implicit`: Boolean) = this()
    
    val clientEmail: String = js.native
    
    /* private */ var createAuthJwt_ : Any = js.native
    
    /**
      * Returns a Google OAuth2 access token object used to authenticate with
      * Firebase services.
      *
      * @returns A Google OAuth2 access token object.
      */
    /* CompleteClass */
    override def getAccessToken(): js.Promise[GoogleOAuthAccessToken] = js.native
    
    /* private */ val httpAgent: Any = js.native
    
    /* private */ val httpClient: Any = js.native
    
    val `implicit`: Boolean = js.native
    
    val privateKey: String = js.native
    
    val projectId: String = js.native
  }
  
  inline def getApplicationDefault(): Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicationDefault")().asInstanceOf[Credential]
  inline def getApplicationDefault(httpAgent: Agent): Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicationDefault")(httpAgent.asInstanceOf[js.Any]).asInstanceOf[Credential]
  
  inline def isApplicationDefault(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isApplicationDefault")().asInstanceOf[Boolean]
  inline def isApplicationDefault(credential: Credential): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isApplicationDefault")(credential.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
