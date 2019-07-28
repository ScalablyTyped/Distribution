package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.`var`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDeclaration
  extends NamespaceMember
     with DeclarationBase
     with ModuleMember {
  var kind: `var`
  var name: String
  var `type`: Type
}

object VariableDeclaration {
  @scala.inline
  def apply(
    kind: `var`,
    name: String,
    `type`: Type,
    comment: String = null,
    flags: DeclarationFlags = null,
    jsDocComment: String = null
  ): VariableDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[VariableDeclaration]
  }
}

