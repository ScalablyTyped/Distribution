package typings.gapiDotClientDotDeploymentmanager.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentUpdateLabelEntry extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object DeploymentUpdateLabelEntry {
  @scala.inline
  def apply(key: String = null, value: String = null): DeploymentUpdateLabelEntry = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DeploymentUpdateLabelEntry]
  }
}

