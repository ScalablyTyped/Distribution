package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A GroupPlacementPolicy specifies resource placement configuration. It
  * specifies the failure bucket separation as well as network locality
  */
@js.native
trait SchemaResourcePolicyGroupPlacementPolicy extends js.Object {
  /**
    * Specifies network locality
    */
  var locality: js.UndefOr[String] = js.native
  /**
    * Specifies instances to hosts placement relationship
    */
  var style: js.UndefOr[String] = js.native
  /**
    * Number of vms in this placement group
    */
  var vmCount: js.UndefOr[Double] = js.native
}

object SchemaResourcePolicyGroupPlacementPolicy {
  @scala.inline
  def apply(): SchemaResourcePolicyGroupPlacementPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicyGroupPlacementPolicy]
  }
  @scala.inline
  implicit class SchemaResourcePolicyGroupPlacementPolicyOps[Self <: SchemaResourcePolicyGroupPlacementPolicy] (val x: Self) extends AnyVal {
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
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocality: Self = this.set("locality", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setVmCount(value: Double): Self = this.set("vmCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVmCount: Self = this.set("vmCount", js.undefined)
  }
  
}

