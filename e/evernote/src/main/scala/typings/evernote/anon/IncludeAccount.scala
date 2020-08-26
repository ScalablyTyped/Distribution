package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeAccount extends js.Object {
  var includeAccount: js.UndefOr[Boolean] = js.native
  var includeBusinessLinkedNotebooks: js.UndefOr[Boolean] = js.native
  var includePersonalLinkedNotebooks: js.UndefOr[Boolean] = js.native
}

object IncludeAccount {
  @scala.inline
  def apply(): IncludeAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeAccount]
  }
  @scala.inline
  implicit class IncludeAccountOps[Self <: IncludeAccount] (val x: Self) extends AnyVal {
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
    def setIncludeAccount(value: Boolean): Self = this.set("includeAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeAccount: Self = this.set("includeAccount", js.undefined)
    @scala.inline
    def setIncludeBusinessLinkedNotebooks(value: Boolean): Self = this.set("includeBusinessLinkedNotebooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeBusinessLinkedNotebooks: Self = this.set("includeBusinessLinkedNotebooks", js.undefined)
    @scala.inline
    def setIncludePersonalLinkedNotebooks(value: Boolean): Self = this.set("includePersonalLinkedNotebooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludePersonalLinkedNotebooks: Self = this.set("includePersonalLinkedNotebooks", js.undefined)
  }
  
}

