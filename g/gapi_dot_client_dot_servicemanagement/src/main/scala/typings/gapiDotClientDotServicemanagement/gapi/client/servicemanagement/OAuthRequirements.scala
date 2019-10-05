package typings.gapiDotClientDotServicemanagement.gapi.client.servicemanagement

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
  var canonicalScopes: js.UndefOr[String] = js.undefined
}

object OAuthRequirements {
  @scala.inline
  def apply(canonicalScopes: String = null): OAuthRequirements = {
    val __obj = js.Dynamic.literal()
    if (canonicalScopes != null) __obj.updateDynamic("canonicalScopes")(canonicalScopes)
    __obj.asInstanceOf[OAuthRequirements]
  }
}

