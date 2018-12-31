package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthRequirements extends js.Object {
  /**
    * The list of publicly documented OAuth scopes that are allowed access. An
    * OAuth token containing any of these scopes will be accepted.
    *
    * Example:
    *
    * canonical_scopes: https://www.googleapis.com/auth/calendar,
    * https://www.googleapis.com/auth/calendar.read
    */
  var canonicalScopes: js.UndefOr[java.lang.String] = js.undefined
}

