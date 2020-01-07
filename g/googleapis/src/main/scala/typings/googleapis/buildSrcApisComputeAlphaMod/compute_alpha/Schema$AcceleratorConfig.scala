package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A specification of the type and number of accelerator cards attached to the
  * instance.
  */
@js.native
trait Schema$AcceleratorConfig extends js.Object {
  /**
    * The number of the guest accelerator cards exposed to this instance.
    */
  var acceleratorCount: js.UndefOr[Double] = js.native
  /**
    * Full or partial URL of the accelerator type resource to attach to this
    * instance. For example:
    * projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100
    * If you are creating an instance template, specify only the accelerator
    * name. See GPUs on Compute Engine for a full list of accelerator types.
    */
  var acceleratorType: js.UndefOr[String] = js.native
}

object Schema$AcceleratorConfig {
  @scala.inline
  def apply(acceleratorCount: Int | Double = null, acceleratorType: String = null): Schema$AcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    if (acceleratorCount != null) __obj.updateDynamic("acceleratorCount")(acceleratorCount.asInstanceOf[js.Any])
    if (acceleratorType != null) __obj.updateDynamic("acceleratorType")(acceleratorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AcceleratorConfig]
  }
}

