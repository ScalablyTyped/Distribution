package typings.envEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Editor extends js.Object {
  var binary: String = js.native
  var id: String = js.native
  var isTerminalEditor: Boolean = js.native
  var keywords: js.Array[String] = js.native
  var name: String = js.native
  var paths: js.Array[String] = js.native
}

object Editor {
  @scala.inline
  def apply(
    binary: String,
    id: String,
    isTerminalEditor: Boolean,
    keywords: js.Array[String],
    name: String,
    paths: js.Array[String]
  ): Editor = {
    val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isTerminalEditor = isTerminalEditor.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Editor]
  }
  @scala.inline
  implicit class EditorOps[Self <: Editor] (val x: Self) extends AnyVal {
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
    def setBinary(value: String): Self = this.set("binary", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTerminalEditor(value: Boolean): Self = this.set("isTerminalEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = this.set("keywords", js.Array(value :_*))
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    @scala.inline
    def setPaths(value: js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
  }
  
}

