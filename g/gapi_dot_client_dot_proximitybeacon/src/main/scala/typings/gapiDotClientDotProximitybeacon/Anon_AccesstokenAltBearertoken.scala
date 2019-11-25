package typings.gapiDotClientDotProximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccesstokenAltBearertoken extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of records to return for this request, up to a
    * server-defined upper limit.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  /** A pagination token obtained from a previous request to list beacons. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * The project id to list beacons under. If not present then the project
    * credential that made the request is used as the project.
    * Optional.
    */
  var projectId: js.UndefOr[String] = js.undefined
  /**
    * Filter query string that supports the following field filters:
    *
    * &#42; &#42;&#42;description:`"<string>"`&#42;&#42;
    * For example: &#42;&#42;description:"Room 3"&#42;&#42;
    * Returns beacons whose description matches tokens in the string "Room 3"
    * (not necessarily that exact string).
    * The string must be double-quoted.
    * &#42; &#42;&#42;status:`<enum>`&#42;&#42;
    * For example: &#42;&#42;status:active&#42;&#42;
    * Returns beacons whose status matches the given value. Values must be
    * one of the Beacon.Status enum values (case insensitive). Accepts
    * multiple filters which will be combined with OR logic.
    * &#42; &#42;&#42;stability:`<enum>`&#42;&#42;
    * For example: &#42;&#42;stability:mobile&#42;&#42;
    * Returns beacons whose expected stability matches the given value.
    * Values must be one of the Beacon.Stability enum values (case
    * insensitive). Accepts multiple filters which will be combined with
    * OR logic.
    * &#42; &#42;&#42;place\_id:`"<string>"`&#42;&#42;
    * For example: &#42;&#42;place\_id:"ChIJVSZzVR8FdkgRXGmmm6SslKw="&#42;&#42;
    * Returns beacons explicitly registered at the given place, expressed as
    * a Place ID obtained from [Google Places API](/places/place-id). Does not
    * match places inside the given place. Does not consider the beacon's
    * actual location (which may be different from its registered place).
    * Accepts multiple filters that will be combined with OR logic. The place
    * ID must be double-quoted.
    * &#42; &#42;&#42;registration\_time`[<|>|<=|>=]<integer>`&#42;&#42;
    * For example: &#42;&#42;registration\_time>=1433116800&#42;&#42;
    * Returns beacons whose registration time matches the given filter.
    * Supports the operators: <, >, <=, and >=. Timestamp must be expressed as
    * an integer number of seconds since midnight January 1, 1970 UTC. Accepts
    * at most two filters that will be combined with AND logic, to support
    * "between" semantics. If more than two are supplied, the latter ones are
    * ignored.
    * &#42; &#42;&#42;lat:`<double> lng:<double> radius:<integer>`&#42;&#42;
    * For example: &#42;&#42;lat:51.1232343 lng:-1.093852 radius:1000&#42;&#42;
    * Returns beacons whose registered location is within the given circle.
    * When any of these fields are given, all are required. Latitude and
    * longitude must be decimal degrees between -90.0 and 90.0 and between
    * -180.0 and 180.0 respectively. Radius must be an integer number of
    * meters between 10 and 1,000,000 (1000 km).
    * &#42; &#42;&#42;property:`"<string>=<string>"`&#42;&#42;
    * For example: &#42;&#42;property:"battery-type=CR2032"&#42;&#42;
    * Returns beacons which have a property of the given name and value.
    * Supports multiple filters which will be combined with OR logic.
    * The entire name=value string must be double-quoted as one string.
    * &#42; &#42;&#42;attachment\_type:`"<string>"`&#42;&#42;
    * For example: &#42;&#42;attachment_type:"my-namespace/my-type"&#42;&#42;
    * Returns beacons having at least one attachment of the given namespaced
    * type. Supports "any within this namespace" via the partial wildcard
    * syntax: "my-namespace/&#42;". Supports multiple filters which will be
    * combined with OR logic. The string must be double-quoted.
    * &#42; &#42;&#42;indoor\_level:`"<string>"`&#42;&#42;
    * For example: &#42;&#42;indoor\_level:"1"&#42;&#42;
    * Returns beacons which are located on the given indoor level. Accepts
    * multiple filters that will be combined with OR logic.
    *
    * Multiple filters on the same field are combined with OR logic (except
    * registration_time which is combined with AND logic).
    * Multiple filters on different fields are combined with AND logic.
    * Filters should be separated by spaces.
    *
    * As with any HTTP query string parameter, the whole filter expression must
    * be URL-encoded.
    *
    * Example REST request:
    * `GET /v1beta1/beacons?q=status:active%20lat:51.123%20lng:-1.095%20radius:1000`
    */
  var q: js.UndefOr[String] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
}

object Anon_AccesstokenAltBearertoken {
  @scala.inline
  def apply(
    `$.xgafv`: String = null,
    access_token: String = null,
    alt: String = null,
    bearer_token: String = null,
    callback: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    pp: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    projectId: String = null,
    q: String = null,
    quotaUser: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): Anon_AccesstokenAltBearertoken = {
    val __obj = js.Dynamic.literal()
    if (`$.xgafv` != null) __obj.updateDynamic("$.xgafv")(`$.xgafv`.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccesstokenAltBearertoken]
  }
}

