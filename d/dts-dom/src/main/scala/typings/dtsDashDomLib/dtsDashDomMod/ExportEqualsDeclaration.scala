package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportEqualsDeclaration
  extends TopLevelDeclaration
     with DeclarationBase
     with ModuleMember {
  var kind: dtsDashDomLib.dtsDashDomLibStrings.`export=`
  var target: java.lang.String
}

object ExportEqualsDeclaration {
  @scala.inline
  def apply(
    kind: dtsDashDomLib.dtsDashDomLibStrings.`export=`,
    target: java.lang.String,
    comment: java.lang.String = null,
    flags: DeclarationFlags = null,
    jsDocComment: java.lang.String = null
  ): ExportEqualsDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, target = target)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[ExportEqualsDeclaration]
  }
}

