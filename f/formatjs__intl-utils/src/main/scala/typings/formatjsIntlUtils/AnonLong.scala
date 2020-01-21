package typings.formatjsIntlUtils

import typings.formatjsIntlUtils.numberTypesMod.DecimalFormatNum
import typings.formatjsIntlUtils.numberTypesMod.LDMLPluralRuleMap
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLong extends js.Object {
  var long: Record[DecimalFormatNum, LDMLPluralRuleMap[String]]
  var short: Record[DecimalFormatNum, LDMLPluralRuleMap[String]]
}

object AnonLong {
  @scala.inline
  def apply(
    long: Record[DecimalFormatNum, LDMLPluralRuleMap[String]],
    short: Record[DecimalFormatNum, LDMLPluralRuleMap[String]]
  ): AnonLong = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLong]
  }
}

