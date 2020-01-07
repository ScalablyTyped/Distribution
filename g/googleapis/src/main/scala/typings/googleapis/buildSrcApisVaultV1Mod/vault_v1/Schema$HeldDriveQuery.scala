package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Query options for Drive holds.
  */
@js.native
trait Schema$HeldDriveQuery extends js.Object {
  /**
    * If true, include files in Team Drives in the hold.
    */
  var includeTeamDriveFiles: js.UndefOr[Boolean] = js.native
}

object Schema$HeldDriveQuery {
  @scala.inline
  def apply(includeTeamDriveFiles: js.UndefOr[Boolean] = js.undefined): Schema$HeldDriveQuery = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeTeamDriveFiles)) __obj.updateDynamic("includeTeamDriveFiles")(includeTeamDriveFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HeldDriveQuery]
  }
}

