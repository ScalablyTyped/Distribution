package typings.expoConfigureSplashScreen.xmlManipulationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpectedCommentType extends ExpectedElement {
  var comment: String = js.native
}

object ExpectedCommentType {
  @scala.inline
  def apply(comment: String): ExpectedCommentType = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectedCommentType]
  }
  @scala.inline
  implicit class ExpectedCommentTypeOps[Self <: ExpectedCommentType] (val x: Self) extends AnyVal {
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
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
  }
  
}

