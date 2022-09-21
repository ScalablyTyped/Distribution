package typings.googleAuthLibrary

import typings.gaxios.commonMod.GaxiosOptions
import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.anon.Res
import typings.googleAuthLibrary.credentialsMod.Credentials
import typings.googleAuthLibrary.googleAuthLibraryStrings.tokens
import typings.googleAuthLibrary.oauth2clientMod.Headers
import typings.googleAuthLibrary.transportersMod.DefaultTransporter
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authclientMod {
  
  @JSImport("google-auth-library/build/src/auth/authclient", "AuthClient")
  @js.native
  abstract class AuthClient ()
    extends EventEmitter
       with CredentialsClient {
    def this(options: EventEmitterOptions) = this()
    
    /**
      * Append additional headers, e.g., x-goog-user-project, shared across the
      * classes inheriting AuthClient. This method should be used by any method
      * that overrides getRequestMetadataAsync(), which is a shared helper for
      * setting request information in both gRPC and HTTP API calls.
      *
      * @param headers object to append additional headers to.
      */
    /* protected */ def addSharedMetadataHeaders(headers: Headers): Headers = js.native
    
    var credentials: Credentials = js.native
    
    /* protected */ var quotaProjectId: js.UndefOr[String] = js.native
    
    var transporter: DefaultTransporter = js.native
  }
  
  @js.native
  trait CredentialsClient extends StObject {
    
    /**
      * The expiration threshold in milliseconds before forcing token refresh.
      */
    var eagerRefreshThresholdMillis: Double = js.native
    
    /**
      * Whether to force refresh on failure when making an authorization request.
      */
    var forceRefreshOnFailure: Boolean = js.native
    
    /**
      * @return A promise that resolves with the current GCP access token
      *   response. If the current credential is expired, a new one is retrieved.
      */
    def getAccessToken(): js.Promise[Res] = js.native
    
    /**
      * The main authentication interface. It takes an optional url which when
      * present is the endpoint being accessed, and returns a Promise which
      * resolves with authorization header fields.
      *
      * The result has the form:
      * { Authorization: 'Bearer <access_token_value>' }
      * @param url The URI being authorized.
      */
    def getRequestHeaders(): js.Promise[Headers] = js.native
    def getRequestHeaders(url: String): js.Promise[Headers] = js.native
    
    /**
      * Subscribes a listener to the tokens event triggered when a token is
      * generated.
      *
      * @param event The tokens event to subscribe to.
      * @param listener The listener that triggers on event trigger.
      * @return The current client instance.
      */
    @JSName("on")
    def on_tokens(event: tokens, listener: js.Function1[/* tokens */ Credentials, Unit]): this.type = js.native
    
    /**
      * The project ID corresponding to the current credentials if available.
      */
    var projectId: js.UndefOr[String | Null] = js.native
    
    /**
      * Provides an alternative Gaxios request implementation with auth credentials
      */
    def request[T](opts: GaxiosOptions): GaxiosPromise[T] = js.native
    
    /**
      * Sets the auth credentials.
      */
    def setCredentials(credentials: Credentials): Unit = js.native
  }
}
