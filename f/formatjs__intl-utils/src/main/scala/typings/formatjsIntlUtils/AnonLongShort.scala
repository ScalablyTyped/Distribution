package typings.formatjsIntlUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLongShort extends js.Object {
  var long: RecordDecimalFormatNumLDM
  var short: RecordDecimalFormatNumLDM
}

object AnonLongShort {
  @scala.inline
  def apply(long: RecordDecimalFormatNumLDM, short: RecordDecimalFormatNumLDM): AnonLongShort = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLongShort]
  }
}

