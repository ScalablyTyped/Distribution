package typings.formatjsIntlUtils

import typings.formatjsIntlUtils.displaynamesTypesMod.RegionCode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNarrow extends js.Object {
  var long: Record[RegionCode, String]
  var narrow: Record[RegionCode, String]
  var short: Record[RegionCode, String]
}

object AnonNarrow {
  @scala.inline
  def apply(
    long: Record[RegionCode, String],
    narrow: Record[RegionCode, String],
    short: Record[RegionCode, String]
  ): AnonNarrow = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNarrow]
  }
}

