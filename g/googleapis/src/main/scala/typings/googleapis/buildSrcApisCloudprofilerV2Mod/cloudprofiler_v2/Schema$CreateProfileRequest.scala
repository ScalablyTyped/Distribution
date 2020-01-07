package typings.googleapis.buildSrcApisCloudprofilerV2Mod.cloudprofiler_v2

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
trait Schema$CreateProfileRequest extends js.Object {
  /**
    * Deployment details.
    */
  var deployment: js.UndefOr[Schema$Deployment] = js.native
  /**
    * One or more profile types that the agent is capable of providing.
    */
  var profileType: js.UndefOr[js.Array[String]] = js.native
}

object Schema$CreateProfileRequest {
  @scala.inline
  def apply(deployment: Schema$Deployment = null, profileType: js.Array[String] = null): Schema$CreateProfileRequest = {
    val __obj = js.Dynamic.literal()
    if (deployment != null) __obj.updateDynamic("deployment")(deployment.asInstanceOf[js.Any])
    if (profileType != null) __obj.updateDynamic("profileType")(profileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateProfileRequest]
  }
}

