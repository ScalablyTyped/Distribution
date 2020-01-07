package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Drive search advanced options
  */
@js.native
trait Schema$DriveOptions extends js.Object {
  /**
    * Set to true to include Team Drive.
    */
  var includeTeamDrives: js.UndefOr[Boolean] = js.native
  /**
    * Search the versions of the Drive file as of the reference date. These
    * timestamps are in GMT and rounded down to the given date.
    */
  var versionDate: js.UndefOr[String] = js.native
}

object Schema$DriveOptions {
  @scala.inline
  def apply(includeTeamDrives: js.UndefOr[Boolean] = js.undefined, versionDate: String = null): Schema$DriveOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeTeamDrives)) __obj.updateDynamic("includeTeamDrives")(includeTeamDrives.asInstanceOf[js.Any])
    if (versionDate != null) __obj.updateDynamic("versionDate")(versionDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DriveOptions]
  }
}

