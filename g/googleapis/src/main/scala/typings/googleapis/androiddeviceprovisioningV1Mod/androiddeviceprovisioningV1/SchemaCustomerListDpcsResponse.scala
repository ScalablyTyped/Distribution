package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message of customer&#39;s listing DPCs.
  */
@js.native
trait SchemaCustomerListDpcsResponse extends js.Object {
  /**
    * The list of DPCs available to the customer that support zero-touch
    * enrollment.
    */
  var dpcs: js.UndefOr[js.Array[SchemaDpc]] = js.native
}

object SchemaCustomerListDpcsResponse {
  @scala.inline
  def apply(): SchemaCustomerListDpcsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerListDpcsResponse]
  }
  @scala.inline
  implicit class SchemaCustomerListDpcsResponseOps[Self <: SchemaCustomerListDpcsResponse] (val x: Self) extends AnyVal {
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
    def setDpcsVarargs(value: SchemaDpc*): Self = this.set("dpcs", js.Array(value :_*))
    @scala.inline
    def setDpcs(value: js.Array[SchemaDpc]): Self = this.set("dpcs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDpcs: Self = this.set("dpcs", js.undefined)
  }
  
}

