package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUserProfilesListResponse extends js.Object {
  /** Account user profile collection. */
  var accountUserProfiles: js.UndefOr[js.Array[AccountUserProfile]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountUserProfilesListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to be used for the next list operation. */
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

