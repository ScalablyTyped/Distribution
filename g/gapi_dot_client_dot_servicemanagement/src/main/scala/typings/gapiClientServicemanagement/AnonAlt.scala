package typings.gapiClientServicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlt extends js.Object {
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
  /**
    * A string for filtering Operations.
    * The following filter fields are supported&#58;
    *
    * &#42; serviceName&#58; Required. Only `=` operator is allowed.
    * &#42; startTime&#58; The time this job was started, in ISO 8601 format.
    * Allowed operators are `>=`,  `>`, `<=`, and `<`.
    * &#42; status&#58; Can be `done`, `in_progress`, or `failed`. Allowed
    * operators are `=`, and `!=`.
    *
    * Filter expression supports conjunction (AND) and disjunction (OR)
    * logical operators. However, the serviceName restriction must be at the
    * top-level and can only be combined with other restrictions via the AND
    * logical operator.
    *
    * Examples&#58;
    *
    * &#42; `serviceName={some-service}.googleapis.com`
    * &#42; `serviceName={some-service}.googleapis.com AND startTime>="2017-02-01"`
    * &#42; `serviceName={some-service}.googleapis.com AND status=done`
    * &#42; `serviceName={some-service}.googleapis.com AND (status=done OR startTime>="2017-02-01")`
    */
  var filter: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** Not used. */
  var name: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * The maximum number of operations to return. If unspecified, defaults to
    * 50. The maximum value is 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /** The standard list page token. */
  var pageToken: js.UndefOr[String] = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

