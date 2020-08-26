package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.estree.mod.ClassDeclaration
  - typings.estree.mod.ClassExpression
*/
trait Class extends Node

object Class {
  @scala.inline
  def ClassDeclaration(body: ClassBody, `type`: typings.estree.estreeStrings.ClassDeclaration): Class = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
  @scala.inline
  def ClassExpression(body: ClassBody, `type`: typings.estree.estreeStrings.ClassExpression): Class = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
}

