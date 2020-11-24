package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxTagBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiTagElement extends js.Object {
  
  var cancel: js.UndefOr[Boolean] = js.native
  
  var component: js.UndefOr[dxTagBox] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var multiTagElement: js.UndefOr[dxElement] = js.native
  
  var selectedItems: js.UndefOr[js.Array[String | Double | _]] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object MultiTagElement {
  
  @scala.inline
  def apply(): MultiTagElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiTagElement]
  }
  
  @scala.inline
  implicit class MultiTagElementOps[Self <: MultiTagElement] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setComponent(value: dxTagBox): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setMultiTagElement(value: dxElement): Self = this.set("multiTagElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiTagElement: Self = this.set("multiTagElement", js.undefined)
    
    @scala.inline
    def setSelectedItemsVarargs(value: (String | Double | js.Any)*): Self = this.set("selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setSelectedItems(value: js.Array[String | Double | _]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
