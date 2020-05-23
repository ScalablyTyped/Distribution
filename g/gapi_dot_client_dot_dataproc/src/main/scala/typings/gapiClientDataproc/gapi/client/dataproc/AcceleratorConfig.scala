package typings.gapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceleratorConfig extends js.Object {
  /** The number of the accelerator cards of this type exposed to this instance. */
  var acceleratorCount: js.UndefOr[Double] = js.undefined
  /**
    * Full URL, partial URI, or short name of the accelerator type resource to expose to this instance. See Google Compute Engine AcceleratorTypes(
    * /compute/docs/reference/beta/acceleratorTypes)Examples &#42;
    * https://www.googleapis.com/compute/beta/projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80 &#42;
    * projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80 &#42; nvidia-tesla-k80
    */
  var acceleratorTypeUri: js.UndefOr[String] = js.undefined
}

object AcceleratorConfig {
  @scala.inline
  def apply(acceleratorCount: js.UndefOr[Double] = js.undefined, acceleratorTypeUri: String = null): AcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceleratorCount)) __obj.updateDynamic("acceleratorCount")(acceleratorCount.get.asInstanceOf[js.Any])
    if (acceleratorTypeUri != null) __obj.updateDynamic("acceleratorTypeUri")(acceleratorTypeUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceleratorConfig]
  }
}

