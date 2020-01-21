package typings.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

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

