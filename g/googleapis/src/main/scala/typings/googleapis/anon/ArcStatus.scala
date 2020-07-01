package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcStatus extends js.Object {
  var arcStatus: js.UndefOr[String] = js.native
  var dealId: js.UndefOr[String] = js.native
  var webPropertyId: js.UndefOr[Double] = js.native
}

object ArcStatus {
  @scala.inline
  def apply(arcStatus: String = null, dealId: String = null, webPropertyId: js.UndefOr[Double] = js.undefined): ArcStatus = {
    val __obj = js.Dynamic.literal()
    if (arcStatus != null) __obj.updateDynamic("arcStatus")(arcStatus.asInstanceOf[js.Any])
    if (dealId != null) __obj.updateDynamic("dealId")(dealId.asInstanceOf[js.Any])
    if (!js.isUndefined(webPropertyId)) __obj.updateDynamic("webPropertyId")(webPropertyId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcStatus]
  }
}

