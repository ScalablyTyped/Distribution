package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxTreeList
import typings.devextreme.mod.DevExpress.ui.dxTreeListRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentType extends js.Object {
  
  var component: js.UndefOr[dxTreeList] = js.native
  
  var dataField: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var editorElement: js.UndefOr[dxElement] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var parentType: js.UndefOr[String] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var row: js.UndefOr[dxTreeListRowObject] = js.native
  
  var rtlEnabled: js.UndefOr[Boolean] = js.native
  
  var setValue: js.UndefOr[js.Any] = js.native
  
  var updateValueTimeout: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ParentType {
  
  @scala.inline
  def apply(): ParentType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentType]
  }
  
  @scala.inline
  implicit class ParentTypeOps[Self <: ParentType] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: dxTreeList): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setDataField(value: String): Self = this.set("dataField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataField: Self = this.set("dataField", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEditorElement(value: dxElement): Self = this.set("editorElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorElement: Self = this.set("editorElement", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setParentType(value: String): Self = this.set("parentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentType: Self = this.set("parentType", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setRow(value: dxTreeListRowObject): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    
    @scala.inline
    def setRtlEnabled(value: Boolean): Self = this.set("rtlEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtlEnabled: Self = this.set("rtlEnabled", js.undefined)
    
    @scala.inline
    def setSetValue(value: js.Any): Self = this.set("setValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    
    @scala.inline
    def setUpdateValueTimeout(value: Double): Self = this.set("updateValueTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateValueTimeout: Self = this.set("updateValueTimeout", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
