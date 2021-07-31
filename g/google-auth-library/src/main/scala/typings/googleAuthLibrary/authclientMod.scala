package typings.googleAuthLibrary

import typings.gaxios.commonMod.GaxiosOptions
import typings.gaxios.commonMod.GaxiosPromise
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
  abstract class AuthClient () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    /**
      * Append additional headers, e.g., x-goog-user-project, shared across the
      * classes inheriting AuthClient. This method should be used by any method
      * that overrides getRequestMetadataAsync(), which is a shared helper for
      * setting request information in both gRPC and HTTP API calls.
      *
      * @param headers objedcdt to append additional headers to.
      */
    /* protected */ def addSharedMetadataHeaders(headers: Headers): Headers = js.native
    
    var credentials: Credentials = js.native
    
    @JSName("on")
    def on_tokens(event: tokens, listener: js.Function1[/* tokens */ Credentials, Unit]): this.type = js.native
    
    var quotaProjectId: js.UndefOr[String] = js.native
    
    /**
      * Provides an alternative Gaxios request implementation with auth credentials
      */
    def request[T](opts: GaxiosOptions): GaxiosPromise[T] = js.native
    
    /**
      * Sets the auth credentials.
      */
    def setCredentials(credentials: Credentials): Unit = js.native
    
    var transporter: DefaultTransporter = js.native
  }
}
