package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.exportName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportNameDeclaration
  extends TopLevelDeclaration
     with DeclarationBase {
  var as: js.UndefOr[String] = js.undefined
  var kind: exportName
  var name: String
}

object ExportNameDeclaration {
  @scala.inline
  def apply(
    kind: exportName,
    name: String,
    as: String = null,
    comment: String = null,
    flags: DeclarationFlags = null,
    jsDocComment: String = null
  ): ExportNameDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (as != null) __obj.updateDynamic("as")(as)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[ExportNameDeclaration]
  }
}

