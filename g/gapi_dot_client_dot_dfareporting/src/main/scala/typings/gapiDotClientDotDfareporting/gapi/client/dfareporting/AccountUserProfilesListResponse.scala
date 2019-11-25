package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUserProfilesListResponse extends js.Object {
  /** Account user profile collection. */
  var accountUserProfiles: js.UndefOr[js.Array[AccountUserProfile]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountUserProfilesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object AccountUserProfilesListResponse {
  @scala.inline
  def apply(
    accountUserProfiles: js.Array[AccountUserProfile] = null,
    kind: String = null,
    nextPageToken: String = null
  ): AccountUserProfilesListResponse = {
    val __obj = js.Dynamic.literal()
    if (accountUserProfiles != null) __obj.updateDynamic("accountUserProfiles")(accountUserProfiles.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountUserProfilesListResponse]
  }
}

