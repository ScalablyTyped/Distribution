package typings.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var canonicalScopes: js.UndefOr[String] = js.native
}

object OAuthRequirements {
  @scala.inline
  def apply(): OAuthRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthRequirements]
  }
  @scala.inline
  implicit class OAuthRequirementsOps[Self <: OAuthRequirements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCanonicalScopes(value: String): Self = this.set("canonicalScopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanonicalScopes: Self = this.set("canonicalScopes", js.undefined)
  }
  
}

