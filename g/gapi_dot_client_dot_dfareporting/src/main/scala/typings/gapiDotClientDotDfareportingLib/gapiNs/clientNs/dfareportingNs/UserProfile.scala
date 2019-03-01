package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfile extends js.Object {
  /** The account ID to which this profile belongs. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** The account name this profile belongs to. */
  var accountName: js.UndefOr[java.lang.String] = js.undefined
  /** The eTag of this response for caching purposes. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The kind of resource this is, in this case dfareporting#userProfile. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The unique ID of the user profile. */
  var profileId: js.UndefOr[java.lang.String] = js.undefined
  /** The sub account ID this profile belongs to if applicable. */
  var subAccountId: js.UndefOr[java.lang.String] = js.undefined
  /** The sub account name this profile belongs to if applicable. */
  var subAccountName: js.UndefOr[java.lang.String] = js.undefined
  /** The user name. */
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

