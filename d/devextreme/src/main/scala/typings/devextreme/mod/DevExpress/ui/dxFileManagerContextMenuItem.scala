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
trait dxFileManagerContextMenuItem extends dxContextMenuItem {
  
  /**
    * [descr:dxFileManagerContextMenuItem.items]
    */
  @JSName("items")
  var items_dxFileManagerContextMenuItem: js.UndefOr[js.Array[dxFileManagerContextMenuItem]] = js.native
  
  /**
    * [descr:dxFileManagerContextMenuItem.name]
    */
  var name: js.UndefOr[create | upload | refresh | download | move | copy | rename | delete | String] = js.native
}
object dxFileManagerContextMenuItem {
  
  @scala.inline
  def apply(): dxFileManagerContextMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileManagerContextMenuItem]
  }
  
  @scala.inline
  implicit class dxFileManagerContextMenuItemOps[Self <: dxFileManagerContextMenuItem] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: dxFileManagerContextMenuItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[dxFileManagerContextMenuItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setName(value: create | upload | refresh | download | move | copy | rename | delete | String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
