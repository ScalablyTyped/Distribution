package typings.eslint

import typings.eslint.mod.AST.TokenType
import typings.eslint.mod.Linter.RuleLevel
import typings.eslint.mod.Rule.NodeTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object eslintStrings {
  @js.native
  sealed trait ArrayExpression extends NodeTypes
  
  @js.native
  sealed trait ArrayPattern extends NodeTypes
  
  @js.native
  sealed trait ArrowFunctionExpression extends NodeTypes
  
  @js.native
  sealed trait AssignmentExpression extends NodeTypes
  
  @js.native
  sealed trait AssignmentPattern extends NodeTypes
  
  @js.native
  sealed trait AwaitExpression extends NodeTypes
  
  @js.native
  sealed trait BinaryExpression extends NodeTypes
  
  @js.native
  sealed trait BlockStatement extends NodeTypes
  
  @js.native
  sealed trait Boolean extends TokenType
  
  @js.native
  sealed trait BreakStatement extends NodeTypes
  
  @js.native
  sealed trait CallExpression extends NodeTypes
  
  @js.native
  sealed trait CatchClause extends NodeTypes
  
  @js.native
  sealed trait ClassBody extends NodeTypes
  
  @js.native
  sealed trait ClassDeclaration extends NodeTypes
  
  @js.native
  sealed trait ClassExpression extends NodeTypes
  
  @js.native
  sealed trait ClassName extends js.Object
  
  @js.native
  sealed trait ConditionalExpression extends NodeTypes
  
  @js.native
  sealed trait ContinueStatement extends NodeTypes
  
  @js.native
  sealed trait DebuggerStatement extends NodeTypes
  
  @js.native
  sealed trait DoWhileStatement extends NodeTypes
  
  @js.native
  sealed trait EmptyStatement extends NodeTypes
  
  @js.native
  sealed trait ExportAllDeclaration extends NodeTypes
  
  @js.native
  sealed trait ExportDefaultDeclaration extends NodeTypes
  
  @js.native
  sealed trait ExportNamedDeclaration extends NodeTypes
  
  @js.native
  sealed trait ExportSpecifier extends NodeTypes
  
  @js.native
  sealed trait ExpressionStatement extends NodeTypes
  
  @js.native
  sealed trait ForInStatement extends NodeTypes
  
  @js.native
  sealed trait ForOfStatement extends NodeTypes
  
  @js.native
  sealed trait ForStatement extends NodeTypes
  
  @js.native
  sealed trait FunctionDeclaration extends NodeTypes
  
  @js.native
  sealed trait FunctionExpression extends NodeTypes
  
  @js.native
  sealed trait FunctionName extends js.Object
  
  @js.native
  sealed trait Identifier
    extends NodeTypes
       with TokenType
  
  @js.native
  sealed trait IfStatement extends NodeTypes
  
  @js.native
  sealed trait ImplicitGlobalVariable extends js.Object
  
  @js.native
  sealed trait ImportBinding extends js.Object
  
  @js.native
  sealed trait ImportDeclaration extends NodeTypes
  
  @js.native
  sealed trait ImportDefaultSpecifier extends NodeTypes
  
  @js.native
  sealed trait ImportExpression extends NodeTypes
  
  @js.native
  sealed trait ImportNamespaceSpecifier extends NodeTypes
  
  @js.native
  sealed trait ImportSpecifier extends NodeTypes
  
  @js.native
  sealed trait JSXIdentifier extends TokenType
  
  @js.native
  sealed trait JSXText extends TokenType
  
  @js.native
  sealed trait Keyword extends TokenType
  
  @js.native
  sealed trait LabeledStatement extends NodeTypes
  
  @js.native
  sealed trait Literal extends NodeTypes
  
  @js.native
  sealed trait LogicalExpression extends NodeTypes
  
  @js.native
  sealed trait MemberExpression extends NodeTypes
  
  @js.native
  sealed trait MetaProperty extends NodeTypes
  
  @js.native
  sealed trait MethodDefinition extends NodeTypes
  
  @js.native
  sealed trait NewExpression extends NodeTypes
  
  @js.native
  sealed trait Null extends TokenType
  
  @js.native
  sealed trait Numeric extends TokenType
  
  @js.native
  sealed trait ObjectExpression extends NodeTypes
  
  @js.native
  sealed trait ObjectPattern extends NodeTypes
  
  @js.native
  sealed trait Parameter extends js.Object
  
  @js.native
  sealed trait Program extends NodeTypes
  
  @js.native
  sealed trait Property extends NodeTypes
  
  @js.native
  sealed trait Punctuator extends TokenType
  
  @js.native
  sealed trait RegularExpression extends TokenType
  
  @js.native
  sealed trait RestElement extends NodeTypes
  
  @js.native
  sealed trait ReturnStatement extends NodeTypes
  
  @js.native
  sealed trait SequenceExpression extends NodeTypes
  
  @js.native
  sealed trait SpreadElement extends NodeTypes
  
  @js.native
  sealed trait String extends TokenType
  
  @js.native
  sealed trait Super extends NodeTypes
  
  @js.native
  sealed trait SwitchCase extends NodeTypes
  
  @js.native
  sealed trait SwitchStatement extends NodeTypes
  
  @js.native
  sealed trait TDZ extends js.Object
  
  @js.native
  sealed trait TaggedTemplateExpression extends NodeTypes
  
  @js.native
  sealed trait TemplateElement extends NodeTypes
  
  @js.native
  sealed trait TemplateLiteral extends NodeTypes
  
  @js.native
  sealed trait ThisExpression extends NodeTypes
  
  @js.native
  sealed trait ThrowStatement extends NodeTypes
  
  @js.native
  sealed trait TryStatement extends NodeTypes
  
  @js.native
  sealed trait UnaryExpression extends NodeTypes
  
  @js.native
  sealed trait UpdateExpression extends NodeTypes
  
  @js.native
  sealed trait Variable extends js.Object
  
  @js.native
  sealed trait VariableDeclaration extends NodeTypes
  
  @js.native
  sealed trait VariableDeclarator extends NodeTypes
  
  @js.native
  sealed trait WhileStatement extends NodeTypes
  
  @js.native
  sealed trait WithStatement extends NodeTypes
  
  @js.native
  sealed trait YieldExpression extends NodeTypes
  
  @js.native
  sealed trait block extends js.Object
  
  @js.native
  sealed trait `catch` extends js.Object
  
  @js.native
  sealed trait `class` extends js.Object
  
  @js.native
  sealed trait code extends js.Object
  
  @js.native
  sealed trait error extends RuleLevel
  
  @js.native
  sealed trait `for` extends js.Object
  
  @js.native
  sealed trait function extends js.Object
  
  @js.native
  sealed trait `function-expression-name` extends js.Object
  
  @js.native
  sealed trait global extends js.Object
  
  @js.native
  sealed trait layout extends js.Object
  
  @js.native
  sealed trait module extends js.Object
  
  @js.native
  sealed trait off extends RuleLevel
  
  @js.native
  sealed trait problem extends js.Object
  
  @js.native
  sealed trait script extends js.Object
  
  @js.native
  sealed trait suggestion extends js.Object
  
  @js.native
  sealed trait switch extends js.Object
  
  @js.native
  sealed trait warn extends RuleLevel
  
  @js.native
  sealed trait whitespace extends js.Object
  
  @js.native
  sealed trait `with` extends js.Object
  
  @scala.inline
  def ArrayExpression: ArrayExpression = "ArrayExpression".asInstanceOf[ArrayExpression]
  @scala.inline
  def ArrayPattern: ArrayPattern = "ArrayPattern".asInstanceOf[ArrayPattern]
  @scala.inline
  def ArrowFunctionExpression: ArrowFunctionExpression = "ArrowFunctionExpression".asInstanceOf[ArrowFunctionExpression]
  @scala.inline
  def AssignmentExpression: AssignmentExpression = "AssignmentExpression".asInstanceOf[AssignmentExpression]
  @scala.inline
  def AssignmentPattern: AssignmentPattern = "AssignmentPattern".asInstanceOf[AssignmentPattern]
  @scala.inline
  def AwaitExpression: AwaitExpression = "AwaitExpression".asInstanceOf[AwaitExpression]
  @scala.inline
  def BinaryExpression: BinaryExpression = "BinaryExpression".asInstanceOf[BinaryExpression]
  @scala.inline
  def BlockStatement: BlockStatement = "BlockStatement".asInstanceOf[BlockStatement]
  @scala.inline
  def Boolean: Boolean = "Boolean".asInstanceOf[Boolean]
  @scala.inline
  def BreakStatement: BreakStatement = "BreakStatement".asInstanceOf[BreakStatement]
  @scala.inline
  def CallExpression: CallExpression = "CallExpression".asInstanceOf[CallExpression]
  @scala.inline
  def CatchClause: CatchClause = "CatchClause".asInstanceOf[CatchClause]
  @scala.inline
  def ClassBody: ClassBody = "ClassBody".asInstanceOf[ClassBody]
  @scala.inline
  def ClassDeclaration: ClassDeclaration = "ClassDeclaration".asInstanceOf[ClassDeclaration]
  @scala.inline
  def ClassExpression: ClassExpression = "ClassExpression".asInstanceOf[ClassExpression]
  @scala.inline
  def ClassName: ClassName = "ClassName".asInstanceOf[ClassName]
  @scala.inline
  def ConditionalExpression: ConditionalExpression = "ConditionalExpression".asInstanceOf[ConditionalExpression]
  @scala.inline
  def ContinueStatement: ContinueStatement = "ContinueStatement".asInstanceOf[ContinueStatement]
  @scala.inline
  def DebuggerStatement: DebuggerStatement = "DebuggerStatement".asInstanceOf[DebuggerStatement]
  @scala.inline
  def DoWhileStatement: DoWhileStatement = "DoWhileStatement".asInstanceOf[DoWhileStatement]
  @scala.inline
  def EmptyStatement: EmptyStatement = "EmptyStatement".asInstanceOf[EmptyStatement]
  @scala.inline
  def ExportAllDeclaration: ExportAllDeclaration = "ExportAllDeclaration".asInstanceOf[ExportAllDeclaration]
  @scala.inline
  def ExportDefaultDeclaration: ExportDefaultDeclaration = "ExportDefaultDeclaration".asInstanceOf[ExportDefaultDeclaration]
  @scala.inline
  def ExportNamedDeclaration: ExportNamedDeclaration = "ExportNamedDeclaration".asInstanceOf[ExportNamedDeclaration]
  @scala.inline
  def ExportSpecifier: ExportSpecifier = "ExportSpecifier".asInstanceOf[ExportSpecifier]
  @scala.inline
  def ExpressionStatement: ExpressionStatement = "ExpressionStatement".asInstanceOf[ExpressionStatement]
  @scala.inline
  def ForInStatement: ForInStatement = "ForInStatement".asInstanceOf[ForInStatement]
  @scala.inline
  def ForOfStatement: ForOfStatement = "ForOfStatement".asInstanceOf[ForOfStatement]
  @scala.inline
  def ForStatement: ForStatement = "ForStatement".asInstanceOf[ForStatement]
  @scala.inline
  def FunctionDeclaration: FunctionDeclaration = "FunctionDeclaration".asInstanceOf[FunctionDeclaration]
  @scala.inline
  def FunctionExpression: FunctionExpression = "FunctionExpression".asInstanceOf[FunctionExpression]
  @scala.inline
  def FunctionName: FunctionName = "FunctionName".asInstanceOf[FunctionName]
  @scala.inline
  def Identifier: Identifier = "Identifier".asInstanceOf[Identifier]
  @scala.inline
  def IfStatement: IfStatement = "IfStatement".asInstanceOf[IfStatement]
  @scala.inline
  def ImplicitGlobalVariable: ImplicitGlobalVariable = "ImplicitGlobalVariable".asInstanceOf[ImplicitGlobalVariable]
  @scala.inline
  def ImportBinding: ImportBinding = "ImportBinding".asInstanceOf[ImportBinding]
  @scala.inline
  def ImportDeclaration: ImportDeclaration = "ImportDeclaration".asInstanceOf[ImportDeclaration]
  @scala.inline
  def ImportDefaultSpecifier: ImportDefaultSpecifier = "ImportDefaultSpecifier".asInstanceOf[ImportDefaultSpecifier]
  @scala.inline
  def ImportExpression: ImportExpression = "ImportExpression".asInstanceOf[ImportExpression]
  @scala.inline
  def ImportNamespaceSpecifier: ImportNamespaceSpecifier = "ImportNamespaceSpecifier".asInstanceOf[ImportNamespaceSpecifier]
  @scala.inline
  def ImportSpecifier: ImportSpecifier = "ImportSpecifier".asInstanceOf[ImportSpecifier]
  @scala.inline
  def JSXIdentifier: JSXIdentifier = "JSXIdentifier".asInstanceOf[JSXIdentifier]
  @scala.inline
  def JSXText: JSXText = "JSXText".asInstanceOf[JSXText]
  @scala.inline
  def Keyword: Keyword = "Keyword".asInstanceOf[Keyword]
  @scala.inline
  def LabeledStatement: LabeledStatement = "LabeledStatement".asInstanceOf[LabeledStatement]
  @scala.inline
  def Literal: Literal = "Literal".asInstanceOf[Literal]
  @scala.inline
  def LogicalExpression: LogicalExpression = "LogicalExpression".asInstanceOf[LogicalExpression]
  @scala.inline
  def MemberExpression: MemberExpression = "MemberExpression".asInstanceOf[MemberExpression]
  @scala.inline
  def MetaProperty: MetaProperty = "MetaProperty".asInstanceOf[MetaProperty]
  @scala.inline
  def MethodDefinition: MethodDefinition = "MethodDefinition".asInstanceOf[MethodDefinition]
  @scala.inline
  def NewExpression: NewExpression = "NewExpression".asInstanceOf[NewExpression]
  @scala.inline
  def Null: Null = "Null".asInstanceOf[Null]
  @scala.inline
  def Numeric: Numeric = "Numeric".asInstanceOf[Numeric]
  @scala.inline
  def ObjectExpression: ObjectExpression = "ObjectExpression".asInstanceOf[ObjectExpression]
  @scala.inline
  def ObjectPattern: ObjectPattern = "ObjectPattern".asInstanceOf[ObjectPattern]
  @scala.inline
  def Parameter: Parameter = "Parameter".asInstanceOf[Parameter]
  @scala.inline
  def Program: Program = "Program".asInstanceOf[Program]
  @scala.inline
  def Property: Property = "Property".asInstanceOf[Property]
  @scala.inline
  def Punctuator: Punctuator = "Punctuator".asInstanceOf[Punctuator]
  @scala.inline
  def RegularExpression: RegularExpression = "RegularExpression".asInstanceOf[RegularExpression]
  @scala.inline
  def RestElement: RestElement = "RestElement".asInstanceOf[RestElement]
  @scala.inline
  def ReturnStatement: ReturnStatement = "ReturnStatement".asInstanceOf[ReturnStatement]
  @scala.inline
  def SequenceExpression: SequenceExpression = "SequenceExpression".asInstanceOf[SequenceExpression]
  @scala.inline
  def SpreadElement: SpreadElement = "SpreadElement".asInstanceOf[SpreadElement]
  @scala.inline
  def String: String = "String".asInstanceOf[String]
  @scala.inline
  def Super: Super = "Super".asInstanceOf[Super]
  @scala.inline
  def SwitchCase: SwitchCase = "SwitchCase".asInstanceOf[SwitchCase]
  @scala.inline
  def SwitchStatement: SwitchStatement = "SwitchStatement".asInstanceOf[SwitchStatement]
  @scala.inline
  def TDZ: TDZ = "TDZ".asInstanceOf[TDZ]
  @scala.inline
  def TaggedTemplateExpression: TaggedTemplateExpression = "TaggedTemplateExpression".asInstanceOf[TaggedTemplateExpression]
  @scala.inline
  def TemplateElement: TemplateElement = "TemplateElement".asInstanceOf[TemplateElement]
  @scala.inline
  def TemplateLiteral: TemplateLiteral = "TemplateLiteral".asInstanceOf[TemplateLiteral]
  @scala.inline
  def ThisExpression: ThisExpression = "ThisExpression".asInstanceOf[ThisExpression]
  @scala.inline
  def ThrowStatement: ThrowStatement = "ThrowStatement".asInstanceOf[ThrowStatement]
  @scala.inline
  def TryStatement: TryStatement = "TryStatement".asInstanceOf[TryStatement]
  @scala.inline
  def UnaryExpression: UnaryExpression = "UnaryExpression".asInstanceOf[UnaryExpression]
  @scala.inline
  def UpdateExpression: UpdateExpression = "UpdateExpression".asInstanceOf[UpdateExpression]
  @scala.inline
  def Variable: Variable = "Variable".asInstanceOf[Variable]
  @scala.inline
  def VariableDeclaration: VariableDeclaration = "VariableDeclaration".asInstanceOf[VariableDeclaration]
  @scala.inline
  def VariableDeclarator: VariableDeclarator = "VariableDeclarator".asInstanceOf[VariableDeclarator]
  @scala.inline
  def WhileStatement: WhileStatement = "WhileStatement".asInstanceOf[WhileStatement]
  @scala.inline
  def WithStatement: WithStatement = "WithStatement".asInstanceOf[WithStatement]
  @scala.inline
  def YieldExpression: YieldExpression = "YieldExpression".asInstanceOf[YieldExpression]
  @scala.inline
  def block: block = "block".asInstanceOf[block]
  @scala.inline
  def `catch`: `catch` = "catch".asInstanceOf[`catch`]
  @scala.inline
  def `class`: `class` = "class".asInstanceOf[`class`]
  @scala.inline
  def code: code = "code".asInstanceOf[code]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def `for`: `for` = "for".asInstanceOf[`for`]
  @scala.inline
  def function: function = "function".asInstanceOf[function]
  @scala.inline
  def `function-expression-name`: `function-expression-name` = "function-expression-name".asInstanceOf[`function-expression-name`]
  @scala.inline
  def global: global = "global".asInstanceOf[global]
  @scala.inline
  def layout: layout = "layout".asInstanceOf[layout]
  @scala.inline
  def module: module = "module".asInstanceOf[module]
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  @scala.inline
  def problem: problem = "problem".asInstanceOf[problem]
  @scala.inline
  def script: script = "script".asInstanceOf[script]
  @scala.inline
  def suggestion: suggestion = "suggestion".asInstanceOf[suggestion]
  @scala.inline
  def switch: switch = "switch".asInstanceOf[switch]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  @scala.inline
  def whitespace: whitespace = "whitespace".asInstanceOf[whitespace]
  @scala.inline
  def `with`: `with` = "with".asInstanceOf[`with`]
}

