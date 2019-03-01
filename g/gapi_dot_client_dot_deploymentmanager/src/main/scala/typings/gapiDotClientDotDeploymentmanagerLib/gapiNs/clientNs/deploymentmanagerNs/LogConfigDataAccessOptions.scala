package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogConfigDataAccessOptions extends js.Object {
  /** Whether Gin logging should happen in a fail-closed manner at the caller. This is relevant only in the LocalIAM implementation, for now. */
  var logMode: js.UndefOr[java.lang.String] = js.undefined
}

object LogConfigDataAccessOptions {
  @scala.inline
  def apply(logMode: java.lang.String = null): LogConfigDataAccessOptions = {
    val __obj = js.Dynamic.literal()
    if (logMode != null) __obj.updateDynamic("logMode")(logMode)
    __obj.asInstanceOf[LogConfigDataAccessOptions]
  }
}

