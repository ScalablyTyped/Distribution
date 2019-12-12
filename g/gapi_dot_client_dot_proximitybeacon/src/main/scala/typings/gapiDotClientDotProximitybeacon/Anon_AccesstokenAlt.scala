package typings.gapiDotClientDotProximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AccesstokenAlt extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /**
    * Beacon whose attachments should be fetched. A beacon name has the
    * format "beacons/N!beaconId" where the beaconId is the base16 ID broadcast
    * by the beacon and N is a code for the beacon's type. Possible values are
    * `3` for Eddystone-UID, `4` for Eddystone-EID, `1` for iBeacon, or `5`
    * for AltBeacon. For Eddystone-EID beacons, you may use either the
    * current EID or the beacon's "stable" UID.
    * Required.
    */
  var beaconName: String = js.native
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /**
    * Specifies the namespace and type of attachment to include in response in
    * <var>namespace/type</var> format. Accepts `&#42;/&#42;` to specify
    * "all types in all namespaces".
    */
  var namespacedType: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /**
    * The project id to list beacon attachments under. This field can be
    * used when "&#42;" is specified to mean all attachment namespaces. Projects
    * may have multiple attachments with multiple namespaces. If "&#42;" is
    * specified and the projectId string is empty, then the project
    * making the request is used.
    * Optional.
    */
  var projectId: js.UndefOr[String] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

