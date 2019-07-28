package typings.googleDashAuthDashLibrary.buildSrcAuthAuthclientMod

import typings.gaxios.buildSrcCommonMod.GaxiosOptions
import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleDashAuthDashLibrary.buildSrcAuthCredentialsMod.Credentials
import typings.googleDashAuthDashLibrary.buildSrcTransportersMod.DefaultTransporter
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryStrings.tokens
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-auth-library/build/src/auth/authclient", "AuthClient")
@js.native
abstract class AuthClient () extends EventEmitter {
  var credentials: Credentials = js.native
  var transporter: DefaultTransporter = js.native
  @JSName("on")
  def on_tokens(event: tokens, listener: js.Function1[/* tokens */ Credentials, Unit]): this.type = js.native
  /**
    * Provides an alternative Gaxios request implementation with auth credentials
    */
  def request[T](opts: GaxiosOptions): GaxiosPromise[T] = js.native
  /**
    * Sets the auth credentials.
    */
  def setCredentials(credentials: Credentials): Unit = js.native
}

