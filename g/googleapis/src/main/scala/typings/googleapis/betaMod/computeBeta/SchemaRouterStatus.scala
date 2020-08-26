package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRouterStatus extends js.Object {
  /**
    * Best routes for this router&#39;s network.
    */
  var bestRoutes: js.UndefOr[js.Array[SchemaRoute]] = js.native
  /**
    * Best routes learned by this router.
    */
  var bestRoutesForRouter: js.UndefOr[js.Array[SchemaRoute]] = js.native
  var bgpPeerStatus: js.UndefOr[js.Array[SchemaRouterStatusBgpPeerStatus]] = js.native
  var natStatus: js.UndefOr[js.Array[SchemaRouterStatusNatStatus]] = js.native
  /**
    * URI of the network to which this router belongs.
    */
  var network: js.UndefOr[String] = js.native
}

object SchemaRouterStatus {
  @scala.inline
  def apply(): SchemaRouterStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterStatus]
  }
  @scala.inline
  implicit class SchemaRouterStatusOps[Self <: SchemaRouterStatus] (val x: Self) extends AnyVal {
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
    def setBestRoutesVarargs(value: SchemaRoute*): Self = this.set("bestRoutes", js.Array(value :_*))
    @scala.inline
    def setBestRoutes(value: js.Array[SchemaRoute]): Self = this.set("bestRoutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBestRoutes: Self = this.set("bestRoutes", js.undefined)
    @scala.inline
    def setBestRoutesForRouterVarargs(value: SchemaRoute*): Self = this.set("bestRoutesForRouter", js.Array(value :_*))
    @scala.inline
    def setBestRoutesForRouter(value: js.Array[SchemaRoute]): Self = this.set("bestRoutesForRouter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBestRoutesForRouter: Self = this.set("bestRoutesForRouter", js.undefined)
    @scala.inline
    def setBgpPeerStatusVarargs(value: SchemaRouterStatusBgpPeerStatus*): Self = this.set("bgpPeerStatus", js.Array(value :_*))
    @scala.inline
    def setBgpPeerStatus(value: js.Array[SchemaRouterStatusBgpPeerStatus]): Self = this.set("bgpPeerStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgpPeerStatus: Self = this.set("bgpPeerStatus", js.undefined)
    @scala.inline
    def setNatStatusVarargs(value: SchemaRouterStatusNatStatus*): Self = this.set("natStatus", js.Array(value :_*))
    @scala.inline
    def setNatStatus(value: js.Array[SchemaRouterStatusNatStatus]): Self = this.set("natStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNatStatus: Self = this.set("natStatus", js.undefined)
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
  }
  
}

