package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogConfigCounterOptions extends js.Object {
  /** The field value to attribute. */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /** The metric to update. */
  var metric: js.UndefOr[java.lang.String] = js.undefined
}

object LogConfigCounterOptions {
  @scala.inline
  def apply(field: java.lang.String = null, metric: java.lang.String = null): LogConfigCounterOptions = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (metric != null) __obj.updateDynamic("metric")(metric)
    __obj.asInstanceOf[LogConfigCounterOptions]
  }
}

