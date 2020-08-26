package typings.gapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeldDriveQuery extends js.Object {
  /** If true, include files in Team Drives in the hold. */
  var includeTeamDriveFiles: js.UndefOr[Boolean] = js.native
}

object HeldDriveQuery {
  @scala.inline
  def apply(): HeldDriveQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeldDriveQuery]
  }
  @scala.inline
  implicit class HeldDriveQueryOps[Self <: HeldDriveQuery] (val x: Self) extends AnyVal {
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
    def setIncludeTeamDriveFiles(value: Boolean): Self = this.set("includeTeamDriveFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeTeamDriveFiles: Self = this.set("includeTeamDriveFiles", js.undefined)
  }
  
}

