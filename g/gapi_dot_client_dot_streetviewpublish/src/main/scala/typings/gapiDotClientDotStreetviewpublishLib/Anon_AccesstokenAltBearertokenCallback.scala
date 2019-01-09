package typings
package gapiDotClientDotStreetviewpublishLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccesstokenAltBearertokenCallback extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Required. A unique identifier for a photo. */
  var id: java.lang.String
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Mask that identifies fields on the photo metadata to update.
    * If not present, the old Photo
    * metadata will be entirely replaced with the
    * new Photo metadata in this request.
    * The update fails if invalid fields are specified. Multiple fields can be
    * specified in a comma-delimited list.
    *
    * The following fields are valid:
    *
    * &#42; `pose.heading`
    * &#42; `pose.latLngPair`
    * &#42; `pose.pitch`
    * &#42; `pose.roll`
    * &#42; `pose.level`
    * &#42; `pose.altitude`
    * &#42; `connections`
    * &#42; `places`
    *
    *
    * <aside class="note"><b>Note:</b> Repeated fields in
    * updateMask
    * mean the entire set of repeated values will be replaced with the new
    * contents. For example, if
    * updateMask
    * contains `connections` and `UpdatePhotoRequest.photo.connections` is empty,
    * all connections will be removed.</aside>
    */
  var updateMask: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
}

