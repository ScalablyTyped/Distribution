package typings.gapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeldDriveQuery extends js.Object {
  /** If true, include files in Team Drives in the hold. */
  var includeTeamDriveFiles: js.UndefOr[Boolean] = js.undefined
}

object HeldDriveQuery {
  @scala.inline
  def apply(includeTeamDriveFiles: js.UndefOr[Boolean] = js.undefined): HeldDriveQuery = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeTeamDriveFiles)) __obj.updateDynamic("includeTeamDriveFiles")(includeTeamDriveFiles.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeldDriveQuery]
  }
}

