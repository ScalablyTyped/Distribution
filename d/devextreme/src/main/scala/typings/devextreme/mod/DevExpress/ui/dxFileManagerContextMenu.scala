package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.copy
import typings.devextreme.devextremeStrings.create
import typings.devextreme.devextremeStrings.delete
import typings.devextreme.devextremeStrings.download
import typings.devextreme.devextremeStrings.move
import typings.devextreme.devextremeStrings.refresh
import typings.devextreme.devextremeStrings.rename
import typings.devextreme.devextremeStrings.upload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFileManagerContextMenu extends js.Object {
  /** Configures context menu items' settings. */
  var items: js.UndefOr[
    js.Array[
      dxFileManagerContextMenuItem | create | upload | refresh | download | move | copy | rename | delete
    ]
  ] = js.undefined
}

object dxFileManagerContextMenu {
  @scala.inline
  def apply(
    items: js.Array[
      dxFileManagerContextMenuItem | create | upload | refresh | download | move | copy | rename | delete
    ] = null
  ): dxFileManagerContextMenu = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFileManagerContextMenu]
  }
}

