package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumMemberDeclaration extends DeclarationBase {
  var kind: dtsDashDomLib.dtsDashDomLibStrings.`enum-value`
  var name: java.lang.String
  var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object EnumMemberDeclaration {
  @scala.inline
  def apply(
    kind: dtsDashDomLib.dtsDashDomLibStrings.`enum-value`,
    name: java.lang.String,
    comment: java.lang.String = null,
    flags: DeclarationFlags = null,
    jsDocComment: java.lang.String = null,
    value: java.lang.String | scala.Double = null
  ): EnumMemberDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumMemberDeclaration]
  }
}

