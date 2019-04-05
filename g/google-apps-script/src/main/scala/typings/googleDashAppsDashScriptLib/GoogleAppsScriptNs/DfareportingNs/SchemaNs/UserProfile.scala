package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfile extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var accountName: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var profileId: js.UndefOr[java.lang.String] = js.undefined
  var subAccountId: js.UndefOr[java.lang.String] = js.undefined
  var subAccountName: js.UndefOr[java.lang.String] = js.undefined
  var userName: js.UndefOr[java.lang.String] = js.undefined
}

object UserProfile {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    accountName: java.lang.String = null,
    etag: java.lang.String = null,
    kind: java.lang.String = null,
    profileId: java.lang.String = null,
    subAccountId: java.lang.String = null,
    subAccountName: java.lang.String = null,
    userName: java.lang.String = null
  ): UserProfile = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (accountName != null) __obj.updateDynamic("accountName")(accountName)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (profileId != null) __obj.updateDynamic("profileId")(profileId)
    if (subAccountId != null) __obj.updateDynamic("subAccountId")(subAccountId)
    if (subAccountName != null) __obj.updateDynamic("subAccountName")(subAccountName)
    if (userName != null) __obj.updateDynamic("userName")(userName)
    __obj.asInstanceOf[UserProfile]
  }
}

