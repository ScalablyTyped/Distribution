package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNetworkEndpointGroupsAttachEndpointsRequest extends js.Object {
  /**
    * The list of network endpoints to be attached.
    */
  var networkEndpoints: js.UndefOr[js.Array[SchemaNetworkEndpoint]] = js.native
}

object SchemaNetworkEndpointGroupsAttachEndpointsRequest {
  @scala.inline
  def apply(): SchemaNetworkEndpointGroupsAttachEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointGroupsAttachEndpointsRequest]
  }
  @scala.inline
  implicit class SchemaNetworkEndpointGroupsAttachEndpointsRequestOps[Self <: SchemaNetworkEndpointGroupsAttachEndpointsRequest] (val x: Self) extends AnyVal {
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
    def setNetworkEndpointsVarargs(value: SchemaNetworkEndpoint*): Self = this.set("networkEndpoints", js.Array(value :_*))
    @scala.inline
    def setNetworkEndpoints(value: js.Array[SchemaNetworkEndpoint]): Self = this.set("networkEndpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkEndpoints: Self = this.set("networkEndpoints", js.undefined)
  }
  
}

