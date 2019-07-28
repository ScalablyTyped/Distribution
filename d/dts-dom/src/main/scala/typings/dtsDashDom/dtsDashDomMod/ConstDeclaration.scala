package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.const
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstDeclaration
  extends NamespaceMember
     with DeclarationBase
     with ModuleMember {
  var kind: const
  var name: String
  var `type`: Type
}

object ConstDeclaration {
  @scala.inline
  def apply(
    kind: const,
    name: String,
    `type`: Type,
    comment: String = null,
    flags: DeclarationFlags = null,
    jsDocComment: String = null
  ): ConstDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[ConstDeclaration]
  }
}

