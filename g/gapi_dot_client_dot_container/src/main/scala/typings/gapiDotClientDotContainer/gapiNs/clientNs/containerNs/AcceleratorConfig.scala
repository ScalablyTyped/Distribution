package typings.gapiDotClientDotContainer.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceleratorConfig extends js.Object {
  /** The number of the accelerator cards exposed to an instance. */
  var acceleratorCount: js.UndefOr[String] = js.undefined
  /**
    * The accelerator type resource name. List of supported accelerators
    * [here](/compute/docs/gpus/#Introduction)
    */
  var acceleratorType: js.UndefOr[String] = js.undefined
}

object AcceleratorConfig {
  @scala.inline
  def apply(acceleratorCount: String = null, acceleratorType: String = null): AcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    if (acceleratorCount != null) __obj.updateDynamic("acceleratorCount")(acceleratorCount)
    if (acceleratorType != null) __obj.updateDynamic("acceleratorType")(acceleratorType)
    __obj.asInstanceOf[AcceleratorConfig]
  }
}

