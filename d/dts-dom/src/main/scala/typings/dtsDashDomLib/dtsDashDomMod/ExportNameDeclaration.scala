package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportNameDeclaration
  extends TopLevelDeclaration
     with DeclarationBase {
  var as: js.UndefOr[java.lang.String] = js.undefined
  var kind: dtsDashDomLib.dtsDashDomLibStrings.exportName
  var name: java.lang.String
}

object ExportNameDeclaration {
  @scala.inline
  def apply(
    kind: dtsDashDomLib.dtsDashDomLibStrings.exportName,
    name: java.lang.String,
    as: java.lang.String = null,
    comment: java.lang.String = null,
    flags: DeclarationFlags = null,
    jsDocComment: java.lang.String = null
  ): ExportNameDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (as != null) __obj.updateDynamic("as")(as)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[ExportNameDeclaration]
  }
}

