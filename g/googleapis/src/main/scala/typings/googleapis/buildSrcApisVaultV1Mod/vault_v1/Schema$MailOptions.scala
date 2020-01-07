package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mail search advanced options
  */
@js.native
trait Schema$MailOptions extends js.Object {
  /**
    * Set to true to exclude drafts.
    */
  var excludeDrafts: js.UndefOr[Boolean] = js.native
}

object Schema$MailOptions {
  @scala.inline
  def apply(excludeDrafts: js.UndefOr[Boolean] = js.undefined): Schema$MailOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeDrafts)) __obj.updateDynamic("excludeDrafts")(excludeDrafts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MailOptions]
  }
}

