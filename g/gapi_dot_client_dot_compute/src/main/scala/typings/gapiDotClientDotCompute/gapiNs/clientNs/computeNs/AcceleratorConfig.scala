package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceleratorConfig extends js.Object {
  /** The number of the guest accelerator cards exposed to this instance. */
  var acceleratorCount: js.UndefOr[Double] = js.undefined
  /** Full or partial URL of the accelerator type resource to expose to this instance. */
  var acceleratorType: js.UndefOr[String] = js.undefined
}

object AcceleratorConfig {
  @scala.inline
  def apply(acceleratorCount: Int | Double = null, acceleratorType: String = null): AcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    if (acceleratorCount != null) __obj.updateDynamic("acceleratorCount")(acceleratorCount.asInstanceOf[js.Any])
    if (acceleratorType != null) __obj.updateDynamic("acceleratorType")(acceleratorType)
    __obj.asInstanceOf[AcceleratorConfig]
  }
}

