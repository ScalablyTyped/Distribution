package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaExchangedPeeringRoute extends js.Object {
  /**
    * The destination range of the route.
    */
  var destRange: js.UndefOr[String] = js.native
  /**
    * If the peering route is imported if there is no confliction.
    */
  var imported: js.UndefOr[Boolean] = js.native
  /**
    * The region of peering route next hop, only applies to dynamic routes.
    */
  var nextHopRegion: js.UndefOr[String] = js.native
  /**
    * The priority of the peering route.
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    * The type of the peering route.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaExchangedPeeringRoute {
  @scala.inline
  def apply(): SchemaExchangedPeeringRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExchangedPeeringRoute]
  }
  @scala.inline
  implicit class SchemaExchangedPeeringRouteOps[Self <: SchemaExchangedPeeringRoute] (val x: Self) extends AnyVal {
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
    def setDestRange(value: String): Self = this.set("destRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestRange: Self = this.set("destRange", js.undefined)
    @scala.inline
    def setImported(value: Boolean): Self = this.set("imported", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImported: Self = this.set("imported", js.undefined)
    @scala.inline
    def setNextHopRegion(value: String): Self = this.set("nextHopRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextHopRegion: Self = this.set("nextHopRegion", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

