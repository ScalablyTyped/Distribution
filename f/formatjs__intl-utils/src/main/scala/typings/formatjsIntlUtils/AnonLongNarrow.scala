package typings.formatjsIntlUtils

import typings.formatjsIntlUtils.displaynamesTypesMod.CurrencyCode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLongNarrow extends js.Object {
  var long: Record[CurrencyCode, String]
  var narrow: Record[CurrencyCode, String]
  var short: Record[CurrencyCode, String]
}

object AnonLongNarrow {
  @scala.inline
  def apply(
    long: Record[CurrencyCode, String],
    narrow: Record[CurrencyCode, String],
    short: Record[CurrencyCode, String]
  ): AnonLongNarrow = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLongNarrow]
  }
}

