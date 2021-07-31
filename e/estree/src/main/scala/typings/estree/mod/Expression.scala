package typings.estree.mod

import typings.estree.anon.Flags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.estree.mod.ThisExpression
  - typings.estree.mod.ArrayExpression
  - typings.estree.mod.ObjectExpression
  - typings.estree.mod.FunctionExpression
  - typings.estree.mod.ArrowFunctionExpression
  - typings.estree.mod.YieldExpression
  - typings.estree.mod.Literal
  - typings.estree.mod.UnaryExpression
  - typings.estree.mod.UpdateExpression
  - typings.estree.mod.BinaryExpression
  - typings.estree.mod.AssignmentExpression
  - typings.estree.mod.LogicalExpression
  - typings.estree.mod.MemberExpression
  - typings.estree.mod.ConditionalExpression
  - typings.estree.mod.CallExpression
  - typings.estree.mod.NewExpression
  - typings.estree.mod.SequenceExpression
  - typings.estree.mod.TemplateLiteral
  - typings.estree.mod.TaggedTemplateExpression
  - typings.estree.mod.ClassExpression
  - typings.estree.mod.MetaProperty
  - typings.estree.mod.Identifier
  - typings.estree.mod.AwaitExpression
  - typings.estree.mod.ImportExpression
  - typings.estree.mod.ChainExpression
*/
trait Expression
  extends StObject
     with Node
object Expression {
  
  @scala.inline
  def ArrayExpression(elements: js.Array[Expression | SpreadElement]): typings.estree.mod.ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[typings.estree.mod.ArrayExpression]
  }
  
  @scala.inline
  def ArrowFunctionExpression(body: BlockStatement | Expression, expression: Boolean, params: js.Array[Pattern]): typings.estree.mod.ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[typings.estree.mod.ArrowFunctionExpression]
  }
  
  @scala.inline
  def AssignmentExpression(left: Pattern | MemberExpression, operator: AssignmentOperator, right: Expression): typings.estree.mod.AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentExpression")
    __obj.asInstanceOf[typings.estree.mod.AssignmentExpression]
  }
  
  @scala.inline
  def AwaitExpression(argument: Expression): typings.estree.mod.AwaitExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[typings.estree.mod.AwaitExpression]
  }
  
  @scala.inline
  def BinaryExpression(left: Expression, operator: BinaryOperator, right: Expression): typings.estree.mod.BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[typings.estree.mod.BinaryExpression]
  }
  
  @scala.inline
  def ChainExpression(expression: ChainElement): typings.estree.mod.ChainExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ChainExpression")
    __obj.asInstanceOf[typings.estree.mod.ChainExpression]
  }
  
  @scala.inline
  def ClassExpression(body: ClassBody): typings.estree.mod.ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[typings.estree.mod.ClassExpression]
  }
  
  @scala.inline
  def ConditionalExpression(alternate: Expression, consequent: Expression, test: Expression): typings.estree.mod.ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[typings.estree.mod.ConditionalExpression]
  }
  
  @scala.inline
  def FunctionExpression(body: BlockStatement, params: js.Array[Pattern]): typings.estree.mod.FunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[typings.estree.mod.FunctionExpression]
  }
  
  @scala.inline
  def Identifier(name: String): typings.estree.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.estree.mod.Identifier]
  }
  
  @scala.inline
  def ImportExpression(source: Expression): typings.estree.mod.ImportExpression = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportExpression")
    __obj.asInstanceOf[typings.estree.mod.ImportExpression]
  }
  
  @scala.inline
  def LogicalExpression(left: Expression, operator: LogicalOperator, right: Expression): typings.estree.mod.LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LogicalExpression")
    __obj.asInstanceOf[typings.estree.mod.LogicalExpression]
  }
  
  @scala.inline
  def MemberExpression(computed: Boolean, `object`: Expression | Super, optional: Boolean, property: Expression): typings.estree.mod.MemberExpression = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typings.estree.mod.MemberExpression]
  }
  
  @scala.inline
  def MetaProperty(meta: Identifier, property: Identifier): typings.estree.mod.MetaProperty = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MetaProperty")
    __obj.asInstanceOf[typings.estree.mod.MetaProperty]
  }
  
  @scala.inline
  def NewExpression(arguments: js.Array[Expression | SpreadElement], callee: Expression | Super): typings.estree.mod.NewExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[typings.estree.mod.NewExpression]
  }
  
  @scala.inline
  def ObjectExpression(properties: js.Array[Property | SpreadElement]): typings.estree.mod.ObjectExpression = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectExpression")
    __obj.asInstanceOf[typings.estree.mod.ObjectExpression]
  }
  
  @scala.inline
  def RegExpLiteral(regex: Flags): typings.estree.mod.RegExpLiteral = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Literal")
    __obj.asInstanceOf[typings.estree.mod.RegExpLiteral]
  }
  
  @scala.inline
  def SequenceExpression(expressions: js.Array[Expression]): typings.estree.mod.SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SequenceExpression")
    __obj.asInstanceOf[typings.estree.mod.SequenceExpression]
  }
  
  @scala.inline
  def SimpleCallExpression(arguments: js.Array[Expression | SpreadElement], callee: Expression | Super, optional: Boolean): typings.estree.mod.SimpleCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[typings.estree.mod.SimpleCallExpression]
  }
  
  @scala.inline
  def SimpleLiteral(): typings.estree.mod.SimpleLiteral = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.updateDynamic("type")("Literal")
    __obj.asInstanceOf[typings.estree.mod.SimpleLiteral]
  }
  
  @scala.inline
  def TaggedTemplateExpression(quasi: TemplateLiteral, tag: Expression): typings.estree.mod.TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[typings.estree.mod.TaggedTemplateExpression]
  }
  
  @scala.inline
  def TemplateLiteral(expressions: js.Array[Expression], quasis: js.Array[TemplateElement]): typings.estree.mod.TemplateLiteral = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[typings.estree.mod.TemplateLiteral]
  }
  
  @scala.inline
  def ThisExpression(): typings.estree.mod.ThisExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[typings.estree.mod.ThisExpression]
  }
  
  @scala.inline
  def UnaryExpression(argument: Expression, operator: UnaryOperator): typings.estree.mod.UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = true)
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[typings.estree.mod.UnaryExpression]
  }
  
  @scala.inline
  def UpdateExpression(argument: Expression, operator: UpdateOperator, prefix: Boolean): typings.estree.mod.UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UpdateExpression")
    __obj.asInstanceOf[typings.estree.mod.UpdateExpression]
  }
  
  @scala.inline
  def YieldExpression(delegate: Boolean): typings.estree.mod.YieldExpression = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[typings.estree.mod.YieldExpression]
  }
}
