package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.clear
import typings.devextreme.devextremeStrings.copy
import typings.devextreme.devextremeStrings.create
import typings.devextreme.devextremeStrings.delete
import typings.devextreme.devextremeStrings.download
import typings.devextreme.devextremeStrings.move
import typings.devextreme.devextremeStrings.refresh
import typings.devextreme.devextremeStrings.rename
import typings.devextreme.devextremeStrings.separator
import typings.devextreme.devextremeStrings.showNavPane
import typings.devextreme.devextremeStrings.upload
import typings.devextreme.devextremeStrings.viewSwitcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFileManagerToolbar extends js.Object {
  /** Configures settings of the toolbar items that are visible when users select files. */
  var fileSelectionItems: js.UndefOr[
    js.Array[
      dxFileManagerToolbarItem | showNavPane | create | upload | refresh | viewSwitcher | download | move | copy | rename | delete | clear | separator
    ]
  ] = js.undefined
  /** Configures toolbar items' settings. */
  var items: js.UndefOr[
    js.Array[
      dxFileManagerToolbarItem | showNavPane | create | upload | refresh | viewSwitcher | download | move | copy | rename | delete | clear | separator
    ]
  ] = js.undefined
}

object dxFileManagerToolbar {
  @scala.inline
  def apply(
    fileSelectionItems: js.Array[
      dxFileManagerToolbarItem | showNavPane | create | upload | refresh | viewSwitcher | download | move | copy | rename | delete | clear | separator
    ] = null,
    items: js.Array[
      dxFileManagerToolbarItem | showNavPane | create | upload | refresh | viewSwitcher | download | move | copy | rename | delete | clear | separator
    ] = null
  ): dxFileManagerToolbar = {
    val __obj = js.Dynamic.literal()
    if (fileSelectionItems != null) __obj.updateDynamic("fileSelectionItems")(fileSelectionItems.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFileManagerToolbar]
  }
}

