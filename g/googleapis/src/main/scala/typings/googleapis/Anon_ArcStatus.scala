package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArcStatus extends js.Object {
  var arcStatus: js.UndefOr[String] = js.native
  var dealId: js.UndefOr[String] = js.native
  var webPropertyId: js.UndefOr[Double] = js.native
}

object Anon_ArcStatus {
  @scala.inline
  def apply(arcStatus: String = null, dealId: String = null, webPropertyId: Int | Double = null): Anon_ArcStatus = {
    val __obj = js.Dynamic.literal()
    if (arcStatus != null) __obj.updateDynamic("arcStatus")(arcStatus.asInstanceOf[js.Any])
    if (dealId != null) __obj.updateDynamic("dealId")(dealId.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArcStatus]
  }
}

