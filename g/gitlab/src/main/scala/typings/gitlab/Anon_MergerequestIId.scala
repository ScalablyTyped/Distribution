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
  def apply(mergerequestIId: Int | Double = null): Anon_MergerequestIId = {
    val __obj = js.Dynamic.literal()
    if (mergerequestIId != null) __obj.updateDynamic("mergerequestIId")(mergerequestIId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MergerequestIId]
  }
}

