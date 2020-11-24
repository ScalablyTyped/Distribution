package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDiagramCustomCommand extends js.Object {
  
  /**
    * [descr:dxDiagramCustomCommand.icon]
    */
  var icon: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxDiagramCustomCommand.items]
    */
  var items: js.UndefOr[js.Array[dxDiagramCustomCommand]] = js.native
  
  /**
    * [descr:dxDiagramCustomCommand.name]
    */
  var name: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 51 */ js.Any
  ] = js.native
  
  /**
    * [descr:dxDiagramCustomCommand.text]
    */
  var text: js.UndefOr[String] = js.native
}
object dxDiagramCustomCommand {
  
  @scala.inline
  def apply(): dxDiagramCustomCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramCustomCommand]
  }
  
  @scala.inline
  implicit class dxDiagramCustomCommandOps[Self <: dxDiagramCustomCommand] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: dxDiagramCustomCommand*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[dxDiagramCustomCommand]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 51 */ js.Any): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
