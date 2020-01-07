package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for hangouts chat export.
  */
@js.native
trait Schema$HangoutsChatExportOptions extends js.Object {
  /**
    * The export format for hangouts chat export.
    */
  var exportFormat: js.UndefOr[String] = js.native
}

object Schema$HangoutsChatExportOptions {
  @scala.inline
  def apply(exportFormat: String = null): Schema$HangoutsChatExportOptions = {
    val __obj = js.Dynamic.literal()
    if (exportFormat != null) __obj.updateDynamic("exportFormat")(exportFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HangoutsChatExportOptions]
  }
}

