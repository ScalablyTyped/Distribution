package typings.estree.mod

import typings.estree.anon.Flags
import typings.estree.estreeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Expression extends Node

object Expression {
  @scala.inline
  def AssignmentExpression(
    left: Pattern | MemberExpression,
    operator: AssignmentOperator,
    right: Expression,
    `type`: typings.estree.estreeStrings.AssignmentExpression
  ): Expression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def TaggedTemplateExpression(
    quasi: TemplateLiteral,
    tag: Expression,
    `type`: typings.estree.estreeStrings.TaggedTemplateExpression
  ): Expression = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def SimpleLiteral(`type`: typings.estree.estreeStrings.Literal): Expression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def ArrowFunctionExpression(
    body: BlockStatement | Expression,
    expression: Boolean,
    params: js.Array[Pattern],
    `type`: typings.estree.estreeStrings.ArrowFunctionExpression
  ): Expression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def ConditionalExpression(
    alternate: Expression,
    consequent: Expression,
    test: Expression,
    `type`: typings.estree.estreeStrings.ConditionalExpression
  ): Expression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def ChainExpression(expression: ChainElement, `type`: typings.estree.estreeStrings.ChainExpression): Expression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def RegExpLiteral(regex: Flags, `type`: typings.estree.estreeStrings.Literal): Expression = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def Identifier(name: String, `type`: typings.estree.estreeStrings.Identifier): Expression = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def MetaProperty(meta: Identifier, property: Identifier, `type`: typings.estree.estreeStrings.MetaProperty): Expression = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def FunctionExpression(
    body: BlockStatement,
    params: js.Array[Pattern],
    `type`: typings.estree.estreeStrings.FunctionExpression
  ): Expression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def ObjectExpression(
    properties: js.Array[Property | SpreadElement],
    `type`: typings.estree.estreeStrings.ObjectExpression
  ): Expression = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def ArrayExpression(
    elements: js.Array[Expression | SpreadElement],
    `type`: typings.estree.estreeStrings.ArrayExpression
  ): Expression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def UpdateExpression(
    argument: Expression,
    operator: UpdateOperator,
    prefix: Boolean,
    `type`: typings.estree.estreeStrings.UpdateExpression
  ): Expression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def NewExpression(
    arguments: js.Array[Expression | SpreadElement],
    callee: Expression | Super,
    `type`: typings.estree.estreeStrings.NewExpression
  ): Expression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def YieldExpression(delegate: Boolean, `type`: typings.estree.estreeStrings.YieldExpression): Expression = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def BinaryExpression(
    left: Expression,
    operator: BinaryOperator,
    right: Expression,
    `type`: typings.estree.estreeStrings.BinaryExpression
  ): Expression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def TemplateLiteral(
    expressions: js.Array[Expression],
    quasis: js.Array[TemplateElement],
    `type`: typings.estree.estreeStrings.TemplateLiteral
  ): Expression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def SimpleCallExpression(
    arguments: js.Array[Expression | SpreadElement],
    callee: Expression | Super,
    optional: Boolean,
    `type`: typings.estree.estreeStrings.CallExpression
  ): Expression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def ClassExpression(body: ClassBody, `type`: typings.estree.estreeStrings.ClassExpression): Expression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def MemberExpression(
    computed: Boolean,
    `object`: Expression | Super,
    optional: Boolean,
    property: Expression,
    `type`: typings.estree.estreeStrings.MemberExpression
  ): Expression = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def SequenceExpression(expressions: js.Array[Expression], `type`: typings.estree.estreeStrings.SequenceExpression): Expression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def ImportExpression(source: Expression, `type`: typings.estree.estreeStrings.ImportExpression): Expression = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def UnaryExpression(
    argument: Expression,
    operator: UnaryOperator,
    prefix: `true`,
    `type`: typings.estree.estreeStrings.UnaryExpression
  ): Expression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def AwaitExpression(argument: Expression, `type`: typings.estree.estreeStrings.AwaitExpression): Expression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def LogicalExpression(
    left: Expression,
    operator: LogicalOperator,
    right: Expression,
    `type`: typings.estree.estreeStrings.LogicalExpression
  ): Expression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def ThisExpression(`type`: typings.estree.estreeStrings.ThisExpression): Expression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
}

