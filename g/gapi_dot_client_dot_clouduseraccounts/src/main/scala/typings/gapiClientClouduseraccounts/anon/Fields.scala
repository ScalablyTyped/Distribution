package typings.gapiClientClouduseraccounts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fields extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
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
  var filter: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /**
    * The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a
    * nextPageToken that can be used to get the next page of results in subsequent list requests.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.
    *
    * You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the
    * creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation
    * is returned first.
    *
    * Currently, only sorting by name or creationTimestamp desc is supported.
    */
  var orderBy: js.UndefOr[String] = js.native
  /** Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results. */
  var pageToken: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Project ID for this request. */
  var project: String = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
}

object Fields {
  @scala.inline
  def apply(project: String): Fields = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
  @scala.inline
  implicit class FieldsOps[Self <: Fields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
  }
  
}

