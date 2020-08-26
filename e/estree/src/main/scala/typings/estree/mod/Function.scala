package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.estree.mod.FunctionDeclaration
  - typings.estree.mod.FunctionExpression
  - typings.estree.mod.ArrowFunctionExpression
*/
trait Function extends Node

object Function {
  @scala.inline
  def FunctionDeclaration(
    body: BlockStatement,
    params: js.Array[Pattern],
    `type`: typings.estree.estreeStrings.FunctionDeclaration
  ): Function = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Function]
  }
  @scala.inline
  def FunctionExpression(
    body: BlockStatement,
    params: js.Array[Pattern],
    `type`: typings.estree.estreeStrings.FunctionExpression
  ): Function = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Function]
  }
  @scala.inline
  def ArrowFunctionExpression(
    body: BlockStatement | Expression,
    expression: Boolean,
    params: js.Array[Pattern],
    `type`: typings.estree.estreeStrings.ArrowFunctionExpression
  ): Function = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Function]
  }
}

