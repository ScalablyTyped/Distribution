package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.clearSelection
import typings.devextreme.devextremeStrings.copy
import typings.devextreme.devextremeStrings.create
import typings.devextreme.devextremeStrings.delete
import typings.devextreme.devextremeStrings.download
import typings.devextreme.devextremeStrings.move
import typings.devextreme.devextremeStrings.refresh
import typings.devextreme.devextremeStrings.rename
import typings.devextreme.devextremeStrings.separator
import typings.devextreme.devextremeStrings.showNavPane
import typings.devextreme.devextremeStrings.switchView
import typings.devextreme.devextremeStrings.upload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFileManagerToolbar extends js.Object {
  /** @name dxFileManagerToolbar.fileSelectionItems */
  var fileSelectionItems: js.UndefOr[
    js.Array[
      dxFileManagerToolbarItem | showNavPane | create | upload | refresh | switchView | download | move | copy | rename | delete | clearSelection | separator
    ]
  ] = js.native
  /** @name dxFileManagerToolbar.items */
  var items: js.UndefOr[
    js.Array[
      dxFileManagerToolbarItem | showNavPane | create | upload | refresh | switchView | download | move | copy | rename | delete | clearSelection | separator
    ]
  ] = js.native
}

object dxFileManagerToolbar {
  @scala.inline
  def apply(): dxFileManagerToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileManagerToolbar]
  }
  @scala.inline
  implicit class dxFileManagerToolbarOps[Self <: dxFileManagerToolbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFileSelectionItemsVarargs(
      value: (dxFileManagerToolbarItem | showNavPane | create | upload | refresh | switchView | download | move | copy | rename | delete | clearSelection | separator)*
    ): Self = this.set("fileSelectionItems", js.Array(value :_*))
    @scala.inline
    def setFileSelectionItems(
      value: js.Array[
          dxFileManagerToolbarItem | showNavPane | create | upload | refresh | switchView | download | move | copy | rename | delete | clearSelection | separator
        ]
    ): Self = this.set("fileSelectionItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSelectionItems: Self = this.set("fileSelectionItems", js.undefined)
    @scala.inline
    def setItemsVarargs(
      value: (dxFileManagerToolbarItem | showNavPane | create | upload | refresh | switchView | download | move | copy | rename | delete | clearSelection | separator)*
    ): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(
      value: js.Array[
          dxFileManagerToolbarItem | showNavPane | create | upload | refresh | switchView | download | move | copy | rename | delete | clearSelection | separator
        ]
    ): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

