package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.dxTreeMapNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeValue extends StObject {
  
  var node: js.UndefOr[dxTreeMapNode] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
  
  var valueText: js.UndefOr[String] = js.undefined
}
object NodeValue {
  
  @scala.inline
  def apply(): NodeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeValue]
  }
  
  @scala.inline
  implicit class NodeValueMutableBuilder[Self <: NodeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: dxTreeMapNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueText(value: String): Self = StObject.set(x, "valueText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTextUndefined: Self = StObject.set(x, "valueText", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
