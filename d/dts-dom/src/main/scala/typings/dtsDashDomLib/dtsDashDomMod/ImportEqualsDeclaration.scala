package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportEqualsDeclaration
  extends Import
     with DeclarationBase {
  var from: java.lang.String
  var kind: dtsDashDomLib.dtsDashDomLibStrings.`import=`
  var name: java.lang.String
}

object ImportEqualsDeclaration {
  @scala.inline
  def apply(
    from: java.lang.String,
    kind: dtsDashDomLib.dtsDashDomLibStrings.`import=`,
    name: java.lang.String,
    comment: java.lang.String = null,
    flags: DeclarationFlags = null,
    jsDocComment: java.lang.String = null
  ): ImportEqualsDeclaration = {
    val __obj = js.Dynamic.literal(from = from, kind = kind, name = name)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[ImportEqualsDeclaration]
  }
}

