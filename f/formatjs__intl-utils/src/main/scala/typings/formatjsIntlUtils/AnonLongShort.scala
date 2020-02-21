package typings.formatjsIntlUtils

import typings.formatjsIntlUtils.numberTypesMod.DecimalFormatNum
import typings.formatjsIntlUtils.numberTypesMod.LDMLPluralRuleMap
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLongShort extends js.Object {
  var long: Record[DecimalFormatNum, LDMLPluralRuleMap[String]]
  var short: Record[DecimalFormatNum, LDMLPluralRuleMap[String]]
}

object AnonLongShort {
  @scala.inline
  def apply(
    long: Record[DecimalFormatNum, LDMLPluralRuleMap[String]],
    short: Record[DecimalFormatNum, LDMLPluralRuleMap[String]]
  ): AnonLongShort = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLongShort]
  }
}

