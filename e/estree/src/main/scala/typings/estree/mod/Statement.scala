package typings.estree.mod

import typings.estree.estreeStrings.`var`
import typings.estree.estreeStrings.const
import typings.estree.estreeStrings.let
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.estree.mod.ExpressionStatement
  - typings.estree.mod.BlockStatement
  - typings.estree.mod.EmptyStatement
  - typings.estree.mod.DebuggerStatement
  - typings.estree.mod.WithStatement
  - typings.estree.mod.ReturnStatement
  - typings.estree.mod.LabeledStatement
  - typings.estree.mod.BreakStatement
  - typings.estree.mod.ContinueStatement
  - typings.estree.mod.IfStatement
  - typings.estree.mod.SwitchStatement
  - typings.estree.mod.ThrowStatement
  - typings.estree.mod.TryStatement
  - typings.estree.mod.WhileStatement
  - typings.estree.mod.DoWhileStatement
  - typings.estree.mod.ForStatement
  - typings.estree.mod.ForInStatement
  - typings.estree.mod.ForOfStatement
  - typings.estree.mod.Declaration
*/
trait Statement extends Node
object Statement {
  
  @scala.inline
  def EmptyStatement(`type`: typings.estree.estreeStrings.EmptyStatement): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  def LabeledStatement(body: Statement, label: Identifier, `type`: typings.estree.estreeStrings.LabeledStatement): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  def ReturnStatement(`type`: typings.estree.estreeStrings.ReturnStatement): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  def SwitchStatement(
    cases: js.Array[SwitchCase],
    discriminant: Expression,
    `type`: typings.estree.estreeStrings.SwitchStatement
  ): Statement = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  def ForStatement(body: Statement, `type`: typings.estree.estreeStrings.ForStatement): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  def ForInStatement(
    body: Statement,
    left: VariableDeclaration | Pattern,
    right: Expression,
    `type`: typings.estree.estreeStrings.ForInStatement
  ): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  def DoWhileStatement(body: Statement, test: Expression, `type`: typings.estree.estreeStrings.DoWhileStatement): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  def WithStatement(body: Statement, `object`: Expression, `type`: typings.estree.estreeStrings.WithStatement): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  def IfStatement(consequent: Statement, test: Expression, `type`: typings.estree.estreeStrings.IfStatement): Statement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  def ContinueStatement(`type`: typings.estree.estreeStrings.ContinueStatement): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  def BreakStatement(`type`: typings.estree.estreeStrings.BreakStatement): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  def TryStatement(block: BlockStatement, `type`: typings.estree.estreeStrings.TryStatement): Statement = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  def WhileStatement(body: Statement, test: Expression, `type`: typings.estree.estreeStrings.WhileStatement): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  def ThrowStatement(argument: Expression, `type`: typings.estree.estreeStrings.ThrowStatement): Statement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  def VariableDeclaration(
    declarations: js.Array[VariableDeclarator],
    kind: `var` | let | const,
    `type`: typings.estree.estreeStrings.VariableDeclaration
  ): Statement = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  def DebuggerStatement(`type`: typings.estree.estreeStrings.DebuggerStatement): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  def ExpressionStatement(expression: Expression, `type`: typings.estree.estreeStrings.ExpressionStatement): Statement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  def ForOfStatement(
    await: Boolean,
    body: Statement,
    left: VariableDeclaration | Pattern,
    right: Expression,
    `type`: typings.estree.estreeStrings.ForOfStatement
  ): Statement = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  def FunctionDeclaration(
    body: BlockStatement,
    params: js.Array[Pattern],
    `type`: typings.estree.estreeStrings.FunctionDeclaration
  ): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  def BlockStatement(body: js.Array[Statement], `type`: typings.estree.estreeStrings.BlockStatement): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  def ClassDeclaration(body: ClassBody, `type`: typings.estree.estreeStrings.ClassDeclaration): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
}
