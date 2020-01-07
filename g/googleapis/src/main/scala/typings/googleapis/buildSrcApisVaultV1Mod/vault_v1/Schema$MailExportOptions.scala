package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for mail export.
  */
@js.native
trait Schema$MailExportOptions extends js.Object {
  /**
    * The export file format.
    */
  var exportFormat: js.UndefOr[String] = js.native
  /**
    * Set to true to export confidential mode content.
    */
  var showConfidentialModeContent: js.UndefOr[Boolean] = js.native
}

object Schema$MailExportOptions {
  @scala.inline
  def apply(exportFormat: String = null, showConfidentialModeContent: js.UndefOr[Boolean] = js.undefined): Schema$MailExportOptions = {
    val __obj = js.Dynamic.literal()
    if (exportFormat != null) __obj.updateDynamic("exportFormat")(exportFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(showConfidentialModeContent)) __obj.updateDynamic("showConfidentialModeContent")(showConfidentialModeContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MailExportOptions]
  }
}

