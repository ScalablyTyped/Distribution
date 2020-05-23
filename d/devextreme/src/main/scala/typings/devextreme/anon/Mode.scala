package typings.devextreme.anon

import typings.devextreme.devextremeStrings.details
import typings.devextreme.devextremeStrings.thumbnails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mode extends js.Object {
  var mode: js.UndefOr[details | thumbnails] = js.undefined
  var showFolders: js.UndefOr[Boolean] = js.undefined
  var showParentFolder: js.UndefOr[Boolean] = js.undefined
}

object Mode {
  @scala.inline
  def apply(
    mode: details | thumbnails = null,
    showFolders: js.UndefOr[Boolean] = js.undefined,
    showParentFolder: js.UndefOr[Boolean] = js.undefined
  ): Mode = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(showFolders)) __obj.updateDynamic("showFolders")(showFolders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showParentFolder)) __obj.updateDynamic("showParentFolder")(showParentFolder.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
}

