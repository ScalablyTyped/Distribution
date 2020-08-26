package typings.diff2html.Diff2Html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var addedLines: Double = js.native
  var blocks: js.Array[Block] = js.native
  var changedPercentage: js.UndefOr[Double] = js.native
  var checksumAfter: js.UndefOr[String] = js.native
  var checksumBefore: js.UndefOr[String] = js.native
  var deletedFileMode: js.UndefOr[String] = js.native
  var deletedLines: Double = js.native
  var isCombined: Boolean = js.native
  var isCopy: js.UndefOr[Boolean] = js.native
  var isDeleted: js.UndefOr[Boolean] = js.native
  var isGitDiff: Boolean = js.native
  var isNew: js.UndefOr[Boolean] = js.native
  var isRename: js.UndefOr[Boolean] = js.native
  var language: String = js.native
  var mode: js.UndefOr[String] = js.native
  var newFileMode: js.UndefOr[String] = js.native
  var newMode: js.UndefOr[String] = js.native
  var newName: String = js.native
  var oldMode: js.UndefOr[String] = js.native
  var oldName: String = js.native
  var unchangedPercentage: js.UndefOr[Double] = js.native
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
    oldName: String
  ): Result = {
    val __obj = js.Dynamic.literal(addedLines = addedLines.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], deletedLines = deletedLines.asInstanceOf[js.Any], isCombined = isCombined.asInstanceOf[js.Any], isGitDiff = isGitDiff.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], newName = newName.asInstanceOf[js.Any], oldName = oldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddedLines(value: Double): Self = this.set("addedLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlocksVarargs(value: Block*): Self = this.set("blocks", js.Array(value :_*))
    @scala.inline
    def setBlocks(value: js.Array[Block]): Self = this.set("blocks", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeletedLines(value: Double): Self = this.set("deletedLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCombined(value: Boolean): Self = this.set("isCombined", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsGitDiff(value: Boolean): Self = this.set("isGitDiff", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewName(value: String): Self = this.set("newName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldName(value: String): Self = this.set("oldName", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangedPercentage(value: Double): Self = this.set("changedPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangedPercentage: Self = this.set("changedPercentage", js.undefined)
    @scala.inline
    def setChecksumAfter(value: String): Self = this.set("checksumAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecksumAfter: Self = this.set("checksumAfter", js.undefined)
    @scala.inline
    def setChecksumBefore(value: String): Self = this.set("checksumBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecksumBefore: Self = this.set("checksumBefore", js.undefined)
    @scala.inline
    def setDeletedFileMode(value: String): Self = this.set("deletedFileMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletedFileMode: Self = this.set("deletedFileMode", js.undefined)
    @scala.inline
    def setIsCopy(value: Boolean): Self = this.set("isCopy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCopy: Self = this.set("isCopy", js.undefined)
    @scala.inline
    def setIsDeleted(value: Boolean): Self = this.set("isDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDeleted: Self = this.set("isDeleted", js.undefined)
    @scala.inline
    def setIsNew(value: Boolean): Self = this.set("isNew", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNew: Self = this.set("isNew", js.undefined)
    @scala.inline
    def setIsRename(value: Boolean): Self = this.set("isRename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRename: Self = this.set("isRename", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setNewFileMode(value: String): Self = this.set("newFileMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewFileMode: Self = this.set("newFileMode", js.undefined)
    @scala.inline
    def setNewMode(value: String): Self = this.set("newMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewMode: Self = this.set("newMode", js.undefined)
    @scala.inline
    def setOldMode(value: String): Self = this.set("oldMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldMode: Self = this.set("oldMode", js.undefined)
    @scala.inline
    def setUnchangedPercentage(value: Double): Self = this.set("unchangedPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnchangedPercentage: Self = this.set("unchangedPercentage", js.undefined)
  }
  
}

