package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyDeclaration
  extends DeclarationBase
     with ClassMember
     with ObjectTypeMember {
  var kind: dtsDashDomLib.dtsDashDomLibStrings.property
  var name: java.lang.String
  var `type`: Type
}

object PropertyDeclaration {
  @scala.inline
  def apply(
    kind: dtsDashDomLib.dtsDashDomLibStrings.property,
    name: java.lang.String,
    `type`: Type,
    comment: java.lang.String = null,
    flags: DeclarationFlags = null,
    jsDocComment: java.lang.String = null
  ): PropertyDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[PropertyDeclaration]
  }
}

