package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationBase extends js.Object {
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var flags: js.UndefOr[DeclarationFlags] = js.undefined
  var jsDocComment: js.UndefOr[java.lang.String] = js.undefined
}

object DeclarationBase {
  @scala.inline
  def apply(
    comment: java.lang.String = null,
    flags: DeclarationFlags = null,
    jsDocComment: java.lang.String = null
  ): DeclarationBase = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[DeclarationBase]
  }
}

