package typings.googleCloudCommon.utilMod

import typings.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.mod.GoogleAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class MakeAuthenticatedRequestFactoryConfigOps[Self <: MakeAuthenticatedRequestFactoryConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthClient(value: GoogleAuth): Self = this.set("authClient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthClient: Self = this.set("authClient", js.undefined)
    @scala.inline
    def setAutoRetry(value: Boolean): Self = this.set("autoRetry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRetry: Self = this.set("autoRetry", js.undefined)
    @scala.inline
    def setCustomEndpoint(value: Boolean): Self = this.set("customEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomEndpoint: Self = this.set("customEndpoint", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    @scala.inline
    def setStream(value: Duplexify): Self = this.set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
  }
  
}

