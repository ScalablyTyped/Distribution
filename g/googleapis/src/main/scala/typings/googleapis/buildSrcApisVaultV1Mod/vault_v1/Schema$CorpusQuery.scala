package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Corpus specific queries.
  */
@js.native
trait Schema$CorpusQuery extends js.Object {
  /**
    * Details pertaining to Drive holds. If set, corpus must be Drive.
    */
  var driveQuery: js.UndefOr[Schema$HeldDriveQuery] = js.native
  /**
    * Details pertaining to Groups holds. If set, corpus must be Groups.
    */
  var groupsQuery: js.UndefOr[Schema$HeldGroupsQuery] = js.native
  /**
    * Details pertaining to Hangouts Chat holds. If set, corpus must be
    * Hangouts Chat.
    */
  var hangoutsChatQuery: js.UndefOr[Schema$HeldHangoutsChatQuery] = js.native
  /**
    * Details pertaining to mail holds. If set, corpus must be mail.
    */
  var mailQuery: js.UndefOr[Schema$HeldMailQuery] = js.native
}

object Schema$CorpusQuery {
  @scala.inline
  def apply(
    driveQuery: Schema$HeldDriveQuery = null,
    groupsQuery: Schema$HeldGroupsQuery = null,
    hangoutsChatQuery: Schema$HeldHangoutsChatQuery = null,
    mailQuery: Schema$HeldMailQuery = null
  ): Schema$CorpusQuery = {
    val __obj = js.Dynamic.literal()
    if (driveQuery != null) __obj.updateDynamic("driveQuery")(driveQuery.asInstanceOf[js.Any])
    if (groupsQuery != null) __obj.updateDynamic("groupsQuery")(groupsQuery.asInstanceOf[js.Any])
    if (hangoutsChatQuery != null) __obj.updateDynamic("hangoutsChatQuery")(hangoutsChatQuery.asInstanceOf[js.Any])
    if (mailQuery != null) __obj.updateDynamic("mailQuery")(mailQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CorpusQuery]
  }
}

