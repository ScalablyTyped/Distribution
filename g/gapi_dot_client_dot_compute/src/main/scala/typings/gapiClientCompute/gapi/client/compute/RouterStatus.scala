package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterStatus extends js.Object {
  /** Best routes for this router's network. */
  var bestRoutes: js.UndefOr[js.Array[Route]] = js.native
  /** Best routes learned by this router. */
  var bestRoutesForRouter: js.UndefOr[js.Array[Route]] = js.native
  var bgpPeerStatus: js.UndefOr[js.Array[RouterStatusBgpPeerStatus]] = js.native
  /** URI of the network to which this router belongs. */
  var network: js.UndefOr[String] = js.native
}

object RouterStatus {
  @scala.inline
  def apply(): RouterStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterStatus]
  }
  @scala.inline
  implicit class RouterStatusOps[Self <: RouterStatus] (val x: Self) extends AnyVal {
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
    def setBestRoutesVarargs(value: Route*): Self = this.set("bestRoutes", js.Array(value :_*))
    @scala.inline
    def setBestRoutes(value: js.Array[Route]): Self = this.set("bestRoutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBestRoutes: Self = this.set("bestRoutes", js.undefined)
    @scala.inline
    def setBestRoutesForRouterVarargs(value: Route*): Self = this.set("bestRoutesForRouter", js.Array(value :_*))
    @scala.inline
    def setBestRoutesForRouter(value: js.Array[Route]): Self = this.set("bestRoutesForRouter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBestRoutesForRouter: Self = this.set("bestRoutesForRouter", js.undefined)
    @scala.inline
    def setBgpPeerStatusVarargs(value: RouterStatusBgpPeerStatus*): Self = this.set("bgpPeerStatus", js.Array(value :_*))
    @scala.inline
    def setBgpPeerStatus(value: js.Array[RouterStatusBgpPeerStatus]): Self = this.set("bgpPeerStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgpPeerStatus: Self = this.set("bgpPeerStatus", js.undefined)
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
  }
  
}

