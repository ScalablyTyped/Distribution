package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.importAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportAllDeclaration
  extends Import
     with DeclarationBase {
  var from: String
  var kind: importAll
  var name: String
}

object ImportAllDeclaration {
  @scala.inline
  def apply(
    from: String,
    kind: importAll,
    name: String,
    comment: String = null,
    flags: DeclarationFlags = null,
    jsDocComment: String = null
  ): ImportAllDeclaration = {
    val __obj = js.Dynamic.literal(from = from, kind = kind, name = name)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[ImportAllDeclaration]
  }
}

