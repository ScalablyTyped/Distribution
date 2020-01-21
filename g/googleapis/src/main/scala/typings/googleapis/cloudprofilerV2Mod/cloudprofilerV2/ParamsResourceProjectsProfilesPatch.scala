package typings.googleapis.cloudprofilerV2Mod.cloudprofilerV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsProfilesPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Output only. Opaque, server-assigned, unique ID for this profile.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaProfile] = js.native
  /**
    * Field mask used to specify the fields to be overwritten. Currently only
    * profile_bytes and labels fields are supported by UpdateProfile, so only
    * those fields can be specified in the mask. When no mask is provided, all
    * fields are overwritten.
    */
  var updateMask: js.UndefOr[String] = js.native
}

