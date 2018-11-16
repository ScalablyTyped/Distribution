package typings
package gapiDotAuth2Lib.gapiNs.auth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2authorizeresponse
   */

trait AuthorizeResponse extends js.Object {
  var access_token: java.lang.String
  var code: java.lang.String
  var error: java.lang.String
  var error_subtype: java.lang.String
  var expires_at: scala.Double
  var expires_in: scala.Double
  var first_issued_at: scala.Double
  var id_token: java.lang.String
  var scope: java.lang.String
}

