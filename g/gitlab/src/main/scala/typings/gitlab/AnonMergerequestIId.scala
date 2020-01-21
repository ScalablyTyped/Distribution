package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMergerequestIId extends js.Object {
  var mergerequestIId: js.UndefOr[Double] = js.undefined
}

object AnonMergerequestIId {
  @scala.inline
  def apply(mergerequestIId: Int | Double = null): AnonMergerequestIId = {
    val __obj = js.Dynamic.literal()
    if (mergerequestIId != null) __obj.updateDynamic("mergerequestIId")(mergerequestIId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMergerequestIId]
  }
}

