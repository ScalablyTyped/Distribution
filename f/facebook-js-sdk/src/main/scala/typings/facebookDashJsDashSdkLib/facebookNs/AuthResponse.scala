package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////
//
//  RESPONSES
//
////////////////////////
trait AuthResponse extends js.Object {
  var accessToken: java.lang.String
  var expiresIn: scala.Double
  var grantedScopes: js.UndefOr[java.lang.String] = js.undefined
  var reauthorize_required_in: js.UndefOr[scala.Double] = js.undefined
  var signedRequest: java.lang.String
  var userID: java.lang.String
}

