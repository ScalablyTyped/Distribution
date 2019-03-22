package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MergerequestId extends js.Object {
  var mergerequestId: js.UndefOr[gitlabLib.distEs5ServicesMergeRequestsMod.MergeRequestId] = js.undefined
}

object Anon_MergerequestId {
  @scala.inline
  def apply(mergerequestId: gitlabLib.distEs5ServicesMergeRequestsMod.MergeRequestId = null): Anon_MergerequestId = {
    val __obj = js.Dynamic.literal()
    if (mergerequestId != null) __obj.updateDynamic("mergerequestId")(mergerequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MergerequestId]
  }
}

