package typings.edtrIoMathquill.anon

import typings.edtrIoMathquill.mod.MQ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edit extends js.Object {
  var edit: js.UndefOr[js.Function1[/* mathField */ MQ, _]] = js.native
  var enter: js.UndefOr[js.Function1[/* mathField */ MQ, _]] = js.native
  var moveOutOf: js.UndefOr[js.Function2[/* direction */ Double, /* mathField */ MQ, _]] = js.native
  var upOutOf: js.UndefOr[js.Function1[/* mathField */ MQ, _]] = js.native
}

object Edit {
  @scala.inline
  def apply(): Edit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Edit]
  }
  @scala.inline
  implicit class EditOps[Self <: Edit] (val x: Self) extends AnyVal {
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
    def setEdit(value: /* mathField */ MQ => _): Self = this.set("edit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEdit: Self = this.set("edit", js.undefined)
    @scala.inline
    def setEnter(value: /* mathField */ MQ => _): Self = this.set("enter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    @scala.inline
    def setMoveOutOf(value: (/* direction */ Double, /* mathField */ MQ) => _): Self = this.set("moveOutOf", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMoveOutOf: Self = this.set("moveOutOf", js.undefined)
    @scala.inline
    def setUpOutOf(value: /* mathField */ MQ => _): Self = this.set("upOutOf", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpOutOf: Self = this.set("upOutOf", js.undefined)
  }
  
}

