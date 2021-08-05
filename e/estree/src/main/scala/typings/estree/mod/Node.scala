package typings.estree.mod

import typings.estree.anon.Cooked
import typings.estree.anon.Flags
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
  
  inline def ArrayExpression(elements: js.Array[Expression | SpreadElement]): typings.estree.mod.ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[typings.estree.mod.ArrayExpression]
  }
  
  inline def ArrayPattern(elements: js.Array[Pattern]): typings.estree.mod.ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[typings.estree.mod.ArrayPattern]
  }
  
  inline def ArrowFunctionExpression(body: BlockStatement | Expression, expression: Boolean, params: js.Array[Pattern]): typings.estree.mod.ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[typings.estree.mod.ArrowFunctionExpression]
  }
  
  inline def AssignmentExpression(left: Pattern | MemberExpression, operator: AssignmentOperator, right: Expression): typings.estree.mod.AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentExpression")
    __obj.asInstanceOf[typings.estree.mod.AssignmentExpression]
  }
  
  inline def AssignmentPattern(left: Pattern, right: Expression): typings.estree.mod.AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[typings.estree.mod.AssignmentPattern]
  }
  
  inline def AssignmentProperty(computed: Boolean, key: Expression, method: Boolean, shorthand: Boolean, value: Pattern): typings.estree.mod.AssignmentProperty = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = "init", method = method.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Property")
    __obj.asInstanceOf[typings.estree.mod.AssignmentProperty]
  }
  
  inline def AwaitExpression(argument: Expression): typings.estree.mod.AwaitExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[typings.estree.mod.AwaitExpression]
  }
  
  inline def BinaryExpression(left: Expression, operator: BinaryOperator, right: Expression): typings.estree.mod.BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[typings.estree.mod.BinaryExpression]
  }
  
  inline def BlockStatement(body: js.Array[Statement]): typings.estree.mod.BlockStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BlockStatement")
    __obj.asInstanceOf[typings.estree.mod.BlockStatement]
  }
  
  inline def BreakStatement(): typings.estree.mod.BreakStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[typings.estree.mod.BreakStatement]
  }
  
  inline def CatchClause(body: BlockStatement): typings.estree.mod.CatchClause = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], param = null)
    __obj.updateDynamic("type")("CatchClause")
    __obj.asInstanceOf[typings.estree.mod.CatchClause]
  }
  
  inline def ChainExpression(expression: ChainElement): typings.estree.mod.ChainExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ChainExpression")
    __obj.asInstanceOf[typings.estree.mod.ChainExpression]
  }
  
  inline def ClassBody(body: js.Array[MethodDefinition]): typings.estree.mod.ClassBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassBody")
    __obj.asInstanceOf[typings.estree.mod.ClassBody]
  }
  
  inline def ClassDeclaration(body: ClassBody): typings.estree.mod.ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = null)
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.asInstanceOf[typings.estree.mod.ClassDeclaration]
  }
  
  inline def ClassExpression(body: ClassBody): typings.estree.mod.ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[typings.estree.mod.ClassExpression]
  }
  
  inline def ConditionalExpression(alternate: Expression, consequent: Expression, test: Expression): typings.estree.mod.ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[typings.estree.mod.ConditionalExpression]
  }
  
  inline def ContinueStatement(): typings.estree.mod.ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[typings.estree.mod.ContinueStatement]
  }
  
  inline def DebuggerStatement(): typings.estree.mod.DebuggerStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DebuggerStatement")
    __obj.asInstanceOf[typings.estree.mod.DebuggerStatement]
  }
  
  inline def DoWhileStatement(body: Statement, test: Expression): typings.estree.mod.DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[typings.estree.mod.DoWhileStatement]
  }
  
  inline def EmptyStatement(): typings.estree.mod.EmptyStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EmptyStatement")
    __obj.asInstanceOf[typings.estree.mod.EmptyStatement]
  }
  
  inline def ExportAllDeclaration(source: Literal): typings.estree.mod.ExportAllDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[typings.estree.mod.ExportAllDeclaration]
  }
  
  inline def ExportDefaultDeclaration(declaration: Declaration | Expression): typings.estree.mod.ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[typings.estree.mod.ExportDefaultDeclaration]
  }
  
  inline def ExportNamedDeclaration(specifiers: js.Array[ExportSpecifier]): typings.estree.mod.ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[typings.estree.mod.ExportNamedDeclaration]
  }
  
  inline def ExportSpecifier(exported: Identifier, local: Identifier): typings.estree.mod.ExportSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportSpecifier")
    __obj.asInstanceOf[typings.estree.mod.ExportSpecifier]
  }
  
  inline def ExpressionStatement(expression: Expression): typings.estree.mod.ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[typings.estree.mod.ExpressionStatement]
  }
  
  inline def ForInStatement(body: Statement, left: VariableDeclaration | Pattern, right: Expression): typings.estree.mod.ForInStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForInStatement")
    __obj.asInstanceOf[typings.estree.mod.ForInStatement]
  }
  
  inline def ForOfStatement(await: Boolean, body: Statement, left: VariableDeclaration | Pattern, right: Expression): typings.estree.mod.ForOfStatement = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForOfStatement")
    __obj.asInstanceOf[typings.estree.mod.ForOfStatement]
  }
  
  inline def ForStatement(body: Statement): typings.estree.mod.ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[typings.estree.mod.ForStatement]
  }
  
  inline def FunctionDeclaration(body: BlockStatement, params: js.Array[Pattern]): typings.estree.mod.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], id = null)
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typings.estree.mod.FunctionDeclaration]
  }
  
  inline def FunctionExpression(body: BlockStatement, params: js.Array[Pattern]): typings.estree.mod.FunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[typings.estree.mod.FunctionExpression]
  }
  
  inline def Identifier(name: String): typings.estree.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.estree.mod.Identifier]
  }
  
  inline def IfStatement(consequent: Statement, test: Expression): typings.estree.mod.IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[typings.estree.mod.IfStatement]
  }
  
  inline def ImportDeclaration(
    source: Literal,
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier]
  ): typings.estree.mod.ImportDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[typings.estree.mod.ImportDeclaration]
  }
  
  inline def ImportDefaultSpecifier(local: Identifier): typings.estree.mod.ImportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDefaultSpecifier")
    __obj.asInstanceOf[typings.estree.mod.ImportDefaultSpecifier]
  }
  
  inline def ImportExpression(source: Expression): typings.estree.mod.ImportExpression = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportExpression")
    __obj.asInstanceOf[typings.estree.mod.ImportExpression]
  }
  
  inline def ImportNamespaceSpecifier(local: Identifier): typings.estree.mod.ImportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[typings.estree.mod.ImportNamespaceSpecifier]
  }
  
  inline def ImportSpecifier(imported: Identifier, local: Identifier): typings.estree.mod.ImportSpecifier = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportSpecifier")
    __obj.asInstanceOf[typings.estree.mod.ImportSpecifier]
  }
  
  inline def LabeledStatement(body: Statement, label: Identifier): typings.estree.mod.LabeledStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LabeledStatement")
    __obj.asInstanceOf[typings.estree.mod.LabeledStatement]
  }
  
  inline def LogicalExpression(left: Expression, operator: LogicalOperator, right: Expression): typings.estree.mod.LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LogicalExpression")
    __obj.asInstanceOf[typings.estree.mod.LogicalExpression]
  }
  
  inline def MemberExpression(computed: Boolean, `object`: Expression | Super, optional: Boolean, property: Expression): typings.estree.mod.MemberExpression = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typings.estree.mod.MemberExpression]
  }
  
  inline def MetaProperty(meta: Identifier, property: Identifier): typings.estree.mod.MetaProperty = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MetaProperty")
    __obj.asInstanceOf[typings.estree.mod.MetaProperty]
  }
  
  inline def MethodDefinition(
    computed: Boolean,
    key: Expression,
    kind: constructor | method | get | set,
    static: Boolean,
    value: FunctionExpression
  ): typings.estree.mod.MethodDefinition = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MethodDefinition")
    __obj.asInstanceOf[typings.estree.mod.MethodDefinition]
  }
  
  inline def NewExpression(arguments: js.Array[Expression | SpreadElement], callee: Expression | Super): typings.estree.mod.NewExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[typings.estree.mod.NewExpression]
  }
  
  inline def ObjectExpression(properties: js.Array[Property | SpreadElement]): typings.estree.mod.ObjectExpression = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectExpression")
    __obj.asInstanceOf[typings.estree.mod.ObjectExpression]
  }
  
  inline def ObjectPattern(properties: js.Array[AssignmentProperty | RestElement]): typings.estree.mod.ObjectPattern = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[typings.estree.mod.ObjectPattern]
  }
  
  inline def Program(body: js.Array[Directive | Statement | ModuleDeclaration], sourceType: script | module): typings.estree.mod.Program = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Program")
    __obj.asInstanceOf[typings.estree.mod.Program]
  }
  
  inline def Property(
    computed: Boolean,
    key: Expression,
    kind: init | get | set,
    method: Boolean,
    shorthand: Boolean,
    value: Expression | Pattern
  ): typings.estree.mod.Property = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Property")
    __obj.asInstanceOf[typings.estree.mod.Property]
  }
  
  inline def RegExpLiteral(regex: Flags): typings.estree.mod.RegExpLiteral = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Literal")
    __obj.asInstanceOf[typings.estree.mod.RegExpLiteral]
  }
  
  inline def RestElement(argument: Pattern): typings.estree.mod.RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typings.estree.mod.RestElement]
  }
  
  inline def ReturnStatement(): typings.estree.mod.ReturnStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typings.estree.mod.ReturnStatement]
  }
  
  inline def SequenceExpression(expressions: js.Array[Expression]): typings.estree.mod.SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SequenceExpression")
    __obj.asInstanceOf[typings.estree.mod.SequenceExpression]
  }
  
  inline def SimpleCallExpression(arguments: js.Array[Expression | SpreadElement], callee: Expression | Super, optional: Boolean): typings.estree.mod.SimpleCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[typings.estree.mod.SimpleCallExpression]
  }
  
  inline def SimpleLiteral(): typings.estree.mod.SimpleLiteral = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.updateDynamic("type")("Literal")
    __obj.asInstanceOf[typings.estree.mod.SimpleLiteral]
  }
  
  inline def SpreadElement(argument: Expression): typings.estree.mod.SpreadElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SpreadElement")
    __obj.asInstanceOf[typings.estree.mod.SpreadElement]
  }
  
  inline def Super(): typings.estree.mod.Super = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Super")
    __obj.asInstanceOf[typings.estree.mod.Super]
  }
  
  inline def SwitchCase(consequent: js.Array[Statement]): typings.estree.mod.SwitchCase = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SwitchCase")
    __obj.asInstanceOf[typings.estree.mod.SwitchCase]
  }
  
  inline def SwitchStatement(cases: js.Array[SwitchCase], discriminant: Expression): typings.estree.mod.SwitchStatement = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SwitchStatement")
    __obj.asInstanceOf[typings.estree.mod.SwitchStatement]
  }
  
  inline def TaggedTemplateExpression(quasi: TemplateLiteral, tag: Expression): typings.estree.mod.TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[typings.estree.mod.TaggedTemplateExpression]
  }
  
  inline def TemplateElement(tail: Boolean, value: Cooked): typings.estree.mod.TemplateElement = {
    val __obj = js.Dynamic.literal(tail = tail.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateElement")
    __obj.asInstanceOf[typings.estree.mod.TemplateElement]
  }
  
  inline def TemplateLiteral(expressions: js.Array[Expression], quasis: js.Array[TemplateElement]): typings.estree.mod.TemplateLiteral = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[typings.estree.mod.TemplateLiteral]
  }
  
  inline def ThisExpression(): typings.estree.mod.ThisExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[typings.estree.mod.ThisExpression]
  }
  
  inline def ThrowStatement(argument: Expression): typings.estree.mod.ThrowStatement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[typings.estree.mod.ThrowStatement]
  }
  
  inline def TryStatement(block: BlockStatement): typings.estree.mod.TryStatement = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TryStatement")
    __obj.asInstanceOf[typings.estree.mod.TryStatement]
  }
  
  inline def UnaryExpression(argument: Expression, operator: UnaryOperator): typings.estree.mod.UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = true)
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[typings.estree.mod.UnaryExpression]
  }
  
  inline def UpdateExpression(argument: Expression, operator: UpdateOperator, prefix: Boolean): typings.estree.mod.UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UpdateExpression")
    __obj.asInstanceOf[typings.estree.mod.UpdateExpression]
  }
  
  inline def VariableDeclaration(declarations: js.Array[VariableDeclarator], kind: `var` | let | const): typings.estree.mod.VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[typings.estree.mod.VariableDeclaration]
  }
  
  inline def VariableDeclarator(id: Pattern): typings.estree.mod.VariableDeclarator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclarator")
    __obj.asInstanceOf[typings.estree.mod.VariableDeclarator]
  }
  
  inline def WhileStatement(body: Statement, test: Expression): typings.estree.mod.WhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[typings.estree.mod.WhileStatement]
  }
  
  inline def WithStatement(body: Statement, `object`: Expression): typings.estree.mod.WithStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WithStatement")
    __obj.asInstanceOf[typings.estree.mod.WithStatement]
  }
  
  inline def YieldExpression(delegate: Boolean): typings.estree.mod.YieldExpression = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[typings.estree.mod.YieldExpression]
  }
}
