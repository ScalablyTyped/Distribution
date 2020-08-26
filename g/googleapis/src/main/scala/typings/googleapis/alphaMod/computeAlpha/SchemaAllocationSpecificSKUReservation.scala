package typings.googleapis.alphaMod.computeAlpha

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
  def apply(): SchemaAllocationSpecificSKUReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocationSpecificSKUReservation]
  }
  @scala.inline
  implicit class SchemaAllocationSpecificSKUReservationOps[Self <: SchemaAllocationSpecificSKUReservation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setInUseCount(value: String): Self = this.set("inUseCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInUseCount: Self = this.set("inUseCount", js.undefined)
    @scala.inline
    def setInstanceProperties(value: SchemaAllocationSpecificSKUAllocationReservedInstanceProperties): Self = this.set("instanceProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceProperties: Self = this.set("instanceProperties", js.undefined)
  }
  
}

