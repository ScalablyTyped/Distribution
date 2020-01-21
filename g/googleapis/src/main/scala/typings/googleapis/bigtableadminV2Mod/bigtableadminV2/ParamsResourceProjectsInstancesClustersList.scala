package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsInstancesClustersList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * DEPRECATED: This field is unused and ignored.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The unique name of the instance for which a list of clusters is
    * requested. Values are of the form
    * `projects/<project>/instances/<instance>`. Use `<instance> = '-'` to list
    * Clusters for all Instances in a project, e.g.,
    * `projects/myproject/instances/-`.
    */
  var parent: js.UndefOr[String] = js.native
}

