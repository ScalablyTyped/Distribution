package typings.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedDiff extends js.Object {
  var hunks: js.Array[Hunk] = js.native
  var index: js.UndefOr[String] = js.native
  var newFileName: js.UndefOr[String] = js.native
  var newHeader: js.UndefOr[String] = js.native
  var oldFileName: js.UndefOr[String] = js.native
  var oldHeader: js.UndefOr[String] = js.native
}

object ParsedDiff {
  @scala.inline
  def apply(hunks: js.Array[Hunk]): ParsedDiff = {
    val __obj = js.Dynamic.literal(hunks = hunks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedDiff]
  }
  @scala.inline
  implicit class ParsedDiffOps[Self <: ParsedDiff] (val x: Self) extends AnyVal {
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
    def setHunksVarargs(value: Hunk*): Self = this.set("hunks", js.Array(value :_*))
    @scala.inline
    def setHunks(value: js.Array[Hunk]): Self = this.set("hunks", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setNewFileName(value: String): Self = this.set("newFileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewFileName: Self = this.set("newFileName", js.undefined)
    @scala.inline
    def setNewHeader(value: String): Self = this.set("newHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewHeader: Self = this.set("newHeader", js.undefined)
    @scala.inline
    def setOldFileName(value: String): Self = this.set("oldFileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldFileName: Self = this.set("oldFileName", js.undefined)
    @scala.inline
    def setOldHeader(value: String): Self = this.set("oldHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldHeader: Self = this.set("oldHeader", js.undefined)
  }
  
}

