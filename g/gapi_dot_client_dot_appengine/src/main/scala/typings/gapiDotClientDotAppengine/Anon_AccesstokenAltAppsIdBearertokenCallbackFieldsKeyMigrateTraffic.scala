package typings.gapiDotClientDotAppengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyMigrateTraffic extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** Part of `name`. Name of the resource to update. Example: apps/myapp/services/default. */
  var appsId: String = js.native
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /**
    * Set to true to gradually shift traffic to one or more versions that you specify. By default, traffic is shifted immediately. For gradual traffic
    * migration, the target versions must be located within instances that are configured for both warmup requests
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#inboundservicetype) and automatic scaling
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#automaticscaling). You must specify the shardBy
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services#shardby) field in the Service resource. Gradual traffic migration is
    * not supported in the App Engine flexible environment. For examples, see Migrating and Splitting Traffic
    * (https://cloud.google.com/appengine/docs/admin-api/migrating-splitting-traffic).
    */
  var migrateTraffic: js.UndefOr[Boolean] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /** Part of `name`. See documentation of `appsId`. */
  var servicesId: String = js.native
  /** Standard field mask for the set of fields to be updated. */
  var updateMask: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

