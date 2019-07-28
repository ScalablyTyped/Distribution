package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.`export=`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportEqualsDeclaration
  extends TopLevelDeclaration
     with DeclarationBase
     with ModuleMember {
  var kind: `export=`
  var target: String
}

object ExportEqualsDeclaration {
  @scala.inline
  def apply(
    kind: `export=`,
    target: String,
    comment: String = null,
    flags: DeclarationFlags = null,
    jsDocComment: String = null
  ): ExportEqualsDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, target = target)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[ExportEqualsDeclaration]
  }
}

