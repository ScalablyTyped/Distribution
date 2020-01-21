package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Commitment for a particular resource (a Commitment is composed of one or
  * more of these).
  */
@js.native
trait SchemaResourceCommitment extends js.Object {
  /**
    * Name of the accelerator type resource. Applicable only when the type is
    * ACCELERATOR.
    */
  var acceleratorType: js.UndefOr[String] = js.native
  /**
    * The amount of the resource purchased (in a type-dependent unit, such as
    * bytes). For vCPUs, this can just be an integer. For memory, this must be
    * provided in MB. Memory must be a multiple of 256 MB, with up to 6.5GB of
    * memory per every vCPU.
    */
  var amount: js.UndefOr[String] = js.native
  /**
    * Type of resource for which this commitment applies. Possible values are
    * VCPU and MEMORY
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaResourceCommitment {
  @scala.inline
  def apply(acceleratorType: String = null, amount: String = null, `type`: String = null): SchemaResourceCommitment = {
    val __obj = js.Dynamic.literal()
    if (acceleratorType != null) __obj.updateDynamic("acceleratorType")(acceleratorType.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourceCommitment]
  }
}

