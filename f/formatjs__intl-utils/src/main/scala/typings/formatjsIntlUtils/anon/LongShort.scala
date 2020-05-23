package typings.formatjsIntlUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LongShort extends js.Object {
  var long: RecordDecimalFormatNumLDM
  var short: RecordDecimalFormatNumLDM
}

object LongShort {
  @scala.inline
  def apply(long: RecordDecimalFormatNumLDM, short: RecordDecimalFormatNumLDM): LongShort = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongShort]
  }
}

