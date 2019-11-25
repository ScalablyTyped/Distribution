package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FolderName extends js.Object {
  var folderName: js.UndefOr[String] = js.undefined
  var isEnabled: js.UndefOr[Boolean] = js.undefined
}

object Anon_FolderName {
  @scala.inline
  def apply(folderName: String = null, isEnabled: js.UndefOr[Boolean] = js.undefined): Anon_FolderName = {
    val __obj = js.Dynamic.literal()
    if (folderName != null) __obj.updateDynamic("folderName")(folderName.asInstanceOf[js.Any])
    if (!js.isUndefined(isEnabled)) __obj.updateDynamic("isEnabled")(isEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FolderName]
  }
}

