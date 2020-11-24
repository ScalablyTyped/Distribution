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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFileManagerContextMenu extends js.Object {
  
  /**
    * [descr:dxFileManagerContextMenu.items]
    */
  var items: js.UndefOr[
    js.Array[
      dxFileManagerContextMenuItem | create | upload | refresh | download | move | copy | rename | delete
    ]
  ] = js.native
}
object dxFileManagerContextMenu {
  
  @scala.inline
  def apply(): dxFileManagerContextMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileManagerContextMenu]
  }
  
  @scala.inline
  implicit class dxFileManagerContextMenuOps[Self <: dxFileManagerContextMenu] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(
      value: (dxFileManagerContextMenuItem | create | upload | refresh | download | move | copy | rename | delete)*
    ): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(
      value: js.Array[
          dxFileManagerContextMenuItem | create | upload | refresh | download | move | copy | rename | delete
        ]
    ): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
