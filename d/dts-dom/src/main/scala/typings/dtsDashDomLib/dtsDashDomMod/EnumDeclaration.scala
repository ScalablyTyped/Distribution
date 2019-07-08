package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumDeclaration
  extends TopLevelDeclaration
     with DeclarationBase {
  var constant: scala.Boolean
  var kind: dtsDashDomLib.dtsDashDomLibStrings.enum
  var members: js.Array[EnumMemberDeclaration]
  var name: java.lang.String
}

object EnumDeclaration {
  @scala.inline
  def apply(
    constant: scala.Boolean,
    kind: dtsDashDomLib.dtsDashDomLibStrings.enum,
    members: js.Array[EnumMemberDeclaration],
    name: java.lang.String,
    comment: java.lang.String = null,
    flags: DeclarationFlags = null,
    jsDocComment: java.lang.String = null
  ): EnumDeclaration = {
    val __obj = js.Dynamic.literal(constant = constant, kind = kind, members = members, name = name)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[EnumDeclaration]
  }
}

