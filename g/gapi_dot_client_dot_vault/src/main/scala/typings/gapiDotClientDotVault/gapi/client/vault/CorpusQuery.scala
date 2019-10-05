package typings.gapiDotClientDotVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorpusQuery extends js.Object {
  /** Details pertaining to Drive holds. If set, corpus must be Drive. */
  var driveQuery: js.UndefOr[HeldDriveQuery] = js.undefined
  /** Details pertaining to Groups holds. If set, corpus must be Groups. */
  var groupsQuery: js.UndefOr[HeldGroupsQuery] = js.undefined
  /** Details pertaining to mail holds. If set, corpus must be mail. */
  var mailQuery: js.UndefOr[HeldMailQuery] = js.undefined
}

object CorpusQuery {
  @scala.inline
  def apply(
    driveQuery: HeldDriveQuery = null,
    groupsQuery: HeldGroupsQuery = null,
    mailQuery: HeldMailQuery = null
  ): CorpusQuery = {
    val __obj = js.Dynamic.literal()
    if (driveQuery != null) __obj.updateDynamic("driveQuery")(driveQuery)
    if (groupsQuery != null) __obj.updateDynamic("groupsQuery")(groupsQuery)
    if (mailQuery != null) __obj.updateDynamic("mailQuery")(mailQuery)
    __obj.asInstanceOf[CorpusQuery]
  }
}

