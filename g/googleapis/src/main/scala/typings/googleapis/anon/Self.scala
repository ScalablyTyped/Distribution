package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Self extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var self: js.UndefOr[Boolean] = js.native
}

object Self {
  @scala.inline
  def apply(): Self = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Self]
  }
  @scala.inline
  implicit class SelfOps[Self_ <: Self] (val x: Self_) extends AnyVal {
    @scala.inline
    def duplicate: Self_ = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self_]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self_ with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self_ with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self_ = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplayName(value: String): Self_ = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self_ = this.set("displayName", js.undefined)
    @scala.inline
    def setEmail(value: String): Self_ = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self_ = this.set("email", js.undefined)
    @scala.inline
    def setId(value: String): Self_ = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self_ = this.set("id", js.undefined)
    @scala.inline
    def setSelf(value: Boolean): Self_ = this.set("self", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelf: Self_ = this.set("self", js.undefined)
  }
  
}

