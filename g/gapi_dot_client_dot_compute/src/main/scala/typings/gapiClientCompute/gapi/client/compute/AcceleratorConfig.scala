package typings.gapiClientCompute.gapi.client.compute

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
  def apply(acceleratorCount: js.UndefOr[Double] = js.undefined, acceleratorType: String = null): AcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceleratorCount)) __obj.updateDynamic("acceleratorCount")(acceleratorCount.get.asInstanceOf[js.Any])
    if (acceleratorType != null) __obj.updateDynamic("acceleratorType")(acceleratorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceleratorConfig]
  }
}

