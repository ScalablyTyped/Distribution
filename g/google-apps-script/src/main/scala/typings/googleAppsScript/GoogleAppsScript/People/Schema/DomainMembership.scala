package typings.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainMembership extends js.Object {
  var inViewerDomain: js.UndefOr[Boolean] = js.native
}

object DomainMembership {
  @scala.inline
  def apply(): DomainMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainMembership]
  }
  @scala.inline
  implicit class DomainMembershipOps[Self <: DomainMembership] (val x: Self) extends AnyVal {
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
    def setInViewerDomain(value: Boolean): Self = this.set("inViewerDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInViewerDomain: Self = this.set("inViewerDomain", js.undefined)
  }
  
}

