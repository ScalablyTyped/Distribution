package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceAccessControl extends js.Object {
  /** The GCP IAM Policy to set on the resource. */
  var gcpIamPolicy: js.UndefOr[java.lang.String] = js.undefined
}

object ResourceAccessControl {
  @scala.inline
  def apply(gcpIamPolicy: java.lang.String = null): ResourceAccessControl = {
    val __obj = js.Dynamic.literal()
    if (gcpIamPolicy != null) __obj.updateDynamic("gcpIamPolicy")(gcpIamPolicy)
    __obj.asInstanceOf[ResourceAccessControl]
  }
}

