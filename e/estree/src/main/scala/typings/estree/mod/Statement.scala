package typings.estree.mod

import typings.estree.estreeStrings.`var`
import typings.estree.estreeStrings.const
import typings.estree.estreeStrings.let
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait Statement
  extends StObject
     with Node
object Statement {
  
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
  
  inline def ClassDeclaration(body: ClassBody): typings.estree.mod.ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = null)
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.asInstanceOf[typings.estree.mod.ClassDeclaration]
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
  
  inline def IfStatement(consequent: Statement, test: Expression): typings.estree.mod.IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[typings.estree.mod.IfStatement]
  }
  
  inline def LabeledStatement(body: Statement, label: Identifier): typings.estree.mod.LabeledStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LabeledStatement")
    __obj.asInstanceOf[typings.estree.mod.LabeledStatement]
  }
  
  inline def ReturnStatement(): typings.estree.mod.ReturnStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typings.estree.mod.ReturnStatement]
  }
  
  inline def SwitchStatement(cases: js.Array[SwitchCase], discriminant: Expression): typings.estree.mod.SwitchStatement = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SwitchStatement")
    __obj.asInstanceOf[typings.estree.mod.SwitchStatement]
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
  
  inline def VariableDeclaration(declarations: js.Array[VariableDeclarator], kind: `var` | let | const): typings.estree.mod.VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[typings.estree.mod.VariableDeclaration]
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
}
