package typings
package gitlabLib.distLatestServicesCommitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitAction extends js.Object {
  /** The action to perform */
  var action: gitlabLib.gitlabLibStrings.create | gitlabLib.gitlabLibStrings.delete | gitlabLib.gitlabLibStrings.move | gitlabLib.gitlabLibStrings.update
  /** File content, required for all except delete. Optional for move */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** text or base64. text is default. */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /** Full path to the file. Ex. lib/class.rb */
  var file_path: java.lang.String
  /** Last known file commit id. Will be only considered in update, move and delete actions. */
  var last_commit_id: js.UndefOr[java.lang.String] = js.undefined
  /** Original full path to the file being moved.Ex.lib / class1.rb */
  var previous_path: js.UndefOr[java.lang.String] = js.undefined
}

object CommitAction {
  @scala.inline
  def apply(
    action: gitlabLib.gitlabLibStrings.create | gitlabLib.gitlabLibStrings.delete | gitlabLib.gitlabLibStrings.move | gitlabLib.gitlabLibStrings.update,
    file_path: java.lang.String,
    content: java.lang.String = null,
    encoding: java.lang.String = null,
    last_commit_id: java.lang.String = null,
    previous_path: java.lang.String = null
  ): CommitAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], file_path = file_path)
    if (content != null) __obj.updateDynamic("content")(content)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (last_commit_id != null) __obj.updateDynamic("last_commit_id")(last_commit_id)
    if (previous_path != null) __obj.updateDynamic("previous_path")(previous_path)
    __obj.asInstanceOf[CommitAction]
  }
}

