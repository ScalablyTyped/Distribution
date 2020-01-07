package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for groups export.
  */
@js.native
trait Schema$GroupsExportOptions extends js.Object {
  /**
    * The export format for groups export.
    */
  var exportFormat: js.UndefOr[String] = js.native
}

object Schema$GroupsExportOptions {
  @scala.inline
  def apply(exportFormat: String = null): Schema$GroupsExportOptions = {
    val __obj = js.Dynamic.literal()
    if (exportFormat != null) __obj.updateDynamic("exportFormat")(exportFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GroupsExportOptions]
  }
}

