package typings
package estreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object estreeMod {
  type AssignmentOperator = estreeLib.estreeLibStrings.`=` | estreeLib.estreeLibStrings.`+=` | estreeLib.estreeLibStrings.`-=` | estreeLib.estreeLibStrings.`*=` | estreeLib.estreeLibStrings.`/=` | estreeLib.estreeLibStrings.`%=` | estreeLib.estreeLibStrings.`**=` | estreeLib.estreeLibStrings.`<<=` | estreeLib.estreeLibStrings.`>>=` | estreeLib.estreeLibStrings.`>>>=` | estreeLib.estreeLibStrings.`|=` | estreeLib.estreeLibStrings.`^=` | estreeLib.estreeLibStrings.`&=`
  type BaseDeclaration = BaseStatement
  type BaseExpression = BaseNode
  type BaseModuleDeclaration = BaseNode
  type BasePattern = BaseNode
  type BaseStatement = BaseNode
  type BinaryOperator = estreeLib.estreeLibStrings.`==` | estreeLib.estreeLibStrings.`!=` | estreeLib.estreeLibStrings.`===` | estreeLib.estreeLibStrings.`!==` | estreeLib.estreeLibStrings.`<` | estreeLib.estreeLibStrings.`<=` | estreeLib.estreeLibStrings.`>` | estreeLib.estreeLibStrings.`>=` | estreeLib.estreeLibStrings.`<<` | estreeLib.estreeLibStrings.`>>` | estreeLib.estreeLibStrings.`>>>` | estreeLib.estreeLibStrings.`+` | estreeLib.estreeLibStrings.`-` | estreeLib.estreeLibStrings.`*` | estreeLib.estreeLibStrings.`/` | estreeLib.estreeLibStrings.`%` | estreeLib.estreeLibStrings.`**` | estreeLib.estreeLibStrings.`|` | estreeLib.estreeLibStrings.`^` | estreeLib.estreeLibStrings.`&` | estreeLib.estreeLibStrings.in | estreeLib.estreeLibStrings.instanceof
  type CallExpression = SimpleCallExpression | NewExpression
  type Class = ClassDeclaration | ClassExpression
  type Declaration = FunctionDeclaration | VariableDeclaration | ClassDeclaration
  type Function = FunctionDeclaration | FunctionExpression | ArrowFunctionExpression
  type Literal = SimpleLiteral | RegExpLiteral
  type LogicalOperator = estreeLib.estreeLibStrings.`||` | estreeLib.estreeLibStrings.`&&`
  type ModuleDeclaration = ImportDeclaration | ExportNamedDeclaration | ExportDefaultDeclaration | ExportAllDeclaration
  type ModuleSpecifier = ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier | ExportSpecifier
  type Node = Identifier | Literal | Program | js.Function | SwitchCase | CatchClause | VariableDeclarator | Statement | estreeLib.Expression | Property | AssignmentProperty | Super | TemplateElement | SpreadElement | Pattern | ClassBody | Class | MethodDefinition | ModuleDeclaration | ModuleSpecifier
  type Pattern = Identifier | ObjectPattern | ArrayPattern | RestElement | AssignmentPattern | MemberExpression
  type Statement = ExpressionStatement | BlockStatement | EmptyStatement | DebuggerStatement | WithStatement | ReturnStatement | LabeledStatement | BreakStatement | ContinueStatement | IfStatement | SwitchStatement | ThrowStatement | TryStatement | WhileStatement | DoWhileStatement | ForStatement | ForInStatement | ForOfStatement | Declaration
  type UnaryOperator = estreeLib.estreeLibStrings.`-` | estreeLib.estreeLibStrings.`+` | estreeLib.estreeLibStrings.`!` | estreeLib.estreeLibStrings.`~` | estreeLib.estreeLibStrings.typeof | estreeLib.estreeLibStrings.void | estreeLib.estreeLibStrings.delete
  type UpdateOperator = estreeLib.estreeLibStrings.`++` | estreeLib.estreeLibStrings.`--`
}
