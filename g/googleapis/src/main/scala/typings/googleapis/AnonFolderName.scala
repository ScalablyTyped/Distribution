package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFolderName extends js.Object {
  var folderName: js.UndefOr[String] = js.native
  var isEnabled: js.UndefOr[Boolean] = js.native
}

object AnonFolderName {
  @scala.inline
  def apply(folderName: String = null, isEnabled: js.UndefOr[Boolean] = js.undefined): AnonFolderName = {
    val __obj = js.Dynamic.literal()
    if (folderName != null) __obj.updateDynamic("folderName")(folderName.asInstanceOf[js.Any])
    if (!js.isUndefined(isEnabled)) __obj.updateDynamic("isEnabled")(isEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFolderName]
  }
}

