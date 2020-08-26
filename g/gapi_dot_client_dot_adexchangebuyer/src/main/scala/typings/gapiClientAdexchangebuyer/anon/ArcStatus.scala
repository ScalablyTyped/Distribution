package typings.gapiClientAdexchangebuyer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcStatus extends js.Object {
  /** ARC approval status. */
  var arcStatus: js.UndefOr[String] = js.native
  /** External deal ID. */
  var dealId: js.UndefOr[String] = js.native
  /** Publisher ID. */
  var webPropertyId: js.UndefOr[Double] = js.native
}

object ArcStatus {
  @scala.inline
  def apply(): ArcStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcStatus]
  }
  @scala.inline
  implicit class ArcStatusOps[Self <: ArcStatus] (val x: Self) extends AnyVal {
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
    def setArcStatus(value: String): Self = this.set("arcStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArcStatus: Self = this.set("arcStatus", js.undefined)
    @scala.inline
    def setDealId(value: String): Self = this.set("dealId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDealId: Self = this.set("dealId", js.undefined)
    @scala.inline
    def setWebPropertyId(value: Double): Self = this.set("webPropertyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebPropertyId: Self = this.set("webPropertyId", js.undefined)
  }
  
}

