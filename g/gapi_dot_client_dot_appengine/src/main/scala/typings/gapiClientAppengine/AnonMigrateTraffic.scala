package typings.gapiClientAppengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMigrateTraffic extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Part of `name`. Name of the resource to update. Example: apps/myapp/services/default. */
  var appsId: String
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /**
    * Set to true to gradually shift traffic to one or more versions that you specify. By default, traffic is shifted immediately. For gradual traffic
    * migration, the target versions must be located within instances that are configured for both warmup requests
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#inboundservicetype) and automatic scaling
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#automaticscaling). You must specify the shardBy
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services#shardby) field in the Service resource. Gradual traffic migration is
    * not supported in the App Engine flexible environment. For examples, see Migrating and Splitting Traffic
    * (https://cloud.google.com/appengine/docs/admin-api/migrating-splitting-traffic).
    */
  var migrateTraffic: js.UndefOr[Boolean] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Part of `name`. See documentation of `appsId`. */
  var servicesId: String
  /** Standard field mask for the set of fields to be updated. */
  var updateMask: js.UndefOr[String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
}

object AnonMigrateTraffic {
  @scala.inline
  def apply(
    appsId: String,
    servicesId: String,
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    bearer_token: String = null,
    callback: String = null,
    fields: String = null,
    key: String = null,
    migrateTraffic: js.UndefOr[Boolean] = js.undefined,
    oauth_token: String = null,
    pp: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    updateMask: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): AnonMigrateTraffic = {
    val __obj = js.Dynamic.literal(appsId = appsId.asInstanceOf[js.Any], servicesId = servicesId.asInstanceOf[js.Any])
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(migrateTraffic)) __obj.updateDynamic("migrateTraffic")(migrateTraffic.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMigrateTraffic]
  }
}

