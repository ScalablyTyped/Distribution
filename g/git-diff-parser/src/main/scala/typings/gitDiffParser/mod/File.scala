package typings.gitDiffParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  var added: Boolean = js.native
  var binary: Boolean = js.native
  var deleted: Boolean = js.native
  var index: js.UndefOr[js.Array[String]] = js.native
  var lines: js.Array[Line] = js.native
  var name: String = js.native
  var oldName: js.UndefOr[String] = js.native
  var renamed: Boolean = js.native
}

object File {
  @scala.inline
  def apply(
    added: Boolean,
    binary: Boolean,
    deleted: Boolean,
    lines: js.Array[Line],
    name: String,
    renamed: Boolean
  ): File = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], renamed = renamed.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
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
    def setAdded(value: Boolean): Self = this.set("added", value.asInstanceOf[js.Any])
    @scala.inline
    def setBinary(value: Boolean): Self = this.set("binary", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinesVarargs(value: Line*): Self = this.set("lines", js.Array(value :_*))
    @scala.inline
    def setLines(value: js.Array[Line]): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenamed(value: Boolean): Self = this.set("renamed", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    @scala.inline
    def setIndex(value: js.Array[String]): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setOldName(value: String): Self = this.set("oldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldName: Self = this.set("oldName", js.undefined)
  }
  
}

