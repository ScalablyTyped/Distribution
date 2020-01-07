package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AcceleratorConfig represents a Hardware Accelerator request.
  */
@js.native
trait Schema$AcceleratorConfig extends js.Object {
  /**
    * The number of the accelerator cards exposed to an instance.
    */
  var acceleratorCount: js.UndefOr[String] = js.native
  /**
    * The accelerator type resource name. List of supported accelerators
    * [here](/compute/docs/gpus/#Introduction)
    */
  var acceleratorType: js.UndefOr[String] = js.native
}

object Schema$AcceleratorConfig {
  @scala.inline
  def apply(acceleratorCount: String = null, acceleratorType: String = null): Schema$AcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    if (acceleratorCount != null) __obj.updateDynamic("acceleratorCount")(acceleratorCount.asInstanceOf[js.Any])
    if (acceleratorType != null) __obj.updateDynamic("acceleratorType")(acceleratorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AcceleratorConfig]
  }
}

