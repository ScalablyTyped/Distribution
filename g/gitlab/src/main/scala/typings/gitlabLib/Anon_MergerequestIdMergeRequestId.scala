package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MergerequestIdMergeRequestId extends js.Object {
  var mergerequestId: js.UndefOr[gitlabLib.distLatestServicesMergeRequestsMod.MergeRequestId] = js.undefined
}

object Anon_MergerequestIdMergeRequestId {
  @scala.inline
  def apply(mergerequestId: gitlabLib.distLatestServicesMergeRequestsMod.MergeRequestId = null): Anon_MergerequestIdMergeRequestId = {
    val __obj = js.Dynamic.literal()
    if (mergerequestId != null) __obj.updateDynamic("mergerequestId")(mergerequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MergerequestIdMergeRequestId]
  }
}

