package typings.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitData extends js.Object {
  var displayName: String
  var long: LDMLPluralRuleMap[RawUnitPattern]
  var narrow: LDMLPluralRuleMap[RawUnitPattern]
  var short: LDMLPluralRuleMap[RawUnitPattern]
}

object UnitData {
  @scala.inline
  def apply(
    displayName: String,
    long: LDMLPluralRuleMap[RawUnitPattern],
    narrow: LDMLPluralRuleMap[RawUnitPattern],
    short: LDMLPluralRuleMap[RawUnitPattern]
  ): UnitData = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnitData]
  }
}

