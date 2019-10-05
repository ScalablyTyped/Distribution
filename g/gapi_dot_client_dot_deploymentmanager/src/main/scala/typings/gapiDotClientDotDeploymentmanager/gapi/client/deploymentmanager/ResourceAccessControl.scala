package typings.gapiDotClientDotDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceAccessControl extends js.Object {
  /** The GCP IAM Policy to set on the resource. */
  var gcpIamPolicy: js.UndefOr[String] = js.undefined
}

object ResourceAccessControl {
  @scala.inline
  def apply(gcpIamPolicy: String = null): ResourceAccessControl = {
    val __obj = js.Dynamic.literal()
    if (gcpIamPolicy != null) __obj.updateDynamic("gcpIamPolicy")(gcpIamPolicy)
    __obj.asInstanceOf[ResourceAccessControl]
  }
}

