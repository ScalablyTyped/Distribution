package typings.gapiDotClientDotStreetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AccesstokenAltBearertokenCallback extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** Required. A unique identifier for a photo. */
  var id: String = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
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
  var updateMask: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

