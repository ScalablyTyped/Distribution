package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceleratorConfig extends js.Object {
  /** The number of the accelerator cards exposed to an instance. */
  var acceleratorCount: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The accelerator type resource name. List of supported accelerators
    * [here](/compute/docs/gpus/#Introduction)
    */
  var acceleratorType: js.UndefOr[java.lang.String] = js.undefined
}

object AcceleratorConfig {
  @scala.inline
  def apply(acceleratorCount: java.lang.String = null, acceleratorType: java.lang.String = null): AcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    if (acceleratorCount != null) __obj.updateDynamic("acceleratorCount")(acceleratorCount)
    if (acceleratorType != null) __obj.updateDynamic("acceleratorType")(acceleratorType)
    __obj.asInstanceOf[AcceleratorConfig]
  }
}

