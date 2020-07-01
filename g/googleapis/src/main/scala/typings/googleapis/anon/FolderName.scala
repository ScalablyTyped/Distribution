package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FolderName extends js.Object {
  var folderName: js.UndefOr[String] = js.native
  var isEnabled: js.UndefOr[Boolean] = js.native
}

object FolderName {
  @scala.inline
  def apply(folderName: String = null, isEnabled: js.UndefOr[Boolean] = js.undefined): FolderName = {
    val __obj = js.Dynamic.literal()
    if (folderName != null) __obj.updateDynamic("folderName")(folderName.asInstanceOf[js.Any])
    if (!js.isUndefined(isEnabled)) __obj.updateDynamic("isEnabled")(isEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderName]
  }
}

