package typings.ecmarkup.specMod

import typings.ecmarkup.ecmarkupStrings.attr
import typings.ecmarkup.ecmarkupStrings.contents
import typings.ecmarkup.ecmarkupStrings.global
import typings.ecmarkup.ecmarkupStrings.node
import typings.ecmarkup.ecmarkupStrings.raw
import typings.std.Element
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ecmarkup.anon.Message
  - typings.ecmarkup.anon.Node
  - typings.ecmarkup.anon.Attr
  - typings.ecmarkup.anon.NodeRelativeColumn
  - typings.ecmarkup.anon.Column
*/
trait Warning extends js.Object
object Warning {
  
  @scala.inline
  def Message(message: String, ruleId: String, `type`: global): Warning = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning]
  }
  
  @scala.inline
  def Column(column: Double, line: Double, message: String, ruleId: String, `type`: raw): Warning = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning]
  }
  
  @scala.inline
  def Node(message: String, node: Text | Element, ruleId: String, `type`: node): Warning = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning]
  }
  
  @scala.inline
  def Attr(attr: String, message: String, node: Element, ruleId: String, `type`: attr): Warning = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning]
  }
  
  @scala.inline
  def NodeRelativeColumn(
    message: String,
    node: Text | Element,
    nodeRelativeColumn: Double,
    nodeRelativeLine: Double,
    ruleId: String,
    `type`: contents
  ): Warning = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodeRelativeColumn = nodeRelativeColumn.asInstanceOf[js.Any], nodeRelativeLine = nodeRelativeLine.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning]
  }
}
