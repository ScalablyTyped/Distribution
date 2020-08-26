package typings.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationOwner extends js.Object {
  /** The Google for Work customer id used in the Directory API. */
  var directoryCustomerId: js.UndefOr[String] = js.native
}

object OrganizationOwner {
  @scala.inline
  def apply(): OrganizationOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationOwner]
  }
  @scala.inline
  implicit class OrganizationOwnerOps[Self <: OrganizationOwner] (val x: Self) extends AnyVal {
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
    def setDirectoryCustomerId(value: String): Self = this.set("directoryCustomerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryCustomerId: Self = this.set("directoryCustomerId", js.undefined)
  }
  
}

