package typings.gapiClientClassroom

import typings.gapiClientClassroom.gapi.client.classroom.Announcement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccesstokenAltCallbackCourseIdFieldsIdKey extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /**
    * Identifier of the course.
    * This identifier can be either the Classroom-assigned identifier or an
    * alias.
    */
  var courseId: String = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** Identifier of the announcement. */
  var id: String = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /** Request body */
  var resource: Announcement = js.native
  /**
    * Mask that identifies which fields on the announcement to update.
    * This field is required to do an update. The update fails if invalid
    * fields are specified. If a field supports empty values, it can be cleared
    * by specifying it in the update mask and not in the Announcement object. If
    * a field that does not support empty values is included in the update mask
    * and not set in the Announcement object, an `INVALID_ARGUMENT` error will be
    * returned.
    *
    * The following fields may be specified by teachers:
    *
    * &#42; `text`
    * &#42; `state`
    * &#42; `scheduled_time`
    */
  var updateMask: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

