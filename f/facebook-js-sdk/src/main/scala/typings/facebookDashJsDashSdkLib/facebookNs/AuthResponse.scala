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

object AuthResponse {
  @scala.inline
  def apply(
    accessToken: java.lang.String,
    expiresIn: scala.Double,
    signedRequest: java.lang.String,
    userID: java.lang.String,
    grantedScopes: java.lang.String = null,
    reauthorize_required_in: scala.Int | scala.Double = null
  ): AuthResponse = {
    val __obj = js.Dynamic.literal(accessToken = accessToken, expiresIn = expiresIn, signedRequest = signedRequest, userID = userID)
    if (grantedScopes != null) __obj.updateDynamic("grantedScopes")(grantedScopes)
    if (reauthorize_required_in != null) __obj.updateDynamic("reauthorize_required_in")(reauthorize_required_in.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthResponse]
  }
}

