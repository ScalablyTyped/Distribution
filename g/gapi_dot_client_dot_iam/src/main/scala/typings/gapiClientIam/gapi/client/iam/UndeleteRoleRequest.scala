package typings.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UndeleteRoleRequest extends js.Object {
  /** Used to perform a consistent read-modify-write. */
  var etag: js.UndefOr[String] = js.native
}

object UndeleteRoleRequest {
  @scala.inline
  def apply(): UndeleteRoleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UndeleteRoleRequest]
  }
  @scala.inline
  implicit class UndeleteRoleRequestOps[Self <: UndeleteRoleRequest] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
  }
  
}

