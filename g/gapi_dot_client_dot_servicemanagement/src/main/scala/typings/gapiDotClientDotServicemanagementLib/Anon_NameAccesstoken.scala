package typings
package gapiDotClientDotServicemanagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_NameAccesstoken extends js.Object {
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
  var filter: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Not used. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The maximum number of operations to return. If unspecified, defaults to
                   * 50. The maximum value is 100.
                   */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /** The standard list page token. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
}

