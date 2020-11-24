package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.contents
import typings.ecmarkup.specMod.Warning
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeRelativeColumn extends Warning {
  
  var message: String = js.native
  
  var node: Text | typings.std.Element = js.native
  
  var nodeRelativeColumn: Double = js.native
  
  var nodeRelativeLine: Double = js.native
  
  var ruleId: String = js.native
  
  var `type`: contents = js.native
}
object NodeRelativeColumn {
  
  @scala.inline
  def apply(
    message: String,
    node: Text | typings.std.Element,
    nodeRelativeColumn: Double,
    nodeRelativeLine: Double,
    ruleId: String,
    `type`: contents
  ): NodeRelativeColumn = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodeRelativeColumn = nodeRelativeColumn.asInstanceOf[js.Any], nodeRelativeLine = nodeRelativeLine.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeRelativeColumn]
  }
  
  @scala.inline
  implicit class NodeRelativeColumnOps[Self <: NodeRelativeColumn] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Text | typings.std.Element): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeRelativeColumn(value: Double): Self = this.set("nodeRelativeColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeRelativeLine(value: Double): Self = this.set("nodeRelativeLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleId(value: String): Self = this.set("ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: contents): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
