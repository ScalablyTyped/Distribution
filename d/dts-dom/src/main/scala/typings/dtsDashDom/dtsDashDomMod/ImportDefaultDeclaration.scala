package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.importDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportDefaultDeclaration
  extends Import
     with DeclarationBase {
  var from: String
  var kind: importDefault
  var name: String
}

object ImportDefaultDeclaration {
  @scala.inline
  def apply(
    from: String,
    kind: importDefault,
    name: String,
    comment: String = null,
    flags: DeclarationFlags = null,
    jsDocComment: String = null
  ): ImportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(from = from, kind = kind, name = name)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[ImportDefaultDeclaration]
  }
}

