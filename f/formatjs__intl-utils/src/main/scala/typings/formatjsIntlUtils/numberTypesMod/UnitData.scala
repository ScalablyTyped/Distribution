package typings.formatjsIntlUtils.numberTypesMod

import typings.formatjsIntlUtils.anon.Recordnarrowshortlongstri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnitData extends js.Object {
  var long: LDMLPluralRuleMap[String] = js.native
  var narrow: LDMLPluralRuleMap[String] = js.native
  var perUnit: Recordnarrowshortlongstri = js.native
  var short: LDMLPluralRuleMap[String] = js.native
}

object UnitData {
  @scala.inline
  def apply(
    long: LDMLPluralRuleMap[String],
    narrow: LDMLPluralRuleMap[String],
    perUnit: Recordnarrowshortlongstri,
    short: LDMLPluralRuleMap[String]
  ): UnitData = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], perUnit = perUnit.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitData]
  }
  @scala.inline
  implicit class UnitDataOps[Self <: UnitData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLong(value: LDMLPluralRuleMap[String]): Self = this.set("long", value.asInstanceOf[js.Any])
    @scala.inline
    def setNarrow(value: LDMLPluralRuleMap[String]): Self = this.set("narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setPerUnit(value: Recordnarrowshortlongstri): Self = this.set("perUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def setShort(value: LDMLPluralRuleMap[String]): Self = this.set("short", value.asInstanceOf[js.Any])
  }
  
}

