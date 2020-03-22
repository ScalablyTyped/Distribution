package typings.gapiClientClassroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCourseWorkStates extends js.Object {
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
  /**
    * Restriction on the work status to return. Only courseWork that matches
    * is returned. If unspecified, items with a work status of `PUBLISHED`
    * is returned.
    */
  var courseWorkStates: js.UndefOr[String | js.Array[String]] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * Optional sort ordering for results. A comma-separated list of fields with
    * an optional sort direction keyword. Supported fields are `updateTime`
    * and `dueDate`. Supported direction keywords are `asc` and `desc`.
    * If not specified, `updateTime desc` is the default behavior.
    * Examples: `dueDate asc,updateTime desc`, `updateTime,dueDate desc`
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Maximum number of items to return. Zero or unspecified indicates that the
    * server may assign a maximum.
    *
    * The server may return fewer than the specified number of results.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * nextPageToken
    * value returned from a previous
    * list call,
    * indicating that the subsequent page of results should be returned.
    *
    * The list request
    * must be otherwise identical to the one that resulted in this token.
    */
  var pageToken: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

