package typings.estree.mod

import typings.estree.estreeStrings.`var`
import typings.estree.estreeStrings.const
import typings.estree.estreeStrings.let
import org.scalablytyped.runtime.StObject
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
  def ClassDeclaration(body: ClassBody, `type`: typings.estree.estreeStrings.ClassDeclaration): typings.estree.mod.ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ClassDeclaration]
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
  def IfStatement(consequent: Statement, test: Expression, `type`: typings.estree.estreeStrings.IfStatement): typings.estree.mod.IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.IfStatement]
  }
  
  @scala.inline
  def LabeledStatement(body: Statement, label: Identifier, `type`: typings.estree.estreeStrings.LabeledStatement): typings.estree.mod.LabeledStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.LabeledStatement]
  }
  
  @scala.inline
  def ReturnStatement(`type`: typings.estree.estreeStrings.ReturnStatement): typings.estree.mod.ReturnStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ReturnStatement]
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
}
