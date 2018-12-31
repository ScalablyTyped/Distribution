package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdpConfig extends js.Object {
  /** OAuth2 client ID. */
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this IDP is enabled. */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Percent of users who will be prompted/redirected federated login for this IDP. */
  var experimentPercent: js.UndefOr[scala.Double] = js.undefined
  /** OAuth2 provider. */
  var provider: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth2 client secret. */
  var secret: js.UndefOr[java.lang.String] = js.undefined
  /** Whitelisted client IDs for audience check. */
  var whitelistedAudiences: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

