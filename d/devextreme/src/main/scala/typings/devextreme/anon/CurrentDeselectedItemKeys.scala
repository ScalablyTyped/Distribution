package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxFileManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentDeselectedItemKeys extends js.Object {
  
  var component: js.UndefOr[dxFileManager] = js.native
  
  var currentDeselectedItemKeys: js.UndefOr[js.Array[String]] = js.native
  
  var currentSelectedItemKeys: js.UndefOr[js.Array[String]] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var selectedItemKeys: js.UndefOr[js.Array[String]] = js.native
  
  var selectedItems: js.UndefOr[js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]] = js.native
}
object CurrentDeselectedItemKeys {
  
  @scala.inline
  def apply(): CurrentDeselectedItemKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentDeselectedItemKeys]
  }
  
  @scala.inline
  implicit class CurrentDeselectedItemKeysOps[Self <: CurrentDeselectedItemKeys] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: dxFileManager): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setCurrentDeselectedItemKeysVarargs(value: String*): Self = this.set("currentDeselectedItemKeys", js.Array(value :_*))
    
    @scala.inline
    def setCurrentDeselectedItemKeys(value: js.Array[String]): Self = this.set("currentDeselectedItemKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentDeselectedItemKeys: Self = this.set("currentDeselectedItemKeys", js.undefined)
    
    @scala.inline
    def setCurrentSelectedItemKeysVarargs(value: String*): Self = this.set("currentSelectedItemKeys", js.Array(value :_*))
    
    @scala.inline
    def setCurrentSelectedItemKeys(value: js.Array[String]): Self = this.set("currentSelectedItemKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentSelectedItemKeys: Self = this.set("currentSelectedItemKeys", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setSelectedItemKeysVarargs(value: String*): Self = this.set("selectedItemKeys", js.Array(value :_*))
    
    @scala.inline
    def setSelectedItemKeys(value: js.Array[String]): Self = this.set("selectedItemKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItemKeys: Self = this.set("selectedItemKeys", js.undefined)
    
    @scala.inline
    def setSelectedItemsVarargs(value: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem*): Self = this.set("selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setSelectedItems(value: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
  }
}
