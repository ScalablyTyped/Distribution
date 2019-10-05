package typings.diff2html.Diff2Html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var addedLines: Double
  var blocks: js.Array[Block]
  var changedPercentage: js.UndefOr[Double] = js.undefined
  var checksumAfter: js.UndefOr[String] = js.undefined
  var checksumBefore: js.UndefOr[String] = js.undefined
  var deletedFileMode: js.UndefOr[String] = js.undefined
  var deletedLines: Double
  var isCombined: Boolean
  var isCopy: js.UndefOr[Boolean] = js.undefined
  var isDeleted: js.UndefOr[Boolean] = js.undefined
  var isGitDiff: Boolean
  var isNew: js.UndefOr[Boolean] = js.undefined
  var isRename: js.UndefOr[Boolean] = js.undefined
  var language: String
  var mode: js.UndefOr[String] = js.undefined
  var newFileMode: js.UndefOr[String] = js.undefined
  var newMode: js.UndefOr[String] = js.undefined
  var newName: String
  var oldMode: js.UndefOr[String] = js.undefined
  var oldName: String
  var unchangedPercentage: js.UndefOr[Double] = js.undefined
}

object Result {
  @scala.inline
  def apply(
    addedLines: Double,
    blocks: js.Array[Block],
    deletedLines: Double,
    isCombined: Boolean,
    isGitDiff: Boolean,
    language: String,
    newName: String,
    oldName: String,
    changedPercentage: Int | Double = null,
    checksumAfter: String = null,
    checksumBefore: String = null,
    deletedFileMode: String = null,
    isCopy: js.UndefOr[Boolean] = js.undefined,
    isDeleted: js.UndefOr[Boolean] = js.undefined,
    isNew: js.UndefOr[Boolean] = js.undefined,
    isRename: js.UndefOr[Boolean] = js.undefined,
    mode: String = null,
    newFileMode: String = null,
    newMode: String = null,
    oldMode: String = null,
    unchangedPercentage: Int | Double = null
  ): Result = {
    val __obj = js.Dynamic.literal(addedLines = addedLines, blocks = blocks, deletedLines = deletedLines, isCombined = isCombined, isGitDiff = isGitDiff, language = language, newName = newName, oldName = oldName)
    if (changedPercentage != null) __obj.updateDynamic("changedPercentage")(changedPercentage.asInstanceOf[js.Any])
    if (checksumAfter != null) __obj.updateDynamic("checksumAfter")(checksumAfter)
    if (checksumBefore != null) __obj.updateDynamic("checksumBefore")(checksumBefore)
    if (deletedFileMode != null) __obj.updateDynamic("deletedFileMode")(deletedFileMode)
    if (!js.isUndefined(isCopy)) __obj.updateDynamic("isCopy")(isCopy)
    if (!js.isUndefined(isDeleted)) __obj.updateDynamic("isDeleted")(isDeleted)
    if (!js.isUndefined(isNew)) __obj.updateDynamic("isNew")(isNew)
    if (!js.isUndefined(isRename)) __obj.updateDynamic("isRename")(isRename)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (newFileMode != null) __obj.updateDynamic("newFileMode")(newFileMode)
    if (newMode != null) __obj.updateDynamic("newMode")(newMode)
    if (oldMode != null) __obj.updateDynamic("oldMode")(oldMode)
    if (unchangedPercentage != null) __obj.updateDynamic("unchangedPercentage")(unchangedPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

