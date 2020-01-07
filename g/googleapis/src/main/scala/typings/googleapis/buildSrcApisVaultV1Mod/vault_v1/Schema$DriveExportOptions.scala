package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for Drive export.
  */
@js.native
trait Schema$DriveExportOptions extends js.Object {
  /**
    * Set to true to include access level information for users with &lt;a
    * href=&quot;https://support.google.com/vault/answer/6099459#metadata&quot;&gt;indirect
    * access&lt;/a&gt; to files.
    */
  var includeAccessInfo: js.UndefOr[Boolean] = js.native
}

object Schema$DriveExportOptions {
  @scala.inline
  def apply(includeAccessInfo: js.UndefOr[Boolean] = js.undefined): Schema$DriveExportOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeAccessInfo)) __obj.updateDynamic("includeAccessInfo")(includeAccessInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DriveExportOptions]
  }
}

