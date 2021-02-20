package typings.estree.mod

import typings.estree.anon.Cooked
import typings.estree.anon.Flags
import typings.estree.estreeBooleans.`true`
import typings.estree.estreeStrings.`var`
import typings.estree.estreeStrings.const
import typings.estree.estreeStrings.constructor
import typings.estree.estreeStrings.get
import typings.estree.estreeStrings.init
import typings.estree.estreeStrings.let
import typings.estree.estreeStrings.method
import typings.estree.estreeStrings.module
import typings.estree.estreeStrings.script
import typings.estree.estreeStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.estree.mod.Identifier
  - typings.estree.mod.Literal
  - typings.estree.mod.Program
  - typings.estree.mod.Function
  - typings.estree.mod.SwitchCase
  - typings.estree.mod.CatchClause
  - typings.estree.mod.VariableDeclarator
  - typings.estree.mod.Statement
  - typings.estree.mod.Expression
  - typings.estree.mod.Property
  - typings.estree.mod.AssignmentProperty
  - typings.estree.mod.Super
  - typings.estree.mod.TemplateElement
  - typings.estree.mod.SpreadElement
  - typings.estree.mod.Pattern
  - typings.estree.mod.ClassBody
  - typings.estree.mod.Class
  - typings.estree.mod.MethodDefinition
  - typings.estree.mod.ModuleDeclaration
  - typings.estree.mod.ModuleSpecifier
*/
trait Node extends StObject
object Node {
  
