package typings.formatjsIntlUnifiedNumberformat.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawNumberFormatResult extends js.Object {
  var formattedString: String
  var integerDigitsCount: Double
  var roundedNumber: Double
}

object RawNumberFormatResult {
  @scala.inline
  def apply(formattedString: String, integerDigitsCount: Double, roundedNumber: Double): RawNumberFormatResult = {
    val __obj = js.Dynamic.literal(formattedString = formattedString.asInstanceOf[js.Any], integerDigitsCount = integerDigitsCount.asInstanceOf[js.Any], roundedNumber = roundedNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawNumberFormatResult]
  }
}

