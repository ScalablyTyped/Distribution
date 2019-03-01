package typings
package diff2htmlLib.Diff2HtmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var addedLines: scala.Double
  var blocks: js.Array[Block]
  var changedPercentage: js.UndefOr[scala.Double] = js.undefined
  var checksumAfter: js.UndefOr[java.lang.String] = js.undefined
  var checksumBefore: js.UndefOr[java.lang.String] = js.undefined
  var deletedFileMode: js.UndefOr[java.lang.String] = js.undefined
  var deletedLines: scala.Double
  var isCombined: scala.Boolean
  var isCopy: js.UndefOr[scala.Boolean] = js.undefined
  var isDeleted: js.UndefOr[scala.Boolean] = js.undefined
  var isGitDiff: scala.Boolean
  var isNew: js.UndefOr[scala.Boolean] = js.undefined
  var isRename: js.UndefOr[scala.Boolean] = js.undefined
  var language: java.lang.String
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var newFileMode: js.UndefOr[java.lang.String] = js.undefined
  var newMode: js.UndefOr[java.lang.String] = js.undefined
  var newName: java.lang.String
  var oldMode: js.UndefOr[java.lang.String] = js.undefined
  var oldName: java.lang.String
  var unchangedPercentage: js.UndefOr[scala.Double] = js.undefined
}

object Result {
  @scala.inline
  def apply(
    addedLines: scala.Double,
    blocks: js.Array[Block],
    deletedLines: scala.Double,
    isCombined: scala.Boolean,
    isGitDiff: scala.Boolean,
    language: java.lang.String,
    newName: java.lang.String,
    oldName: java.lang.String,
    changedPercentage: scala.Int | scala.Double = null,
    checksumAfter: java.lang.String = null,
    checksumBefore: java.lang.String = null,
    deletedFileMode: java.lang.String = null,
    isCopy: js.UndefOr[scala.Boolean] = js.undefined,
    isDeleted: js.UndefOr[scala.Boolean] = js.undefined,
    isNew: js.UndefOr[scala.Boolean] = js.undefined,
    isRename: js.UndefOr[scala.Boolean] = js.undefined,
    mode: java.lang.String = null,
    newFileMode: java.lang.String = null,
    newMode: java.lang.String = null,
    oldMode: java.lang.String = null,
    unchangedPercentage: scala.Int | scala.Double = null
  ): Result = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addedLines")(addedLines)
    __obj.updateDynamic("blocks")(blocks)
    __obj.updateDynamic("deletedLines")(deletedLines)
    __obj.updateDynamic("isCombined")(isCombined)
    __obj.updateDynamic("isGitDiff")(isGitDiff)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("newName")(newName)
    __obj.updateDynamic("oldName")(oldName)
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

