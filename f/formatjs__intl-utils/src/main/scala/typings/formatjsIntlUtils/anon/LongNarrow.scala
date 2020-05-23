package typings.formatjsIntlUtils.anon

import typings.formatjsIntlUtils.displaynamesTypesMod.CurrencyCode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LongNarrow extends js.Object {
  var long: Record[CurrencyCode, String]
  var narrow: Record[CurrencyCode, String]
  var short: Record[CurrencyCode, String]
}

object LongNarrow {
  @scala.inline
  def apply(
    long: Record[CurrencyCode, String],
    narrow: Record[CurrencyCode, String],
    short: Record[CurrencyCode, String]
  ): LongNarrow = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongNarrow]
  }
}

