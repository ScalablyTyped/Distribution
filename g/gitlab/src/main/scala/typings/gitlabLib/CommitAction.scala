package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Commits
trait CommitAction extends js.Object {
  /** The action to perform */
  var action: gitlabLib.gitlabLibStrings.create | gitlabLib.gitlabLibStrings.delete | gitlabLib.gitlabLibStrings.move | gitlabLib.gitlabLibStrings.update
  /** File content, required for all except delete. Optional for move */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** text or base64. text is default. */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /** Full path to the file. Ex. lib/class.rb */
  var filePath: java.lang.String
  /** Last known file commit id. Will be only considered in update, move and delete actions. */
  var lastCommitId: js.UndefOr[java.lang.String] = js.undefined
  /** Original full path to the file being moved.Ex.lib / class1.rb */
  var previousPath: js.UndefOr[java.lang.String] = js.undefined
}

object CommitAction {
  @scala.inline
  def apply(
    action: gitlabLib.gitlabLibStrings.create | gitlabLib.gitlabLibStrings.delete | gitlabLib.gitlabLibStrings.move | gitlabLib.gitlabLibStrings.update,
    filePath: java.lang.String,
    content: java.lang.String = null,
    encoding: java.lang.String = null,
    lastCommitId: java.lang.String = null,
    previousPath: java.lang.String = null
  ): CommitAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], filePath = filePath)
    if (content != null) __obj.updateDynamic("content")(content)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (lastCommitId != null) __obj.updateDynamic("lastCommitId")(lastCommitId)
    if (previousPath != null) __obj.updateDynamic("previousPath")(previousPath)
    __obj.asInstanceOf[CommitAction]
  }
}

