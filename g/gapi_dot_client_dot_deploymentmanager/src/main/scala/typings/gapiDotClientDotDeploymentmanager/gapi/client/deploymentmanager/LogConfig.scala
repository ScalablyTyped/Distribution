package typings.gapiDotClientDotDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogConfig extends js.Object {
  /** Cloud audit options. */
  var cloudAudit: js.UndefOr[LogConfigCloudAuditOptions] = js.undefined
  /** Counter options. */
  var counter: js.UndefOr[LogConfigCounterOptions] = js.undefined
  /** Data access options. */
  var dataAccess: js.UndefOr[LogConfigDataAccessOptions] = js.undefined
}

object LogConfig {
  @scala.inline
  def apply(
    cloudAudit: LogConfigCloudAuditOptions = null,
    counter: LogConfigCounterOptions = null,
    dataAccess: LogConfigDataAccessOptions = null
  ): LogConfig = {
    val __obj = js.Dynamic.literal()
    if (cloudAudit != null) __obj.updateDynamic("cloudAudit")(cloudAudit.asInstanceOf[js.Any])
    if (counter != null) __obj.updateDynamic("counter")(counter.asInstanceOf[js.Any])
    if (dataAccess != null) __obj.updateDynamic("dataAccess")(dataAccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogConfig]
  }
}

