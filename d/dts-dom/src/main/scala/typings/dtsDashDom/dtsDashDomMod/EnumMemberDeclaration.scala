package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.`enum-value`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumMemberDeclaration extends DeclarationBase {
  var kind: `enum-value`
  var name: String
  var value: js.UndefOr[String | Double] = js.undefined
}

object EnumMemberDeclaration {
  @scala.inline
  def apply(
    kind: `enum-value`,
    name: String,
    comment: String = null,
    flags: DeclarationFlags = null,
    jsDocComment: String = null,
    value: String | Double = null
  ): EnumMemberDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumMemberDeclaration]
  }
}

