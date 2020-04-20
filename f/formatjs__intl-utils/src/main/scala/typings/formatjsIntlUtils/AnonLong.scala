package typings.formatjsIntlUtils

import typings.formatjsIntlUtils.displaynamesTypesMod.LanguageTag
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLong extends js.Object {
  var long: Record[LanguageTag, String]
  var narrow: Record[LanguageTag, String]
  var short: Record[LanguageTag, String]
}

object AnonLong {
  @scala.inline
  def apply(
    long: Record[LanguageTag, String],
    narrow: Record[LanguageTag, String],
    short: Record[LanguageTag, String]
  ): AnonLong = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLong]
  }
}

