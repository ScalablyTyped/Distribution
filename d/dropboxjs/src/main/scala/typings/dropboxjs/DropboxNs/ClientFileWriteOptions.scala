package typings.dropboxjs.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientFileWriteOptions extends js.Object {
  var lastVersionTag: js.UndefOr[String] = js.undefined
  var noOverwrite: js.UndefOr[Boolean] = js.undefined
  var parentRev: js.UndefOr[String] = js.undefined
}

object ClientFileWriteOptions {
  @scala.inline
  def apply(
    lastVersionTag: String = null,
    noOverwrite: js.UndefOr[Boolean] = js.undefined,
    parentRev: String = null
  ): ClientFileWriteOptions = {
    val __obj = js.Dynamic.literal()
    if (lastVersionTag != null) __obj.updateDynamic("lastVersionTag")(lastVersionTag)
    if (!js.isUndefined(noOverwrite)) __obj.updateDynamic("noOverwrite")(noOverwrite)
    if (parentRev != null) __obj.updateDynamic("parentRev")(parentRev)
    __obj.asInstanceOf[ClientFileWriteOptions]
  }
}

