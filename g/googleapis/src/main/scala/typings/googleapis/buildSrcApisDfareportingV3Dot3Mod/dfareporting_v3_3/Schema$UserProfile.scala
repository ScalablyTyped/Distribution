package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a UserProfile resource.
  */
@js.native
trait Schema$UserProfile extends js.Object {
  /**
    * The account ID to which this profile belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The account name this profile belongs to.
    */
  var accountName: js.UndefOr[String] = js.native
  /**
    * The eTag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The kind of resource this is, in this case dfareporting#userProfile.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The unique ID of the user profile.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * The sub account ID this profile belongs to if applicable.
    */
  var subAccountId: js.UndefOr[String] = js.native
  /**
    * The sub account name this profile belongs to if applicable.
    */
  var subAccountName: js.UndefOr[String] = js.native
  /**
    * The user name.
    */
  var userName: js.UndefOr[String] = js.native
}

object Schema$UserProfile {
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
  ): Schema$UserProfile = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (accountName != null) __obj.updateDynamic("accountName")(accountName.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (subAccountId != null) __obj.updateDynamic("subAccountId")(subAccountId.asInstanceOf[js.Any])
    if (subAccountName != null) __obj.updateDynamic("subAccountName")(subAccountName.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserProfile]
  }
}

