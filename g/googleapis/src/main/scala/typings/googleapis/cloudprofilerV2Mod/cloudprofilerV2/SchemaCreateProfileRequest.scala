package typings.googleapis.cloudprofilerV2Mod.cloudprofilerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CreateProfileRequest describes a profile resource online creation request.
  * The deployment field must be populated. The profile_type specifies the list
  * of profile types supported by the agent. The creation call will hang until
  * a profile of one of these types needs to be collected.
  */
@js.native
trait SchemaCreateProfileRequest extends js.Object {
  /**
    * Deployment details.
    */
  var deployment: js.UndefOr[SchemaDeployment] = js.native
  /**
    * One or more profile types that the agent is capable of providing.
    */
  var profileType: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCreateProfileRequest {
  @scala.inline
  def apply(deployment: SchemaDeployment = null, profileType: js.Array[String] = null): SchemaCreateProfileRequest = {
    val __obj = js.Dynamic.literal()
    if (deployment != null) __obj.updateDynamic("deployment")(deployment.asInstanceOf[js.Any])
    if (profileType != null) __obj.updateDynamic("profileType")(profileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateProfileRequest]
  }
}

