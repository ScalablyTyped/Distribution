package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportAllDeclaration
  extends Import
     with DeclarationBase {
  var from: java.lang.String
  var kind: dtsDashDomLib.dtsDashDomLibStrings.importAll
  var name: java.lang.String
}

object ImportAllDeclaration {
  @scala.inline
  def apply(
    from: java.lang.String,
    kind: dtsDashDomLib.dtsDashDomLibStrings.importAll,
    name: java.lang.String,
    comment: java.lang.String = null,
    flags: DeclarationFlags = null,
    jsDocComment: java.lang.String = null
  ): ImportAllDeclaration = {
    val __obj = js.Dynamic.literal(from = from, kind = kind, name = name)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[ImportAllDeclaration]
  }
}

