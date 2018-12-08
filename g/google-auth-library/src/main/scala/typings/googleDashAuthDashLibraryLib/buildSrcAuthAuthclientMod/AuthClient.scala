package typings
package googleDashAuthDashLibraryLib.buildSrcAuthAuthclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-auth-library/build/src/auth/authclient", "AuthClient")
@js.native
abstract class AuthClient ()
  extends nodeLib.eventsMod.EventEmitter {
  var credentials: googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.Credentials = js.native
  var transporter: googleDashAuthDashLibraryLib.buildSrcTransportersMod.DefaultTransporter = js.native
  @JSName("on")
  def on_tokens(
    event: googleDashAuthDashLibraryLib.googleDashAuthDashLibraryLibStrings.tokens,
    listener: js.Function1[
      /* tokens */ googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.Credentials, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
       * Provides an alternative Axios request implementation with auth credentials
       */
  def request[T](opts: axiosLib.axiosMod.AxiosRequestConfig): axiosLib.axiosMod.AxiosPromise[T] = js.native
  /**
       * Sets the auth credentials.
       */
  def setCredentials(credentials: googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.Credentials): scala.Unit = js.native
}

