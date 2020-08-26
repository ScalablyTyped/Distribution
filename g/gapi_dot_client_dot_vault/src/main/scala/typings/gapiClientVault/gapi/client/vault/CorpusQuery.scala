package typings.gapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CorpusQuery extends js.Object {
  /** Details pertaining to Drive holds. If set, corpus must be Drive. */
  var driveQuery: js.UndefOr[HeldDriveQuery] = js.native
  /** Details pertaining to Groups holds. If set, corpus must be Groups. */
  var groupsQuery: js.UndefOr[HeldGroupsQuery] = js.native
  /** Details pertaining to mail holds. If set, corpus must be mail. */
  var mailQuery: js.UndefOr[HeldMailQuery] = js.native
}

object CorpusQuery {
  @scala.inline
  def apply(): CorpusQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CorpusQuery]
  }
  @scala.inline
  implicit class CorpusQueryOps[Self <: CorpusQuery] (val x: Self) extends AnyVal {
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
    def setDriveQuery(value: HeldDriveQuery): Self = this.set("driveQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriveQuery: Self = this.set("driveQuery", js.undefined)
    @scala.inline
    def setGroupsQuery(value: HeldGroupsQuery): Self = this.set("groupsQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupsQuery: Self = this.set("groupsQuery", js.undefined)
    @scala.inline
    def setMailQuery(value: HeldMailQuery): Self = this.set("mailQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMailQuery: Self = this.set("mailQuery", js.undefined)
  }
  
}

