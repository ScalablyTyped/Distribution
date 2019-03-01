package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceleratorConfig extends js.Object {
  /** The number of the guest accelerator cards exposed to this instance. */
  var acceleratorCount: js.UndefOr[scala.Double] = js.undefined
  /** Full or partial URL of the accelerator type resource to expose to this instance. */
  var acceleratorType: js.UndefOr[java.lang.String] = js.undefined
}

object AcceleratorConfig {
  @scala.inline
  def apply(acceleratorCount: scala.Int | scala.Double = null, acceleratorType: java.lang.String = null): AcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    if (acceleratorCount != null) __obj.updateDynamic("acceleratorCount")(acceleratorCount.asInstanceOf[js.Any])
    if (acceleratorType != null) __obj.updateDynamic("acceleratorType")(acceleratorType)
    __obj.asInstanceOf[AcceleratorConfig]
  }
}

