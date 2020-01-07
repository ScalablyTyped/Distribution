package typings.googleapis.buildSrcApisDeploymentmanagerV2Mod.deploymentmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The access controls set on the resource.
  */
@js.native
trait Schema$ResourceAccessControl extends js.Object {
  /**
    * The GCP IAM Policy to set on the resource.
    */
  var gcpIamPolicy: js.UndefOr[String] = js.native
}

object Schema$ResourceAccessControl {
  @scala.inline
  def apply(gcpIamPolicy: String = null): Schema$ResourceAccessControl = {
    val __obj = js.Dynamic.literal()
    if (gcpIamPolicy != null) __obj.updateDynamic("gcpIamPolicy")(gcpIamPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResourceAccessControl]
  }
}

