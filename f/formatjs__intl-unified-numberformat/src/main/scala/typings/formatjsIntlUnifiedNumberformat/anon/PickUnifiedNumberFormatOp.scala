package typings.formatjsIntlUnifiedNumberformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@formatjs/intl-unified-numberformat.@formatjs/intl-unified-numberformat.UnifiedNumberFormatOptions, 'localeMatcher'> */
trait PickUnifiedNumberFormatOp extends js.Object {
  var localeMatcher: js.UndefOr[String] = js.undefined
}

object PickUnifiedNumberFormatOp {
  @scala.inline
  def apply(localeMatcher: String = null): PickUnifiedNumberFormatOp = {
    val __obj = js.Dynamic.literal()
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickUnifiedNumberFormatOp]
  }
}

