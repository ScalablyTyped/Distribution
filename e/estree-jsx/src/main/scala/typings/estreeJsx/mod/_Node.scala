package typings.estreeJsx.mod

import typings.estree.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Node extends StObject
object _Node {
  
  inline def JSXAttribute(name: JSXIdentifier | JSXNamespacedName): typings.estreeJsx.mod.JSXAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = null)
    __obj.updateDynamic("type")("JSXAttribute")
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXAttribute]
  }
  
  inline def JSXClosingElement(name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName): typings.estreeJsx.mod.JSXClosingElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXClosingElement")
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXClosingElement]
  }
  
  inline def JSXClosingFragment(): typings.estreeJsx.mod.JSXClosingFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXClosingFragment")
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXClosingFragment]
  }
  
  inline def JSXElement(
    children: js.Array[
      JSXText | JSXExpressionContainer | JSXSpreadChild | typings.estreeJsx.mod.JSXElement | JSXFragment
    ],
    openingElement: JSXOpeningElement
  ): typings.estreeJsx.mod.JSXElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], closingElement = null)
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXElement]
  }
  
  inline def JSXEmptyExpression(): typings.estreeJsx.mod.JSXEmptyExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXEmptyExpression")
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXEmptyExpression]
  }
  
  inline def JSXExpressionContainer(expression: Expression | JSXEmptyExpression): typings.estreeJsx.mod.JSXExpressionContainer = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXExpressionContainer")
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXExpressionContainer]
  }
  
  inline def JSXFragment(
    children: js.Array[
      JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | typings.estreeJsx.mod.JSXFragment
    ],
    closingFragment: JSXClosingFragment,
    openingFragment: JSXOpeningFragment
  ): typings.estreeJsx.mod.JSXFragment = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXFragment]
  }
  
  inline def JSXIdentifier(name: String): typings.estreeJsx.mod.JSXIdentifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXIdentifier")
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXIdentifier]
  }
  
  inline def JSXMemberExpression(): typings.estreeJsx.mod.JSXMemberExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXMemberExpression]
  }
  
  inline def JSXNamespacedName(): typings.estreeJsx.mod.JSXNamespacedName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXNamespacedName]
  }
  
  inline def JSXOpeningElement(
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName,
    selfClosing: Boolean
  ): typings.estreeJsx.mod.JSXOpeningElement = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXOpeningElement")
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXOpeningElement]
  }
  
  inline def JSXOpeningFragment(): typings.estreeJsx.mod.JSXOpeningFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXOpeningFragment")
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXOpeningFragment]
  }
  
  inline def JSXSpreadAttribute(argument: Expression): typings.estreeJsx.mod.JSXSpreadAttribute = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXSpreadAttribute")
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXSpreadAttribute]
  }
  
  inline def JSXText(raw: String, value: String): typings.estreeJsx.mod.JSXText = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typings.estreeJsx.mod.JSXText]
  }
}
