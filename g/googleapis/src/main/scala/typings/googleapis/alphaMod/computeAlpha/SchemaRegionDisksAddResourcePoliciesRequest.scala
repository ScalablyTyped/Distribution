package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRegionDisksAddResourcePoliciesRequest extends js.Object {
  /**
    * Resource policies to be added to this disk.
    */
  var resourcePolicies: js.UndefOr[js.Array[String]] = js.native
}

object SchemaRegionDisksAddResourcePoliciesRequest {
  @scala.inline
  def apply(): SchemaRegionDisksAddResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionDisksAddResourcePoliciesRequest]
  }
  @scala.inline
  implicit class SchemaRegionDisksAddResourcePoliciesRequestOps[Self <: SchemaRegionDisksAddResourcePoliciesRequest] (val x: Self) extends AnyVal {
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
    def setResourcePoliciesVarargs(value: String*): Self = this.set("resourcePolicies", js.Array(value :_*))
    @scala.inline
    def setResourcePolicies(value: js.Array[String]): Self = this.set("resourcePolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourcePolicies: Self = this.set("resourcePolicies", js.undefined)
  }
  
}

