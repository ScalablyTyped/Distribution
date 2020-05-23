package typings.formatjsIntlUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompactLong extends js.Object {
  var compactLong: js.UndefOr[RecordDecimalFormatNumLDM] = js.undefined
  var compactShort: js.UndefOr[RecordDecimalFormatNumLDM] = js.undefined
}

object CompactLong {
  @scala.inline
  def apply(compactLong: RecordDecimalFormatNumLDM = null, compactShort: RecordDecimalFormatNumLDM = null): CompactLong = {
    val __obj = js.Dynamic.literal()
    if (compactLong != null) __obj.updateDynamic("compactLong")(compactLong.asInstanceOf[js.Any])
    if (compactShort != null) __obj.updateDynamic("compactShort")(compactShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompactLong]
  }
}

