package typings.gapiClientClassroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInvitedEmailAddress extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /**
    * If specified, only results with the specified `invited_email_address`
    * will be returned.
    */
  var invitedEmailAddress: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
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
  /**
    * If specified, only results with the specified `state` values will be
    * returned. Otherwise, results with a `state` of `PENDING` will be returned.
    */
  var states: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The ID of the student whose guardian invitations are to be returned.
    * The identifier can be one of the following:
    *
    * &#42; the numeric identifier for the user
    * &#42; the email address of the user
    * &#42; the string literal `"me"`, indicating the requesting user
    * &#42; the string literal `"-"`, indicating that results should be returned for
    * all students that the requesting user is permitted to view guardian
    * invitations.
    */
  var studentId: String = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

