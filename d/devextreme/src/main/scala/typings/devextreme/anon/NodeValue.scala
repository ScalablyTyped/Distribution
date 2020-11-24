package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.dxTreeMapNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeValue extends js.Object {
  
  var node: js.UndefOr[dxTreeMapNode] = js.native
  
  var value: js.UndefOr[Double] = js.native
  
  var valueText: js.UndefOr[String] = js.native
}
object NodeValue {
  
  @scala.inline
  def apply(): NodeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeValue]
  }
  
  @scala.inline
  implicit class NodeValueOps[Self <: NodeValue] (val x: Self) extends AnyVal {
    
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
    def setNode(value: dxTreeMapNode): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueText(value: String): Self = this.set("valueText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueText: Self = this.set("valueText", js.undefined)
  }
}
