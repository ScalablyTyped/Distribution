package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * An expression for filtering the results of the request.  Filter rules are
    * case insensitive. The fields eligible for filtering are:  + `name` + `id`
    * + <code>labels.<em>key</em></code> where *key* is the name of a label
    * Some examples of using labels as filters:  |Filter|Description|
    * |------|-----------| |name:how*|The project's name starts with "how".|
    * |name:Howl|The project's name is `Howl` or `howl`.| |name:HOWL|Equivalent
    * to above.| |NAME:howl|Equivalent to above.| |labels.color:*|The project
    * has the label `color`.| |labels.color:red|The project's label `color` has
    * the value `red`.| |labels.color:red&nbsp;labels.size:big|The project's
    * label `color` has the value `red` and its label `size` has the value
    * `big`.  If you specify a filter that has both `parent.type` and
    * `parent.id`, then the `resourcemanager.projects.list` permission is
    * checked on the parent. If the user has this permission, all projects
    * under the parent will be returned after remaining filters have been
    * applied. If the user lacks this permission, then all projects for which
    * the user has the `resourcemanager.projects.get` permission will be
    * returned after remaining filters have been applied. If no filter is
    * specified, the call will return projects for which the user has
    * `resourcemanager.projects.get` permissions.  Optional.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The maximum number of Projects to return in the response. The server can
    * return fewer Projects than requested. If unspecified, server picks an
    * appropriate default.  Optional.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A pagination token returned from a previous call to ListProjects that
    * indicates from where listing should continue.  Optional.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsList {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    fields: String = null,
    filter: String = null,
    key: String = null,
    oauth_token: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceProjectsList = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceProjectsList]
  }
}

