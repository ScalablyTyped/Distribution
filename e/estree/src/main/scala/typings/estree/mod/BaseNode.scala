package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseNode extends BaseNodeWithoutComments {
  var leadingComments: js.UndefOr[js.Array[Comment]] = js.native
  var trailingComments: js.UndefOr[js.Array[Comment]] = js.native
}

object BaseNode {
  @scala.inline
  def apply(`type`: String): BaseNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseNode]
  }
  @scala.inline
  implicit class BaseNodeOps[Self <: BaseNode] (val x: Self) extends AnyVal {
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
    def setLeadingCommentsVarargs(value: Comment*): Self = this.set("leadingComments", js.Array(value :_*))
    @scala.inline
    def setLeadingComments(value: js.Array[Comment]): Self = this.set("leadingComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeadingComments: Self = this.set("leadingComments", js.undefined)
    @scala.inline
    def setTrailingCommentsVarargs(value: Comment*): Self = this.set("trailingComments", js.Array(value :_*))
    @scala.inline
    def setTrailingComments(value: js.Array[Comment]): Self = this.set("trailingComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrailingComments: Self = this.set("trailingComments", js.undefined)
  }
  
}

