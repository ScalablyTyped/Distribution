package typings.gapiDotClientDotCompute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltFieldsInstanceKeyOauthtokenPort extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Name of the instance scoping this request. */
  var instance: String
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Specifies which COM or serial port to retrieve data from. */
  var port: js.UndefOr[Double] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Project ID for this request. */
  var project: String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * Returns output starting from a specific byte position. Use this to page through output when the output is too large to return in a single request. For
    * the initial request, leave this field unspecified. For subsequent calls, this field should be set to the next value returned in the previous call.
    */
  var start: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /** The name of the zone for this request. */
  var zone: String
}

object Anon_AltFieldsInstanceKeyOauthtokenPort {
  @scala.inline
  def apply(
    instance: String,
    project: String,
    zone: String,
    alt: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    port: Int | Double = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    start: String = null,
    userIp: String = null
  ): Anon_AltFieldsInstanceKeyOauthtokenPort = {
    val __obj = js.Dynamic.literal(instance = instance, project = project, zone = zone)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (start != null) __obj.updateDynamic("start")(start)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltFieldsInstanceKeyOauthtokenPort]
  }
}

