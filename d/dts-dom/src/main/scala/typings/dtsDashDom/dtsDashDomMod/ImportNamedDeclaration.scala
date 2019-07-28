package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.importNamed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportNamedDeclaration
  extends Import
     with DeclarationBase {
  var as: js.UndefOr[String] = js.undefined
  var from: String
  var kind: importNamed
  var name: String
}

object ImportNamedDeclaration {
  @scala.inline
  def apply(
    from: String,
    kind: importNamed,
    name: String,
    as: String = null,
    comment: String = null,
    flags: DeclarationFlags = null,
    jsDocComment: String = null
  ): ImportNamedDeclaration = {
    val __obj = js.Dynamic.literal(from = from, kind = kind, name = name)
    if (as != null) __obj.updateDynamic("as")(as)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[ImportNamedDeclaration]
  }
}

