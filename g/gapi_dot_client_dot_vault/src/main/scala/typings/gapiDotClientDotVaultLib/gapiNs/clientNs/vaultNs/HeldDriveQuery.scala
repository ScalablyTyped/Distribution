package typings
package gapiDotClientDotVaultLib.gapiNs.clientNs.vaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeldDriveQuery extends js.Object {
  /** If true, include files in Team Drives in the hold. */
  var includeTeamDriveFiles: js.UndefOr[scala.Boolean] = js.undefined
}

object HeldDriveQuery {
  @scala.inline
  def apply(includeTeamDriveFiles: js.UndefOr[scala.Boolean] = js.undefined): HeldDriveQuery = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeTeamDriveFiles)) __obj.updateDynamic("includeTeamDriveFiles")(includeTeamDriveFiles)
    __obj.asInstanceOf[HeldDriveQuery]
  }
}

