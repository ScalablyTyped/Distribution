package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfile extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var accountName: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var profileId: js.UndefOr[String] = js.undefined
  var subAccountId: js.UndefOr[String] = js.undefined
  var subAccountName: js.UndefOr[String] = js.undefined
  var userName: js.UndefOr[String] = js.undefined
}

object UserProfile {
  @scala.inline
  def apply(
    accountId: String = null,
    accountName: String = null,
    etag: String = null,
    kind: String = null,
    profileId: String = null,
    subAccountId: String = null,
    subAccountName: String = null,
    userName: String = null
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

