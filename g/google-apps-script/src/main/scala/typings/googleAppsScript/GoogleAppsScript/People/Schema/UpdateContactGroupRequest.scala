package typings.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateContactGroupRequest extends js.Object {
  var contactGroup: js.UndefOr[ContactGroup] = js.native
}

object UpdateContactGroupRequest {
  @scala.inline
  def apply(): UpdateContactGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContactGroupRequest]
  }
  @scala.inline
  implicit class UpdateContactGroupRequestOps[Self <: UpdateContactGroupRequest] (val x: Self) extends AnyVal {
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
    def setContactGroup(value: ContactGroup): Self = this.set("contactGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactGroup: Self = this.set("contactGroup", js.undefined)
  }
  
}

