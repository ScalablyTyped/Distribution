package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.exportDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportDefaultDeclaration
  extends TopLevelDeclaration
     with DeclarationBase
     with ModuleMember {
  var kind: exportDefault
  var name: String
}

object ExportDefaultDeclaration {
  @scala.inline
  def apply(
    kind: exportDefault,
    name: String,
    comment: String = null,
    flags: DeclarationFlags = null,
    jsDocComment: String = null
  ): ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[ExportDefaultDeclaration]
  }
}

