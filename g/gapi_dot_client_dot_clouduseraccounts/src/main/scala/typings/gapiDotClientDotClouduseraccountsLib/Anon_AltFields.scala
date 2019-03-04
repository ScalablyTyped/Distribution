package typings
package gapiDotClientDotClouduseraccountsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltFields extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets a filter expression for filtering listed resources, in the form filter={expression}. Your {expression} must be in the format: field_name
    * comparison_string literal_string.
    *
    * The field_name is the name of the field you want to compare. Only atomic field types are supported (string, number, boolean). The comparison_string
    * must be either eq (equals) or ne (not equals). The literal_string is the string value to filter to. The literal value must be valid for the type of
    * field you are filtering by (string, number, boolean). For string fields, the literal value is interpreted as a regular expression using RE2 syntax. The
    * literal value must match the entire field.
    *
    * For example, to filter for instances that do not have a name of example-instance, you would use filter=name ne example-instance.
    *
    * Compute Engine Beta API Only: If you use filtering in the Beta API, you can also filter on nested fields. For example, you could filter on instances
    * that have set the scheduling.automaticRestart field to true. In particular, use filtering on nested fields to take advantage of instance labels to
    * organize and filter results based on label values.
    *
    * The Beta API also supports filtering on multiple expressions by providing each separate expression within parentheses. For example,
    * (scheduling.automaticRestart eq true) (zone eq us-central1-f). Multiple expressions are treated as AND expressions, meaning that resources must match
    * all expressions to pass the filters.
    */
  var filter: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a
    * nextPageToken that can be used to get the next page of results in subsequent list requests.
    */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.
    *
    * You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the
    * creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation
    * is returned first.
    *
    * Currently, only sorting by name or creationTimestamp desc is supported.
    */
  var orderBy: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Project ID for this request. */
  var project: java.lang.String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltFields {
  @scala.inline
  def apply(
    project: java.lang.String,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    filter: java.lang.String = null,
    key: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    orderBy: java.lang.String = null,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltFields = {
    val __obj = js.Dynamic.literal(project = project)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltFields]
  }
}

