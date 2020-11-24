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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFileManagerToolbarItem extends dxToolbarItem {
  
  /**
    * [descr:dxFileManagerToolbarItem.icon]
    */
  var icon: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFileManagerToolbarItem.name]
    */
  var name: js.UndefOr[
    showNavPane | create | upload | refresh | switchView | download | move | copy | rename | delete | clearSelection | separator | String
  ] = js.native
}
object dxFileManagerToolbarItem {
  
  @scala.inline
  def apply(): dxFileManagerToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileManagerToolbarItem]
  }
  
  @scala.inline
  implicit class dxFileManagerToolbarItemOps[Self <: dxFileManagerToolbarItem] (val x: Self) extends AnyVal {
    
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
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setName(
      value: showNavPane | create | upload | refresh | switchView | download | move | copy | rename | delete | clearSelection | separator | String
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
