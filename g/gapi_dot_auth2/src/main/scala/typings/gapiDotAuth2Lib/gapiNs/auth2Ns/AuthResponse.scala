package typings
package gapiDotAuth2Lib.gapiNs.auth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2authresponse
   */

trait AuthResponse extends js.Object {
  var access_token: java.lang.String
  var expires_at: scala.Double
  var expires_in: scala.Double
  var first_issued_at: scala.Double
  var id_token: java.lang.String
  var login_hint: java.lang.String
  var scope: java.lang.String
}

