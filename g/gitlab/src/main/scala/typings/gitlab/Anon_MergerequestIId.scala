package typings.gitlab

import typings.gitlab.distServicesMod.MergeRequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MergerequestIId extends js.Object {
  var mergerequestIId: js.UndefOr[MergeRequestId] = js.undefined
}

object Anon_MergerequestIId {
  @scala.inline
  def apply(mergerequestIId: js.UndefOr[MergeRequestId] = js.undefined): Anon_MergerequestIId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mergerequestIId)) __obj.updateDynamic("mergerequestIId")(mergerequestIId)
    __obj.asInstanceOf[Anon_MergerequestIId]
  }
}

