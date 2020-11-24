package typings.estreeJsx.mod

import typings.estree.mod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Node extends js.Object
object _Node {
  
  @scala.inline
  def JSXIdentifier(name: String, `type`: typings.estreeJsx.estreeJsxStrings.JSXIdentifier): _Node = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Node]
  }
  
  @scala.inline
  def JSXAttribute(name: JSXIdentifier | JSXNamespacedName, `type`: typings.estreeJsx.estreeJsxStrings.JSXAttribute): _Node = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Node]
  }
  
  @scala.inline
  def JSXClosingElement(
    name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName,
    `type`: typings.estreeJsx.estreeJsxStrings.JSXClosingElement
  ): _Node = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Node]
  }
  
  @scala.inline
  def JSXText(raw: String, `type`: typings.estreeJsx.estreeJsxStrings.JSXText, value: String): _Node = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Node]
  }
  
  @scala.inline
  def JSXMemberExpression(`type`: typings.estreeJsx.estreeJsxStrings.JSXMemberExpression): _Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Node]
  }
  
  @scala.inline
  def JSXOpeningElement(
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName,
    selfClosing: Boolean,
    `type`: typings.estreeJsx.estreeJsxStrings.JSXOpeningElement
  ): _Node = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Node]
  }
  
  @scala.inline
  def JSXOpeningFragment(`type`: typings.estreeJsx.estreeJsxStrings.JSXOpeningFragment): _Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Node]
  }
  
  @scala.inline
  def JSXSpreadAttribute(argument: Expression, `type`: typings.estreeJsx.estreeJsxStrings.JSXSpreadAttribute): _Node = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Node]
  }
  
  @scala.inline
  def JSXNamespacedName(`type`: typings.estreeJsx.estreeJsxStrings.JSXNamespacedName): _Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Node]
  }
  
  @scala.inline
  def JSXElement(
    children: js.Array[
      JSXText | JSXExpressionContainer | JSXSpreadChild | typings.estreeJsx.mod.JSXElement | JSXFragment
    ],
    openingElement: JSXOpeningElement,
    `type`: typings.estreeJsx.estreeJsxStrings.JSXElement
  ): _Node = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Node]
  }
  
  @scala.inline
  def JSXEmptyExpression(`type`: typings.estreeJsx.estreeJsxStrings.JSXEmptyExpression): _Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Node]
  }
  
  @scala.inline
  def JSXClosingFragment(`type`: typings.estreeJsx.estreeJsxStrings.JSXClosingFragment): _Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Node]
  }
  
  @scala.inline
  def JSXExpressionContainer(
    expression: Expression | JSXEmptyExpression,
    `type`: typings.estreeJsx.estreeJsxStrings.JSXExpressionContainer
  ): _Node = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Node]
  }
  
  @scala.inline
  def JSXFragment(
    children: js.Array[
      JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | typings.estreeJsx.mod.JSXFragment
    ],
    closingFragment: JSXClosingFragment,
    openingFragment: JSXOpeningFragment,
    `type`: typings.estreeJsx.estreeJsxStrings.JSXFragment
  ): _Node = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Node]
  }
}
