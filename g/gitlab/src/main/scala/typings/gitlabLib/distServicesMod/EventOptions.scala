package typings
package gitlabLib.distServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventOptions extends js.Object {
  var action: js.UndefOr[
    gitlabLib.gitlabLibStrings.created | gitlabLib.gitlabLibStrings.updated | gitlabLib.gitlabLibStrings.closed | gitlabLib.gitlabLibStrings.reopened | gitlabLib.gitlabLibStrings.pushed | gitlabLib.gitlabLibStrings.commented | gitlabLib.gitlabLibStrings.merged | gitlabLib.gitlabLibStrings.joined | gitlabLib.gitlabLibStrings.left | gitlabLib.gitlabLibStrings.destroyed | gitlabLib.gitlabLibStrings.expired
  ] = js.undefined
  var targetType: js.UndefOr[
    gitlabLib.gitlabLibStrings.issue | gitlabLib.gitlabLibStrings.milestone | gitlabLib.gitlabLibStrings.merge_request | gitlabLib.gitlabLibStrings.note | gitlabLib.gitlabLibStrings.project | gitlabLib.gitlabLibStrings.snippet | gitlabLib.gitlabLibStrings.user
  ] = js.undefined
}

object EventOptions {
  @scala.inline
  def apply(
    action: gitlabLib.gitlabLibStrings.created | gitlabLib.gitlabLibStrings.updated | gitlabLib.gitlabLibStrings.closed | gitlabLib.gitlabLibStrings.reopened | gitlabLib.gitlabLibStrings.pushed | gitlabLib.gitlabLibStrings.commented | gitlabLib.gitlabLibStrings.merged | gitlabLib.gitlabLibStrings.joined | gitlabLib.gitlabLibStrings.left | gitlabLib.gitlabLibStrings.destroyed | gitlabLib.gitlabLibStrings.expired = null,
    targetType: gitlabLib.gitlabLibStrings.issue | gitlabLib.gitlabLibStrings.milestone | gitlabLib.gitlabLibStrings.merge_request | gitlabLib.gitlabLibStrings.note | gitlabLib.gitlabLibStrings.project | gitlabLib.gitlabLibStrings.snippet | gitlabLib.gitlabLibStrings.user = null
  ): EventOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (targetType != null) __obj.updateDynamic("targetType")(targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventOptions]
  }
}

