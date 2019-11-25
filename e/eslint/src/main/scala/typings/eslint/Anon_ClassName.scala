package typings.eslint

import typings.eslint.eslintMod.Scope.DefinitionType
import typings.eslint.eslintStrings.ClassName
import typings.estree.estreeMod.ClassDeclaration
import typings.estree.estreeMod.ClassExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends DefinitionType {
  var node: ClassDeclaration | ClassExpression
  var parent: Null
  var `type`: ClassName
}

object Anon_ClassName {
  @scala.inline
  def apply(node: ClassDeclaration | ClassExpression, parent: Null, `type`: ClassName): Anon_ClassName = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassName]
  }
}

