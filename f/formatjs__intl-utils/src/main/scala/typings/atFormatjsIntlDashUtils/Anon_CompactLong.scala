package typings.atFormatjsIntlDashUtils

import typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.DecimalFormatNum
import typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.LDMLPluralRuleMap
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompactLong extends js.Object {
  var compactLong: js.UndefOr[Record[DecimalFormatNum, LDMLPluralRuleMap[String]]] = js.undefined
  var compactShort: js.UndefOr[Record[DecimalFormatNum, LDMLPluralRuleMap[String]]] = js.undefined
}

object Anon_CompactLong {
  @scala.inline
  def apply(
    compactLong: Record[DecimalFormatNum, LDMLPluralRuleMap[String]] = null,
    compactShort: Record[DecimalFormatNum, LDMLPluralRuleMap[String]] = null
  ): Anon_CompactLong = {
    val __obj = js.Dynamic.literal()
    if (compactLong != null) __obj.updateDynamic("compactLong")(compactLong.asInstanceOf[js.Any])
    if (compactShort != null) __obj.updateDynamic("compactShort")(compactShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CompactLong]
  }
}

