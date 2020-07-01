package typings.eslint.mod.Rule

import typings.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ T in eslint.eslint.Rule.NodeTypes ]:? (node : estree.estree.Node): void} */
trait NodeListener extends js.Object {
  var ArrayExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ArrayPattern: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ArrowFunctionExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var AssignmentExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var AssignmentPattern: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var AwaitExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var BinaryExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var BlockStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var BreakStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var CallExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var CatchClause: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ChainExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ClassBody: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ClassDeclaration: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ClassExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ConditionalExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ContinueStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var DebuggerStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var DoWhileStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var EmptyStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ExportAllDeclaration: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ExportDefaultDeclaration: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ExportNamedDeclaration: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ExportSpecifier: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ExpressionStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ForInStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ForOfStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ForStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var FunctionDeclaration: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var FunctionExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var Identifier: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var IfStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ImportDeclaration: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ImportDefaultSpecifier: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ImportExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ImportNamespaceSpecifier: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ImportSpecifier: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var LabeledStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var Literal: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var LogicalExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var MemberExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var MetaProperty: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var MethodDefinition: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var NewExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ObjectExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ObjectPattern: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var Program: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var Property: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var RestElement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ReturnStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var SequenceExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var SpreadElement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var Super: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var SwitchCase: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var SwitchStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var TaggedTemplateExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var TemplateElement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var TemplateLiteral: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ThisExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var ThrowStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var TryStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var UnaryExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var UpdateExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var VariableDeclaration: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var VariableDeclarator: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var WhileStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var WithStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var YieldExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
}

