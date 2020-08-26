package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a secondary IP range of a subnetwork.
  */
@js.native
trait SchemaSubnetworkSecondaryRange extends js.Object {
  /**
    * The range of IP addresses belonging to this subnetwork secondary range.
    * Provide this property when you create the subnetwork. Ranges must be
    * unique and non-overlapping with all primary and secondary IP ranges
    * within a network. Only IPv4 is supported.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  /**
    * The name associated with this subnetwork secondary range, used when
    * adding an alias IP range to a VM instance. The name must be 1-63
    * characters long, and comply with RFC1035. The name must be unique within
    * the subnetwork.
    */
  var rangeName: js.UndefOr[String] = js.native
  /**
    * The type of IP CIDR range to associate with this subnetwork secondary
    * range. The default is RFC_1918. When creating a subnetwork in non-RFC
    * 1918 range, this field must be set to NON_RFC_1918.
    */
  var rangeType: js.UndefOr[String] = js.native
}

object SchemaSubnetworkSecondaryRange {
  @scala.inline
  def apply(): SchemaSubnetworkSecondaryRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubnetworkSecondaryRange]
  }
  @scala.inline
  implicit class SchemaSubnetworkSecondaryRangeOps[Self <: SchemaSubnetworkSecondaryRange] (val x: Self) extends AnyVal {
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
    def setIpCidrRange(value: String): Self = this.set("ipCidrRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpCidrRange: Self = this.set("ipCidrRange", js.undefined)
    @scala.inline
    def setRangeName(value: String): Self = this.set("rangeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeName: Self = this.set("rangeName", js.undefined)
    @scala.inline
    def setRangeType(value: String): Self = this.set("rangeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeType: Self = this.set("rangeType", js.undefined)
  }
  
}

