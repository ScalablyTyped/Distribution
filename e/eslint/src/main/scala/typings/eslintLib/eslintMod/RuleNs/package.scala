package typings
package eslintLib.eslintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RuleNs {
  type NodeListener = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ T in eslint.eslint.Rule.NodeTypes ]:? (node : estree.estree.Node): void}
    */ eslintLib.eslintLibStrings.NodeListener with js.Any
  type NodeTypes = js.UndefOr[
    eslintLib.eslintLibStrings.Identifier | eslintLib.eslintLibStrings.Literal | eslintLib.eslintLibStrings.Program | eslintLib.eslintLibStrings.FunctionDeclaration | eslintLib.eslintLibStrings.FunctionExpression | eslintLib.eslintLibStrings.ArrowFunctionExpression | eslintLib.eslintLibStrings.SwitchCase | eslintLib.eslintLibStrings.CatchClause | eslintLib.eslintLibStrings.VariableDeclarator | eslintLib.eslintLibStrings.ExpressionStatement | eslintLib.eslintLibStrings.BlockStatement | eslintLib.eslintLibStrings.EmptyStatement | eslintLib.eslintLibStrings.DebuggerStatement | eslintLib.eslintLibStrings.WithStatement | eslintLib.eslintLibStrings.ReturnStatement | eslintLib.eslintLibStrings.LabeledStatement | eslintLib.eslintLibStrings.BreakStatement | eslintLib.eslintLibStrings.ContinueStatement | eslintLib.eslintLibStrings.IfStatement | eslintLib.eslintLibStrings.SwitchStatement | eslintLib.eslintLibStrings.ThrowStatement | eslintLib.eslintLibStrings.TryStatement | eslintLib.eslintLibStrings.WhileStatement | eslintLib.eslintLibStrings.DoWhileStatement | eslintLib.eslintLibStrings.ForStatement | eslintLib.eslintLibStrings.ForInStatement | eslintLib.eslintLibStrings.ForOfStatement | eslintLib.eslintLibStrings.VariableDeclaration | eslintLib.eslintLibStrings.ClassDeclaration | eslintLib.eslintLibStrings.Property | eslintLib.eslintLibStrings.Super | eslintLib.eslintLibStrings.TemplateElement | eslintLib.eslintLibStrings.SpreadElement | eslintLib.eslintLibStrings.ObjectPattern | eslintLib.eslintLibStrings.ArrayPattern | eslintLib.eslintLibStrings.RestElement | eslintLib.eslintLibStrings.AssignmentPattern | eslintLib.eslintLibStrings.MemberExpression | eslintLib.eslintLibStrings.ClassBody | eslintLib.eslintLibStrings.ClassExpression | eslintLib.eslintLibStrings.MethodDefinition | eslintLib.eslintLibStrings.ImportDeclaration | eslintLib.eslintLibStrings.ExportNamedDeclaration | eslintLib.eslintLibStrings.ExportDefaultDeclaration | eslintLib.eslintLibStrings.ExportAllDeclaration | eslintLib.eslintLibStrings.ImportSpecifier | eslintLib.eslintLibStrings.ImportDefaultSpecifier | eslintLib.eslintLibStrings.ImportNamespaceSpecifier | eslintLib.eslintLibStrings.ExportSpecifier
  ]
  type ReportDescriptor = ReportDescriptorMessage with ReportDescriptorLocation with ReportDescriptorOptions
  type ReportDescriptorLocation = eslintLib.Anon_Node_238858895 | eslintLib.Anon_Loc
  type ReportDescriptorMessage = eslintLib.Anon_Message | eslintLib.Anon_MessageId
}
