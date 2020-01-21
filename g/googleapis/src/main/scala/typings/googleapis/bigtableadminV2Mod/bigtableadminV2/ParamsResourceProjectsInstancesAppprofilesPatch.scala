package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsInstancesAppprofilesPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * If true, ignore safety checks when updating the app profile.
    */
  var ignoreWarnings: js.UndefOr[Boolean] = js.native
  /**
    * (`OutputOnly`) The unique name of the app profile. Values are of the form
    * `projects/<project>/instances/<instance>/appProfiles/_a-zA-Z0-9*`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAppProfile] = js.native
  /**
    * The subset of app profile fields which should be replaced. If unset, all
    * fields will be replaced.
    */
  var updateMask: js.UndefOr[String] = js.native
}

