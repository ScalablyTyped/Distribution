package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfile extends js.Object {
  /** The account ID to which this profile belongs. */
  var accountId: js.UndefOr[String] = js.undefined
  /** The account name this profile belongs to. */
  var accountName: js.UndefOr[String] = js.undefined
  /** The eTag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.undefined
  /** The kind of resource this is, in this case dfareporting#userProfile. */
  var kind: js.UndefOr[String] = js.undefined
  /** The unique ID of the user profile. */
  var profileId: js.UndefOr[String] = js.undefined
  /** The sub account ID this profile belongs to if applicable. */
  var subAccountId: js.UndefOr[String] = js.undefined
  /** The sub account name this profile belongs to if applicable. */
  var subAccountName: js.UndefOr[String] = js.undefined
  /** The user name. */
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

