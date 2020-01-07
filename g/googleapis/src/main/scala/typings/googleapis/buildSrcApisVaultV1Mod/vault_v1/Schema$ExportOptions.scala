package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Export advanced options
  */
@js.native
trait Schema$ExportOptions extends js.Object {
  /**
    * Option available for Drive export.
    */
  var driveOptions: js.UndefOr[Schema$DriveExportOptions] = js.native
  /**
    * Option available for groups export.
    */
  var groupsOptions: js.UndefOr[Schema$GroupsExportOptions] = js.native
  /**
    * Option available for hangouts chat export.
    */
  var hangoutsChatOptions: js.UndefOr[Schema$HangoutsChatExportOptions] = js.native
  /**
    * Option available for mail export.
    */
  var mailOptions: js.UndefOr[Schema$MailExportOptions] = js.native
  /**
    * The requested export location.
    */
  var region: js.UndefOr[String] = js.native
}

object Schema$ExportOptions {
  @scala.inline
  def apply(
    driveOptions: Schema$DriveExportOptions = null,
    groupsOptions: Schema$GroupsExportOptions = null,
    hangoutsChatOptions: Schema$HangoutsChatExportOptions = null,
    mailOptions: Schema$MailExportOptions = null,
    region: String = null
  ): Schema$ExportOptions = {
    val __obj = js.Dynamic.literal()
    if (driveOptions != null) __obj.updateDynamic("driveOptions")(driveOptions.asInstanceOf[js.Any])
    if (groupsOptions != null) __obj.updateDynamic("groupsOptions")(groupsOptions.asInstanceOf[js.Any])
    if (hangoutsChatOptions != null) __obj.updateDynamic("hangoutsChatOptions")(hangoutsChatOptions.asInstanceOf[js.Any])
    if (mailOptions != null) __obj.updateDynamic("mailOptions")(mailOptions.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ExportOptions]
  }
}

