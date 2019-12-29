package typings.atFormatjsIntlDashUtils

import typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.DecimalFormatNum
import typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.LDMLPluralRuleMap
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Long extends js.Object {
  var long: Record[DecimalFormatNum, LDMLPluralRuleMap[String]]
  var short: Record[DecimalFormatNum, LDMLPluralRuleMap[String]]
}

object Anon_Long {
  @scala.inline
  def apply(
    long: Record[DecimalFormatNum, LDMLPluralRuleMap[String]],
    short: Record[DecimalFormatNum, LDMLPluralRuleMap[String]]
  ): Anon_Long = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Long]
  }
}

