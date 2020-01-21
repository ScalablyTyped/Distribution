package typings.gapiAuth2.gapi.auth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.auth2.authorize")
@js.native
object authorize extends js.Object {
  /**
    * Performs a one time OAuth 2.0 authorization.
    * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2authorizeparams-callback
    */
  def apply(params: AuthorizeConfig, callback: js.Function1[/* response */ AuthorizeResponse, Unit]): Unit = js.native
}

