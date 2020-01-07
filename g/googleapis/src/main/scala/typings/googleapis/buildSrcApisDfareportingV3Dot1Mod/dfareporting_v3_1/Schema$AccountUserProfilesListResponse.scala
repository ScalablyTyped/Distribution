package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Account User Profile List Response
  */
@js.native
trait Schema$AccountUserProfilesListResponse extends js.Object {
  /**
    * Account user profile collection.
    */
  var accountUserProfiles: js.UndefOr[js.Array[Schema$AccountUserProfile]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountUserProfilesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$AccountUserProfilesListResponse {
  @scala.inline
  def apply(
    accountUserProfiles: js.Array[Schema$AccountUserProfile] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$AccountUserProfilesListResponse = {
    val __obj = js.Dynamic.literal()
    if (accountUserProfiles != null) __obj.updateDynamic("accountUserProfiles")(accountUserProfiles.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountUserProfilesListResponse]
  }
}

