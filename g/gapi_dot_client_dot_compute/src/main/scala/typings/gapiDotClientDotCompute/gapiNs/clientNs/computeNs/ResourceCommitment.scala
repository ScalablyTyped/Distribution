package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceCommitment extends js.Object {
  /**
    * The amount of the resource purchased (in a type-dependent unit, such as bytes). For vCPUs, this can just be an integer. For memory, this must be
    * provided in MB. Memory must be a multiple of 256 MB, with up to 6.5GB of memory per every vCPU.
    */
  var amount: js.UndefOr[String] = js.undefined
  /** Type of resource for which this commitment applies. Possible values are VCPU and MEMORY */
  var `type`: js.UndefOr[String] = js.undefined
}

object ResourceCommitment {
  @scala.inline
  def apply(amount: String = null, `type`: String = null): ResourceCommitment = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResourceCommitment]
  }
}

