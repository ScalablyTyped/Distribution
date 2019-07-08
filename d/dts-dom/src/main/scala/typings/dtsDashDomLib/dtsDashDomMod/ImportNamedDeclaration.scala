package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportNamedDeclaration
  extends Import
     with DeclarationBase {
  var as: js.UndefOr[java.lang.String] = js.undefined
  var from: java.lang.String
  var kind: dtsDashDomLib.dtsDashDomLibStrings.importNamed
  var name: java.lang.String
}

object ImportNamedDeclaration {
  @scala.inline
  def apply(
    from: java.lang.String,
    kind: dtsDashDomLib.dtsDashDomLibStrings.importNamed,
    name: java.lang.String,
    as: java.lang.String = null,
    comment: java.lang.String = null,
    flags: DeclarationFlags = null,
    jsDocComment: java.lang.String = null
  ): ImportNamedDeclaration = {
    val __obj = js.Dynamic.literal(from = from, kind = kind, name = name)
    if (as != null) __obj.updateDynamic("as")(as)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[ImportNamedDeclaration]
  }
}

