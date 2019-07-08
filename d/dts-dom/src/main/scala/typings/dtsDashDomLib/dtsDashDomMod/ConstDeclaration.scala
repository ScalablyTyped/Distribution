package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstDeclaration
  extends NamespaceMember
     with DeclarationBase
     with ModuleMember {
  var kind: dtsDashDomLib.dtsDashDomLibStrings.const
  var name: java.lang.String
  var `type`: Type
}

object ConstDeclaration {
  @scala.inline
  def apply(
    kind: dtsDashDomLib.dtsDashDomLibStrings.const,
    name: java.lang.String,
    `type`: Type,
    comment: java.lang.String = null,
    flags: DeclarationFlags = null,
    jsDocComment: java.lang.String = null
  ): ConstDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[ConstDeclaration]
  }
}

