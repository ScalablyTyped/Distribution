package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.enum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumDeclaration
  extends TopLevelDeclaration
     with DeclarationBase {
  var constant: Boolean
  var kind: enum
  var members: js.Array[EnumMemberDeclaration]
  var name: String
}

object EnumDeclaration {
  @scala.inline
  def apply(
    constant: Boolean,
    kind: enum,
    members: js.Array[EnumMemberDeclaration],
    name: String,
    comment: String = null,
    flags: DeclarationFlags = null,
    jsDocComment: String = null
  ): EnumDeclaration = {
    val __obj = js.Dynamic.literal(constant = constant, kind = kind, members = members, name = name)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[EnumDeclaration]
  }
}

