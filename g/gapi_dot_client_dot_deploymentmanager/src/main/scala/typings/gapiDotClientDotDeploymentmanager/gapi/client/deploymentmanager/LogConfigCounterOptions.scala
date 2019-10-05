package typings.gapiDotClientDotDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogConfigCounterOptions extends js.Object {
  /** The field value to attribute. */
  var field: js.UndefOr[String] = js.undefined
  /** The metric to update. */
  var metric: js.UndefOr[String] = js.undefined
}

object LogConfigCounterOptions {
  @scala.inline
  def apply(field: String = null, metric: String = null): LogConfigCounterOptions = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (metric != null) __obj.updateDynamic("metric")(metric)
    __obj.asInstanceOf[LogConfigCounterOptions]
  }
}

