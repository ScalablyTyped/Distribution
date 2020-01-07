package typings.googleapis.buildSrcApisStorageV1Mod.storage_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Name of a bucket.
    */
  var bucket: js.UndefOr[String] = js.native
  /**
    * If present, only return default ACL listing if the bucket's current
    * metageneration matches this value.
    */
  var ifMetagenerationMatch: js.UndefOr[String] = js.native
  /**
    * If present, only return default ACL listing if the bucket's current
    * metageneration does not match the given value.
    */
  var ifMetagenerationNotMatch: js.UndefOr[String] = js.native
  /**
    * The project to be billed for this request. Required for Requester Pays
    * buckets.
    */
  var userProject: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarList {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    bucket: String = null,
    fields: String = null,
    ifMetagenerationMatch: String = null,
    ifMetagenerationNotMatch: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null,
    userProject: String = null
  ): ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (ifMetagenerationMatch != null) __obj.updateDynamic("ifMetagenerationMatch")(ifMetagenerationMatch.asInstanceOf[js.Any])
    if (ifMetagenerationNotMatch != null) __obj.updateDynamic("ifMetagenerationNotMatch")(ifMetagenerationNotMatch.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarList]
  }
}

