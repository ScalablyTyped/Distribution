package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInterconnectDiagnosticsLinkLACPStatus extends js.Object {
  /**
    * System ID of the port on Google?s side of the LACP exchange.
    */
  var googleSystemId: js.UndefOr[String] = js.native
  /**
    * System ID of the port on the neighbor?s side of the LACP exchange.
    */
  var neighborSystemId: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
}

object SchemaInterconnectDiagnosticsLinkLACPStatus {
  @scala.inline
  def apply(): SchemaInterconnectDiagnosticsLinkLACPStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectDiagnosticsLinkLACPStatus]
  }
  @scala.inline
  implicit class SchemaInterconnectDiagnosticsLinkLACPStatusOps[Self <: SchemaInterconnectDiagnosticsLinkLACPStatus] (val x: Self) extends AnyVal {
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
    def setGoogleSystemId(value: String): Self = this.set("googleSystemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogleSystemId: Self = this.set("googleSystemId", js.undefined)
    @scala.inline
    def setNeighborSystemId(value: String): Self = this.set("neighborSystemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeighborSystemId: Self = this.set("neighborSystemId", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

