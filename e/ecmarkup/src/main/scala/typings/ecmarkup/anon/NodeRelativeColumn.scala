package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.contents
import typings.ecmarkup.specMod.Warning
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeRelativeColumn
  extends StObject
     with Warning {
  
  var message: String
  
  var node: Text | typings.std.Element
  
  var nodeRelativeColumn: Double
  
  var nodeRelativeLine: Double
  
  var ruleId: String
  
  var `type`: contents
}
object NodeRelativeColumn {
  
  @scala.inline
  def apply(
    message: String,
    node: Text | typings.std.Element,
    nodeRelativeColumn: Double,
    nodeRelativeLine: Double,
    ruleId: String
  ): NodeRelativeColumn = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodeRelativeColumn = nodeRelativeColumn.asInstanceOf[js.Any], nodeRelativeLine = nodeRelativeLine.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("contents")
    __obj.asInstanceOf[NodeRelativeColumn]
  }
  
  @scala.inline
  implicit class NodeRelativeColumnMutableBuilder[Self <: NodeRelativeColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Text | typings.std.Element): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeRelativeColumn(value: Double): Self = StObject.set(x, "nodeRelativeColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeRelativeLine(value: Double): Self = StObject.set(x, "nodeRelativeLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: contents): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