  @scala.inline
  def ArrayExpression(
    elements: js.Array[Expression | SpreadElement],
    `type`: typings.estree.estreeStrings.ArrayExpression
  ): typings.estree.mod.ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ArrayExpression]
  }
  
  @scala.inline
  def ArrayPattern(elements: js.Array[Pattern], `type`: typings.estree.estreeStrings.ArrayPattern): typings.estree.mod.ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ArrayPattern]
  }
  
  @scala.inline
  def ArrowFunctionExpression(
    body: BlockStatement | Expression,
    expression: Boolean,
    params: js.Array[Pattern],
    `type`: typings.estree.estreeStrings.ArrowFunctionExpression
  ): typings.estree.mod.ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ArrowFunctionExpression]
  }
  
  @scala.inline
  def AssignmentExpression(
    left: Pattern | MemberExpression,
    operator: AssignmentOperator,
    right: Expression,
    `type`: typings.estree.estreeStrings.AssignmentExpression
  ): typings.estree.mod.AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.AssignmentExpression]
  }
  
  @scala.inline
  def AssignmentPattern(left: Pattern, right: Expression, `type`: typings.estree.estreeStrings.AssignmentPattern): typings.estree.mod.AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.AssignmentPattern]
  }
  
  @scala.inline
  def AssignmentProperty(
    computed: Boolean,
    key: Expression,
    kind: init,
    method: Boolean,
    shorthand: Boolean,
    `type`: typings.estree.estreeStrings.Property,
    value: Pattern
  ): typings.estree.mod.AssignmentProperty = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.AssignmentProperty]
  }
  
  @scala.inline
  def AwaitExpression(argument: Expression, `type`: typings.estree.estreeStrings.AwaitExpression): typings.estree.mod.AwaitExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.AwaitExpression]
  }
  
  @scala.inline
  def BinaryExpression(
    left: Expression,
    operator: BinaryOperator,
    right: Expression,
    `type`: typings.estree.estreeStrings.BinaryExpression
  ): typings.estree.mod.BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.BinaryExpression]
  }
  
  @scala.inline
  def BlockStatement(body: js.Array[Statement], `type`: typings.estree.estreeStrings.BlockStatement): typings.estree.mod.BlockStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.BlockStatement]
  }
  
  @scala.inline
  def BreakStatement(`type`: typings.estree.estreeStrings.BreakStatement): typings.estree.mod.BreakStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.BreakStatement]
  }
  
  @scala.inline
  def CatchClause(body: BlockStatement, `type`: typings.estree.estreeStrings.CatchClause): typings.estree.mod.CatchClause = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.CatchClause]
  }
  
  @scala.inline
  def ChainExpression(expression: ChainElement, `type`: typings.estree.estreeStrings.ChainExpression): typings.estree.mod.ChainExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ChainExpression]
  }
  
  @scala.inline
  def ClassBody(body: js.Array[MethodDefinition], `type`: typings.estree.estreeStrings.ClassBody): typings.estree.mod.ClassBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ClassBody]
  }
  
  @scala.inline
  def ClassDeclaration(body: ClassBody, `type`: typings.estree.estreeStrings.ClassDeclaration): typings.estree.mod.ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ClassDeclaration]
  }
  
  @scala.inline
  def ClassExpression(body: ClassBody, `type`: typings.estree.estreeStrings.ClassExpression): typings.estree.mod.ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ClassExpression]
  }
  
  @scala.inline
  def ConditionalExpression(
    alternate: Expression,
    consequent: Expression,
    test: Expression,
    `type`: typings.estree.estreeStrings.ConditionalExpression
  ): typings.estree.mod.ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ConditionalExpression]
  }
  
  @scala.inline
  def ContinueStatement(`type`: typings.estree.estreeStrings.ContinueStatement): typings.estree.mod.ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ContinueStatement]
  }
  
  @scala.inline
  def DebuggerStatement(`type`: typings.estree.estreeStrings.DebuggerStatement): typings.estree.mod.DebuggerStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.DebuggerStatement]
  }
  
  @scala.inline
  def DoWhileStatement(body: Statement, test: Expression, `type`: typings.estree.estreeStrings.DoWhileStatement): typings.estree.mod.DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.DoWhileStatement]
  }
  
  @scala.inline
  def EmptyStatement(`type`: typings.estree.estreeStrings.EmptyStatement): typings.estree.mod.EmptyStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.EmptyStatement]
  }
  
  @scala.inline
  def ExportAllDeclaration(source: Literal, `type`: typings.estree.estreeStrings.ExportAllDeclaration): typings.estree.mod.ExportAllDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ExportAllDeclaration]
  }
  
  @scala.inline
  def ExportDefaultDeclaration(
    declaration: Declaration | Expression,
    `type`: typings.estree.estreeStrings.ExportDefaultDeclaration
  ): typings.estree.mod.ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ExportDefaultDeclaration]
  }
  
  @scala.inline
  def ExportNamedDeclaration(specifiers: js.Array[ExportSpecifier], `type`: typings.estree.estreeStrings.ExportNamedDeclaration): typings.estree.mod.ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ExportNamedDeclaration]
  }
  
  @scala.inline
  def ExportSpecifier(exported: Identifier, local: Identifier, `type`: typings.estree.estreeStrings.ExportSpecifier): typings.estree.mod.ExportSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ExportSpecifier]
  }
  
  @scala.inline
  def ExpressionStatement(expression: Expression, `type`: typings.estree.estreeStrings.ExpressionStatement): typings.estree.mod.ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ExpressionStatement]
  }
  
  @scala.inline
  def ForInStatement(
    body: Statement,
    left: VariableDeclaration | Pattern,
    right: Expression,
    `type`: typings.estree.estreeStrings.ForInStatement
  ): typings.estree.mod.ForInStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ForInStatement]
  }
  
  @scala.inline
  def ForOfStatement(
    await: Boolean,
    body: Statement,
    left: VariableDeclaration | Pattern,
    right: Expression,
    `type`: typings.estree.estreeStrings.ForOfStatement
  ): typings.estree.mod.ForOfStatement = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ForOfStatement]
  }
  
  @scala.inline
  def ForStatement(body: Statement, `type`: typings.estree.estreeStrings.ForStatement): typings.estree.mod.ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ForStatement]
  }
  
  @scala.inline
  def FunctionDeclaration(
    body: BlockStatement,
    params: js.Array[Pattern],
    `type`: typings.estree.estreeStrings.FunctionDeclaration
  ): typings.estree.mod.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.FunctionDeclaration]
  }
  
  @scala.inline
  def FunctionExpression(
    body: BlockStatement,
    params: js.Array[Pattern],
    `type`: typings.estree.estreeStrings.FunctionExpression
  ): typings.estree.mod.FunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.FunctionExpression]
  }
  
  @scala.inline
  def Identifier(name: String, `type`: typings.estree.estreeStrings.Identifier): typings.estree.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.Identifier]
  }
  
  @scala.inline
  def IfStatement(consequent: Statement, test: Expression, `type`: typings.estree.estreeStrings.IfStatement): typings.estree.mod.IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.IfStatement]
  }
  
  @scala.inline
  def ImportDeclaration(
    source: Literal,
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier],
    `type`: typings.estree.estreeStrings.ImportDeclaration
  ): typings.estree.mod.ImportDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ImportDeclaration]
  }
  
  @scala.inline
  def ImportDefaultSpecifier(local: Identifier, `type`: typings.estree.estreeStrings.ImportDefaultSpecifier): typings.estree.mod.ImportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ImportDefaultSpecifier]
  }
  
  @scala.inline
  def ImportExpression(source: Expression, `type`: typings.estree.estreeStrings.ImportExpression): typings.estree.mod.ImportExpression = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ImportExpression]
  }
  
  @scala.inline
  def ImportNamespaceSpecifier(local: Identifier, `type`: typings.estree.estreeStrings.ImportNamespaceSpecifier): typings.estree.mod.ImportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ImportNamespaceSpecifier]
  }
  
  @scala.inline
  def ImportSpecifier(imported: Identifier, local: Identifier, `type`: typings.estree.estreeStrings.ImportSpecifier): typings.estree.mod.ImportSpecifier = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ImportSpecifier]
  }
  
  @scala.inline
  def LabeledStatement(body: Statement, label: Identifier, `type`: typings.estree.estreeStrings.LabeledStatement): typings.estree.mod.LabeledStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.LabeledStatement]
  }
  
  @scala.inline
  def LogicalExpression(
    left: Expression,
    operator: LogicalOperator,
    right: Expression,
    `type`: typings.estree.estreeStrings.LogicalExpression
  ): typings.estree.mod.LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.LogicalExpression]
  }
  
  @scala.inline
  def MemberExpression(
    computed: Boolean,
    `object`: Expression | Super,
    optional: Boolean,
    property: Expression,
    `type`: typings.estree.estreeStrings.MemberExpression
  ): typings.estree.mod.MemberExpression = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.MemberExpression]
  }
  
  @scala.inline
  def MetaProperty(meta: Identifier, property: Identifier, `type`: typings.estree.estreeStrings.MetaProperty): typings.estree.mod.MetaProperty = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.MetaProperty]
  }
  
  @scala.inline
  def MethodDefinition(
    computed: Boolean,
    key: Expression,
    kind: constructor | method | get | set,
    static: Boolean,
    `type`: typings.estree.estreeStrings.MethodDefinition,
    value: FunctionExpression
  ): typings.estree.mod.MethodDefinition = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.MethodDefinition]
  }
  
  @scala.inline
  def NewExpression(
    arguments: js.Array[Expression | SpreadElement],
    callee: Expression | Super,
    `type`: typings.estree.estreeStrings.NewExpression
  ): typings.estree.mod.NewExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.NewExpression]
  }
  
  @scala.inline
  def ObjectExpression(
    properties: js.Array[Property | SpreadElement],
    `type`: typings.estree.estreeStrings.ObjectExpression
  ): typings.estree.mod.ObjectExpression = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ObjectExpression]
  }
  
  @scala.inline
  def ObjectPattern(
    properties: js.Array[AssignmentProperty | RestElement],
    `type`: typings.estree.estreeStrings.ObjectPattern
  ): typings.estree.mod.ObjectPattern = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ObjectPattern]
  }
  
  @scala.inline
  def Program(
    body: js.Array[Directive | Statement | ModuleDeclaration],
    sourceType: script | module,
    `type`: typings.estree.estreeStrings.Program
  ): typings.estree.mod.Program = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.Program]
  }
  
  @scala.inline
  def Property(
    computed: Boolean,
    key: Expression,
    kind: init | get | set,
    method: Boolean,
    shorthand: Boolean,
    `type`: typings.estree.estreeStrings.Property,
    value: Expression | Pattern
  ): typings.estree.mod.Property = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.Property]
  }
  
  @scala.inline
  def RegExpLiteral(regex: Flags, `type`: typings.estree.estreeStrings.Literal): typings.estree.mod.RegExpLiteral = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.RegExpLiteral]
  }
  
  @scala.inline
  def RestElement(argument: Pattern, `type`: typings.estree.estreeStrings.RestElement): typings.estree.mod.RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.RestElement]
  }
  
  @scala.inline
  def ReturnStatement(`type`: typings.estree.estreeStrings.ReturnStatement): typings.estree.mod.ReturnStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ReturnStatement]
  }
  
  @scala.inline
  def SequenceExpression(expressions: js.Array[Expression], `type`: typings.estree.estreeStrings.SequenceExpression): typings.estree.mod.SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.SequenceExpression]
  }
  
  @scala.inline
  def SimpleCallExpression(
    arguments: js.Array[Expression | SpreadElement],
    callee: Expression | Super,
    optional: Boolean,
    `type`: typings.estree.estreeStrings.CallExpression
  ): typings.estree.mod.SimpleCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.SimpleCallExpression]
  }
  
  @scala.inline
  def SimpleLiteral(`type`: typings.estree.estreeStrings.Literal): typings.estree.mod.SimpleLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.SimpleLiteral]
  }
  
  @scala.inline
  def SpreadElement(argument: Expression, `type`: typings.estree.estreeStrings.SpreadElement): typings.estree.mod.SpreadElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.SpreadElement]
  }
  
  @scala.inline
  def Super(`type`: typings.estree.estreeStrings.Super): typings.estree.mod.Super = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.Super]
  }
  
  @scala.inline
  def SwitchCase(consequent: js.Array[Statement], `type`: typings.estree.estreeStrings.SwitchCase): typings.estree.mod.SwitchCase = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.SwitchCase]
  }
  
  @scala.inline
  def SwitchStatement(
    cases: js.Array[SwitchCase],
    discriminant: Expression,
    `type`: typings.estree.estreeStrings.SwitchStatement
  ): typings.estree.mod.SwitchStatement = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.SwitchStatement]
  }
  
  @scala.inline
  def TaggedTemplateExpression(
    quasi: TemplateLiteral,
    tag: Expression,
    `type`: typings.estree.estreeStrings.TaggedTemplateExpression
  ): typings.estree.mod.TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.TaggedTemplateExpression]
  }
  
  @scala.inline
  def TemplateElement(tail: Boolean, `type`: typings.estree.estreeStrings.TemplateElement, value: Cooked): typings.estree.mod.TemplateElement = {
    val __obj = js.Dynamic.literal(tail = tail.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.TemplateElement]
  }
  
  @scala.inline
  def TemplateLiteral(
    expressions: js.Array[Expression],
    quasis: js.Array[TemplateElement],
    `type`: typings.estree.estreeStrings.TemplateLiteral
  ): typings.estree.mod.TemplateLiteral = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.TemplateLiteral]
  }
  
  @scala.inline
  def ThisExpression(`type`: typings.estree.estreeStrings.ThisExpression): typings.estree.mod.ThisExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ThisExpression]
  }
  
  @scala.inline
  def ThrowStatement(argument: Expression, `type`: typings.estree.estreeStrings.ThrowStatement): typings.estree.mod.ThrowStatement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ThrowStatement]
  }
  
  @scala.inline
  def TryStatement(block: BlockStatement, `type`: typings.estree.estreeStrings.TryStatement): typings.estree.mod.TryStatement = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.TryStatement]
  }
  
  @scala.inline
  def UnaryExpression(
    argument: Expression,
    operator: UnaryOperator,
    prefix: `true`,
    `type`: typings.estree.estreeStrings.UnaryExpression
  ): typings.estree.mod.UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.UnaryExpression]
  }
  
  @scala.inline
  def UpdateExpression(
    argument: Expression,
    operator: UpdateOperator,
    prefix: Boolean,
    `type`: typings.estree.estreeStrings.UpdateExpression
  ): typings.estree.mod.UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.UpdateExpression]
  }
  
  @scala.inline
  def VariableDeclaration(
    declarations: js.Array[VariableDeclarator],
    kind: `var` | let | const,
    `type`: typings.estree.estreeStrings.VariableDeclaration
  ): typings.estree.mod.VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.VariableDeclaration]
  }
  
  @scala.inline
  def VariableDeclarator(id: Pattern, `type`: typings.estree.estreeStrings.VariableDeclarator): typings.estree.mod.VariableDeclarator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.VariableDeclarator]
  }
  
  @scala.inline
  def WhileStatement(body: Statement, test: Expression, `type`: typings.estree.estreeStrings.WhileStatement): typings.estree.mod.WhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.WhileStatement]
  }
  
  @scala.inline
  def WithStatement(body: Statement, `object`: Expression, `type`: typings.estree.estreeStrings.WithStatement): typings.estree.mod.WithStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.WithStatement]
  }
  
  @scala.inline
  def YieldExpression(delegate: Boolean, `type`: typings.estree.estreeStrings.YieldExpression): typings.estree.mod.YieldExpression = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.YieldExpression]
  }
}
