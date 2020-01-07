package typings.googleapis.buildSrcApisGenomicsV2alpha1Mod.genomics_v2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Carries information about an accelerator that can be attached to a VM.
  */
@js.native
trait Schema$Accelerator extends js.Object {
  /**
    * How many accelerators of this type to attach.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * The accelerator type string (for example, &quot;nvidia-tesla-k80&quot;).
    * Only NVIDIA GPU accelerators are currently supported. If an NVIDIA GPU is
    * attached, the required runtime libraries will be made available to all
    * containers under `/usr/local/nvidia`. The driver version to install must
    * be specified using the NVIDIA driver version parameter on the virtual
    * machine specification. Note that attaching a GPU increases the worker VM
    * startup time by a few minutes.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Accelerator {
  @scala.inline
  def apply(count: String = null, `type`: String = null): Schema$Accelerator = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Accelerator]
  }
}

