package typings.gapiDotClientDotCivicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  /** The registered address of the voter to look up. */
  var address: String
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** The unique ID of the election to look up. A list of election IDs can be obtained at https://www.googleapis.com/civicinfo/{version}/elections */
  var electionId: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** If set to true, only data from official state sources will be returned. */
  var officialOnly: js.UndefOr[Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * If set to true, the query will return the success codeand include any partial information when it is unable to determine a matching address or unable
    * to determine the election for electionId=0 queries.
    */
  var returnAllAvailableData: js.UndefOr[Boolean] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object Anon_Address {
  @scala.inline
  def apply(
    address: String,
    alt: String = null,
    electionId: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    officialOnly: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    returnAllAvailableData: js.UndefOr[Boolean] = js.undefined,
    userIp: String = null
  ): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (electionId != null) __obj.updateDynamic("electionId")(electionId)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(officialOnly)) __obj.updateDynamic("officialOnly")(officialOnly)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (!js.isUndefined(returnAllAvailableData)) __obj.updateDynamic("returnAllAvailableData")(returnAllAvailableData)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_Address]
  }
}

