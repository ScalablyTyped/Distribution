package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanComment extends js.Object {
  var canComment: js.UndefOr[Boolean] = js.native
  var canPlusone: js.UndefOr[Boolean] = js.native
  var canUpdate: js.UndefOr[Boolean] = js.native
  var isPlusOned: js.UndefOr[Boolean] = js.native
  var resharingDisabled: js.UndefOr[Boolean] = js.native
}

object CanComment {
  @scala.inline
  def apply(): CanComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanComment]
  }
  @scala.inline
  implicit class CanCommentOps[Self <: CanComment] (val x: Self) extends AnyVal {
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
    def setCanComment(value: Boolean): Self = this.set("canComment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanComment: Self = this.set("canComment", js.undefined)
    @scala.inline
    def setCanPlusone(value: Boolean): Self = this.set("canPlusone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanPlusone: Self = this.set("canPlusone", js.undefined)
    @scala.inline
    def setCanUpdate(value: Boolean): Self = this.set("canUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanUpdate: Self = this.set("canUpdate", js.undefined)
    @scala.inline
    def setIsPlusOned(value: Boolean): Self = this.set("isPlusOned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPlusOned: Self = this.set("isPlusOned", js.undefined)
    @scala.inline
    def setResharingDisabled(value: Boolean): Self = this.set("resharingDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResharingDisabled: Self = this.set("resharingDisabled", js.undefined)
  }
  
}

