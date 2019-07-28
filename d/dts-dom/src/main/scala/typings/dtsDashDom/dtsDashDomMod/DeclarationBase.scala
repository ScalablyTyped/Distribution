package typings.dtsDashDom.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationBase extends js.Object {
  var comment: js.UndefOr[String] = js.undefined
  var flags: js.UndefOr[DeclarationFlags] = js.undefined
  var jsDocComment: js.UndefOr[String] = js.undefined
}

object DeclarationBase {
  @scala.inline
  def apply(comment: String = null, flags: DeclarationFlags = null, jsDocComment: String = null): DeclarationBase = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[DeclarationBase]
  }
}

