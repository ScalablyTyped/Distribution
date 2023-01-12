package typings.estreeJsx

import typings.estree.mod.BaseExpression
import typings.estree.mod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.estreeJsx.mod.JSXSimpleAttribute
    - typings.estreeJsx.mod.JSXSpreadAttribute
  */
  trait JSXAttribute extends StObject
  object JSXAttribute {
    
    inline def JSXSimpleAttribute(name: JSXIdentifier): typings.estreeJsx.mod.JSXSimpleAttribute = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = null)
      __obj.updateDynamic("type")("JSXAttribute")
      __obj.asInstanceOf[typings.estreeJsx.mod.JSXSimpleAttribute]
    }
    
    inline def JSXSpreadAttribute(argument: BaseExpression): typings.estreeJsx.mod.JSXSpreadAttribute = {
      val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXSpreadAttribute")
      __obj.asInstanceOf[typings.estreeJsx.mod.JSXSpreadAttribute]
    }
  }
  
  trait JSXBaseAttribute
    extends StObject
       with BaseNode {
    
    @JSName("type")
    val type_JSXBaseAttribute: typings.estreeJsx.estreeJsxStrings.JSXAttribute | typings.estreeJsx.estreeJsxStrings.JSXSpreadAttribute
  }
  object JSXBaseAttribute {
    
    inline def apply(
      `type`: typings.estreeJsx.estreeJsxStrings.JSXAttribute | typings.estreeJsx.estreeJsxStrings.JSXSpreadAttribute
    ): JSXBaseAttribute = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSXBaseAttribute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSXBaseAttribute] (val x: Self) extends AnyVal {
      
      inline def setType(
        value: typings.estreeJsx.estreeJsxStrings.JSXAttribute | typings.estreeJsx.estreeJsxStrings.JSXSpreadAttribute
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSXClosingElement
    extends StObject
       with BaseNode {
    
    val name: JSXIdentifier
    
    @JSName("type")
    val type_JSXClosingElement: typings.estreeJsx.estreeJsxStrings.JSXClosingElement
  }
  object JSXClosingElement {
    
    inline def apply(name: JSXIdentifier): JSXClosingElement = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXClosingElement")
      __obj.asInstanceOf[JSXClosingElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSXClosingElement] (val x: Self) extends AnyVal {
      
      inline def setName(value: JSXIdentifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: typings.estreeJsx.estreeJsxStrings.JSXClosingElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSXElement
    extends StObject
       with BaseNode {
    
    val children: js.Array[BaseExpression]
    
    val closingElement: JSXClosingElement | Null
    
    val openingElement: JSXOpeningElement
    
    @JSName("type")
    val type_JSXElement: typings.estreeJsx.estreeJsxStrings.JSXElement
  }
  object JSXElement {
    
    inline def apply(children: js.Array[BaseExpression], openingElement: JSXOpeningElement): JSXElement = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], closingElement = null)
      __obj.updateDynamic("type")("JSXElement")
      __obj.asInstanceOf[JSXElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSXElement] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[BaseExpression]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: BaseExpression*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setClosingElement(value: JSXClosingElement): Self = StObject.set(x, "closingElement", value.asInstanceOf[js.Any])
      
      inline def setClosingElementNull: Self = StObject.set(x, "closingElement", null)
      
      inline def setOpeningElement(value: JSXOpeningElement): Self = StObject.set(x, "openingElement", value.asInstanceOf[js.Any])
      
      inline def setType(value: typings.estreeJsx.estreeJsxStrings.JSXElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSXExpressionContainer
    extends StObject
       with BaseNode {
    
    val expression: BaseExpression
    
    @JSName("type")
    val type_JSXExpressionContainer: typings.estreeJsx.estreeJsxStrings.JSXExpressionContainer
  }
  object JSXExpressionContainer {
    
    inline def apply(expression: BaseExpression): JSXExpressionContainer = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXExpressionContainer")
      __obj.asInstanceOf[JSXExpressionContainer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSXExpressionContainer] (val x: Self) extends AnyVal {
      
      inline def setExpression(value: BaseExpression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setType(value: typings.estreeJsx.estreeJsxStrings.JSXExpressionContainer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSXFragment
    extends StObject
       with BaseNode {
    
    val children: js.Array[BaseExpression]
    
    @JSName("type")
    val type_JSXFragment: typings.estreeJsx.estreeJsxStrings.JSXFragment
  }
  object JSXFragment {
    
    inline def apply(children: js.Array[BaseExpression]): JSXFragment = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXFragment")
      __obj.asInstanceOf[JSXFragment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSXFragment] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[BaseExpression]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: BaseExpression*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setType(value: typings.estreeJsx.estreeJsxStrings.JSXFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSXIdentifier
    extends StObject
       with BaseNode {
    
    val name: String
    
    @JSName("type")
    val type_JSXIdentifier: typings.estreeJsx.estreeJsxStrings.JSXIdentifier
  }
  object JSXIdentifier {
    
    inline def apply(name: String): JSXIdentifier = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXIdentifier")
      __obj.asInstanceOf[JSXIdentifier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSXIdentifier] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: typings.estreeJsx.estreeJsxStrings.JSXIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSXOpeningElement
    extends StObject
       with BaseNode {
    
    val attributes: js.Array[JSXAttribute]
    
    val name: JSXIdentifier
    
    val selfClosing: Boolean
    
    @JSName("type")
    val type_JSXOpeningElement: typings.estreeJsx.estreeJsxStrings.JSXOpeningElement
  }
  object JSXOpeningElement {
    
    inline def apply(attributes: js.Array[JSXAttribute], name: JSXIdentifier, selfClosing: Boolean): JSXOpeningElement = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXOpeningElement")
      __obj.asInstanceOf[JSXOpeningElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSXOpeningElement] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: js.Array[JSXAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: JSXAttribute*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setName(value: JSXIdentifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
      
      inline def setType(value: typings.estreeJsx.estreeJsxStrings.JSXOpeningElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSXSimpleAttribute
    extends StObject
       with JSXBaseAttribute
       with JSXAttribute {
    
    val name: JSXIdentifier
    
    @JSName("type")
    val type_JSXSimpleAttribute: typings.estreeJsx.estreeJsxStrings.JSXAttribute
    
    val value: BaseExpression | Null
  }
  object JSXSimpleAttribute {
    
    inline def apply(name: JSXIdentifier): JSXSimpleAttribute = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = null)
      __obj.updateDynamic("type")("JSXAttribute")
      __obj.asInstanceOf[JSXSimpleAttribute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSXSimpleAttribute] (val x: Self) extends AnyVal {
      
      inline def setName(value: JSXIdentifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: typings.estreeJsx.estreeJsxStrings.JSXAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: BaseExpression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  trait JSXSpreadAttribute
    extends StObject
       with JSXBaseAttribute
       with JSXAttribute {
    
    val argument: BaseExpression
    
    @JSName("type")
    val type_JSXSpreadAttribute: typings.estreeJsx.estreeJsxStrings.JSXSpreadAttribute
  }
  object JSXSpreadAttribute {
    
    inline def apply(argument: BaseExpression): JSXSpreadAttribute = {
      val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXSpreadAttribute")
      __obj.asInstanceOf[JSXSpreadAttribute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSXSpreadAttribute] (val x: Self) extends AnyVal {
      
      inline def setArgument(value: BaseExpression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
      
      inline def setType(value: typings.estreeJsx.estreeJsxStrings.JSXSpreadAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSXText
    extends StObject
       with BaseNode {
    
    @JSName("type")
    val type_JSXText: typings.estreeJsx.estreeJsxStrings.JSXText
    
    val value: String
  }
  object JSXText {
    
    inline def apply(value: String): JSXText = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JSXText")
      __obj.asInstanceOf[JSXText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSXText] (val x: Self) extends AnyVal {
      
      inline def setType(value: typings.estreeJsx.estreeJsxStrings.JSXText): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
