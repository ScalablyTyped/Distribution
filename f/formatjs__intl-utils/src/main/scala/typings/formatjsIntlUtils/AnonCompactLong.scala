package typings.formatjsIntlUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompactLong extends js.Object {
  var compactLong: js.UndefOr[RecordDecimalFormatNumLDM] = js.undefined
  var compactShort: js.UndefOr[RecordDecimalFormatNumLDM] = js.undefined
}

object AnonCompactLong {
  @scala.inline
  def apply(compactLong: RecordDecimalFormatNumLDM = null, compactShort: RecordDecimalFormatNumLDM = null): AnonCompactLong = {
    val __obj = js.Dynamic.literal()
    if (compactLong != null) __obj.updateDynamic("compactLong")(compactLong.asInstanceOf[js.Any])
    if (compactShort != null) __obj.updateDynamic("compactShort")(compactShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompactLong]
  }
}

