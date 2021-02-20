package typings.googleCloudCommon.utilMod

import typings.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.mod.GoogleAuth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MakeAuthenticatedRequestFactoryConfig extends GoogleAuthOptions {
  
  /**
    * A pre-instantiated GoogleAuth client that should be used.
    * A new will be created if this is not set.
    */
  var authClient: js.UndefOr[GoogleAuth] = js.native
  
  /**
    * Automatically retry requests if the response is related to rate limits or
    * certain intermittent server errors. We will exponentially backoff
    * subsequent requests by default. (default: true)
    */
  var autoRetry: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, just return the provided request options. Default: false.
    */
  var customEndpoint: js.UndefOr[Boolean] = js.native
  
  /**
    * Account email address, required for PEM/P12 usage.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of automatic retries attempted before returning the error.
    * (default: 3)
    */
  var maxRetries: js.UndefOr[Double] = js.native
  
  var stream: js.UndefOr[Duplexify] = js.native
}
object MakeAuthenticatedRequestFactoryConfig {
  
  @scala.inline
  def apply(): MakeAuthenticatedRequestFactoryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeAuthenticatedRequestFactoryConfig]
  }
  
  @scala.inline
  implicit class MakeAuthenticatedRequestFactoryConfigMutableBuilder[Self <: MakeAuthenticatedRequestFactoryConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthClient(value: GoogleAuth): Self = StObject.set(x, "authClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthClientUndefined: Self = StObject.set(x, "authClient", js.undefined)
    
    @scala.inline
    def setAutoRetry(value: Boolean): Self = StObject.set(x, "autoRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRetryUndefined: Self = StObject.set(x, "autoRetry", js.undefined)
    
    @scala.inline
    def setCustomEndpoint(value: Boolean): Self = StObject.set(x, "customEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomEndpointUndefined: Self = StObject.set(x, "customEndpoint", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    @scala.inline
    def setStream(value: Duplexify): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
