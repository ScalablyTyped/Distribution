package typings.formatjsEcma402Abstract.numberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrencyData extends js.Object {
  
  var displayName: LDMLPluralRuleMap[String] = js.native
  
  var narrow: String = js.native
  
  var symbol: String = js.native
}
object CurrencyData {
  
  @scala.inline
  def apply(displayName: LDMLPluralRuleMap[String], narrow: String, symbol: String): CurrencyData = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyData]
  }
  
  @scala.inline
  implicit class CurrencyDataOps[Self <: CurrencyData] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: LDMLPluralRuleMap[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNarrow(value: String): Self = this.set("narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
}
