package typings.estreeJsx.mod

import typings.estree.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Node extends StObject
object _Node {
  
  @scala.inline
  def JSXAttribute(name: JSXIdentifier | JSXNamespacedName, `type`: typings.estreeJsx.estreeJsxStrings.JSXAttribute): typings.estreeJsx.mod.JSXAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXAttribute]
  }
  
  @scala.inline
  def JSXClosingElement(
    name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName,
    `type`: typings.estreeJsx.estreeJsxStrings.JSXClosingElement
  ): typings.estreeJsx.mod.JSXClosingElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXClosingElement]
  }
  
  @scala.inline
  def JSXClosingFragment(`type`: typings.estreeJsx.estreeJsxStrings.JSXClosingFragment): typings.estreeJsx.mod.JSXClosingFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXClosingFragment]
  }
  
  @scala.inline
  def JSXElement(
    children: js.Array[
      JSXText | JSXExpressionContainer | JSXSpreadChild | typings.estreeJsx.mod.JSXElement | JSXFragment
    ],
    openingElement: JSXOpeningElement,
    `type`: typings.estreeJsx.estreeJsxStrings.JSXElement
  ): typings.estreeJsx.mod.JSXElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXElement]
  }
  
  @scala.inline
  def JSXEmptyExpression(`type`: typings.estreeJsx.estreeJsxStrings.JSXEmptyExpression): typings.estreeJsx.mod.JSXEmptyExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXEmptyExpression]
  }
  
  @scala.inline
  def JSXExpressionContainer(
    expression: Expression | JSXEmptyExpression,
    `type`: typings.estreeJsx.estreeJsxStrings.JSXExpressionContainer
  ): typings.estreeJsx.mod.JSXExpressionContainer = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXExpressionContainer]
  }
  
  @scala.inline
  def JSXFragment(
    children: js.Array[
      JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | typings.estreeJsx.mod.JSXFragment
    ],
    closingFragment: JSXClosingFragment,
    openingFragment: JSXOpeningFragment,
    `type`: typings.estreeJsx.estreeJsxStrings.JSXFragment
  ): typings.estreeJsx.mod.JSXFragment = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXFragment]
  }
  
  @scala.inline
  def JSXIdentifier(name: String, `type`: typings.estreeJsx.estreeJsxStrings.JSXIdentifier): typings.estreeJsx.mod.JSXIdentifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXIdentifier]
  }
  
  @scala.inline
  def JSXMemberExpression(`type`: typings.estreeJsx.estreeJsxStrings.JSXMemberExpression): typings.estreeJsx.mod.JSXMemberExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXMemberExpression]
  }
  
  @scala.inline
  def JSXNamespacedName(`type`: typings.estreeJsx.estreeJsxStrings.JSXNamespacedName): typings.estreeJsx.mod.JSXNamespacedName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXNamespacedName]
  }
  
  @scala.inline
  def JSXOpeningElement(
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName,
    selfClosing: Boolean,
    `type`: typings.estreeJsx.estreeJsxStrings.JSXOpeningElement
  ): typings.estreeJsx.mod.JSXOpeningElement = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXOpeningElement]
  }
  
  @scala.inline
  def JSXOpeningFragment(`type`: typings.estreeJsx.estreeJsxStrings.JSXOpeningFragment): typings.estreeJsx.mod.JSXOpeningFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXOpeningFragment]
  }
  
  @scala.inline
  def JSXSpreadAttribute(argument: Expression, `type`: typings.estreeJsx.estreeJsxStrings.JSXSpreadAttribute): typings.estreeJsx.mod.JSXSpreadAttribute = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXSpreadAttribute]
  }
  
  @scala.inline
  def JSXText(raw: String, `type`: typings.estreeJsx.estreeJsxStrings.JSXText, value: String): typings.estreeJsx.mod.JSXText = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXText]
  }
}
