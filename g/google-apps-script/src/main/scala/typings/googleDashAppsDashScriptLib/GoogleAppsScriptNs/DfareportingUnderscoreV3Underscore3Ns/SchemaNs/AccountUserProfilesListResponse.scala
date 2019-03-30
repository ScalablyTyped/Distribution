package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUserProfilesListResponse extends js.Object {
  var accountUserProfiles: js.UndefOr[js.Array[AccountUserProfile]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object AccountUserProfilesListResponse {
  @scala.inline
  def apply(
    accountUserProfiles: js.Array[AccountUserProfile] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): AccountUserProfilesListResponse = {
    val __obj = js.Dynamic.literal()
    if (accountUserProfiles != null) __obj.updateDynamic("accountUserProfiles")(accountUserProfiles)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[AccountUserProfilesListResponse]
  }
}

