package typings.gapiDotClientDotDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentLabelEntry extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object DeploymentLabelEntry {
  @scala.inline
  def apply(key: String = null, value: String = null): DeploymentLabelEntry = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DeploymentLabelEntry]
  }
}

