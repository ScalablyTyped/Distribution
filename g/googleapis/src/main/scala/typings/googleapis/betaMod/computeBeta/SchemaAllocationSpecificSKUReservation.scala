package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This reservation type allows to pre allocate specific instance
  * configuration.
  */
@js.native
trait SchemaAllocationSpecificSKUReservation extends js.Object {
  /**
    * Specifies number of resources that are allocated.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * [OutputOnly] Indicates how many resource are in use.
    */
  var inUseCount: js.UndefOr[String] = js.native
  /**
    * The instance properties for this specific sku reservation.
    */
  var instanceProperties: js.UndefOr[SchemaAllocationSpecificSKUAllocationReservedInstanceProperties] = js.native
}

object SchemaAllocationSpecificSKUReservation {
  @scala.inline
  def apply(
    count: String = null,
    inUseCount: String = null,
    instanceProperties: SchemaAllocationSpecificSKUAllocationReservedInstanceProperties = null
  ): SchemaAllocationSpecificSKUReservation = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (inUseCount != null) __obj.updateDynamic("inUseCount")(inUseCount.asInstanceOf[js.Any])
    if (instanceProperties != null) __obj.updateDynamic("instanceProperties")(instanceProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAllocationSpecificSKUReservation]
  }
}

