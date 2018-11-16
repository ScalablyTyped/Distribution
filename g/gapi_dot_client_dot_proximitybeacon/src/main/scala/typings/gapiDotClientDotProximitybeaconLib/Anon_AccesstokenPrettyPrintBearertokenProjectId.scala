package typings
package gapiDotClientDotProximitybeaconLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_AccesstokenPrettyPrintBearertokenProjectId extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Beacon whose attachments should be fetched. A beacon name has the
                   * format "beacons/N!beaconId" where the beaconId is the base16 ID broadcast
                   * by the beacon and N is a code for the beacon's type. Possible values are
                   * `3` for Eddystone-UID, `4` for Eddystone-EID, `1` for iBeacon, or `5`
                   * for AltBeacon. For Eddystone-EID beacons, you may use either the
                   * current EID or the beacon's "stable" UID.
                   * Required.
                   */
  var beaconName: java.lang.String
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Specifies the namespace and type of attachment to include in response in
                   * <var>namespace/type</var> format. Accepts `&#42;/&#42;` to specify
                   * "all types in all namespaces".
                   */
  var namespacedType: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * The project id to list beacon attachments under. This field can be
                   * used when "&#42;" is specified to mean all attachment namespaces. Projects
                   * may have multiple attachments with multiple namespaces. If "&#42;" is
                   * specified and the projectId string is empty, then the project
                   * making the request is used.
                   * Optional.
                   */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
}

