package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNetworkEndpointWithHealthStatus extends js.Object {
  /**
    * [Output only] The health status of network endpoint;
    */
  var healths: js.UndefOr[js.Array[SchemaHealthStatusForNetworkEndpoint]] = js.native
  /**
    * [Output only] The network endpoint;
    */
  var networkEndpoint: js.UndefOr[SchemaNetworkEndpoint] = js.native
}

object SchemaNetworkEndpointWithHealthStatus {
  @scala.inline
  def apply(): SchemaNetworkEndpointWithHealthStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointWithHealthStatus]
  }
  @scala.inline
  implicit class SchemaNetworkEndpointWithHealthStatusOps[Self <: SchemaNetworkEndpointWithHealthStatus] (val x: Self) extends AnyVal {
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
    def setHealthsVarargs(value: SchemaHealthStatusForNetworkEndpoint*): Self = this.set("healths", js.Array(value :_*))
    @scala.inline
    def setHealths(value: js.Array[SchemaHealthStatusForNetworkEndpoint]): Self = this.set("healths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealths: Self = this.set("healths", js.undefined)
    @scala.inline
    def setNetworkEndpoint(value: SchemaNetworkEndpoint): Self = this.set("networkEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkEndpoint: Self = this.set("networkEndpoint", js.undefined)
  }
  
}

