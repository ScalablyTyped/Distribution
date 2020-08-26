package typings.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var leadingComments: js.UndefOr[String] = js.native
  var leadingDetachedCommentsList: js.Array[String] = js.native
  var pathList: js.Array[Double] = js.native
  var spanList: js.Array[Double] = js.native
  var trailingComments: js.UndefOr[String] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    leadingDetachedCommentsList: js.Array[String],
    pathList: js.Array[Double],
    spanList: js.Array[Double]
  ): AsObject = {
    val __obj = js.Dynamic.literal(leadingDetachedCommentsList = leadingDetachedCommentsList.asInstanceOf[js.Any], pathList = pathList.asInstanceOf[js.Any], spanList = spanList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
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
    def setLeadingDetachedCommentsListVarargs(value: String*): Self = this.set("leadingDetachedCommentsList", js.Array(value :_*))
    @scala.inline
    def setLeadingDetachedCommentsList(value: js.Array[String]): Self = this.set("leadingDetachedCommentsList", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathListVarargs(value: Double*): Self = this.set("pathList", js.Array(value :_*))
    @scala.inline
    def setPathList(value: js.Array[Double]): Self = this.set("pathList", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpanListVarargs(value: Double*): Self = this.set("spanList", js.Array(value :_*))
    @scala.inline
    def setSpanList(value: js.Array[Double]): Self = this.set("spanList", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeadingComments(value: String): Self = this.set("leadingComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeadingComments: Self = this.set("leadingComments", js.undefined)
    @scala.inline
    def setTrailingComments(value: String): Self = this.set("trailingComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrailingComments: Self = this.set("trailingComments", js.undefined)
  }
  
}

