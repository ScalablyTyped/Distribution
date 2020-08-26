package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceProposalUser extends js.Object {
  /** Gaia id associated with a user, absent for the Google Tag Manager system. */
  var gaiaId: js.UndefOr[String] = js.native
  /** User type distinguishes between a user and the Google Tag Manager system. */
  var `type`: js.UndefOr[String] = js.native
}

object WorkspaceProposalUser {
  @scala.inline
  def apply(): WorkspaceProposalUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceProposalUser]
  }
  @scala.inline
  implicit class WorkspaceProposalUserOps[Self <: WorkspaceProposalUser] (val x: Self) extends AnyVal {
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
    def setGaiaId(value: String): Self = this.set("gaiaId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGaiaId: Self = this.set("gaiaId", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

