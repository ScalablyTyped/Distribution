package typings.gapiClientGenomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFilter extends js.Object {
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
    * &#42; projectId&#58; Required. Corresponds to
    * OperationMetadata.projectId.
    * &#42; createTime&#58; The time this job was created, in seconds from the
    * [epoch](http://en.wikipedia.org/wiki/Unix_time). Can use `>=` and/or `<=`
    * operators.
    * &#42; status&#58; Can be `RUNNING`, `SUCCESS`, `FAILURE`, or `CANCELED`. Only
    * one status may be specified.
    * &#42; labels.key where key is a label key.
    *
    * Examples&#58;
    *
    * &#42; `projectId = my-project AND createTime >= 1432140000`
    * &#42; `projectId = my-project AND createTime >= 1432140000 AND createTime <= 1432150000 AND status = RUNNING`
    * &#42; `projectId = my-project AND labels.color = &#42;`
    * &#42; `projectId = my-project AND labels.color = red`
    */
  var filter: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** The name of the operation's parent resource. */
  var name: String = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * The maximum number of results to return. If unspecified, defaults to
    * 256. The maximum value is 2048.
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

